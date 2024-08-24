package com.cl.dao;

import com.cl.entity.ShouchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShouchengView;


/**
 * 收成
 * 
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface ShouchengDao extends BaseMapper<ShouchengEntity> {
	
	List<ShouchengView> selectListView(@Param("ew") Wrapper<ShouchengEntity> wrapper);

	List<ShouchengView> selectListView(Pagination page,@Param("ew") Wrapper<ShouchengEntity> wrapper);
	
	ShouchengView selectView(@Param("ew") Wrapper<ShouchengEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShouchengEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShouchengEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShouchengEntity> wrapper);



}
