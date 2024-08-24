package com.cl.entity.view;

import com.cl.entity.ShangpinrukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 商品入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-19 14:11:38
 */
@TableName("shangpinruku")
public class ShangpinrukuView  extends ShangpinrukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinrukuView(){
	}
 
 	public ShangpinrukuView(ShangpinrukuEntity shangpinrukuEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinrukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
