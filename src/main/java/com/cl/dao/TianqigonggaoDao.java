package com.cl.dao;

import com.cl.entity.TianqigonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TianqigonggaoView;


/**
 * 天气公告
 * 
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface TianqigonggaoDao extends BaseMapper<TianqigonggaoEntity> {
	
	List<TianqigonggaoView> selectListView(@Param("ew") Wrapper<TianqigonggaoEntity> wrapper);

	List<TianqigonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<TianqigonggaoEntity> wrapper);
	
	TianqigonggaoView selectView(@Param("ew") Wrapper<TianqigonggaoEntity> wrapper);
	

}
