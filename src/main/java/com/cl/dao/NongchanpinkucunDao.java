package com.cl.dao;

import com.cl.entity.NongchanpinkucunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.NongchanpinkucunView;


/**
 * 农产品库存
 * 
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface NongchanpinkucunDao extends BaseMapper<NongchanpinkucunEntity> {
	
	List<NongchanpinkucunView> selectListView(@Param("ew") Wrapper<NongchanpinkucunEntity> wrapper);

	List<NongchanpinkucunView> selectListView(Pagination page,@Param("ew") Wrapper<NongchanpinkucunEntity> wrapper);
	
	NongchanpinkucunView selectView(@Param("ew") Wrapper<NongchanpinkucunEntity> wrapper);
	

}
