import java.util.Scanner;

public class Kontroll{

    //checkar så user input är rätt

    public static int kontroll(String check){

        Scanner scan = new Scanner(System.in);

        while(true){
            int j = 0;
            for(int i = 0; i<check.length();i++){                   //jättefin nested for loop
                                                                    //while true för att få rätt input efter en fel input
                if (!Character.isDigit(check.charAt(i))){
                    System.out.println(check.charAt(i)+" :inte ett nummer");
                    break;
                } else {
                    j++;
                    if( i == j - 1 && j == check.length()){
                        return Integer.parseInt(check);
                    }
                }
            }
            System.out.println("Skriv endast nummer ");             //rätt input
            System.out.print(": ");
            check = scan.nextLine();
        }
    }
}