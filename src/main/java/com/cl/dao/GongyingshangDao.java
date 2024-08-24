package com.cl.dao;

import com.cl.entity.GongyingshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GongyingshangView;


/**
 * 供应商
 * 
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface GongyingshangDao extends BaseMapper<GongyingshangEntity> {
	
	List<GongyingshangView> selectListView(@Param("ew") Wrapper<GongyingshangEntity> wrapper);

	List<GongyingshangView> selectListView(Pagination page,@Param("ew") Wrapper<GongyingshangEntity> wrapper);
	
	GongyingshangView selectView(@Param("ew") Wrapper<GongyingshangEntity> wrapper);
	

}
