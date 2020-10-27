package com.zhujidong.bean;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    //生成静态prsf
    private static final String ss="22";
    //变形 psf
    public static final int NUM=1;
    public static final int MU=2;
    public static final String SS="11";

    public static void main(String[] args) throws FileNotFoundException {
//        getString();
        //        FileInputStream fileInputStream=new FileInputStream("");
        String [] strings=new String[]{"tom","jerry","hanmeiemi"};
        //fori
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);

        }
        //iter
        for (String string : strings) {
            System.out.println(string);
        }
        //itar
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            System.out.println(string);
        }
        //模板四 list.for
        List list=new ArrayList();
        list.add("sss");
        list.add("222");
        list.add("sssa");
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }


    }

    public static void getString() {
        String string="sss";
        ArrayList arrayList=new ArrayList();
        System.out.println("arrayList = " + arrayList);
        System.out.println("Customer.getString");
        System.out.println(string);
    }
    public  void method(){
        List list=new ArrayList();
        list.add("sss");
        list.add("222");
        list.add("sssa");
        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        
    }


}
