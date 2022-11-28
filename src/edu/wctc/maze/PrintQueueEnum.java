package edu.wctc.maze;

import java.util.ArrayList;
import java.util.List;

public enum PrintQueueEnum {
    INSTANCE;

    private List<String> printText = new ArrayList<>();

    PrintQueueEnum() {}

    public void enqueue(String text) {
        printText.add(text);
    }

    public String flush() {
        String text = String.join("\n", printText);
        printText.clear();
        return text;
    }
}
