import java.lang.annotation.Documented;

@Documented // Makes the annotation appear in Javadoc-generated documentation
@interface ClassDetails {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}
