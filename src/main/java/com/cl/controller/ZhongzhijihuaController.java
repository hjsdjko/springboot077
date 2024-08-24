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

import com.cl.entity.ZhongzhijihuaEntity;
import com.cl.entity.view.ZhongzhijihuaView;

import com.cl.service.ZhongzhijihuaService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 种植计划
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
@RestController
@RequestMapping("/zhongzhijihua")
public class ZhongzhijihuaController {
    @Autowired
    private ZhongzhijihuaService zhongzhijihuaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhongzhijihuaEntity zhongzhijihua,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhongzhijihua.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhongzhijihuaEntity> ew = new EntityWrapper<ZhongzhijihuaEntity>();

		PageUtils page = zhongzhijihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhijihua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhongzhijihuaEntity zhongzhijihua, 
		HttpServletRequest request){
        EntityWrapper<ZhongzhijihuaEntity> ew = new EntityWrapper<ZhongzhijihuaEntity>();

		PageUtils page = zhongzhijihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhijihua), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhongzhijihuaEntity zhongzhijihua){
       	EntityWrapper<ZhongzhijihuaEntity> ew = new EntityWrapper<ZhongzhijihuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhongzhijihua, "zhongzhijihua")); 
        return R.ok().put("data", zhongzhijihuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhongzhijihuaEntity zhongzhijihua){
        EntityWrapper< ZhongzhijihuaEntity> ew = new EntityWrapper< ZhongzhijihuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhongzhijihua, "zhongzhijihua")); 
		ZhongzhijihuaView zhongzhijihuaView =  zhongzhijihuaService.selectView(ew);
		return R.ok("查询种植计划成功").put("data", zhongzhijihuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhongzhijihuaEntity zhongzhijihua = zhongzhijihuaService.selectById(id);
		zhongzhijihua = zhongzhijihuaService.selectView(new EntityWrapper<ZhongzhijihuaEntity>().eq("id", id));
        return R.ok().put("data", zhongzhijihua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhongzhijihuaEntity zhongzhijihua = zhongzhijihuaService.selectById(id);
		zhongzhijihua = zhongzhijihuaService.selectView(new EntityWrapper<ZhongzhijihuaEntity>().eq("id", id));
        return R.ok().put("data", zhongzhijihua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhongzhijihuaEntity zhongzhijihua, HttpServletRequest request){
    	zhongzhijihua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhongzhijihua);
        zhongzhijihuaService.insert(zhongzhijihua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhongzhijihuaEntity zhongzhijihua, HttpServletRequest request){
    	zhongzhijihua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhongzhijihua);
        zhongzhijihuaService.insert(zhongzhijihua);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhongzhijihuaEntity zhongzhijihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhongzhijihua);
        zhongzhijihuaService.updateById(zhongzhijihua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhongzhijihuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
