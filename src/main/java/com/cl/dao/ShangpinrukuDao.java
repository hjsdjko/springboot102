package com.cl.dao;

import com.cl.entity.ShangpinrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShangpinrukuView;


/**
 * 商品入库
 * 
 * @author 
 * @email 
 * @date 2024-03-19 14:11:38
 */
public interface ShangpinrukuDao extends BaseMapper<ShangpinrukuEntity> {
	
	List<ShangpinrukuView> selectListView(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);

	List<ShangpinrukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	
	ShangpinrukuView selectView(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	

}
