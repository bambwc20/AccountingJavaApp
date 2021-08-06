import javax.swing.JOptionPane;

public class AppArr {
    public static void main(String[] args) throws Exception {
        String valueOfSupplyStr = JOptionPane.showInputDialog("Enter a valueOfSupply");
        String[] arr = { valueOfSupplyStr };
        calcurlate(arr);
    }

    private static void calcurlate(String[] args) throws Exception {

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        double[] dividendRates = new double[3]; // 더블형 데이터를 3개 담을 수 있는 배열이 만들어짐
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        System.out.println("Value of Supply: " + valueOfSupply);
        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income: " + income);
        int i = 0;
        while (i < dividendRates.length) {
            System.out.println("Dividend-" + (i + 1) + ": " + income * dividendRates[i]);
            i++;
        }

    }
}
