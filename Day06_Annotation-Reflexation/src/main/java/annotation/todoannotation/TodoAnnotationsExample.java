package annotation.todoannotation;

//package Annotations.todoannotation;
import java.lang.reflect.Method;

public class TodoAnnotationsExample {

    public static void main(String[] args) {
        Class<?> cls = ProjectTasks.class;
        Method[] methods = cls.getDeclaredMethods();

        System.out.println("Pending Tasks:");
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Task: " + annotation.task());
                System.out.println("  Assigned To: " + annotation.assignedTo());
                System.out.println("  Priority: " + annotation.priority());
                System.out.println();

            }
        }
    }
}