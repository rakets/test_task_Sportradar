# Sports Event Calendar (test coding task for Sportradar)

<img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java" />
<img src="https://img.shields.io/badge/Maven-4.0.0-C71A36?style=for-the-badge&logo=apachemaven" alt="Maven" />
<img src="https://img.shields.io/badge/Spring_Boot-3.5.13-green?style=for-the-badge&logo=springboot" alt="Spring Boot 3" />

<img src="https://img.shields.io/badge/MySQL-8-blue?style=for-the-badge&logo=mysql" alt="MySQL" />

<img src="https://img.shields.io/badge/HTML-5-E34F26?style=for-the-badge&logo=html5" alt="HTML5" />
<img src="https://img.shields.io/badge/CSS-3-1572B6?style=for-the-badge&logo=css3" alt="CSS3" />
<img src="https://img.shields.io/badge/JavaScript-ES6-F7DF1E?style=for-the-badge&logo=javascript" alt="JavaScript" />


This project is a simple **Sports Event Calendar** application built with:
- **Backend:** Java + Spring Boot
- **Database:** MySQL
- **Frontend:** HTML, CSS, JavaScript

The application allows you to:
- View sports events
- Add new events
- Store and retrieve data from a relational database

---

## Architecture

### Backend
- Spring Boot REST API
- Layered structure:
  - Controller
  - Service
  - Repository
  - Entity (JPA)

### Database
- MySQL
- Normalized schema (3NF)
- Relations:
  - Event → Team (home/away)
  - Event → Sport
  - Event → Competition

---

### Frontend
- Static HTML page served by Spring Boot
- Fetch API for communication with backend

---

## Setup Instructions

### 1. Clone repository
```bash
git clone <your-repo-url>
cd sports-calendar
```

### 2. Configure database connection
Edit:
```
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### 3. Run application
```bash
mvn spring-boot:run
```

---

## Application URLs

### Frontend
```
http://localhost:8080
```

### API Endpoints

#### Get all events
```
GET /api/events
```

#### Get event by ID
```
GET /api/events/{id}
```

#### Create event
```
POST /api/events
```

---

## Example Request

```json
{
  "date": "2024-01-03",
  "time": "16:00:00",
  "status": "scheduled",
  "season": 2024,
  "homeGoals": 0,
  "awayGoals": 0
}
```

---

## Frontend

- Display list of events
- Show:
  - date
  - time
  - teams
  - status
- Add new event via form
- Simple navigation bar

---

## Possible Improvements

- Add filters (by sport, date)
- Implement DTO layer
- Add validation
- Improve UI/UX
- Add unit tests
- Import events from JSON

---

## 📦 Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- HTML / CSS / JavaScript