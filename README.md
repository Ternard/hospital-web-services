# Hospital Web Services Application

A lightweight, production-grade Hospital Management System built with Spring Boot and MySQL, optimized for local development environments.

## Features

✅ **User Management**
- User registration and login
- Role-based access control (Admin, Doctor, Nurse, Receptionist, Patient)
- JWT authentication
- BCrypt password encryption

✅ **Patient Management**
- Complete patient CRUD operations
- Medical history tracking
- Blood group and allergy management

✅ **Doctor Management**
- Doctor profile management
- Specialization tracking
- Consultation fees

✅ **Appointments**
- Schedule appointments
- Appointment status management
- Patient and doctor appointment views

✅ **Medical Records**
- Store medical records
- Diagnosis and prescription tracking
- Test results management

✅ **Billing**
- Track billing records
- Payment status management
- Simple billing system

✅ **Security**
- Role-based authorization
- Input validation
- Global exception handling
- Audit logging

## Prerequisites

- Java 17+
- MySQL (XAMPP)
- Maven 3.6+
- IDE (VS Code, IntelliJ IDEA, Eclipse)

## Setup Instructions

### 1. Database Setup

```bash
# Start XAMPP and ensure MySQL is running
# Open phpMyAdmin: http://localhost/phpmyadmin

# Execute the SQL schema:
# src/main/resources/db/migration/V1__Initial_Schema.sql
```

### 2. Clone Repository

```bash
git clone https://github.com/Ternard/hospital-web-services.git
cd hospital-web-services
```

### 3. Configure Application

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=
```

### 4. Build & Run

```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

The application will start at `http://localhost:8080`

## Default Credentials

```
Username: admin
Password: admin123
Role: ADMIN
```

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - Login user
- `POST /api/auth/logout` - Logout user

### Patients
- `GET /api/patients` - Get all patients (paginated)
- `GET /api/patients/{id}` - Get patient by ID
- `POST /api/patients` - Create new patient
- `PUT /api/patients/{id}` - Update patient
- `DELETE /api/patients/{id}` - Delete patient

### Appointments
- `GET /api/appointments` - Get all appointments
- `GET /api/appointments/{id}` - Get appointment by ID
- `GET /api/appointments/patient/{patientId}` - Get patient appointments
- `GET /api/appointments/doctor/{doctorId}` - Get doctor appointments
- `POST /api/appointments` - Create appointment
- `PUT /api/appointments/{id}` - Update appointment
- `PUT /api/appointments/{id}/status/{status}` - Update appointment status
- `PUT /api/appointments/{id}/cancel` - Cancel appointment

## Project Structure

```
hospital-web-services/
├── src/main/java/com/hospital/
│   ├── controller/       (REST Controllers)
│   ├── service/          (Business Logic)
│   ├── repository/       (Data Access)
│   ├── entity/           (JPA Entities)
│   ├── dto/              (Data Transfer Objects)
│   ├── config/           (Spring Configuration)
│   ├── security/         (Authentication & Security)
│   ├── exception/        (Exception Handling)
│   └── HospitalApplication.java
├── src/main/resources/
│   ├── application.properties
│   └── db/migration/
├── src/test/
├── public/               (Frontend Files)
│   ├── index.html
│   ├── login.html
│   ├── register.html
│   └── css/
├── pom.xml
└── README.md
```

## Technology Stack

- **Backend**: Spring Boot 3.1.5
- **Database**: MySQL
- **ORM**: Hibernate/JPA
- **Security**: Spring Security + JWT
- **Validation**: Hibernate Validator
- **Build**: Maven
- **Frontend**: HTML/CSS/JavaScript
- **Testing**: JUnit 4

## Testing

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=AuthServiceTest
```

## Postman Collection

Import the Postman collection to test all API endpoints:
- See `API_EXAMPLES.md` for detailed endpoint documentation

## Security Notes

1. Change JWT secret in production
2. Use strong database passwords
3. Enable HTTPS in production
4. Implement rate limiting for APIs
5. Regular security audits recommended

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see LICENSE file for details.

## Support

For support, email support@hospital.com or open an issue on GitHub.

## Authors

- **Ternard** - Initial implementation

## Acknowledgments

- Spring Boot documentation
- MySQL documentation
- Community contributions
