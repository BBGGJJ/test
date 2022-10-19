package com.gbj.mybatis.test;

import java.util.UUID;

/**
 * @program: mybatis
 * @ClassName: test01
 * @Version 1.0
 * @author: 龚宝金
 * @create: 2022-10-19 13:29
 **/
public class test01 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        s = s.replace("-","");
        System.out.println(s);
        System.out.println(s.length());
    }
}
