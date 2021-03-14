package com.mwz.staticProxy;

/**
 * @author: yuuki
 * @Date: 2021-03-04 - 03 - 17:20
 * @Description: com.mwz.staticProxy
 * @version: 1.0
 * 实现目标角色行为，增强目标角色行为
 */
public class Agency implements RentHouse {
    //目标对象
    private RentHouse target;

    public Agency(RentHouse target) {
        this.target = target;
    }

    @Override
    public void toRentHouse() {
        // 功能的扩展
        System.out.println("发布租房信息...");

        target.toRentHouse();

        // 功能的扩展
        System.out.println("签订合同...");
    }
}
