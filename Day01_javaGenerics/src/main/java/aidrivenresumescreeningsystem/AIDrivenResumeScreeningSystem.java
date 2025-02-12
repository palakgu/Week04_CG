package aidrivenresumescreeningsystem;

public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Samarth");
        ProductManager productManager = new ProductManager("Sanjay");
        DataScientist dataScientist = new DataScientist("Ajay");

        Resume<SoftwareEngineer> seResume = new Resume<>();
        Resume<ProductManager> pmResume = new Resume<>();
        Resume<DataScientist> dsResume = new Resume<>();

        seResume.addresume(softwareEngineer);
        pmResume.addresume(productManager);
        dsResume.addresume(dataScientist);

        Utility.displayAllResume(seResume.getResumes());
        Utility.displayAllResume(pmResume.getResumes());
        Utility.displayAllResume(dsResume.getResumes());
    }
}
