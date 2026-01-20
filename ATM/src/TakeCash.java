import java.util.Scanner;

public class TakeCash {
    public void takeACash(CashATM cashATM, Card card){
        Scanner scanner = new Scanner(System.in);
        IncorrectInput incorrectInput = new IncorrectInput();
        int requestAmount;

        while (true) {
            System.out.println("Enter the amount you want to withdraw: ");

            requestAmount = incorrectInput.numOrNot();

            if (requestAmount % 10 != 0){
                System.out.println("Incorrect amount");
                continue;
            }

            if (requestAmount <= 0) {
                System.out.println("The amount must be greater than zero");
                continue;
            }
            break;
        }

        try {
            if (card.getCardBalance() < requestAmount) {
                throw new InsufficientFunds(requestAmount, card.getCardBalance());
            }

            cashATM.request(requestAmount, card);

        } catch (NotEnoughBanknotes e){
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (InsufficientFunds e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }
}
