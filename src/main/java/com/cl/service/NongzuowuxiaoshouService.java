package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.NongzuowuxiaoshouEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.NongzuowuxiaoshouView;


/**
 * 农作物销售
 *
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface NongzuowuxiaoshouService extends IService<NongzuowuxiaoshouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongzuowuxiaoshouView> selectListView(Wrapper<NongzuowuxiaoshouEntity> wrapper);
   	
   	NongzuowuxiaoshouView selectView(@Param("ew") Wrapper<NongzuowuxiaoshouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongzuowuxiaoshouEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<NongzuowuxiaoshouEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<NongzuowuxiaoshouEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<NongzuowuxiaoshouEntity> wrapper);



}

