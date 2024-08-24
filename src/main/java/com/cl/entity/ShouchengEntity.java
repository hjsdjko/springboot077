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
 * 收成
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
@TableName("shoucheng")
public class ShouchengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShouchengEntity() {
		
	}
	
	public ShouchengEntity(T t) {
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
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 作物名称
	 */
					
	private String zuowumingcheng;
	
	/**
	 * 位置
	 */
					
	private String weizhi;
	
	/**
	 * 地块名称
	 */
					
	private String dikuaimingcheng;
	
	/**
	 * 收成日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shouchengriqi;
	
	/**
	 * 品质
	 */
					
	private String pinzhi;
	
	/**
	 * 产量
	 */
					
	private Integer chanliang;
	
	
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
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：作物名称
	 */
	public void setZuowumingcheng(String zuowumingcheng) {
		this.zuowumingcheng = zuowumingcheng;
	}
	/**
	 * 获取：作物名称
	 */
	public String getZuowumingcheng() {
		return zuowumingcheng;
	}
	/**
	 * 设置：位置
	 */
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
	/**
	 * 设置：地块名称
	 */
	public void setDikuaimingcheng(String dikuaimingcheng) {
		this.dikuaimingcheng = dikuaimingcheng;
	}
	/**
	 * 获取：地块名称
	 */
	public String getDikuaimingcheng() {
		return dikuaimingcheng;
	}
	/**
	 * 设置：收成日期
	 */
	public void setShouchengriqi(Date shouchengriqi) {
		this.shouchengriqi = shouchengriqi;
	}
	/**
	 * 获取：收成日期
	 */
	public Date getShouchengriqi() {
		return shouchengriqi;
	}
	/**
	 * 设置：品质
	 */
	public void setPinzhi(String pinzhi) {
		this.pinzhi = pinzhi;
	}
	/**
	 * 获取：品质
	 */
	public String getPinzhi() {
		return pinzhi;
	}
	/**
	 * 设置：产量
	 */
	public void setChanliang(Integer chanliang) {
		this.chanliang = chanliang;
	}
	/**
	 * 获取：产量
	 */
	public Integer getChanliang() {
		return chanliang;
	}

}
