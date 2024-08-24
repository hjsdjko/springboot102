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


import com.cl.dao.DiscusswodedingdanDao;
import com.cl.entity.DiscusswodedingdanEntity;
import com.cl.service.DiscusswodedingdanService;
import com.cl.entity.view.DiscusswodedingdanView;

@Service("discusswodedingdanService")
public class DiscusswodedingdanServiceImpl extends ServiceImpl<DiscusswodedingdanDao, DiscusswodedingdanEntity> implements DiscusswodedingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswodedingdanEntity> page = this.selectPage(
                new Query<DiscusswodedingdanEntity>(params).getPage(),
                new EntityWrapper<DiscusswodedingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswodedingdanEntity> wrapper) {
		  Page<DiscusswodedingdanView> page =new Query<DiscusswodedingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusswodedingdanView> selectListView(Wrapper<DiscusswodedingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswodedingdanView selectView(Wrapper<DiscusswodedingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
