import java.util.ArrayList;
import java.util.List;

/**
 * Created by gyovai on 8/26/2014.
 */
public class Actor {
    private List<String> lines = new ArrayList<String>();
    private Script script;

    public Actor(Script script) {
        this.script = script;
    }

    public void learnLines(int numLines) {
        for (int i = 0; i < numLines; i++) {
            lines.add(script.getRandomLine());
        }
    }

    public void reciteLine(int lineNumber) {
        if (lineNumber > lines.size() - 1) {
            return;
        }
        System.out.println(lines.get(lineNumber));
    }
}
