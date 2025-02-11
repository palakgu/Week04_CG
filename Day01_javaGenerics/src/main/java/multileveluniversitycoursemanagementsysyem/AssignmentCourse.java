package multileveluniversitycoursemanagementsysyem;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse(String courseName){
        super(courseName);
    }

    @Override
    public void evalution() {
        System.out.println(getCourseName()+ " Evaluted through Assignment");
    }
}
