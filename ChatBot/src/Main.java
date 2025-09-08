import chatbot.ChatBot;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot();
        Scanner sc = new Scanner(System.in);

        System.out.println("🤖 Chatbot is running! Type 'quit' to exit.");
        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Bot: Goodbye 👋");
                break;
            }
            System.out.println("Bot: " + bot.getResponse(userInput));
        }
        sc.close();
    }
}
