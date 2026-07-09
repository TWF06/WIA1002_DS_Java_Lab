package Q4;

public class Test {
    public static void main(String []args){
        Account1 s = new Account1("George", 1122, 1000);
        s.setAIR(1.5);
        
        s.deposit(30);
        s.deposit(40);
        s.deposit(50);
        s.withdraw(5);
        s.withdraw(4);
        s.withdraw(2);
        
        System.out.printf("Account balance : RM%.2f%n",s.getBalance());
        s.getMonthlyInterest();
        System.out.println("Account created :"+ s.getDate());
        
        s.generateMonthlyInterest();
        System.out.printf("Account balance : RM%.2f%n",s.getBalance());
        
        s.accSummary();
    }
}
