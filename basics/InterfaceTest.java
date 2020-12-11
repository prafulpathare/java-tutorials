import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

class Account  {
    
    { System.out.println("\n\033[1;32m[ " + LocalDateTime.now() + " | new ]\tAccount created\033[0;37m"); }

    private static int counter;
    private int id, age;
    private String name;

    Account() {}

    Account(String name, int age) {
        this.id = 1000 + counter++;
        this.name = name;
        this.age = age;
    }
    
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public void printAccount() {
        System.out.println("\n********************************");
        System.out.println("Account ID\t: " + this.id);
        System.out.println("Name\t\t: " + this.name);
        System.out.println("Age\t\t: " + this.age);
        System.out.println("********************************");
    }
}

class InterfaceTest {
    static { System.out.println("Test class loaded."); }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.printf("\nName\t: ");
        String name = sc.nextLine();
        System.out.printf("Age\t: ");
        int age = sc.nextInt();

        Account account = new Account(name, age);

        account.printAccount();

    }
}