package com.xu.dubbo.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @author  xu
 * @version 1.0 
 */
public class DubboProvider {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        System.out.println("服务启动.....");
        System.in.read();
    }
}
