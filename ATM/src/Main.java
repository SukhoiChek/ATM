import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Card card = new Card();
        CashATM cashATM = new CashATM();
        TakeCash takeCash = new TakeCash();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("""
                    Select the operation you need:
                    1. Take Cash
                    2. Replenish
                    3. See the card balance
                    4. See cash in ATM and available banknotes
                    5. Exit
                    """);
            if (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите число от 1 до 5.");
                scanner.next();
                continue;
            }

            int userChoice = scanner.nextInt();

            if (userChoice < 1 || userChoice > 5) {
                System.out.println("Incorrect. Enter a number between 1 and 5");
                continue;
            }
            if (userChoice == 5) break;

            menu.userChoice(userChoice, card, cashATM, takeCash);
        }

    }


}