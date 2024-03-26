import java.util.Arrays;
import java.util.Scanner;

public class Accounts {

    //password
    //username
    //choice
    static int choice;

    static String[] userNames = new String[20];
    static int[] userPasswords = new int[20];


    public Accounts() {


        Arrays.fill(userNames, "tomt");
        Arrays.fill(userPasswords, 0);

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello world!");                            //hejsan


        int password;

        do{
                                                                            //do while för val
            System.out.println("Vad vill du göra?");
            System.out.println("1: Skapa konto");
            System.out.println("2: logga in");
            System.out.println("3: tagga");
            System.out.print(": ");
            String check = scan.nextLine();
            choice = Kontroll.kontroll(check);                            //kollar integers i user input

            switch (choice) {


                case 1 -> {
                                                                        //skapar ett konto
                    System.out.println("Skriv in användarnamn");        //borde flytta allt det här in i create klassen
                    System.out.print(": ");
                    String userName = scan.nextLine();
                    System.out.println("Skriv in lösenord");
                    System.out.print(": ");
                    check = scan.nextLine();
                    password = Kontroll.kontroll(check);
                    CreateAcc.createAcc(userName, password);

                }
                case 2 -> LogIn.logIn();                                    //logga in
                case 3 -> System.out.println("Hejdå");                      //exits
                default -> System.out.println("idiot, skriv 1 eller 2");      //pepega

            }

        }while (choice != 3);


        if (LogIn.logedIn){

            Library.libraryUI();

        }
    }

}
