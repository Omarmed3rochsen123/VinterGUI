import java.util.Scanner;

public class Library {

    //password
    //usernam
    //choice
    //check

    public Library() {


        Scanner scan = new Scanner(System.in);

        System.out.println("Hello world!");                            //hejsan

        System.out.println("Vad vill du göra?");
        System.out.println("1: Skapa konto");
        System.out.println("2: logga in");
        System.out.print(": ");
        String check = scan.nextLine();
        int choice = Kontroll.kontroll(check);                            //kollar integers

        int password;
        switch (choice) {

            case 1 -> {                                              //skapar ett konto
                System.out.println("Skriv in användarnamn");
                System.out.print(": ");
                String userName = scan.nextLine();
                System.out.println("Skriv in lösenord");
                System.out.print(": ");
                check = scan.nextLine();
                password = Kontroll.kontroll(check);
                CreateAcc.createAcc(userName, password);

            }
            case 2 -> LogIn.logIn();                                    //logga in
            default -> System.out.println("idiot, skriv 1 eller 2");      //pepega


        }

        System.out.print("Eneter password: ");                           //test
        check = scan.nextLine();
        password = Kontroll.kontroll(check);
        System.out.println(password);

    }

}
