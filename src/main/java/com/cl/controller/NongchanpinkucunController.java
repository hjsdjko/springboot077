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

import com.cl.entity.NongchanpinkucunEntity;
import com.cl.entity.view.NongchanpinkucunView;

import com.cl.service.NongchanpinkucunService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 农产品库存
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
@RestController
@RequestMapping("/nongchanpinkucun")
public class NongchanpinkucunController {
    @Autowired
    private NongchanpinkucunService nongchanpinkucunService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NongchanpinkucunEntity nongchanpinkucun,
                @RequestParam(required = false) Double kucunshuliangstart,
                @RequestParam(required = false) Double kucunshuliangend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rukushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rukushijianend,
		HttpServletRequest request){
        EntityWrapper<NongchanpinkucunEntity> ew = new EntityWrapper<NongchanpinkucunEntity>();
                if(kucunshuliangstart!=null) ew.ge("kucunshuliang", kucunshuliangstart);
                if(kucunshuliangend!=null) ew.le("kucunshuliang", kucunshuliangend);
                if(rukushijianstart!=null) ew.ge("rukushijian", rukushijianstart);
                if(rukushijianend!=null) ew.le("rukushijian", rukushijianend);

		PageUtils page = nongchanpinkucunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongchanpinkucun), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NongchanpinkucunEntity nongchanpinkucun, 
                @RequestParam(required = false) Double kucunshuliangstart,
                @RequestParam(required = false) Double kucunshuliangend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rukushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rukushijianend,
		HttpServletRequest request){
        EntityWrapper<NongchanpinkucunEntity> ew = new EntityWrapper<NongchanpinkucunEntity>();
                if(kucunshuliangstart!=null) ew.ge("kucunshuliang", kucunshuliangstart);
                if(kucunshuliangend!=null) ew.le("kucunshuliang", kucunshuliangend);
                if(rukushijianstart!=null) ew.ge("rukushijian", rukushijianstart);
                if(rukushijianend!=null) ew.le("rukushijian", rukushijianend);

		PageUtils page = nongchanpinkucunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongchanpinkucun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NongchanpinkucunEntity nongchanpinkucun){
       	EntityWrapper<NongchanpinkucunEntity> ew = new EntityWrapper<NongchanpinkucunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nongchanpinkucun, "nongchanpinkucun")); 
        return R.ok().put("data", nongchanpinkucunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NongchanpinkucunEntity nongchanpinkucun){
        EntityWrapper< NongchanpinkucunEntity> ew = new EntityWrapper< NongchanpinkucunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nongchanpinkucun, "nongchanpinkucun")); 
		NongchanpinkucunView nongchanpinkucunView =  nongchanpinkucunService.selectView(ew);
		return R.ok("查询农产品库存成功").put("data", nongchanpinkucunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NongchanpinkucunEntity nongchanpinkucun = nongchanpinkucunService.selectById(id);
		nongchanpinkucun = nongchanpinkucunService.selectView(new EntityWrapper<NongchanpinkucunEntity>().eq("id", id));
        return R.ok().put("data", nongchanpinkucun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NongchanpinkucunEntity nongchanpinkucun = nongchanpinkucunService.selectById(id);
		nongchanpinkucun = nongchanpinkucunService.selectView(new EntityWrapper<NongchanpinkucunEntity>().eq("id", id));
        return R.ok().put("data", nongchanpinkucun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NongchanpinkucunEntity nongchanpinkucun, HttpServletRequest request){
    	nongchanpinkucun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongchanpinkucun);
        nongchanpinkucunService.insert(nongchanpinkucun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody NongchanpinkucunEntity nongchanpinkucun, HttpServletRequest request){
    	nongchanpinkucun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongchanpinkucun);
        nongchanpinkucunService.insert(nongchanpinkucun);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody NongchanpinkucunEntity nongchanpinkucun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nongchanpinkucun);
        nongchanpinkucunService.updateById(nongchanpinkucun);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        nongchanpinkucunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
