package com.mwz.jdkProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: yuuki
 * @Date: 2021-03-08 - 03 - 15:47
 * @Description: com.mwz.jdkProxy
 * @version: 1.0
 */
public class JdkProxy {
    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        ClassLoader classLoader=this.getClass().getClassLoader();

        Class[] interfaces=target.getClass().getInterfaces();

        InvocationHandler invocationHandler= new InvocationHandler() {
            /**
             * @param proxy
             * @param method
             * @param args
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               Object object= method.invoke(target,args);
                    return object;
            }
        };
        Object proxy=Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);// ？
        return proxy;
    }
}
