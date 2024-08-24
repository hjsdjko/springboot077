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

import com.cl.entity.TianqigonggaoEntity;
import com.cl.entity.view.TianqigonggaoView;

import com.cl.service.TianqigonggaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 天气公告
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
@RestController
@RequestMapping("/tianqigonggao")
public class TianqigonggaoController {
    @Autowired
    private TianqigonggaoService tianqigonggaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TianqigonggaoEntity tianqigonggao,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<TianqigonggaoEntity> ew = new EntityWrapper<TianqigonggaoEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = tianqigonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tianqigonggao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TianqigonggaoEntity tianqigonggao, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<TianqigonggaoEntity> ew = new EntityWrapper<TianqigonggaoEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = tianqigonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tianqigonggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TianqigonggaoEntity tianqigonggao){
       	EntityWrapper<TianqigonggaoEntity> ew = new EntityWrapper<TianqigonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tianqigonggao, "tianqigonggao")); 
        return R.ok().put("data", tianqigonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TianqigonggaoEntity tianqigonggao){
        EntityWrapper< TianqigonggaoEntity> ew = new EntityWrapper< TianqigonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tianqigonggao, "tianqigonggao")); 
		TianqigonggaoView tianqigonggaoView =  tianqigonggaoService.selectView(ew);
		return R.ok("查询天气公告成功").put("data", tianqigonggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TianqigonggaoEntity tianqigonggao = tianqigonggaoService.selectById(id);
		tianqigonggao = tianqigonggaoService.selectView(new EntityWrapper<TianqigonggaoEntity>().eq("id", id));
        return R.ok().put("data", tianqigonggao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TianqigonggaoEntity tianqigonggao = tianqigonggaoService.selectById(id);
		tianqigonggao = tianqigonggaoService.selectView(new EntityWrapper<TianqigonggaoEntity>().eq("id", id));
        return R.ok().put("data", tianqigonggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TianqigonggaoEntity tianqigonggao, HttpServletRequest request){
    	tianqigonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tianqigonggao);
        tianqigonggaoService.insert(tianqigonggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TianqigonggaoEntity tianqigonggao, HttpServletRequest request){
    	tianqigonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tianqigonggao);
        tianqigonggaoService.insert(tianqigonggao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TianqigonggaoEntity tianqigonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tianqigonggao);
        tianqigonggaoService.updateById(tianqigonggao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tianqigonggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
