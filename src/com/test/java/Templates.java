package com.test.java;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2019-04-16 15:19
 */
public class Templates {

    //prsf
    private static final HelloWord CUSTOMER = new HelloWord();
    //psf
    public static final String A = "SSS";

    //psvm  生成main方法
    public static void main(String[] args) {

        //sout输出语句
        System.out.println("--");
        //soutp 输出方法形参
        System.out.println("args = [" + args + "]");
        int a = 0;
        //soutv 输出最近的一个变量名
        System.out.println("a = " + a);
        //soutm 输出当前类名.方法名
        System.out.println("Templates.main");


        String[] arr = new String[]{"Tom", "Jerry", "KangKang", "Jean"};
        //fori 生成普通for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter 增强for
        for (String s : arr) {
            System.out.println(s);
        }
        //itar for循环并赋值
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
        }
        ArrayList list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");

        //循环
        //list.for
        for (Object o : list) {

        }
        //list.fori
        for (int k = 0; k < list.size(); k++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }


        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.nn/xxx.null 指定变量的判断

    }

    public void method() {

    }
}
