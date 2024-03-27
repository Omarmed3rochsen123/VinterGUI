import java.util.ArrayList;

class Books extends Shelves{
    private int sidor;
    private String författare;
    private String genre;

    private static String title;

    private static int amount;

    Books(int shelf, String shelfName, int sidor, String författare, String genre, String title) {
        super(shelf, shelfName);
        this.sidor = sidor;
        this.författare = författare;
        this.genre = genre;
        this.title = title;
    }


    Books Frankenstein = new Books(1,"ok",1,"ok","ok","Frankenstein");
    Books Hej = new Books(1,"ok",1,"ok","ok","Hej");

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Books.title = title;
    }


}
