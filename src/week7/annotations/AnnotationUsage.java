package week7.annotations;

/**
 * Following objects can be annotated
 * Class
 * Field
 * Method
 * Method parameter
 */

@Deprecated // // this annotation is used to point out that this class has a newer version
public class AnnotationUsage {

    // there are some code quality tools: SonarCube, PMD, CheckStyle, Spotless
    // if you use SuppressWarnings, then code quality tools will not check this method
    @SuppressWarnings("unchecked")
    public void aMethod() {

    }

    public static void main(String[] args) {
        AnnotationUsage annotationUsage = new AnnotationUsage(); // there is cross on the class name, because the class is deprecated
    }
}
