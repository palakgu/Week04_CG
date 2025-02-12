package aidrivenresumescreeningsystem;

public class DataScientist extends JobRole{
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public void displayRole() {
        System.out.println("  DataScientist : "+ getCandidateName());
    }
}
