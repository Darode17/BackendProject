Blood Bank Management System
A full-stack web application built using Spring Boot, Angular, and MySQL to manage blood inventory, donors, and hospital requests efficiently.

🚀 Project Overview
The Blood Bank Management System helps:
Manage blood stock availability
Register and track donors
Handle hospital blood requests
Maintain donation history
Provide real-time updates between frontend and backend
This system ensures efficient coordination between donors, hospitals, and blood banks.

🛠️ Tech Stack
Backend
Java
Spring Boot
Spring Data JPA
Hibernate
REST APIs
Frontend
Angular
TypeScript
HTML
CSS
Bootstrap
Database
MySQL
Tools
Git
Postman
IntelliJ IDEA / VS Code

📌 Features

✅ Donor Registration & Management
✅ Blood Stock Management
✅ Hospital Blood Request Handling
✅ Donation History Tracking
✅ RESTful API Integration
✅ Real-time Frontend-Backend Communication
✅ Optimized MySQL Queries for Fast Data Retrieval

🏗️ System Architecture

Frontend (Angular) → REST API (Spring Boot) → MySQL Database

Angular handles UI and user interaction

Spring Boot handles business logic

MySQL stores application data

⚙️ Installation & Setup
1️⃣ Clone the Repository
git clone https://github.com/Darode17/BackendProject.git
cd BackendProject
2️⃣ Backend Setup (Spring Boot)

Configure application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/bloodbank
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Run the application:

mvn spring-boot:run

Backend runs at:

http://localhost:8080
3️⃣ Frontend Setup (Angular)
cd frontend
npm install
ng serve

Frontend runs at:

http://localhost:4200
📊 API Endpoints (Sample)
Method	Endpoint	Description
POST	/donors	Add new donor
GET	/donors	Get all donors
POST	/requests	Create blood request
GET	/inventory	Check blood stock
📈 Future Improvements

Role-based authentication (Admin / Hospital)

Email/SMS notifications

Dashboard with analytics

Deployment on AWS / Azure

👩‍💻 Author

Radhika Darode
Backend Developer
📧 radhikadarode20@gmail.com
🔗 https://www.linkedin.com/in/radhika-darode-691184229/
