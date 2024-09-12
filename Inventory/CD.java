package Inventory;


public class CD extends Product {
    private String artist;
    private String label;
    private int numSong;

    public CD (){
        super(); //Untuk Mengakses Constructor SuperClass
        artist = "";
        label = "";
        numSong = 0;
    }

    //Constructor Parameter
    public CD(String artist,String label , int numSong,int number,int quantity,String name , Double price){
        super(number,quantity,name,price);
        this.artist = artist;
        this.label = label;
        this.numSong = numSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getnumSong() {
        return numSong;
    }

    public void setnumSong(int numSong) {
        this.numSong = numSong;
    }

    @Override //Membuat Method Yang Sama Dengan Method Di Superclass
    public void print() {
        super.print();
        System.out.println("Artist :" + artist);
        System.out.println("Label" + label);
        System.out.println("Numsong" +numSong);
        System.out.println("");
        System.out.println("============================");
        System.out.println("");
    }

}
