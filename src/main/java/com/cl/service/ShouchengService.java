package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShouchengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShouchengView;


/**
 * 收成
 *
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface ShouchengService extends IService<ShouchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouchengView> selectListView(Wrapper<ShouchengEntity> wrapper);
   	
   	ShouchengView selectView(@Param("ew") Wrapper<ShouchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouchengEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShouchengEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShouchengEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShouchengEntity> wrapper);



}

