package lib;

public class Accounting {
    double valueOfSupply;
    double vatRate;
    double expenseRate;

    public Accounting(double valueOfSupply, double vatRate, double expenseRate) {
        this.valueOfSupply = valueOfSupply;
        this.vatRate = vatRate;
        this.expenseRate = expenseRate;
    };

    public void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDiviend1());
        System.out.println("Dividend 2 : " + getDiviend2());
        System.out.println("Dividend 3 : " + getDiviend3());
    }

    double getDiviend1() {
        return getIncome() * 0.5;
    }

    double getDiviend2() {
        return getIncome() * 0.3;
    }

    double getDiviend3() {
        return getIncome() * 0.2;
    }

    double getIncome() {
        return valueOfSupply - getExpense();
    }

    double getExpense() {
        return valueOfSupply * expenseRate;
    }

    double getTotal() {
        return valueOfSupply + getVAT();
    }

    double getVAT() {
        return valueOfSupply * vatRate;
    }
}
