package com.yltrcc.app.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Package: com.yltrcc.app
 * Date：2022-01-13
 * Time：10:09
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class CouponMain {

    public static void main(String[] args) {
        SpringApplication.run(CouponMain.class, args);
    }

}
