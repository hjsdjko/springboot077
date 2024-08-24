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


import com.cl.dao.NongchanpinkucunDao;
import com.cl.entity.NongchanpinkucunEntity;
import com.cl.service.NongchanpinkucunService;
import com.cl.entity.view.NongchanpinkucunView;

@Service("nongchanpinkucunService")
public class NongchanpinkucunServiceImpl extends ServiceImpl<NongchanpinkucunDao, NongchanpinkucunEntity> implements NongchanpinkucunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchanpinkucunEntity> page = this.selectPage(
                new Query<NongchanpinkucunEntity>(params).getPage(),
                new EntityWrapper<NongchanpinkucunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchanpinkucunEntity> wrapper) {
		  Page<NongchanpinkucunView> page =new Query<NongchanpinkucunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<NongchanpinkucunView> selectListView(Wrapper<NongchanpinkucunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchanpinkucunView selectView(Wrapper<NongchanpinkucunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
