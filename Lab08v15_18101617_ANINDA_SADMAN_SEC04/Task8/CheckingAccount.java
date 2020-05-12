public class CheckingAccount extends Account{
    public static int numberOfAccount;
    public CheckingAccount(){
        super(0);
        numberOfAccount++;
    }
    public CheckingAccount(double n){
        super(n);
        numberOfAccount++;
    }
}
