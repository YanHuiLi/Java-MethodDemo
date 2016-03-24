package com.Archer.method;

/**
 * Created by Archer on 2016/3/24.
 * @方法的递归调用
 *
 */
public class MethodDemo03 {
    public static void main(String[] args) {
addNum(100);
        System.out.println(addNum(100));
    }

    /**
     *从1加到100
     * @param num
     * @return
     */
    private static int addNum(int num){
        if (num==1){//程序出口
            return 1;
        }else {
            return num+addNum(num -1);
        }
    }
}
