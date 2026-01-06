# Ikaansh Events Backend

Spring Boot backend system for managing events, registrations, and users in an event management platform.

---

## 1️⃣ Project Structure

src/
├── main/java/com/Ikaansh/events
│ ├── config
│ │ ├── PasswordEncoderConfig.java
│ │ └── SecurityConfig.java
│ ├── controller
│ │ ├── AdminEventController.java
│ │ ├── AuthController.java
│ │ ├── EventController.java
│ │ ├── StudentController.java
│ │ └── UserController.java
│ ├── dto
│ │ ├── EventRequest.java
│ │ ├── LoginRequest.java
│ │ └── RegisterRequest.java
│ ├── entity
│ │ ├── Event.java
│ │ ├── Registration.java
│ │ ├── Role.java
│ │ └── User.java
│ ├── repository
│ │ ├── EventRepository.java
│ │ ├── RegistrationRepository.java
│ │ └── UserRepository.java
│ ├── service
│ │ ├── EventService.java
│ │ ├── RegistrationService.java
│ │ └── UserService.java
│ └── IkaanshEventsApplication.java
└── resources
└── application.properties

---

## 2️⃣ Features
- User registration & login
- Event management (create, update, delete)
- Admin panel for managing events and registrations
- Role-based access (Admin/User)
- REST APIs for frontend integration

---

## 3️⃣ Tech Stack
- Java 17
- Spring Boot
- Dynamic Web Project (Eclipse)
- PostgreSQL database
- Spring Security
- Lombok

---

## 4️⃣ Setup Instructions
1. Clone the repository:  
```bash
git clone https://github.com/KapilSharma55/ikaansh-events-backend.git
Import the project in Eclipse as a Dynamic Web Project
Configure src/main/resources/application.properties with your PostgreSQL credentials
Run IkaanshEventsApplication.java to start the server
Test API endpoints using Postman or frontend integration
5️⃣ API Endpoints (Examples)
Endpoint	Method	Description
/api/auth/register	POST	Register new user
/api/auth/login	POST	Login
/api/events	GET	Get all events
/api/events	POST	Create new event
/api/events/{id}	PUT	Update event by ID
/api/events/{id}	DELETE	Delete event by ID
/api/registrations	POST	Register for an event


## 7️⃣ Contributing
- Fork the repository
- Create a feature branch (`git checkout -b feature/xyz`)
- Commit your changes (`git commit -m "Add feature xyz"`)
- Push branch (`git push origin feature/xyz`)
- Create a Pull Request

## 8️⃣ Author
Kapil Sharma

## 9️⃣ License
This project is licensed under the MIT License. See LICENSE file for details.
