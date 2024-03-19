

public class CreateAcc {

    //skapar konto för inlog

    static void createAcc(String userName, int password) {                //skapar konto och fyller en plats i arrayen

        boolean finns = false;


        for (int i = 0; Accounts.userNames.length > i; i++) {
            if (Accounts.userNames[i].equalsIgnoreCase(userName)) {                      //kollar om konto med uppgifter redan finns
                System.out.println("Finns redan en användare med detta användarnamn");
                finns = true;
                break;
            }
        }
        if (!finns){

            for (int i = 0; Accounts.userNames.length > i; i++) {
                if (Accounts.userNames[i].equalsIgnoreCase("tomt")){
                    Accounts.userNames[i] = userName;
                    Accounts.userPasswords[i] = password;
                    System.out.println( Accounts.userNames[i]);                                    //tar upp en plats och "skapar" kontot
                    System.out.println( Accounts.userPasswords[i]);

                    break;
                }
            }
        }
    }
}
