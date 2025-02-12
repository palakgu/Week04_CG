package aidrivenresumescreeningsystem;

import java.util.List;

public class Utility {
    public static void displayAllResume(List<? extends JobRole> jobRoles){
        for(JobRole job : jobRoles){
            job.displayRole();
        }

    }
}
