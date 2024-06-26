package com.entity.view;

import com.entity.MinsuyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 民宿预订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-16 16:55:50
 */
@TableName("minsuyuding")
public class MinsuyudingView  extends MinsuyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MinsuyudingView(){
	}
 
 	public MinsuyudingView(MinsuyudingEntity minsuyudingEntity){
 	try {
			BeanUtils.copyProperties(this, minsuyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
