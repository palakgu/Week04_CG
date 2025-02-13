package queueinterface;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Patient{
    String name ;
    int severity;

    public Patient(String name,int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }
}
public class TriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return Integer.compare(o1.severity, o2.severity);
            }
        });
        queue.add(new Patient("John" , 3));
        queue.add(new Patient("Palak" ,2));
        queue.add(new Patient("Anjali" ,3));

        for(Patient patient : queue){
            System.out.println(patient.getName()+ ",");
        }

    }
}
