package chatbot;

import java.util.Random;

public class ResponseGenerator {
    private Random rand = new Random();

    public String generate(String intent) {
        switch (intent) {
            case "greeting":
                String[] greetings = {"Hello!", "Hi there!", "Hey 👋"};
                return greetings[rand.nextInt(greetings.length)];

            case "goodbye":
                String[] goodbyes = {"Goodbye!", "See you later!", "Take care 👋"};
                return goodbyes[rand.nextInt(goodbyes.length)];

            case "weather":
                return ApiIntegration.getWeather("New York");

            case "status":
                return "I’m just a bot, but I’m doing great! 😄";

            default:
                return "Sorry, I didn’t understand that.";
        }
    }
}
