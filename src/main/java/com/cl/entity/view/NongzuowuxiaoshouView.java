package com.cl.entity.view;

import com.cl.entity.NongzuowuxiaoshouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 农作物销售
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
@TableName("nongzuowuxiaoshou")
public class NongzuowuxiaoshouView  extends NongzuowuxiaoshouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongzuowuxiaoshouView(){
	}
 
 	public NongzuowuxiaoshouView(NongzuowuxiaoshouEntity nongzuowuxiaoshouEntity){
 	try {
			BeanUtils.copyProperties(this, nongzuowuxiaoshouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
