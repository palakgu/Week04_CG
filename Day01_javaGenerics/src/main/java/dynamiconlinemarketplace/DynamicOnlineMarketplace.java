package dynamiconlinemarketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {


        BookCategory book = new BookCategory();
        ClothingCategory cloth = new ClothingCategory();
        GadgetCategory gadget = new GadgetCategory();

        Book java = new Book(book, " java Fundamental ", 500);
        Clothing shirt = new Clothing(cloth, "Shirt", 1000);
        Gadgets iphone = new Gadgets(gadget, "Iphone", 50000);

        Utility.applyDiscount(java,8 );
        Utility.applyDiscount(shirt, 10);
        Utility.applyDiscount(iphone , 20);

        java.display();
        shirt.display();
        iphone.display();
    }

}
