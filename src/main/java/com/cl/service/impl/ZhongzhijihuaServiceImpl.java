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


import com.cl.dao.ZhongzhijihuaDao;
import com.cl.entity.ZhongzhijihuaEntity;
import com.cl.service.ZhongzhijihuaService;
import com.cl.entity.view.ZhongzhijihuaView;

@Service("zhongzhijihuaService")
public class ZhongzhijihuaServiceImpl extends ServiceImpl<ZhongzhijihuaDao, ZhongzhijihuaEntity> implements ZhongzhijihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzhijihuaEntity> page = this.selectPage(
                new Query<ZhongzhijihuaEntity>(params).getPage(),
                new EntityWrapper<ZhongzhijihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzhijihuaEntity> wrapper) {
		  Page<ZhongzhijihuaView> page =new Query<ZhongzhijihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZhongzhijihuaView> selectListView(Wrapper<ZhongzhijihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzhijihuaView selectView(Wrapper<ZhongzhijihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
