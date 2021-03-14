package com.mwz.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: yuuki
 * @Date: 2021-03-10 - 03 - 22:39
 * @Description: com.mwz.cglibProxy
 * @version: 1.0
 */
public class CglibProxy {
    // 目标对象
    private Object target;
    // 通过构造器得到目标对象

    public CglibProxy(Object target) {
        this.target = target;
    }

    /**
     *
     * @return
     */
    public Object getProxy(){
     // 通过enhancer类的create方法可以生成一个类，用来生成代理对象
        Enhancer enhancer=new Enhancer();
        // 设置父类（将目标对象声明为当前生成类的父类）
        enhancer.setSuperclass(target.getClass());
        MethodInterceptor methodInterceptor=new MethodInterceptor() {
            /**
             * 拦截器：
             *  1.返回目标对象
             *  2.增强目标行为
             * @param o 由cglib动态生成的代理类实例
             * @param method 实体类所调用的被代理方法的引用
             * @param objects 参数列表
             * @param methodProxy 生成代理类所调用的方法的引用
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object object=methodProxy.invoke(target,objects);
                return object;
            }
        };
        // 设置拦截器 回调对象为本身对象
        enhancer.setCallback(methodInterceptor);
        // 生成一个代理对象并返回
        return enhancer.create();
    }




}
