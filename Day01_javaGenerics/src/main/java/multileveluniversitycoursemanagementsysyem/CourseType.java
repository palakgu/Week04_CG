package multileveluniversitycoursemanagementsysyem;

 abstract public class CourseType {
    String courseName ;
    public CourseType(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public abstract void evalution();
}
