import java.util.Arrays;

public class CreateAcc {

    //skapa konto

    private static String[] userNames = new String[20];
    private static int[] userPasswords = new int[20];



    public static String createAcc(String userName, int password){



        for (int i = 0; userNames.length > i; i++){
            if(userNames[i].equalsIgnoreCase(userName)){
                System.out.println("Finns redan en användare med detta användarnamn");
                break;
            }
        }


        return "hej";
    }
}
