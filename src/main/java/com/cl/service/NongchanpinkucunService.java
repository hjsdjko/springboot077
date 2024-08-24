package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.NongchanpinkucunEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.NongchanpinkucunView;


/**
 * 农产品库存
 *
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface NongchanpinkucunService extends IService<NongchanpinkucunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchanpinkucunView> selectListView(Wrapper<NongchanpinkucunEntity> wrapper);
   	
   	NongchanpinkucunView selectView(@Param("ew") Wrapper<NongchanpinkucunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchanpinkucunEntity> wrapper);
   	

}

