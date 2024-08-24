package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.NongzuowuxiaoshouDao;
import com.cl.entity.NongzuowuxiaoshouEntity;
import com.cl.service.NongzuowuxiaoshouService;
import com.cl.entity.view.NongzuowuxiaoshouView;

@Service("nongzuowuxiaoshouService")
public class NongzuowuxiaoshouServiceImpl extends ServiceImpl<NongzuowuxiaoshouDao, NongzuowuxiaoshouEntity> implements NongzuowuxiaoshouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongzuowuxiaoshouEntity> page = this.selectPage(
                new Query<NongzuowuxiaoshouEntity>(params).getPage(),
                new EntityWrapper<NongzuowuxiaoshouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongzuowuxiaoshouEntity> wrapper) {
		  Page<NongzuowuxiaoshouView> page =new Query<NongzuowuxiaoshouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<NongzuowuxiaoshouView> selectListView(Wrapper<NongzuowuxiaoshouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongzuowuxiaoshouView selectView(Wrapper<NongzuowuxiaoshouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<NongzuowuxiaoshouEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<NongzuowuxiaoshouEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<NongzuowuxiaoshouEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
