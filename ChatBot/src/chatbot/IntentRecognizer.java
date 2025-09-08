package chatbot;

public class IntentRecognizer {
    public String detectIntent(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) return "greeting";
        if (input.contains("bye")) return "goodbye";
        if (input.contains("weather")) return "weather";
        if (input.contains("how are you")) return "status";

        return "unknown";
    }
}
