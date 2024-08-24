package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.NongtianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.NongtianView;


/**
 * 农田
 *
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface NongtianService extends IService<NongtianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongtianView> selectListView(Wrapper<NongtianEntity> wrapper);
   	
   	NongtianView selectView(@Param("ew") Wrapper<NongtianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongtianEntity> wrapper);
   	

}

