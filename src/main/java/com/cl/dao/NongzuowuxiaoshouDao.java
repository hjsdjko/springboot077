package com.cl.dao;

import com.cl.entity.NongzuowuxiaoshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.NongzuowuxiaoshouView;


/**
 * 农作物销售
 * 
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface NongzuowuxiaoshouDao extends BaseMapper<NongzuowuxiaoshouEntity> {
	
	List<NongzuowuxiaoshouView> selectListView(@Param("ew") Wrapper<NongzuowuxiaoshouEntity> wrapper);

	List<NongzuowuxiaoshouView> selectListView(Pagination page,@Param("ew") Wrapper<NongzuowuxiaoshouEntity> wrapper);
	
	NongzuowuxiaoshouView selectView(@Param("ew") Wrapper<NongzuowuxiaoshouEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NongzuowuxiaoshouEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NongzuowuxiaoshouEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NongzuowuxiaoshouEntity> wrapper);



}
