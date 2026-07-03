import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private final List<Account> accounts;

    public Customer(String name) {

        this.name = name;
        accounts = new ArrayList<>();

    }

    public void addAccount(Account a) {

        accounts.add(a);

    }

    public double totalWorth() {

        double total = 0;

        for (Account account : accounts) {

            total += account.getBalance();

        }

        return total;

    }

}
