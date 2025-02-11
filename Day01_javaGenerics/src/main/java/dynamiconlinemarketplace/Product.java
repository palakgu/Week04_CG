package dynamiconlinemarketplace;

class BookCategory{}

class ClothingCategory{}

class GadgetCategory{}


abstract class Product <T>{
    T category;
    String name ;
    double price;

    public Product(T caregory , String name , double price){
        this.category = caregory;
        this.name = name;
        this.price = price;
    }

    public T getCategory() {
        return category;
    }



    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    abstract public void display();
}
