public class BankAccount {
        double checkingBalance;
        double savingsBalance;
        public static int quantityOfAccounts = 0;
        public static double totalMoney = 0;

        public void bankAccount(double checkings, double savings) {
            this.checkingBalance = checkings;
            this.savingsBalance = savings;
            totalMoney = checkings + savings;
            quantityOfAccounts++;

        }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public String depositChecking(double depositQuantity) {
            checkingBalance = checkingBalance + depositQuantity;
            return "You deposited " + depositQuantity + " into your checking account!";
    }

    public String depositSaving(double depositQuantity) {
            savingsBalance = savingsBalance + depositQuantity;
        return "You deposited " + depositQuantity + " into your savings account!";

    }

    public String withdrawChecking(double depositQuantity) {
        checkingBalance = checkingBalance - depositQuantity;
        if (checkingBalance >=0) {
            return "You withdrew " + depositQuantity + " into your checking account!";
        } else {
            checkingBalance = checkingBalance + depositQuantity;
            return "Transaction failed, you too poor";
        }


    }

    public String withdrawSaving(double depositQuantity) {
        savingsBalance = savingsBalance - depositQuantity;
        if (savingsBalance >=0) {
            return "You withdrew " + depositQuantity + " into your savings account!";
        } else {
            savingsBalance = savingsBalance + depositQuantity;
            return "Transaction failed, you too poor";
        }
    }

    public String getBalance(){
            String message = "Checkings: " + checkingBalance;
            String message1 = "Savings: " + savingsBalance;
            return message + message1;
    }


    String accountNumber;

        private String createAccountNumber() {

        }


}
