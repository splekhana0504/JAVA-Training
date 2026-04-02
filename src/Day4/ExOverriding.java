package Day4;
class Bank{
    double GetInterestRate(){
        return 5.0;
    }
}
class SavingBank extends Bank{
    @Override
    double GetInterestRate(){
        return 7.5;
    }
}
public class ExOverriding {
    public static void main(String[] args) {
        Bank b=new SavingBank();
        System.out.println("Interest Rate:"+b.GetInterestRate());
    }
}