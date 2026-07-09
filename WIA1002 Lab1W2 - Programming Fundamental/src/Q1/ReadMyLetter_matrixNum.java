package Q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadMyLetter_matrixNum {
    public void readLetter(){
        String fileName = "E:\\UM\\Y1S2\\WIA1002 - Data Structure (12)\\WIA1002 Labs\\WIA1002 Lab1W2 - Programming Fundamental\\TanWF_25005493.txt";
        System.out.println("Reading from file: " + fileName);
        
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }catch (IOException e){
        System.out.println("IOException");
        }
    }
    
    public void appendLetter(){
        Scanner sc= new Scanner(System.in);
        String fileName = "E:\\UM\\Y1S2\\WIA1002 - Data Structure (12)\\WIA1002 Labs\\WIA1002 Lab1W2 - Programming Fundamental\\TanWF_25005493.txt";
        System.out.println("Writing to file: " + fileName);
        System.out.println("Write your content: ");
        String str = sc.nextLine();
        try{
            FileWriter fw = new FileWriter(fileName,true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.newLine();
            bw.write(str);
            bw.close();
            
            ReadMyLetter_matrixNum a= new ReadMyLetter_matrixNum();
            a.readLetter();
        }catch(IOException e){
            System.out.println("IOException");
        }
    }
    
    public static void main(String[]args){
        ReadMyLetter_matrixNum a= new ReadMyLetter_matrixNum();
        a.readLetter();
        a.appendLetter();
    }
}
