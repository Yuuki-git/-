package com.mwz.jdkProxy;

import com.mwz.staticProxy.Marry;
import com.mwz.staticProxy.RentHouse;
import com.mwz.staticProxy.Tenant;


/**
 * @author: yuuki
 * @Date: 2021-03-08 - 03 - 16:02
 * @Description: com.mwz.jdkProxy
 * @version: 1.0
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        // 得到目标对象
        RentHouse target=new Tenant();
        // 获取代理类
        JdkProxy jdkProxy=new JdkProxy(target);
        // 得到代理对象
        RentHouse rentHouse= (RentHouse) jdkProxy.getProxy();
        // 通过代理对象实现方法
            rentHouse.toRentHouse();

        Marry target2=new Tenant();

        JdkProxy jdkProxy1=new JdkProxy(target2);

        Marry marry= (Marry) jdkProxy1.getProxy();

        marry.toMarry();
    }
}
