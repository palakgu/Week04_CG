package aidrivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public void displayRole() {
        System.out.println("Software Engineer :"+ getCandidateName());
    }
}
