package com.atguigu.gulimall.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Description：
 *
 * @author yltrcc
 * 
 **/

@Data
@ToString
public class SpuItemAttrGroupVo {

    private String groupName;

    private List<Attr> attrs;

}
