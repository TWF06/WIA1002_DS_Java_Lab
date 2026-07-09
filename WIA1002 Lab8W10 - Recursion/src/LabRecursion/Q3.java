/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabRecursion;

/**
 *
 * @author Tan Wei Feng
 */
public class Q3 {
    public static void main(String[] args) {
        System.out.println("result : " + exponent(10, 3));
    }

    public static long exponent(int x, int m) {
        if (m == 0) {
            return 1;
        }
        if (m == 1) {
            return x;
        }
        return x * exponent(x, m - 1);
    }
}
