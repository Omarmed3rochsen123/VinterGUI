import java.util.Scanner;

public class LogIn {

    //logga in med existerande konto

    static boolean logedIn;
    static int password;
    static String check;
    static String userName;

    public static void logIn(){                             //kan inte logga in på riktigt men det är inte det viktiga



        Scanner scan = new Scanner(System.in);

        System.out.print("Ange användarnamn: ");
        userName = scan.nextLine();
        System.out.print("Ange lösenord: ");
        check = scan.nextLine();
        password = Kontroll.kontroll(check);

        logedIn = true;
        Accounts.choice = 3;

    }
}
