package nested_classes.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BankAccount {
    private int numberUID;
    private int balans = 0;
    private  User user;

    private ArrayList<Transaction> transactionList = new ArrayList<>();

    public BankAccount(int numberUID, User user) {
        this.numberUID = numberUID;
        this.user = user;
    }
    private class Transaction {
        private TransactionType transactionType;
        private int summ;
        private long date;

        public Transaction(TransactionType transactionType, int summ, long date) {
            this.transactionType = transactionType;
            this.summ = summ;
            this.date = date;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "transactionType=" + transactionType.typeName +
                    ", summ=" + summ +
                    ", date=" + date +
                    '}';
        }
    }

    /** Пополнение счета
     * @param value - сумма
     */
    void PopolnenieCheta(int value) {
        doTransaction(TransactionType.PUT, value, new Date().getTime());
        this.balans += value;
    }

    /** Снятие денег со счета
     * @param value - сумма которую клиент хочет получить
     * @return возвращает мапу, где ключ это код успешности, и String сумма или объяснение
     */
    Map<Integer, String> getSum(int value) {
        Map<Integer, String> map = new HashMap<>();
        if(this.balans > 0) {
            if(this.balans - value >= 0) {
                this.balans -= value;
                doTransaction(TransactionType.GET, value, new Date().getTime());
                map.put(200, String.valueOf(value));
            } else {
                map.put(400, "Недостаточно средств на счету. Баланс составляет " + this.balans);
            }
        } else {
            map.put(500, "Недостаточно средств на счету");
        }
        return map;
    }

    /** Получение информации о балансе
     */
    String getInfo() {
        return "Ваш баланс составляет " + this.balans + "тг";
    }

    private void addTransactionList(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    private void doTransaction(TransactionType transactionType, int summ, long date) {
        Transaction transaction = new Transaction(transactionType, summ, date);
        addTransactionList(transaction);
    }

    void getHistoryTransaction() {
        for(int i = 0; i < this.transactionList.size(); i++) {
            Transaction transaction = this.transactionList.get(i);
            System.out.println(transaction.toString());
        }
    }
}

class User {
    String name;
    String surname;
    int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}

class Test {
    public static void main(String[] args) {
        User user1 = new User("Zharkyn", "Markabayev", 26);
        BankAccount bankAccount = new BankAccount(234324, user1);
        bankAccount.PopolnenieCheta(1000);
        bankAccount.getSum(500);
        bankAccount.PopolnenieCheta(200);
        bankAccount.getHistoryTransaction();
        bankAccount.getInfo();
    }
}