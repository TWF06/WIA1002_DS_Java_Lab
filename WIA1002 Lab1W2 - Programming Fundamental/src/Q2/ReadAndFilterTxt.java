package Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadAndFilterTxt {
    public static void main(String[]args){
        ReadAndFilterTxt a=new ReadAndFilterTxt();
        a.eliminateComma();
        a.eliminateCommaSpace();
        a.eliminateSemicolonSpace();
        a.eliminateNumbers();
    }
    
    public void eliminateComma(){
        String fileName = "\\E:\\UM\\Y1S2\\WIA1002 - Data Structure (12)\\WIA1002 Labs\\WIA1002 Lab1W2 - Programming Fundamental\\text1.txt";
        ArrayList <Character> list1 = new ArrayList<Character>();
        
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int counter=0;
            while((line = br.readLine())!=null){
                int length = line.length();
                for (int i=0; i<length;i++){
                    char c= line.charAt(i);
                    if(c==','){
                        continue;
                    }
                    else{
                        list1.add(c);
                    }
                }
                list1.add('\n');
                counter++;
            }
            System.out.println("text1 consist of "+(list1.size()-counter)+" characters");
            for(char c: list1){
                System.out.print(c);
            }
            br.close();
        }catch(IOException e){
            System.out.println("IOException");
        }
    }
    
    public void eliminateCommaSpace(){
        String fileName = "E:\\UM\\Y1S2\\WIA1002 - Data Structure (12)\\WIA1002 Labs\\WIA1002 Lab1W2 - Programming Fundamental\\text2.txt";
        ArrayList<Integer> list2 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(", "); 
            
                for (String s : tokens) {
                    if (!s.isEmpty()) {
                        list2.add(Integer.parseInt(s));
                    }
                }
            }

            System.out.println("List contains " + list2.size() + " integers:");
            for (int i: list2)
                System.out.println(i);

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
    
    public void eliminateSemicolonSpace(){
        String fileName = "E:\\UM\\Y1S2\\WIA1002 - Data Structure (12)\\WIA1002 Labs\\WIA1002 Lab1W2 - Programming Fundamental\\text3.txt";
        ArrayList<Double> list2 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("; "); 
            
                for (String s : tokens) {
                    if (!s.isEmpty()) {
                        list2.add(Double.parseDouble(s));
                    }
                }
            }

            System.out.println("List contains " + list2.size() + " integers:");
            for (double i: list2)
                System.out.println(i);

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
    
    public void eliminateNumbers(){
        String fileName = "\\E:\\UM\\Y1S2\\WIA1002 - Data Structure (12)\\WIA1002 Labs\\WIA1002 Lab1W2 - Programming Fundamental\\text4.txt";
        ArrayList <Character> list1 = new ArrayList<Character>();
        
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int counter=0;
            while((line = br.readLine())!=null){
                int length = line.length();
                for (int i=0; i<length;i++){
                    char c= line.charAt(i);
                    if(Character.isDigit(c)){
                        continue;
                    }
                    else{
                        list1.add(c);
                    }
                }
                list1.add('\n');
                counter++;
            }
            System.out.println("text1 consist of "+(list1.size()-counter)+" characters");
            for(char c: list1){
                System.out.print(c);
            }
            br.close();
        }catch(IOException e){
            System.out.println("IOException");
        }
    }
}
