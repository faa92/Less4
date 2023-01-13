
public class CreditCardDemo {
    private final int AccNum;
    private int balance;

    public CreditCardDemo(int AccNum) {
        this.AccNum = AccNum;


    }

    public void setValues (int balance) {                 //void не выводит (sout) info по карте, как исправить?

        this.balance = balance;

    }
     public String getValues () {
         return "Номер счёта: " + AccNum + "\n" + "Баланс: " + balance;
     }


    public int getAccNum() {
        return AccNum;
    }
    public void addBalance(int value) {
        balance = balance + value;

    }
    public void delBalance (int value) {
        balance = balance - value;
    }



}





