package chatbot.APIS;

import java.net.*;
import java.io.*;

public class JokeTeller {
    public JokeTeller() {}
    
    public static String getJoke() {
        String link = "https://v2.jokeapi.dev/joke/Any?format=txt";
        StringBuilder str = new StringBuilder();

        try {
            // Establishing a connection
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            // Reading data from input stream
            try (InputStream stream = connection.getInputStream()) {
                int ch;
                while ((ch = stream.read()) != -1) {
                    str.append((char) ch);
                }
            }

            return str.toString(); // Return joke text

        } catch (Exception e) {
            return "⚠️ Check Your Internet Connection!" + e.getMessage();
        }
    }

    // Inner class
//     class GetData extends Thread {
//         String link;

//         public GetData(String link) {
//             this.link = link;
//         }

//         public void run() {
//             try {
//                 StringBuilder str = new StringBuilder();

//                 // Establishing a connection
//                 URL url = new URL(link);
//                 HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                 connection.setRequestMethod("GET");
//                 connection.connect();

//                 // Reading data from input stream
//                 InputStream stream = connection.getInputStream();
//                 int ch;
//                 while ((ch = stream.read()) != -1) {
//                     str.append((char) ch);
//                 }

//                 // Output joke to console
//                 System.out.println("\nJoke:\n" + str.toString());

//             } catch (Exception e) {
//                 System.out.println("Check Your Internet Connection");
//             }
//         }
//     }
}
