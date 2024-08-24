package com.cl.dao;

import com.cl.entity.ZhongzhijihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhongzhijihuaView;


/**
 * 种植计划
 * 
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface ZhongzhijihuaDao extends BaseMapper<ZhongzhijihuaEntity> {
	
	List<ZhongzhijihuaView> selectListView(@Param("ew") Wrapper<ZhongzhijihuaEntity> wrapper);

	List<ZhongzhijihuaView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzhijihuaEntity> wrapper);
	
	ZhongzhijihuaView selectView(@Param("ew") Wrapper<ZhongzhijihuaEntity> wrapper);
	

}
