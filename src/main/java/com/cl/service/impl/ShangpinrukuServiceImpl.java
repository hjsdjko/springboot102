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


import com.cl.dao.ShangpinrukuDao;
import com.cl.entity.ShangpinrukuEntity;
import com.cl.service.ShangpinrukuService;
import com.cl.entity.view.ShangpinrukuView;

@Service("shangpinrukuService")
public class ShangpinrukuServiceImpl extends ServiceImpl<ShangpinrukuDao, ShangpinrukuEntity> implements ShangpinrukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinrukuEntity> page = this.selectPage(
                new Query<ShangpinrukuEntity>(params).getPage(),
                new EntityWrapper<ShangpinrukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinrukuEntity> wrapper) {
		  Page<ShangpinrukuView> page =new Query<ShangpinrukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShangpinrukuView> selectListView(Wrapper<ShangpinrukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinrukuView selectView(Wrapper<ShangpinrukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
