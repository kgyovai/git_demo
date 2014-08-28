/**
 * Created by kane on 8/27/14.
 */
public class Prop {
    private String action = "";

    public Prop(String action) {
        this.action = action;
    }

    public void doAction() {
        System.out.println(action);
    }
}
