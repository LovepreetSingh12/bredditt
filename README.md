# Breaditt - A Reddit Clone

## Overview
Breaditt is a feature-rich social media application that serves as a clone of the popular platform Reddit. Built using Spring Boot, it provides users with the ability to create and manage communities, share posts, and engage in discussions. Breaditt emulates the core functionalities of Reddit while incorporating modern backend development practices.

## Features
- **User Authentication and Authorization**: Secure user registration, login, and session management.
- **Community Management**: Users can create, join, and manage communities (subreddits).
- **Post Creation and Voting**: Users can create posts, upvote or downvote content, and comment on posts.
- **Commenting System**: Nested comments allow users to participate in discussions.
- **Notification System**: Users are notified of relevant actions such as replies and upvotes.
- **User Profiles**: View user activity and profile details.

## Technologies Used
- **Backend**: Spring Boot, Spring Security, Spring Data JPA
- **Database**: MongoDB (or other NoSQL databases)
- **Front-end**: (Optional) React or Angular for the UI
- **Additional Libraries**: Lombok, MapStruct, etc.
- **Build Tool**: Maven or Gradle

## Installation Guide
### 1. Clone the Repository
```bash
git clone https://github.com/username/breaditt.git
cd breaditt
```
### 2. Configure Database
- Ensure MongoDB is installed and running.
- Update **application.properties** or **application.yml** with your MongoDB configuration:
```bash
spring.data.mongodb.uri=mongodb://localhost:27017/breaditt
```
### 3. Build and Run the Application
```bash
./mvnw spring-boot:run
```
### 4. Access the Application
Open your browser and navigate to **http://localhost:92**