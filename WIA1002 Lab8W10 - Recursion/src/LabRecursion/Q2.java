/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabRecursion;

/**
 *
 * @author Tan Wei Feng
 */
public class Q2 {
    public static void main(String[] args) {
        permuteString("", "ABC");
    }

    public static void permuteString(String beginningString, String endingString) {
        if (endingString.length() <= 1) {
            System.out.println(beginningString + endingString);
        } else {
            for (int i = 0; i < endingString.length(); i++) {
                String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                permuteString(beginningString + endingString.charAt(i), newString);
            }
        }
    }
}
