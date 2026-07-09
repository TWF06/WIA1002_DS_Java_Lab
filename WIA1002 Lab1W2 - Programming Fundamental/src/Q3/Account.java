package Q3;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    
    Account(){
        dateCreated = new Date();
    }
    
    Account(int id, double balance){
        this.id = id;
        this.balance= balance;
        dateCreated = new Date();
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    public double getAIR(){
        return annualInterestRate;
    }
    
    public void setAIR(double AIR){
        this.annualInterestRate=AIR;
    }
    
    public String getDate(){
        return dateCreated.toString();
    }
    
    public double getMonthlyInterestRate(){
        double MIR = annualInterestRate/12.0;
        System.out.println("Monthly Interest Rate: "+MIR+"%");
        return MIR;
    }
    
    public double getMonthlyInterest(){
        double MI= balance*getMonthlyInterestRate()/100.0;
        System.out.printf("Monthly Interest: RM %.2f %n", MI);
        return MI;
    }
    
    public void generateMonthlyInterest(){
        double MI = getMonthlyInterest();
        balance= balance+MI;
    }
    
    public boolean withdraw(double amount){
        if(amount<balance){
            balance=balance-amount;
            System.out.printf("Successfully withdraw. RM %.2f %n",amount);
            return true;
        }
        else{
            System.out.printf("Insufficient balance. You have RM%.2f left%n",balance);
            return false;
        }
    }
    
    public void deposit(double amount){
        balance= balance+amount;
        System.out.printf("Successfully deposited RM %.2f %n",amount);
    }
}
