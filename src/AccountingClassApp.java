class Accounting {
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

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

    public double getDiviend1() {
        return getIncome() * 0.5;
    }

    public double getDiviend2() {
        return getIncome() * 0.3;
    }

    public double getDiviend3() {
        return getIncome() * 0.2;
    }

    public double getIncome() {
        return valueOfSupply - getExpense();
    }

    public double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public double getTotal() {
        return valueOfSupply + getVAT();
    }

    public double getVAT() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingClassApp {

    public static void main(String[] args) {
        // Accounting.valueOfSupply = 10000.0;
        // Accounting.vatRate = 0.1;
        // Accounting.expenseRate = 0.3;
        // Accounting.print();
        // 클래스를 쓰면 어디에 속해있는지 확실하게 알 수 있다.
        // anotherVariable = ...;
        // anotherMethod = ...;

        Accounting Account1 = new Accounting();
        Account1.valueOfSupply = 10000.0;
        Account1.vatRate = 0.1;
        Account1.expenseRate = 0.3;

        Accounting Account2 = new Accounting();
        Account2.valueOfSupply = 10000.0;
        Account2.vatRate = 0.1;
        Account2.expenseRate = 0.3;

        Account1.print();
        Account2.print();
    }

}