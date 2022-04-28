package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Description：
 *
 * @author yltrcc
 * 
 **/

@Data
public class SpuBoundTo {

    private Long spuId;

    private BigDecimal buyBounds;

    private BigDecimal growBounds;

}
