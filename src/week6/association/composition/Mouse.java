package week6.association.composition;

public class Mouse {

    private Button leftButton; // there is association between Mouse object and Button object
                               // We could say that this association is a composition. Because there is part-of relation
    private Button rightButton;
    private Gear gear;

    public Button getLeftButton() {
        return leftButton;
    }

    public void setLeftButton(Button leftButton) {
        this.leftButton = leftButton;
    }

    public Button getRightButton() {
        return rightButton;
    }

    public void setRightButton(Button rightButton) {
        this.rightButton = rightButton;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }
}
