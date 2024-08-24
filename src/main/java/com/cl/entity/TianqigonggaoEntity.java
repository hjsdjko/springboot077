package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 天气公告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
@TableName("tianqigonggao")
public class TianqigonggaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TianqigonggaoEntity() {
		
	}
	
	public TianqigonggaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 地点
	 */
					
	private String didian;
	
	/**
	 * 天气状况
	 */
					
	private String tianqizhuangkuang;
	
	/**
	 * 气温
	 */
					
	private String qiwen;
	
	/**
	 * 风向
	 */
					
	private String fengxiang;
	
	/**
	 * 风力
	 */
					
	private String fengli;
	
	/**
	 * 特殊天气预警
	 */
					
	private String teshutianqiyujing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
	/**
	 * 设置：地点
	 */
	public void setDidian(String didian) {
		this.didian = didian;
	}
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
	}
	/**
	 * 设置：天气状况
	 */
	public void setTianqizhuangkuang(String tianqizhuangkuang) {
		this.tianqizhuangkuang = tianqizhuangkuang;
	}
	/**
	 * 获取：天气状况
	 */
	public String getTianqizhuangkuang() {
		return tianqizhuangkuang;
	}
	/**
	 * 设置：气温
	 */
	public void setQiwen(String qiwen) {
		this.qiwen = qiwen;
	}
	/**
	 * 获取：气温
	 */
	public String getQiwen() {
		return qiwen;
	}
	/**
	 * 设置：风向
	 */
	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}
	/**
	 * 获取：风向
	 */
	public String getFengxiang() {
		return fengxiang;
	}
	/**
	 * 设置：风力
	 */
	public void setFengli(String fengli) {
		this.fengli = fengli;
	}
	/**
	 * 获取：风力
	 */
	public String getFengli() {
		return fengli;
	}
	/**
	 * 设置：特殊天气预警
	 */
	public void setTeshutianqiyujing(String teshutianqiyujing) {
		this.teshutianqiyujing = teshutianqiyujing;
	}
	/**
	 * 获取：特殊天气预警
	 */
	public String getTeshutianqiyujing() {
		return teshutianqiyujing;
	}

}
