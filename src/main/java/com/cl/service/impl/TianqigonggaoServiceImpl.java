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


import com.cl.dao.TianqigonggaoDao;
import com.cl.entity.TianqigonggaoEntity;
import com.cl.service.TianqigonggaoService;
import com.cl.entity.view.TianqigonggaoView;

@Service("tianqigonggaoService")
public class TianqigonggaoServiceImpl extends ServiceImpl<TianqigonggaoDao, TianqigonggaoEntity> implements TianqigonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TianqigonggaoEntity> page = this.selectPage(
                new Query<TianqigonggaoEntity>(params).getPage(),
                new EntityWrapper<TianqigonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TianqigonggaoEntity> wrapper) {
		  Page<TianqigonggaoView> page =new Query<TianqigonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TianqigonggaoView> selectListView(Wrapper<TianqigonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TianqigonggaoView selectView(Wrapper<TianqigonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
