package com.cl.entity.view;

import com.cl.entity.NongchanpinkucunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 农产品库存
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
@TableName("nongchanpinkucun")
public class NongchanpinkucunView  extends NongchanpinkucunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongchanpinkucunView(){
	}
 
 	public NongchanpinkucunView(NongchanpinkucunEntity nongchanpinkucunEntity){
 	try {
			BeanUtils.copyProperties(this, nongchanpinkucunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
