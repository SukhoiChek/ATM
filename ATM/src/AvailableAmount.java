public class AvailableAmount {
    public void avalible(CashATM cashATM){
        int ten = 0;
        int fifty = 0;
        int hundred = 0;

        if (cashATM.getTen() > 0){
            ten = cashATM.getTen() * 10;
        }
        if (cashATM.getFifty() > 0){
            fifty = cashATM.getFifty() * 50;
        }
        if (cashATM.getHundred() > 0){
            hundred = cashATM.getHundred() * 100;
        }
        long sumInATM = ten + fifty + hundred;

        System.out.println("Available amount from an ATM is " + sumInATM + "\n" +
                            "the 10 dollar bill: " + cashATM.getTen() + "\n" +
                            "the 50 dollar bill: " + cashATM.getFifty() + "\n" +
                            "the 100 dollar bill: " + cashATM.getHundred() + "\n");
    }
}

