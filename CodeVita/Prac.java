package CodeVita;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac {

    public static void handleBankOperations(int initialBalance, List<String> operations) {
        int balance = initialBalance;
        List<String[]> transactionHistory = new ArrayList<>(); // To track all transactions (credit and debit)
        List<Integer> commits = new ArrayList<>(); // To track balances after each commit

        for (String operation : operations) {
            String[] parts = operation.split(" ");
            String op = parts[0];

            switch (op) {
                case "read":
                    System.out.println(balance);
                    break;

                case "credit":
                    int creditAmount = Integer.parseInt(parts[1]);
                    balance += creditAmount;
                    transactionHistory.add(new String[]{"credit", String.valueOf(creditAmount)});
                    break;

                case "debit":
                    int debitAmount = Integer.parseInt(parts[1]);
                    balance -= debitAmount;
                    transactionHistory.add(new String[]{"debit", String.valueOf(debitAmount)});
                    break;

                case "abort":
                    int transactionIndex = Integer.parseInt(parts[1]) - 1;
                    if (transactionIndex < transactionHistory.size()) {
                        String[] transaction = transactionHistory.get(transactionIndex);
                        if (transaction[0].equals("credit")) {
                            balance -= Integer.parseInt(transaction[1]);
                        } else if (transaction[0].equals("debit")) {
                            balance += Integer.parseInt(transaction[1]);
                        }
                        transactionHistory.remove(transactionIndex);
                    }
                    break;

                case "rollback":
                    int commitIndex = Integer.parseInt(parts[1]) - 1;
                    if (commitIndex < commits.size()) {
                        balance = commits.get(commitIndex);
                        // Remove all transactions and commits after the rollback point
                        transactionHistory = transactionHistory.subList(0, commitIndex + 1);
                        commits = commits.subList(0, commitIndex + 1);
                    }
                    break;

                case "commit":
                    commits.add(balance);
                    break;

                default:
                    System.out.println("Invalid operation: " + op);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialBalance = scanner.nextInt();
        int numOperations = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after integer input

        List<String> operations = new ArrayList<>();
        for (int i = 0; i < numOperations; i++) {
            operations.add(scanner.nextLine().trim());
        }

        handleBankOperations(initialBalance, operations);

        scanner.close();
    }
}
