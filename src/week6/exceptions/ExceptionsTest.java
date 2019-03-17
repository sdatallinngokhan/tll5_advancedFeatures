package week6.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsTest {

    public void handleCheckedExceptionByTryCatch() { // handling checked exceptions is mandatory. try catch block is required
        try {
            File file = new File("wrong path"); // path should be like /users/gokhan/projects/tallinn5
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException abc) {
            abc.printStackTrace();
        }
    }

    public void handleCheckedExceptionByThrowingExceptionFromMethodSignature() throws FileNotFoundException {
        File file = new File("wrong path");
        FileReader fileReader = new FileReader(file);
    }

    public void handleUncheckedExceptionByTryCatch() { // handling unchecked exceptions is not mandatory. try catch block is optional
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ExceptionsTest exceptionsTest = new ExceptionsTest();

        exceptionsTest.handleCheckedExceptionByTryCatch();

        exceptionsTest.handleCheckedExceptionByThrowingExceptionFromMethodSignature();

        exceptionsTest.handleUncheckedExceptionByTryCatch();
    }
}
