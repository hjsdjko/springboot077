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


import com.cl.dao.NongtianDao;
import com.cl.entity.NongtianEntity;
import com.cl.service.NongtianService;
import com.cl.entity.view.NongtianView;

@Service("nongtianService")
public class NongtianServiceImpl extends ServiceImpl<NongtianDao, NongtianEntity> implements NongtianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongtianEntity> page = this.selectPage(
                new Query<NongtianEntity>(params).getPage(),
                new EntityWrapper<NongtianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongtianEntity> wrapper) {
		  Page<NongtianView> page =new Query<NongtianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<NongtianView> selectListView(Wrapper<NongtianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongtianView selectView(Wrapper<NongtianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
