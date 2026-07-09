/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabRecursion;

/**
 *
 * @author Tan Wei Feng
 */
public class Q1 {
    public static void main(String[] args) {
        System.out.println(substituteAI("flabbergasted"));
        System.out.println(substituteAI("Astronaut"));
    }

    public static String substituteAI(String str) {
        //Base Case:
        if (str.length() == 0) {
            return str;
        } //Recursive Case:
        else if (str.charAt(0) == ('a')) {
            return 'i' + substituteAI(str.substring(1));
        } else {
            return str.charAt(0) + substituteAI(str.substring(1));
        }
    }
}
