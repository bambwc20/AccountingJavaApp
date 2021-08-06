import lib.Accounting;

public class AccountingClassApp {

    public static void main(String[] args) {
        try {

            if (args.length == 0) {
                args = new String[3];
            }

            if (args[0] == null || args[1] == null || args[2] == null) {
                Error err = new Error("판매가, 세율, 이익율 전부를 정확하게 입력해주세요.");
                throw err;
            }

            double valueOfSupply = Double.parseDouble(args[0]);
            double vatRate = Double.parseDouble(args[1]);
            double expenseRate = Double.parseDouble(args[2]);

            Accounting Account = new Accounting(valueOfSupply, vatRate, expenseRate);
            Account.print();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}