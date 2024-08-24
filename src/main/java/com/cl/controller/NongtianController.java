package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.NongtianEntity;
import com.cl.entity.view.NongtianView;

import com.cl.service.NongtianService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 农田
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
@RestController
@RequestMapping("/nongtian")
public class NongtianController {
    @Autowired
    private NongtianService nongtianService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NongtianEntity nongtian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			nongtian.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<NongtianEntity> ew = new EntityWrapper<NongtianEntity>();

		PageUtils page = nongtianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongtian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NongtianEntity nongtian, 
		HttpServletRequest request){
        EntityWrapper<NongtianEntity> ew = new EntityWrapper<NongtianEntity>();

		PageUtils page = nongtianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongtian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NongtianEntity nongtian){
       	EntityWrapper<NongtianEntity> ew = new EntityWrapper<NongtianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nongtian, "nongtian")); 
        return R.ok().put("data", nongtianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NongtianEntity nongtian){
        EntityWrapper< NongtianEntity> ew = new EntityWrapper< NongtianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nongtian, "nongtian")); 
		NongtianView nongtianView =  nongtianService.selectView(ew);
		return R.ok("查询农田成功").put("data", nongtianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NongtianEntity nongtian = nongtianService.selectById(id);
		nongtian = nongtianService.selectView(new EntityWrapper<NongtianEntity>().eq("id", id));
        return R.ok().put("data", nongtian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NongtianEntity nongtian = nongtianService.selectById(id);
		nongtian = nongtianService.selectView(new EntityWrapper<NongtianEntity>().eq("id", id));
        return R.ok().put("data", nongtian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NongtianEntity nongtian, HttpServletRequest request){
    	nongtian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongtian);
        nongtianService.insert(nongtian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody NongtianEntity nongtian, HttpServletRequest request){
    	nongtian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongtian);
        nongtianService.insert(nongtian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody NongtianEntity nongtian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nongtian);
        nongtianService.updateById(nongtian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        nongtianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
