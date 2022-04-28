package com.atguigu.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atguigu.gulimall.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author yltrcc
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:00:18
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
