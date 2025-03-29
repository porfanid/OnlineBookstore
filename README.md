# OnlineBookstore

This project is developed as part of the Software Development course, showcasing a comprehensive online bookstore application built with Java Spring Boot.

## Features

- User authentication and authorization
- Browse and search for books
- Shopping cart and checkout process
- Admin panel for managing books and orders

## Technologies Used

- Java Spring Boot
- Maven
- Thymeleaf
- Hibernate
- MySQL

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven 3.x
- MySQL database

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/porfanid/OnlineBookstore.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd OnlineBookstore
   ```
3. **Configure the database:**
    - Create a MySQL database named `online_bookstore`.
    - Update the database configuration in `src/main/resources/application.properties` with your database credentials.

4. **Build the project:**
   ```bash
   mvn clean install
   ```
5. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

### Usage

- Access the application at `http://localhost:8080`.
- Register a new user or log in with existing credentials.
- Browse the catalog, add books to your cart, and proceed to checkout.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file for details.