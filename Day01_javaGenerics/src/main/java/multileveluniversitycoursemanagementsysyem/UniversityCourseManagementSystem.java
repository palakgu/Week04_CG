package multileveluniversitycoursemanagementsysyem;

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
        ExamCourse maths = new ExamCourse("Maths");
        AssignmentCourse English = new AssignmentCourse("English");
        ResearchCourse Biology = new ResearchCourse("Biology");

        Course<ExamCourse>exam = new Course<>();
        Course<AssignmentCourse> assignment = new Course<>();
        Course<ResearchCourse> research = new Course<>();

        exam.addCourse(maths);
        assignment.addCourse(English);
        research.addCourse(Biology);

        Utility.displayAll(exam.getCourses());
        Utility.displayAll(assignment.getCourses());
        Utility.displayAll(research.getCourses());


    }
}
