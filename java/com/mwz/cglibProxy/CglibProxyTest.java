package com.mwz.cglibProxy;

import com.mwz.staticProxy.RentHouse;
import com.mwz.staticProxy.Tenant;

/**
 * @author: yuuki
 * @Date: 2021-03-10 - 03 - 22:57
 * @Description: com.mwz.cglibProxy
 * @version: 1.0
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        // 获取目标对象
        RentHouse target=new Tenant();
        // 生成代理类
        CglibProxy cglibProxy=new CglibProxy(target);
        //通过带参构造获取代理对象
        RentHouse rentHouse= (RentHouse) cglibProxy.getProxy();
        // 调用
        rentHouse.toRentHouse();
    }
}
