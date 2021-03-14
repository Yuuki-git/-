package com.mwz.staticProxy;

/**
 * @author: yuuki
 * @Date: 2021-03-04 - 03 - 17:25
 * @Description: com.mwz.staticProxy
 * @version: 1.0
 */
public class Stater {
    public static void main(String[] args) {
       // 静态代理
       // 得到目标角色
        RentHouse target=new Tenant();

        // 得到代理角色
        Agency agency=new Agency(target);

        agency.toRentHouse();

    }
}
