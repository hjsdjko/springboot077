package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.TianqigonggaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TianqigonggaoView;


/**
 * 天气公告
 *
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
public interface TianqigonggaoService extends IService<TianqigonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TianqigonggaoView> selectListView(Wrapper<TianqigonggaoEntity> wrapper);
   	
   	TianqigonggaoView selectView(@Param("ew") Wrapper<TianqigonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TianqigonggaoEntity> wrapper);
   	

}

