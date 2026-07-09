package Q4;

import java.util.ArrayList;

public class Account1 extends Account{
    private String name;
    ArrayList <Transaction>transaction = new ArrayList<>();
    
    Account1(String name, int id, double balance){
        super(id,balance);
        this.name=name;
    
    }
    
    public boolean withdraw(double amount){
        if(amount<getBalance()){
            setBalance(getBalance()-amount);
            transaction.add(new Transaction('w',amount,getBalance(),"Withdraw RM"+amount));
            System.out.printf("Successfully withdraw. RM %.2f %n",amount);
            return true;
        }
        else{
            System.out.printf("Insufficient balance. You have RM%.2f left%n",getBalance());
            return false;
        }
    }
    
    public void deposit(double amount){
        setBalance(getBalance()+amount);
        transaction.add(new Transaction('d',amount,getBalance(),"Deposit RM"+amount));
        System.out.printf("Successfully deposited RM %.2f %n",amount);
    }
    
    public void accSummary(){
        System.out.println("Account Holder:"+name);
        System.out.println("Interest Rate PA:"+getAIR());
        for(Transaction a:transaction){
            System.out.print(a);
        }
    }
}
