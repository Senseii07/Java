public class books {
    String title;
    String author;
    int pages;
    double price;

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        books book1 = new books();
        book1.title = "To Kill a Mockingbird";
        book1.author = "Harper Lee";
        book1.pages = 281;
        book1.price = 7.99;

        books book2 = new books();
        book2.title = "1984";
        book2.author = "George Orwell";
        book2.pages = 328;
        book2.price = 8.99;

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
    }
    
}
