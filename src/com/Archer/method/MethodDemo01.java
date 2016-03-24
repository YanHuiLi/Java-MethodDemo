package com.Archer.method;

/**
 * @function Java方法的创建和重载
 *
 * @加油~
 * Created by Archer on 2016/3/24.
 */
public class MethodDemo01 {


    public static void main(String[] args) {

    }

    //方法的创建，访问修饰符，返回值类型，方法名称（首小字母小写）
    //void为空
    public void tellMe(){
        //方法体
        System.out.println("hello Archer!");


    }

    /**
     * 除了void类型不需要返回值，其他类型都需要
     * @return
     */
    public int say(){

        System.out.println("hello me ");

        return  0;
    }

    public String print(){


        return "hello";
    }

    //可以添加参数，无返回值
    public void tell1(int i,String n){
        System.out.println(i);
        System.out.println(n);


    }

    //有返回值又可以添加参数

    public int tell2(int i){
        return  i;
    }

    /**
     * 方法的重载，方法的名称相同，但是参数的类型和个数不同
     * 通过传递参数的个数和类型不同来完成不同的功能
     */



}