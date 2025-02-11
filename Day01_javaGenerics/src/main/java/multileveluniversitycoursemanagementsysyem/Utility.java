package multileveluniversitycoursemanagementsysyem;

import java.util.List;

public class Utility {
    public static void displayAll(List<? extends CourseType> courses){
     for(CourseType course : courses){
         course.evalution();
     }
    }
}
