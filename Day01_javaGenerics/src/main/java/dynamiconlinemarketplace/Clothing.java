package dynamiconlinemarketplace;

public class Clothing extends Product<ClothingCategory>{

    public Clothing(ClothingCategory category , String name , double price){
        super(category,name,price);
    }

    @Override
    public void display() {
        System.out.println("Cloth: " + getName() + ", Price: " + getPrice());
    }
}
