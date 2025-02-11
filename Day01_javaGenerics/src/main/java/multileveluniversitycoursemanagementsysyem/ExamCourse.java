package multileveluniversitycoursemanagementsysyem;

public class ExamCourse extends CourseType {


    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evalution() {
        System.out.println(getCourseName()+" Generated througn Exams");
    }
}
