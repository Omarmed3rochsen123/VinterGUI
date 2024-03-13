class Books extends Shelves{
    private int sidor;
    private String författare;
    private String genre;

    Books(int shelf, String shelfName, int sidor, String författare, String genre) {
        super(shelf, shelfName);
        this.sidor = sidor;
        this.författare = författare;
        this.genre = genre;
    }
}
