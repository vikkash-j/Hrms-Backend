# HRMS Frontend - React Application

A responsive Human Resource Management System (HRMS) frontend built using React.js. The application communicates with the Spring Boot backend through REST APIs.

## Tech Stack

- React JS
- JavaScript
- Bootstrap 5
- Axios
- React Router DOM

## Features

- Dashboard
- Department Management
- Employee Management
- Responsive UI
- REST API Integration
- Form Validation
- CRUD Operations

## Project Structure

```
src
 ├── components
 ├── services
 ├── pages
 ├── App.js
 └── index.js
```

## Screens

- Home Page
- Department List
- Add Department
- Update Department
- Employee List
- Add Employee
- Update Employee

## Installation

Clone the repository

```bash
git clone https://github.com/your-username/HRMS-Frontend.git
```

Install dependencies

```bash
npm install
```

Start the application

```bash
npm start
```

The application runs on

```
http://localhost:3000
```

## Backend Configuration

Update the backend API URL inside your Axios service.

Example

```javascript
const API_BASE_URL = "http://localhost:8080";
```

For production deployment

```javascript
const API_BASE_URL = "https://your-backend-url.onrender.com";
```

## Future Enhancements

- Authentication
- JWT Login
- Dashboard Analytics
- Pagination
- Search & Filter
- Dark Mode
- Role Based UI

## Author

Vikkash J