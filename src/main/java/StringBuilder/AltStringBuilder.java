package StringBuilder;

import java.util.Stack;

public class AltStringBuilder {

    private StringBuilder currentStringBuilder;
    private final Stack <String> history;

    public AltStringBuilder() {
        currentStringBuilder = new StringBuilder();
        history = new Stack<>();
    }

    public void append(String string) {
        saveSnapshot();
        currentStringBuilder.append(string);
    }

    private void saveSnapshot() {
        history.push(currentStringBuilder.toString());
    }

    public void undo() {
        if (!history.isEmpty()) {
            String previousState = history.pop();
            currentStringBuilder = new StringBuilder(previousState);
        }
    }

    @Override
    public String toString() {
        return currentStringBuilder.toString();
    }
}


