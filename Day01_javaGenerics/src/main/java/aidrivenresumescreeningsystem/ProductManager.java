package aidrivenresumescreeningsystem;

public class ProductManager extends JobRole{
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public void displayRole() {
        System.out.println(" Product Mananger : "+ getCandidateName());
    }
}
