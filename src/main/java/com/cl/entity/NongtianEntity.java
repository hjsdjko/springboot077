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
 * 农田
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-01 09:53:50
 */
@TableName("nongtian")
public class NongtianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongtianEntity() {
		
	}
	
	public NongtianEntity(T t) {
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
	 * 农田名称
	 */
					
	private String nongtianmingcheng;
	
	/**
	 * 位置
	 */
					
	private String weizhi;
	
	/**
	 * 面积
	 */
					
	private String mianji;
	
	/**
	 * 土地用途
	 */
					
	private String tudiyongtu;
	
	/**
	 * 地形特征
	 */
					
	private String dixingtezheng;
	
	/**
	 * 土地质量
	 */
					
	private String tudizhiliang;
	
	/**
	 * 水资源
	 */
					
	private String shuiziyuan;
	
	/**
	 * 地理环境
	 */
					
	private String dilihuanjing;
	
	/**
	 * 土地图片
	 */
					
	private String tuditupian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	
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
	 * 设置：农田名称
	 */
	public void setNongtianmingcheng(String nongtianmingcheng) {
		this.nongtianmingcheng = nongtianmingcheng;
	}
	/**
	 * 获取：农田名称
	 */
	public String getNongtianmingcheng() {
		return nongtianmingcheng;
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
	 * 设置：面积
	 */
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
	/**
	 * 设置：土地用途
	 */
	public void setTudiyongtu(String tudiyongtu) {
		this.tudiyongtu = tudiyongtu;
	}
	/**
	 * 获取：土地用途
	 */
	public String getTudiyongtu() {
		return tudiyongtu;
	}
	/**
	 * 设置：地形特征
	 */
	public void setDixingtezheng(String dixingtezheng) {
		this.dixingtezheng = dixingtezheng;
	}
	/**
	 * 获取：地形特征
	 */
	public String getDixingtezheng() {
		return dixingtezheng;
	}
	/**
	 * 设置：土地质量
	 */
	public void setTudizhiliang(String tudizhiliang) {
		this.tudizhiliang = tudizhiliang;
	}
	/**
	 * 获取：土地质量
	 */
	public String getTudizhiliang() {
		return tudizhiliang;
	}
	/**
	 * 设置：水资源
	 */
	public void setShuiziyuan(String shuiziyuan) {
		this.shuiziyuan = shuiziyuan;
	}
	/**
	 * 获取：水资源
	 */
	public String getShuiziyuan() {
		return shuiziyuan;
	}
	/**
	 * 设置：地理环境
	 */
	public void setDilihuanjing(String dilihuanjing) {
		this.dilihuanjing = dilihuanjing;
	}
	/**
	 * 获取：地理环境
	 */
	public String getDilihuanjing() {
		return dilihuanjing;
	}
	/**
	 * 设置：土地图片
	 */
	public void setTuditupian(String tuditupian) {
		this.tuditupian = tuditupian;
	}
	/**
	 * 获取：土地图片
	 */
	public String getTuditupian() {
		return tuditupian;
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

}
