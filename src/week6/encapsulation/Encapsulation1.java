package week6.encapsulation;

public class Encapsulation1 {

    private String foo;
    private String bar;

    private boolean male;

    public Encapsulation1(String foo, String bar, boolean male) {
        this.foo = foo;
        this.bar = bar;
        this.male = male;
    }

    public String getFoo() {
        if (foo.equals("not allowed")){
            return "You did something wrong";
        }
        return foo;
    }

    public String getBar() {
        return bar;
    }

    public boolean isMale() {
        return male;
    }

    public void setFoo(String foo) {
        if (foo.equals("dangerous")){
            this.foo = "not allowed";
        } else {
            this.foo = foo;
        }
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
