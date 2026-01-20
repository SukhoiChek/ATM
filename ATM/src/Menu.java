import java.util.Scanner;
public class Menu {
    public  void userChoice (int userChoice, Card card, CashATM cashATM, TakeCash takeCash){
        Replenishment replenishment = new Replenishment();
        AvailableAmount availableAmount = new AvailableAmount();
        Scanner scanner = new Scanner(System.in);
        IncorrectInput incorrectInput = new IncorrectInput();
        switch (userChoice){
            case 1:
                takeCash.takeACash(cashATM, card);
                break;
            case 2:
                System.out.println("Enter banknote nominal : \n1. 10 \n2. 50\n3. 100 ");
                int choice = incorrectInput.numAndSumChek();
                System.out.println("Enter the number of banknotes: ");
                int numberOfBills = incorrectInput.numChek();
                replenishment.replenishment(choice, numberOfBills, card, cashATM);
                break;
            case 3:
                System.out.println("Your card balance is: " + card.getCardBalance());
                break;
            case 4:
                availableAmount.avalible(cashATM);
                break;
            case 5:
                break;
        }
        if (userChoice == 1)
            System.out.println("After withdrawing cash from an ATM:\n");
        if (userChoice == 2){
            System.out.println("After depositing cash at an ATM");
        }
        if (userChoice == 1 || userChoice ==2){
            System.out.println("the 10 dollar bill: " + cashATM.getTen() + "\n" +
                    "the 50 dollar bill: " + cashATM.getFifty() + "\n" +
                    "the 100 dollar bill: " + cashATM.getHundred() + "\n" +
                    "Card balance is: " + card.getCardBalance());
        }

    }
}
