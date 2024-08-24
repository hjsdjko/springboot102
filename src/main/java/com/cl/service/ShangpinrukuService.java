package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShangpinrukuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShangpinrukuView;


/**
 * 商品入库
 *
 * @author 
 * @email 
 * @date 2024-03-19 14:11:38
 */
public interface ShangpinrukuService extends IService<ShangpinrukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinrukuView> selectListView(Wrapper<ShangpinrukuEntity> wrapper);
   	
   	ShangpinrukuView selectView(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinrukuEntity> wrapper);
   	

}

