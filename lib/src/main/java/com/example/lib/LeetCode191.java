package com.example.lib;



//编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
//输入：00000000000000000000000000001011
//输出：3
//解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
public class LeetCode191 {


    public static int hammingWeight(int n) {
        int mask = 1;
        int count =0;
        for(int i=0;i<32;i++){
            if((n&mask)!=0){
                count++;
            }
            mask<<=1;
        }
        return count;
    }

    public static void main(String[] args) {



        int num = hammingWeight(00000000000000000000000000001011);

        System.out.printf(""+num);
    }

}
