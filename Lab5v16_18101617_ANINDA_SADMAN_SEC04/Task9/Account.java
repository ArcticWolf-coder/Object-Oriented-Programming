public class Account{
    public String name="Default Account";
    public double balance;
    private double min=100;
    public String nameKi(){
        return name;
    }
    public double balanceKi(){
        return balance;
    }
    public void withdraw(double d){
        if(balance-d>min){
            balance-=d;
            System.out.println("Withdraw successful! New balance is: "+balance);
        } else {
            System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        }
    }   
    public static double interestRate=5.0;
    public void nameBoshao(String name){
        this.name=name;
    }
    public void balanceBoshao(double balance){
        this.balance=balance;
    }
    public Account(){
    }
    public Account(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
}
    
    