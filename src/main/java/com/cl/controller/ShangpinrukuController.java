package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ShangpinrukuEntity;
import com.cl.entity.view.ShangpinrukuView;

import com.cl.service.ShangpinrukuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 商品入库
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-19 14:11:38
 */
@RestController
@RequestMapping("/shangpinruku")
public class ShangpinrukuController {
    @Autowired
    private ShangpinrukuService shangpinrukuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangpinrukuEntity shangpinruku,
		HttpServletRequest request){
        EntityWrapper<ShangpinrukuEntity> ew = new EntityWrapper<ShangpinrukuEntity>();

		PageUtils page = shangpinrukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinruku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangpinrukuEntity shangpinruku, 
		HttpServletRequest request){
        EntityWrapper<ShangpinrukuEntity> ew = new EntityWrapper<ShangpinrukuEntity>();

		PageUtils page = shangpinrukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinruku), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangpinrukuEntity shangpinruku){
       	EntityWrapper<ShangpinrukuEntity> ew = new EntityWrapper<ShangpinrukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangpinruku, "shangpinruku")); 
        return R.ok().put("data", shangpinrukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangpinrukuEntity shangpinruku){
        EntityWrapper< ShangpinrukuEntity> ew = new EntityWrapper< ShangpinrukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangpinruku, "shangpinruku")); 
		ShangpinrukuView shangpinrukuView =  shangpinrukuService.selectView(ew);
		return R.ok("查询商品入库成功").put("data", shangpinrukuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangpinrukuEntity shangpinruku = shangpinrukuService.selectById(id);
		shangpinruku = shangpinrukuService.selectView(new EntityWrapper<ShangpinrukuEntity>().eq("id", id));
        return R.ok().put("data", shangpinruku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangpinrukuEntity shangpinruku = shangpinrukuService.selectById(id);
		shangpinruku = shangpinrukuService.selectView(new EntityWrapper<ShangpinrukuEntity>().eq("id", id));
        return R.ok().put("data", shangpinruku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangpinrukuEntity shangpinruku, HttpServletRequest request){
    	shangpinruku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinruku);
        shangpinrukuService.insert(shangpinruku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangpinrukuEntity shangpinruku, HttpServletRequest request){
    	shangpinruku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinruku);
        shangpinrukuService.insert(shangpinruku);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShangpinrukuEntity shangpinruku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangpinruku);
        shangpinrukuService.updateById(shangpinruku);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangpinrukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
