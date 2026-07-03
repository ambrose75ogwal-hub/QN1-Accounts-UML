public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Ambrose");

        SavingsAccount savings =
                new SavingsAccount("S001", 1000, 5);

        CurrentAccount current =
                new CurrentAccount("C001", 500, 300);

        customer.addAccount(savings);
        customer.addAccount(current);

        savings.deposit(500);
        savings.withdraw(300);
        savings.addInterest();

        current.withdraw(700);

        System.out.println(savings.generateStatement());
        System.out.println();

        System.out.println(current.generateStatement());
        System.out.println();

        System.out.println("Total Worth: "
                + customer.totalWorth());

    }

}