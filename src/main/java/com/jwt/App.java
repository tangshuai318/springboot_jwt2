package com.jwt;

import java.util.ArrayList;
import java.util.List;

/**
 * User: TANGSHUAI
 * Date: 2020-10-17
 * Time: 22:18
 */
public class App {

    public static void main(String[] args) {
        
        
        List<String> list = new ArrayList<>();
        list.add("zs");
        list.add("ls");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);
        }
        for (String s : list) {
            System.out.println("s = " + s);
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
    }

    public void test() {

        System.out.println("ok");
    }
}
