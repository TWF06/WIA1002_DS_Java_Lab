package Q3;

public class Test {
    public static void main(String []args){
        Account s = new Account(1122, 20000);
        s.setAIR(4.5);
        s.withdraw(2500);
        s.deposit(3000);
        System.out.printf("Account balance : RM%.2f%n",s.getBalance());
        s.getMonthlyInterest();
        System.out.println("Account created :"+ s.getDate());
        
        s.generateMonthlyInterest();
        System.out.printf("Account balance : RM%.2f%n",s.getBalance());
    }
}
