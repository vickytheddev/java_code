
public class accesmodifires {
    public static void main(String[] args) {
        Bankaccount p1 = new Bankaccount();
        p1.name = "Vicky";
        p1.balance = 10000;
        p1.password = "vicky";
        p1.setpassword("vickythedev");
        p1.account = 345234123;
        System.out.println(p1.name);
        System.out.println(p1.balance);
        System.out.println(p1.password);

        System.out.println(p1.account);
    }
}
class Bankaccount {
    public String name;
    protected int balance;
    String password;
    public void setpassword (String vickythedev) {
        password = vickythedev;
    }
    int account;
}
