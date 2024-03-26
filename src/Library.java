import java.util.Scanner;

class Library{

    private String name;                //namn på biblioteket

    Library(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    static private Scanner scan = new Scanner(System.in);
    private static String input;
    private static String check;

    static void libraryUI(){

        //userinterface för att låna böcker

        System.out.println("hej " + LogIn.userName);
        System.out.println("Vad vill du göra?");
        System.out.println("1. Söka efter bok");
        System.out.print(": ");

        check = scan.nextLine();
        Kontroll.kontroll(check);
        input = check;

        if (Integer.parseInt(input) == 1){

            bookSearch();

        }

    }

    static void bookSearch(){

        System.out.println("Vad heter boken?");
        input = scan.nextLine();

        if (Books.getTitle().equalsIgnoreCase(input)){

            System.out.println("Den finns");

        } else {

            System.out.println("Den finns ej");

        }





    }

}

