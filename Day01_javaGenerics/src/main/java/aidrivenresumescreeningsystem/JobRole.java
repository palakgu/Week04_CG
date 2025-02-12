package aidrivenresumescreeningsystem;

 abstract public class JobRole {
    String candidateName;

     public JobRole(String candidateName) {
         this.candidateName = candidateName;
     }

     public String getCandidateName() {
         return candidateName;
     }
     public abstract void displayRole();
 }
