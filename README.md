# 🧭 Indoor Navigation System

<p align="center">
  <img src="https://img.shields.io/badge/Java-23-orange?style=for-the-badge&logo=openjdk" alt="Java">
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0.1-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot">
  <img src="https://img.shields.io/badge/MongoDB-Database-green?style=for-the-badge&logo=mongodb" alt="MongoDB">
  <img src="https://img.shields.io/badge/HTML5-Frontend-orange?style=for-the-badge&logo=html5" alt="HTML5">
  <img src="https://img.shields.io/badge/CSS3-Styling-blue?style=for-the-badge&logo=css3" alt="CSS3">
  <img src="https://img.shields.io/badge/JavaScript-Frontend-yellow?style=for-the-badge&logo=javascript" alt="JavaScript">
  <img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven" alt="Maven">
</p>

<h3 align="center">
  A web-based indoor navigation system designed to help users find locations and navigate efficiently inside buildings.
</h3>

<p align="center">
  <a href="#-overview">Overview</a> •
  <a href="#-features">Features</a> •
  <a href="#-technology-stack">Tech Stack</a> •
  <a href="#-architecture">Architecture</a> •
  <a href="#-installation">Installation</a> •
  <a href="#-usage">Usage</a> •
  <a href="#-project-structure">Project Structure</a> •
  <a href="#-future-enhancements">Future Enhancements</a>
</p>

---

## 📌 Overview

**Indoor Navigation System** is a web-based application developed to provide navigation assistance inside indoor environments such as colleges, office buildings, hospitals, shopping malls, hotels, and other large facilities.

Traditional GPS-based navigation systems are mainly designed for outdoor environments. Indoor environments can contain multiple rooms, corridors, floors, stairs, and other interconnected locations where conventional GPS navigation may not provide accurate guidance.

This project provides an indoor-focused navigation approach using predefined locations and connections stored in a MongoDB database.

The backend is developed using **Java and Spring Boot**, while the frontend uses **HTML, CSS, and JavaScript**.

---

## 🎯 Problem Statement

Finding a particular room, laboratory, department, office, or facility inside a large building can be difficult for:

- 🎓 Students
- 👨‍💼 Employees
- 👨‍👩‍👧 Visitors
- 🏥 Patients
- 🛍️ Customers
- 🆕 First-time visitors

The objective of this project is to provide a simple and user-friendly system that helps users identify their destination and navigate through predefined indoor locations.

---

## 💡 Proposed Solution

The system models the indoor environment as a collection of connected locations.

A typical navigation flow is:

```text
User
  ↓
Select Destination
  ↓
Navigation Request
  ↓
Spring Boot Backend
  ↓
Retrieve Location Data
  ↓
Navigation Service
  ↓
Calculate / Generate Route
  ↓
Return Navigation Information
  ↓
Display Route to User

The application separates the frontend, backend, business logic, and database responsibilities to keep the project organized and maintainable.

✨ Features
🧭 Indoor Navigation

Allows users to navigate between predefined locations inside an indoor environment.

📍 Location-Based Navigation

Indoor locations are represented as nodes that can be connected to other locations.

Example:

Entrance
   ↓
Reception
   ↓
Main Corridor
   ↓
Computer Lab
   ↓
Classroom
🎯 Destination Selection

Users can select or enter a destination and request navigation information.

🗺️ Navigation Interface

The application provides dedicated navigation pages for displaying route information.

💾 MongoDB Database

MongoDB is used to store indoor location information.

⚡ Spring Boot Backend

Spring Boot provides the backend architecture and handles HTTP requests and application logic.

🌐 Web-Based Frontend

The frontend is developed using:

HTML5
CSS3
JavaScript
🧩 Layered Architecture

The backend is organized into:

Controller
    ↓
Service
    ↓
Repository
    ↓
MongoDB

This makes the application easier to understand, test, and maintain.

🖥️ Application Screenshots

Replace these images with screenshots from your actual running application.

🏠 Home Page

🎯 Destination Selection

🧭 Navigation Page

🗺️ Full Navigation

🏗️ System Architecture
                       ┌──────────────────────┐
                       │        USER          │
                       └──────────┬───────────┘
                                  │
                                  ▼
                       ┌──────────────────────┐
                       │   Web Frontend       │
                       │ HTML / CSS / JS      │
                       └──────────┬───────────┘
                                  │
                             HTTP Request
                                  │
                                  ▼
                       ┌──────────────────────┐
                       │   Spring Boot        │
                       │      Backend         │
                       └──────────┬───────────┘
                                  │
                                  ▼
                       ┌──────────────────────┐
                       │ NavigationController│
                       └──────────┬───────────┘
                                  │
                                  ▼
                       ┌──────────────────────┐
                       │  NavigationService   │
                       └──────────┬───────────┘
                                  │
                                  ▼
                       ┌──────────────────────┐
                       │ LocationRepository   │
                       └──────────┬───────────┘
                                  │
                                  ▼
                       ┌──────────────────────┐
                       │      MongoDB         │
                       │ indoor_navigation_db │
                       └──────────────────────┘
🔄 Application Workflow
              ┌───────────────┐
              │     START     │
              └───────┬───────┘
                      │
                      ▼
             ┌─────────────────┐
             │ Open Application│
             └────────┬────────┘
                      │
                      ▼
             ┌─────────────────┐
             │   Home Page     │
             └────────┬────────┘
                      │
                      ▼
             ┌─────────────────┐
             │ Select/Enter    │
             │   Destination   │
             └────────┬────────┘
                      │
                      ▼
             ┌─────────────────┐
             │ Send Navigation │
             │     Request     │
             └────────┬────────┘
                      │
                      ▼
             ┌─────────────────┐
             │ Spring Boot API │
             └────────┬────────┘
                      │
                      ▼
             ┌─────────────────┐
             │ Navigation      │
             │ Service         │
             └────────┬────────┘
                      │
                      ▼
             ┌─────────────────┐
             │ Retrieve Data   │
             │ from MongoDB    │
             └────────┬────────┘
                      │
                      ▼
             ┌─────────────────┐
             │ Generate Route  │
             └────────┬────────┘
                      │
                      ▼
             ┌─────────────────┐
             │ Display         │
             │ Navigation      │
             └────────┬────────┘
                      │
                      ▼
                ┌──────────┐
                │   END    │
                └──────────┘
🛠️ Technology Stack
Technology	Purpose
☕ Java	Backend programming
🌱 Spring Boot	Backend framework
🍃 Spring Data MongoDB	Database integration
🍃 MongoDB	Location data storage
🌐 HTML5	Frontend structure
🎨 CSS3	UI styling
⚡ JavaScript	Frontend functionality
🦉 Maven	Dependency and build management
🐙 Git	Version control
🐙 GitHub	Source-code hosting
🧩 Project Structure
indoor-navigation-system/
│
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
│
├── src/
│   │
│   ├── main/
│   │   │
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── college/
│   │   │           └── indoor_navigation/
│   │   │               │
│   │   │               ├── config/
│   │   │               │   └── DataLoader.java
│   │   │               │
│   │   │               ├── controller/
│   │   │               │   └── NavigationController.java
│   │   │               │
│   │   │               ├── model/
│   │   │               │   └── LocationNode.java
│   │   │               │
│   │   │               ├── repository/
│   │   │               │   └── LocationRepository.java
│   │   │               │
│   │   │               ├── service/
│   │   │               │   └── NavigationService.java
│   │   │               │
│   │   │               └── IndoorNavigationApplication.java
│   │   │
│   │   └── resources/
│   │       │
│   │       ├── static/
│   │       │   │
│   │       │   ├── css/
│   │       │   │   └── style.css
│   │       │   │
│   │       │   ├── js/
│   │       │   │   ├── main.js
│   │       │   │   ├── destination.js
│   │       │   │   └── navigation.js
│   │       │   │
│   │       │   ├── index.html
│   │       │   ├── destination.html
│   │       │   ├── navigate.html
│   │       │   └── full-navigate.html
│   │       │
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── college/
│                   └── indoor_navigation/
│                       └── IndoorNavigationApplicationTests.java
│
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
🧠 Core Components
IndoorNavigationApplication

The main Spring Boot entry point of the application.

It starts the Spring Boot application and initializes the backend server.

NavigationController

The controller layer receives navigation-related HTTP requests from the frontend and communicates with the service layer.

Frontend
   ↓
NavigationController
   ↓
NavigationService
NavigationService

The service layer contains the application's navigation/business logic.

It works with location data to process navigation requests.

LocationNode

Represents an indoor location that can participate in the navigation system.

A location can represent places such as:

Entrance
Room
Laboratory
Office
Corridor
Staircase
Reception
LocationRepository

The repository layer provides access to MongoDB using Spring Data MongoDB.

NavigationService
        ↓
LocationRepository
        ↓
MongoDB
DataLoader

The data loader is responsible for loading predefined location data required by the application.

🗄️ Database

The application uses MongoDB as its database.

Local MongoDB Configuration
spring.application.name=indoor-navigation
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=indoor_navigation_db

MongoDB should therefore be running locally on:

localhost:27017

The application uses:

Database:
indoor_navigation_db
🗺️ Navigation Model

The indoor environment can be represented as a graph where:

A node represents a location.
A connection represents a possible movement between locations.

Example:

                 ┌──────────────┐
                 │   Entrance   │
                 └──────┬───────┘
                        │
                        ▼
                 ┌──────────────┐
                 │  Reception   │
                 └──────┬───────┘
                        │
              ┌─────────┴─────────┐
              ▼                   ▼
       ┌──────────────┐    ┌──────────────┐
       │   Corridor   │    │    Stairs    │
       └──────┬───────┘    └──────┬───────┘
              │                   │
       ┌──────┴───────┐           ▼
       ▼              ▼    ┌──────────────┐
 ┌──────────┐   ┌──────────┐│   Floor 2   │
 │  Room A  │   │  Room B  │└──────────────┘
 └──────────┘   └──────────┘

This model can be extended to support larger buildings and multiple floors.

🔌 Backend API

The project contains a Spring Boot controller for handling navigation functionality.

The exact API endpoints should be verified from NavigationController.java.

Example API structure:

HTTP Request
     ↓
NavigationController
     ↓
NavigationService
     ↓
LocationRepository
     ↓
MongoDB

Update the endpoint table below whenever additional API endpoints are added.

Method	Endpoint	Purpose
GET	/api/locations	Retrieve available locations
GET	/api/navigation	Process navigation request
🚀 Installation
1️⃣ Prerequisites

Install the following software:

Java JDK
MongoDB
Git
IntelliJ IDEA or VS Code

Verify Java:

java -version

Verify Git:

git --version
📥 Clone the Repository

Clone the project:

git clone https://github.com/YOUR_USERNAME/indoor-navigation-system.git

Navigate into the project:

cd indoor-navigation-system
🍃 Start MongoDB

Make sure MongoDB is running locally.

The application expects MongoDB at:

localhost:27017
▶️ Run the Application
Windows

Use the Maven wrapper:

.\mvnw.cmd spring-boot:run
Linux / macOS
./mvnw spring-boot:run
🌐 Open the Application

After successful startup, open:

http://localhost:8080

The Spring Boot application serves the frontend from the project's static resources.

🧪 Run Tests

To execute the project's tests:

Windows
.\mvnw.cmd test
Linux / macOS
./mvnw test
🏗️ Build the Project
Windows
.\mvnw.cmd clean package
Linux / macOS
./mvnw clean package

The generated build files will be placed in:

target/

The target/ directory should not be committed to Git because it is generated during the build process.

🐛 Troubleshooting
❌ Port 8080 Already in Use

If you see:

Web server failed to start.
Port 8080 was already in use.

Find the process using port 8080:

netstat -ano | findstr :8080

Identify the process:

tasklist | findstr PID

Replace PID with the process ID.

If the process is an unwanted old Java/Spring Boot instance, stop it:

taskkill /PID PID /F

Then restart:

.\mvnw.cmd spring-boot:run
❌ MongoDB Connection Error

If the application cannot connect to MongoDB:

Check that MongoDB is running.
Verify that MongoDB is listening on port 27017.
Check application.properties.
Restart the Spring Boot application.

Expected MongoDB configuration:

Host: localhost
Port: 27017
Database: indoor_navigation_db
❌ Maven Command Not Found

Instead of using globally installed Maven, use the Maven wrapper included with the project:

.\mvnw.cmd spring-boot:run
🔐 Security

Never commit sensitive credentials to GitHub.

Do not upload:

.env
API keys
Database passwords
Access tokens
Private credentials

For production applications, sensitive configuration should be provided through environment variables or a secure configuration system.

The current local configuration uses MongoDB without authentication:

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=indoor_navigation_db
🚧 Current Limitations

The current version is designed around predefined indoor locations and a locally running MongoDB database.

Some advanced real-world indoor positioning capabilities are not yet included.

🔮 Future Enhancements
📱 Mobile Application

Develop Android/iOS applications to provide navigation on mobile devices.

📍 Real-Time Indoor Positioning

Integrate technologies such as:

Bluetooth Low Energy (BLE)
Wi-Fi positioning
QR-code positioning
Indoor positioning sensors
🗺️ Interactive Indoor Maps

Add interactive maps containing:

Rooms
Corridors
Stairs
Elevators
Entrances
Emergency exits
🏢 Multi-Floor Navigation

Support navigation across multiple floors.

Floor 1
   ↓
Elevator / Stairs
   ↓
Floor 2
   ↓
Destination
♿ Accessibility-Aware Navigation

Provide accessible routes that prioritize:

Elevators
Ramps
Accessible entrances
Avoidance of stairs
🚨 Emergency Navigation

Add navigation to:

Emergency exits
Fire exits
First-aid facilities
Safety zones
☁️ Cloud Deployment

Deploy the backend and database using cloud infrastructure.

🔐 Authentication

Add authentication and role-based access for:

Students
Visitors
Administrators
🛠️ Admin Dashboard

Allow administrators to:

Add locations
Remove locations
Update locations
Modify connections
Manage building maps
Manage navigation data
📈 Future Architecture
                         ┌──────────────────┐
                         │      USERS       │
                         └────────┬─────────┘
                                  │
                                  ▼
                    ┌─────────────────────────┐
                    │   Web / Mobile Client   │
                    └────────────┬────────────┘
                                 │
                                 ▼
                    ┌─────────────────────────┐
                    │       REST API          │
                    └────────────┬────────────┘
                                 │
             ┌───────────────────┼───────────────────┐
             │                   │                   │
             ▼                   ▼                   ▼
      ┌──────────────┐    ┌──────────────┐    ┌──────────────┐
      │ Navigation   │    │ Location     │    │ User/Auth    │
      │ Service      │    │ Service      │    │ Service      │
      └──────┬───────┘    └──────┬───────┘    └──────┬───────┘
             │                   │                   │
             └───────────────────┼───────────────────┘
                                 │
                                 ▼
                       ┌──────────────────┐
                       │     MongoDB      │
                       └──────────────────┘
📊 Development Roadmap
Current
  │
  ├── ✅ Spring Boot Backend
  ├── ✅ MongoDB Integration
  ├── ✅ Indoor Location Model
  ├── ✅ Navigation Service
  ├── ✅ Web Frontend
  └── ✅ Basic Navigation
          │
          ▼
Next
  │
  ├── ⬜ Interactive Indoor Map
  ├── ⬜ Multi-Floor Navigation
  ├── ⬜ Real-Time Positioning
  ├── ⬜ Authentication
  ├── ⬜ Admin Dashboard
  └── ⬜ Cloud Deployment
          │
          ▼
Future
  │
  ├── ⬜ Mobile Application
  ├── ⬜ Accessibility Routes
  ├── ⬜ Emergency Navigation
  └── ⬜ Advanced Indoor Positioning
👨‍💻 Author
Rohan Pawar

Indoor Navigation System

Developed using:

Java
Spring Boot
MongoDB
HTML
CSS
JavaScript
Maven
Connect With Me
💼 LinkedIn: YOUR_LINKEDIN_URL
🐙 GitHub: YOUR_GITHUB_PROFILE_URL
📧 Email: YOUR_EMAIL
⭐ Support

If you find this project useful or interesting, please consider giving the repository a ⭐ on GitHub.

📄 License

This project is developed for educational, academic, and project demonstration purposes.
