package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * Description：
 *
 * @author yltrcc
 *
 **/

@Data
public class AttrRespVo extends AttrVo {

    /**
     *
     */
    private String catelogName;

    private String groupName;

    private Long[] catelogPath;

}
