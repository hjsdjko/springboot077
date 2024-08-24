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


import com.cl.dao.ShouchengDao;
import com.cl.entity.ShouchengEntity;
import com.cl.service.ShouchengService;
import com.cl.entity.view.ShouchengView;

@Service("shouchengService")
public class ShouchengServiceImpl extends ServiceImpl<ShouchengDao, ShouchengEntity> implements ShouchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouchengEntity> page = this.selectPage(
                new Query<ShouchengEntity>(params).getPage(),
                new EntityWrapper<ShouchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouchengEntity> wrapper) {
		  Page<ShouchengView> page =new Query<ShouchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShouchengView> selectListView(Wrapper<ShouchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouchengView selectView(Wrapper<ShouchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShouchengEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShouchengEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShouchengEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
