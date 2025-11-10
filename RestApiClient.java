/*
 * Project: REST API Client
 * Task: Fetch and display public REST API data in structured format
 * Author: Vivin (CSE Student)
 * Description:
 * This Java program demonstrates how to consume a public REST API using HttpURLConnection.
 * It fetches weather data (JSON format) from the Open-Meteo API and displays it neatly.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class RestApiClient {

    public static void main(String[] args) {
        try {
            // 🌍 API endpoint for current weather in Chennai
            String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=13.0827&longitude=80.2707&current_weather=true";

            // ⚙️ Step 1: Create URL object
            URL url = new URL(apiUrl);

            // ⚙️ Step 2: Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // ⚙️ Step 3: Set request method
            connection.setRequestMethod("GET");

            // ⚙️ Step 4: Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // ⚙️ Step 5: Read response if successful
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                // ⚙️ Step 6: Parse JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());
                JSONObject currentWeather = jsonResponse.getJSONObject("current_weather");

                // ⚙️ Step 7: Display the data in structured format
                System.out.println("\n------ Current Weather Data ------");
                System.out.println("Temperature: " + currentWeather.getDouble("temperature") + "°C");
                System.out.println("Wind Speed: " + currentWeather.getDouble("windspeed") + " km/h");
                System.out.println("Wind Direction: " + currentWeather.getDouble("winddirection") + "°");
                System.out.println("Weather Code: " + currentWeather.getInt("weathercode"));
                System.out.println("Time: " + currentWeather.getString("time"));
                System.out.println("-----------------------------------");

            } else {
                System.out.println("❌ Failed to fetch data. HTTP Response Code: " + responseCode);
            }

            // ⚙️ Step 8: Disconnect
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

