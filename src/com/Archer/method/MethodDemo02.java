package com.Archer.method;

/**
 * Created by Archer on 2016/3/24.
 * @function 方法的重载
 */
public class MethodDemo02 {

    public static void main(String[] args) {

        tell(10,20);
        tell(10,20,30);
    }

    public void tell(){

    }

    public void tell(int i){

    }

    //编译器报错，只是更变了返回值类型，不算重载
    public static void tell(int j,int i){
        System.out.println(i+j);

    }

    public static void tell(int j,int i,int f){
        System.out.println(i+j+f);
    }


}
