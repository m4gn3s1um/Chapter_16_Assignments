import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account a1 = new Account(1,"Magnus", "Andersen",10000.0);
        Account a2 = new Account(2,"Lars", "Henriksen",40000.0);
        Account a3 = new Account(3,"Hans", "Lars",20000.0);
        Account a4 = new Account(4,"Jens", "Jensen",30000.0);
        Account a5 = new Account(5,"Ulrik", "Thomsen",50000.0);

        List<Account> accountList = new ArrayList<>();

        accountList.add(a1);
        accountList.add(a2);
        accountList.add(a3);
        accountList.add(a4);
        accountList.add(a5);


        Collections.sort(accountList,new AccountComparator());
        System.out.println(accountList);


    }
}