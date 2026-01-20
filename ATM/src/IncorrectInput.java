import java.util.Scanner;
public class IncorrectInput {

    public int numOrNot(){
        int num;
        Scanner scanner = new Scanner(System.in);
        while (true){
            if (scanner.hasNextInt()){
                num = scanner.nextInt();
                if (num <= 10_000){
                    break;
                }else {
                    System.out.println("Can't take a cash much more than 10.000 onetime\n" +
                                        "enter an amount less than 10,000");
                }
            } else{
                System.out.println("Enter a number");
                scanner.next();
            }
        }
        return num;
    }

    public int numAndSumChek(){
        int num;
        Scanner scanner = new Scanner(System.in);
        while (true){
            if (scanner.hasNextInt()){
                num = scanner.nextInt();
                if (num == 1 || num == 2 || num == 3){
                    break;
                }else {
                    System.out.println("Enter 1 or 2 or 3 point");
                }
            } else{
                System.out.println("Enter 1 or 2 or 3 point");
                scanner.next();
            }
        }
        return num;
    }

    public int numChek(){
        int num;
        Scanner scanner = new Scanner(System.in);
        while (true){
            if (scanner.hasNextInt()){
                num = scanner.nextInt();
                    break;
                } else{
                System.out.println("Enter a number");
                scanner.next();
            }
        }
        return num;
    }

}
