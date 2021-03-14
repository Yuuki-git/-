package com.mwz.staticProxy;

/**
 * @author: yuuki
 * @Date: 2021-03-04 - 03 - 17:22
 * @Description: com.mwz.staticProxy
 * @version: 1.0
 */
public class Tenant implements RentHouse,Marry{

    @Override
    public void toRentHouse() {
        System.out.println("需要一间三室一厅的房子");
    }

    @Override
    public void toMarry() {
        System.out.println("我要结婚了..");
    }
}
