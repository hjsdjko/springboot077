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


import com.cl.dao.GongyingshangDao;
import com.cl.entity.GongyingshangEntity;
import com.cl.service.GongyingshangService;
import com.cl.entity.view.GongyingshangView;

@Service("gongyingshangService")
public class GongyingshangServiceImpl extends ServiceImpl<GongyingshangDao, GongyingshangEntity> implements GongyingshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyingshangEntity> page = this.selectPage(
                new Query<GongyingshangEntity>(params).getPage(),
                new EntityWrapper<GongyingshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyingshangEntity> wrapper) {
		  Page<GongyingshangView> page =new Query<GongyingshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<GongyingshangView> selectListView(Wrapper<GongyingshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyingshangView selectView(Wrapper<GongyingshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
