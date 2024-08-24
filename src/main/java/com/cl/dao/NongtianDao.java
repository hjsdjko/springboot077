package com.cl.dao;

import com.cl.entity.NongtianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.NongtianView;


/**
 * 农田
 * 
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface NongtianDao extends BaseMapper<NongtianEntity> {
	
	List<NongtianView> selectListView(@Param("ew") Wrapper<NongtianEntity> wrapper);

	List<NongtianView> selectListView(Pagination page,@Param("ew") Wrapper<NongtianEntity> wrapper);
	
	NongtianView selectView(@Param("ew") Wrapper<NongtianEntity> wrapper);
	

}
