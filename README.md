# REST-API-CLIENT

COMPANY NAME : CODETECH IT SOLUTION

NAME : Vivin S.R

INTERN ID : CT06DR125

DOMAIN : Java Programming

DURATION : 6 WEEKS

MENTOR : NEELA SANTOSH

** DESCRIPTION ABOUT THE TASK **

🌐 TASK 2: REST API CLIENT
🧩 Objective:

--> The main objective of this task is to create a Java application that consumes a public REST API, processes the JSON response, and displays the data in a structured and user-friendly format. This project focuses on the practical implementation of HTTP communication and JSON parsing, which are essential for real-world software and web integration projects.

⚙️ Overview:

--> In modern software systems, applications rarely work in isolation. They constantly interact with other systems over the internet using APIs (Application Programming Interfaces). REST (Representational State Transfer) APIs are the most common type of web services that use HTTP methods to allow communication between clients and servers.

--> In this task, a Java-based REST API Client was developed to fetch live weather data from the public Open-Meteo API, which provides accurate and up-to-date meteorological information such as temperature, wind speed, wind direction, and more.

--> The program establishes an HTTP connection to the API, sends a GET request, reads the server response, parses the JSON data, and displays the extracted information in a clean and organized format.

💻 Technology Used:

--> Programming Language: Java

--> API Used: Open-Meteo Public Weather API

Libraries:

--> java.net.HttpURLConnection – for sending HTTP requests and receiving responses

--> java.io – for reading the response stream

--> org.json – for parsing and handling JSON data

--> Tools Used: Visual Studio Code, JDK 17

🧠 Working Principle:

--> The program starts by defining the API endpoint URL, which includes latitude and longitude coordinates for a specific location (in this case, Chennai). Using the built-in HttpURLConnection class, it opens a connection to the URL and sets the request method to GET.

--> Once the request is made, the API returns a JSON-formatted response containing weather data. This response is read through a BufferedReader, stored as a string, and then parsed using the org.json library.

--> From the JSON object, key fields such as temperature, wind speed, wind direction, and time are extracted and displayed neatly in the console.

--> The flow of execution follows these main steps:

--> Establish HTTP connection.

--> Send GET request.

--> Receive JSON response.

--> Parse and extract data.

--> Display the results.

🧰 Features:

✅ Fetches real-time weather data from the internet.
✅ Handles HTTP connections and responses effectively.
✅ Parses JSON data dynamically using a lightweight library.
✅ Displays data in a structured and readable format.
✅ Implements error handling to catch failed connections or unexpected responses.
✅ Fully functional and executable in a standalone Java environment.

🧪 Sample Output
Response Code: 200

------ Current Weather Data ------
Temperature: 27.5°C
Wind Speed: 8.7 km/h
Wind Direction: 45.0°
Weather Code: 2
Time: 2025-11-10T13:00
-----------------------------------


--> The output above confirms that the REST API call was successful and that data was received, parsed, and printed correctly.

🚀 Conclusion:

--> This project demonstrates how Java can be effectively used for web data integration and real-time information retrieval. The REST API client developed here showcases strong fundamentals in:
API communication

Data serialization/deserialization

Internet-based programming

--> Through this task, practical understanding of network programming concepts was strengthened — including HTTP protocols, API endpoints, and JSON data structures.

--> By completing this project, a solid foundation has been built for future integration-based applications such as weather dashboards, IoT systems, or data-driven analytics platforms.

-->This project not only fulfills the internship requirement but also provides real-world insight into how modern systems interact and share data across networks. 🌍💻✨

** OUTPUT **

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/771de5d1-5381-41da-9de4-0991c454776f" />
