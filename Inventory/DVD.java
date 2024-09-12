package Inventory;
public class DVD extends Product {
    private String rating;
    private String studio;
    private int lenght;

    public DVD () {
        super(); // Untuk Mengakses Constructor SuperClass
        rating ="";
        studio = "";
        lenght = 0;
    }

    //Constructor Parameter
    public DVD(String rating , String studio , int lenght, int number, int quantity, String name, Double price) {
        super(number, quantity, name, price);
        this.rating = rating;
        this.studio = studio;
        this.lenght = lenght;
    }


    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override // Membuat Method Yang Sama Dengan Method Di Superclass
    public void print() {
        super.print();
        System.out.println("Rating :" + rating);
        System.out.println("Studio" + studio);
        System.out.println("Lenght" +lenght);
        System.out.println("");
        System.out.println("============================");
        System.out.println("");
    }

}
