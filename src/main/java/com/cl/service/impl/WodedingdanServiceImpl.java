package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.WodedingdanDao;
import com.cl.entity.WodedingdanEntity;
import com.cl.service.WodedingdanService;
import com.cl.entity.view.WodedingdanView;

@Service("wodedingdanService")
public class WodedingdanServiceImpl extends ServiceImpl<WodedingdanDao, WodedingdanEntity> implements WodedingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodedingdanEntity> page = this.selectPage(
                new Query<WodedingdanEntity>(params).getPage(),
                new EntityWrapper<WodedingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodedingdanEntity> wrapper) {
		  Page<WodedingdanView> page =new Query<WodedingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<WodedingdanView> selectListView(Wrapper<WodedingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodedingdanView selectView(Wrapper<WodedingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WodedingdanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WodedingdanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WodedingdanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
