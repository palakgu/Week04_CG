package dynamiconlinemarketplace;

public class Gadgets extends Product<GadgetCategory>{
    public Gadgets(GadgetCategory category , String name , double price){
        super(category,name,price);
    }

    @Override
    public void display() {
        System.out.println("Gadget: " + getName() + ", Price: " + getPrice());
    }
}
