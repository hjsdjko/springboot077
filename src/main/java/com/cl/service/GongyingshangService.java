package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.GongyingshangEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GongyingshangView;


/**
 * 供应商
 *
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface GongyingshangService extends IService<GongyingshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyingshangView> selectListView(Wrapper<GongyingshangEntity> wrapper);
   	
   	GongyingshangView selectView(@Param("ew") Wrapper<GongyingshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyingshangEntity> wrapper);
   	

}

