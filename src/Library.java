
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


    static void libraryUI(){
        //userinterface för att låna böcker
        System.out.println("hej " + LogIn.userName);

    }

}

