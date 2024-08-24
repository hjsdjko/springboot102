package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusswodedingdanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusswodedingdanView;


/**
 * 我的订单评论表
 *
 * @author 
 * @email 
 * @date 2024-03-19 14:11:38
 */
public interface DiscusswodedingdanService extends IService<DiscusswodedingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswodedingdanView> selectListView(Wrapper<DiscusswodedingdanEntity> wrapper);
   	
   	DiscusswodedingdanView selectView(@Param("ew") Wrapper<DiscusswodedingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswodedingdanEntity> wrapper);
   	

}

