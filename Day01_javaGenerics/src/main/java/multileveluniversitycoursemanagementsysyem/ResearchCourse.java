package multileveluniversitycoursemanagementsysyem;

public class ResearchCourse extends CourseType{

    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evalution() {
        System.out.println(getCourseName()+" Generate through Research ");
    }
}
