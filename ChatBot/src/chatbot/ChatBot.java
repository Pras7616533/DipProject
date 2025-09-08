package chatbot;

public class ChatBot {
    private IntentRecognizer recognizer;
    private ResponseGenerator responder;

    public ChatBot() {
        recognizer = new IntentRecognizer();
        responder = new ResponseGenerator();
    }

    public String getResponse(String userInput) {
        String intent = recognizer.detectIntent(userInput);
        return responder.generate(intent);
    }
}
