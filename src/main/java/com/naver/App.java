package com.naver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private String who = null;

    public static void main(String[] args) {
        //获取Spring的ApplicationContext配置文件，注入IOC容器中
        //(Map: key:String, bean标签的id属性值 ==>value:Object, bean标签class属性所指类的实例)
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hw1 = (HelloWorld)factory.getBean("hello");//map.get("hello")
        System.out.println(hw1.getInfo());
        System.out.println(hw1);

    }
}
