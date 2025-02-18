package Annotations.repeatableannotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Annotations.repeatableannotation.BugReports.class)
public @interface BugReport {
    String description();
    String reportedBy() default "Unknown";
}