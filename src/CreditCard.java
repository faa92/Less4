import java.util.Scanner;
public class CreditCard {
    public static void main (String [] args) {

        CreditCardDemo myCard1 = new CreditCardDemo(123);
        myCard1.setValues(0);

        CreditCardDemo myCard2 = new CreditCardDemo(456);
        myCard2.setValues(1000);

        CreditCardDemo myCard3 = new CreditCardDemo(789);
        myCard3.setValues(10000);

        CreditCardDemo[] myCards = new CreditCardDemo [] {myCard1,myCard2,myCard3};


        System.out.println("Info: "+"\n"+myCards[0]+"\n"+ myCards[1]+"\n"+myCards[2]);
        int operation;
        do {
            System.out.print("Введите номер счёта: ");
            Scanner scan = new Scanner(System.in);
            int acc = scan.nextInt();
            CreditCardDemo foundCard = getCreditCard(acc, myCards);
            if (foundCard == null) {
                System.out.println("Не найдено!");

            } else {
                System.out.println(foundCard.getValues());
                cardOperations(foundCard);
            }


            System.out.println("Для выхода введите 0");
            operation = scan.nextInt();
        } while (operation != 0);
        System.out.println("Info: "+"\n"+myCards[0]+"\n"+ myCards[1]+"\n"+myCards[2] );

    }
    private static void cardOperations(CreditCardDemo foundCard) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите операцию: \n 1) Пополнить.\n 2) Снять.");
        int operation = scan.nextInt();
        System.out.println("Введите сумму: ");
        int sum = scan.nextInt();
        if (operation == 1) {
            foundCard.addBalance(sum);
        } else if (operation == 2) {
            foundCard.delBalance(sum);
        }
        System.out.println(foundCard.getValues());
    }

    private static CreditCardDemo getCreditCard(int acc, CreditCardDemo[] myCards) {
       for (int i = 0; i < myCards.length; i++) {
           if (myCards[i].getAccNum() == acc) {
                return myCards [i];
           }


        }
        return null;
    }

}
