package week6.exceptions;

public class ThrowingException {

    public void throwExceptionExample() {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            // throwing exception is mostly used for giving information to developer for maintenance the code
            throw new ArithmeticException("You are probably dividing a number by 0(zero)");
        }
    }

    public static void main(String[] args) {
        ThrowingException throwingException = new ThrowingException();

        throwingException.throwExceptionExample();
    }

}
