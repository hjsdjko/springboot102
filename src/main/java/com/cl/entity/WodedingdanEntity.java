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
 * 我的订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-19 14:11:38
 */
@TableName("wodedingdan")
public class WodedingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WodedingdanEntity() {
		
	}
	
	public WodedingdanEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 商品编号
	 */
					
	private String shangpinbianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 商品类型
	 */
					
	private String shangpinleixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 价格
	 */
					
	private Double jiage;
	
	/**
	 * 总价
	 */
					
	private Double zongjia;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 购买日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date goumairiqi;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：商品编号
	 */
	public void setShangpinbianhao(String shangpinbianhao) {
		this.shangpinbianhao = shangpinbianhao;
	}
	/**
	 * 获取：商品编号
	 */
	public String getShangpinbianhao() {
		return shangpinbianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：商品类型
	 */
	public void setShangpinleixing(String shangpinleixing) {
		this.shangpinleixing = shangpinleixing;
	}
	/**
	 * 获取：商品类型
	 */
	public String getShangpinleixing() {
		return shangpinleixing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Double getJiage() {
		return jiage;
	}
	/**
	 * 设置：总价
	 */
	public void setZongjia(Double zongjia) {
		this.zongjia = zongjia;
	}
	/**
	 * 获取：总价
	 */
	public Double getZongjia() {
		return zongjia;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：购买日期
	 */
	public void setGoumairiqi(Date goumairiqi) {
		this.goumairiqi = goumairiqi;
	}
	/**
	 * 获取：购买日期
	 */
	public Date getGoumairiqi() {
		return goumairiqi;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
