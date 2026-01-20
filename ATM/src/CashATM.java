public class CashATM {
    final int tenBanknote = 10;
    final int fiftyBanknote = 50;
    final int hundredBanknote = 100;
    private int ten = 200;
    int fifty = 40;
    int hundred = 60;

    public void request(int requestAmount, Card card){

        int remaining = requestAmount;


        switch (numCount(remaining)){
            case 2:
                donzesForCaseTwo(remaining, card);
                break;
            case 3:
                logicForCaseThree(remaining, card);
                break;
            case 4:
                logicForCaseThree(remaining, card);
                break;
            case 5:
                logicForCaseThree(remaining, card);
                break;
            default:
                System.out.println("BadLuck");
        }
    }



    public void logicForCaseThree(int remaining, Card card){
        int hundredBanknoteCount = remaining / hundredBanknote;
        int fiftyInHundred = fifty / 2;
        int tenInHundred = ten / tenBanknote;
        int ostatok = remaining % hundredBanknote;
        if (hundred >= hundredBanknoteCount){
            hundred -= hundredBanknoteCount;
            card.setCardBalance(card.getCardBalance() - (remaining));
            return;
        } else if ((hundred + (fiftyInHundred)) >= hundredBanknoteCount) {
            hundredBanknoteCount -= hundred;
            fiftyInHundred -= hundredBanknoteCount;
            fifty = fiftyInHundred * 2;
            card.setCardBalance(card.getCardBalance() - (remaining));
            hundred = 0;
            return;
        } else if (((hundred + (fiftyInHundred) + (tenInHundred))) >= hundredBanknoteCount) {
            hundredBanknoteCount -= hundred;
            hundredBanknoteCount -= fiftyInHundred;
            tenInHundred -= hundredBanknoteCount;
            ten = tenInHundred * tenBanknote;
            fifty = 0;
            hundred = 0;
            card.setCardBalance(card.getCardBalance() - (remaining));
            return;
        }
        if (ostatok > 0){
            donzesForCaseTwo(ostatok, card);
        }
        throw new NotEnoughBanknotes(remaining);
    }

    public void donzesForCaseTwo(int remaining, Card card){
        int tenBanknoteCount = remaining / tenBanknote;
        if (remaining < 50){
            if (ten >= tenBanknoteCount){
                ten -= tenBanknoteCount;
                card.setCardBalance(card.getCardBalance() - (remaining));
            }
            return;
        }
        if (remaining == 50){
            if (fifty >= 1){
                --fifty;
                card.setCardBalance(card.getCardBalance() - (remaining));
            }
            return;
        }
        if (remaining > 50){
            if (fifty >= 1 || ten >= ((remaining - fiftyBanknote) / tenBanknote)){
                --fifty;
                ten -= ((remaining - fiftyBanknote) / tenBanknote);
                card.setCardBalance(card.getCardBalance() - (remaining));
                return;
            } else if (ten >= (remaining / tenBanknote)) {
                ten -= remaining / tenBanknote;
                card.setCardBalance(card.getCardBalance() - (remaining));
                return;
            }
            throw new NotEnoughBanknotes(remaining);

        }


    }

    public int numCount(int remaining){                 //количество цифр в числе
        int count = 0;
        do {
            count++;
            remaining /= 10;
        } while (remaining != 0);
        return count;
    }

    public int tenth(int remaining){
        int i = (remaining / 10) % 10;
        return i;
    }

    public int getTen(){
        return this.ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public int getFifty(){
        return this.fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getHundred(){
        return this.hundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }
}
