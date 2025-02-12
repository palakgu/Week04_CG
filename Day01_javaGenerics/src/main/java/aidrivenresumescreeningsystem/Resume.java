package aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Resume <T extends JobRole>{
    List<T> resumes;

    public Resume() {
        resumes = new ArrayList<>();
    }
    public void addresume(T resume){
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }
}
