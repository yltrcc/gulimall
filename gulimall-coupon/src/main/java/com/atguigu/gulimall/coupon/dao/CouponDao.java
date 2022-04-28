package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author leifengyang
 * Email： leifengyang@gmail.com
 * Date： 2019-10-08 09:36:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
