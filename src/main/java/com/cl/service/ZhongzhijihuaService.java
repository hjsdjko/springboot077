package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhongzhijihuaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhongzhijihuaView;


/**
 * 种植计划
 *
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface ZhongzhijihuaService extends IService<ZhongzhijihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzhijihuaView> selectListView(Wrapper<ZhongzhijihuaEntity> wrapper);
   	
   	ZhongzhijihuaView selectView(@Param("ew") Wrapper<ZhongzhijihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzhijihuaEntity> wrapper);
   	

}

