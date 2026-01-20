public class Replenishment {
    public void replenishment(int banknote, int banknoteSum, Card card, CashATM cashATM){
        int nominal = banknote;
        switch (banknote){
            case 1:                                 // 10
                    card.setCardBalance(card.getCardBalance() + (cashATM.tenBanknote * banknoteSum));
                    cashATM.setTen(cashATM.getTen() + banknoteSum);
                break;
            case 2:                                 // 50
                card.setCardBalance(card.getCardBalance() + (cashATM.fiftyBanknote * banknoteSum));
                cashATM.setFifty(cashATM.getFifty() + banknoteSum);
                break;
            case 3:                                // 100
                card.setCardBalance(card.getCardBalance() + (cashATM.hundredBanknote * banknoteSum));
                cashATM.setHundred(cashATM.getHundred() + banknoteSum);
                break;
        }


    }




}
