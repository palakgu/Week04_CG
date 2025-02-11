package dynamiconlinemarketplace;

public class Book extends Product<BookCategory>{
    public Book(BookCategory category,String name ,double price){
        super(category,name,price);
    }

    @Override
    public void display() {
        System.out.println("Book: " + getName() + ", Price: " + getPrice());
    }
}
