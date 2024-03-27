class Shelves{
    private int shelf;                                  //för att hitta böcker lättare
    private String shelfName;


    Shelves(int shelf, String shelfName) {
        this.shelf = shelf;
        this.shelfName = shelfName;
    }

    @Override
    public String toString() {

        return "Shelves{" +
                "shelf=" + shelf +
                ", shelfName='" + shelfName + '\'' +
                '}';

    }

    static void contains(){


    }
}

