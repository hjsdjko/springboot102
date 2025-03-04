package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WodedingdanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WodedingdanView;


/**
 * 我的订单
 *
 * @author 
 * @email 
 * @date 2024-03-19 14:11:38
 */
public interface WodedingdanService extends IService<WodedingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodedingdanView> selectListView(Wrapper<WodedingdanEntity> wrapper);
   	
   	WodedingdanView selectView(@Param("ew") Wrapper<WodedingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodedingdanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WodedingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WodedingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WodedingdanEntity> wrapper);



}

