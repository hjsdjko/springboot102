package com.cl.dao;

import com.cl.entity.DiscusswodedingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusswodedingdanView;


/**
 * 我的订单评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-19 14:11:38
 */
public interface DiscusswodedingdanDao extends BaseMapper<DiscusswodedingdanEntity> {
	
	List<DiscusswodedingdanView> selectListView(@Param("ew") Wrapper<DiscusswodedingdanEntity> wrapper);

	List<DiscusswodedingdanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswodedingdanEntity> wrapper);
	
	DiscusswodedingdanView selectView(@Param("ew") Wrapper<DiscusswodedingdanEntity> wrapper);
	

}
