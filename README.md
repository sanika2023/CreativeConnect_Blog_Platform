# 🎨 CreativeConnect

CreativeConnect is a full-stack web application that allows users to share, discover, and manage creative content. The platform supports user authentication, content creation, and organization through categories and tags.

This project was built as a learning-focused full-stack application using **Spring Boot** for the backend and **React + TypeScript** for the frontend.

---

## 🚀 Features

- User authentication (login & logout)
- Create, edit, and delete posts
- View posts by category and tag
- Responsive frontend UI
- RESTful API architecture connecting frontend and backend

---

## 🛠 Tech Stack

### Backend
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- Maven

### Frontend
- React
- TypeScript
- Vite
- Tailwind CSS
- React Router

---

## 📁 Project Structure
CreativeConnect/
├── backend/ # Spring Boot backend
└── frontend/ # React frontend

## ⚙️ Getting Started

Follow the steps below to run the project locally.

---

### 1️⃣ Clone the Repository

git clone https://github.com/YOUR_USERNAME/CreativeConnect.git
cd CreativeConnect

### 2️⃣ Backend Setup

Navigate to the backend folder and start the Spring Boot server:

cd backend
./mvnw spring-boot:run

The backend will run at:
http://localhost:8080

### 3️⃣ Frontend Setup

Open a new terminal window, then:

cd frontend
npm install
npm run dev


The frontend will run at:
http://localhost:5173

## 🔐 Environment Variables

### Frontend
Create a .env file inside the frontend folder:
VITE_API_URL=http://localhost:8080

### Backend
If using a database, configure credentials using environment variables instead of hardcoding them in application.properties.
🔗 API Overview (Sample)
Method	    Endpoint	        Description
GET	        /api/v1/posts	    Get all posts
POST	      /posts	          Create a new post
PUT	        /posts/{id}       Update a post
DELETE	    /posts/{id}	      Delete a post


### 📌 Future Improvements

User profiles

Image uploads

Comments and likes

Deployment to cloud platforms

Improved UI theming and branding



---

## ✅ How to add this README

1. In your `CreativeConnect` root folder:
   - Create a file called:
     ```
     README.md
     ```

2. Paste the content above

3. Commit & push:
   ```bash
   git add README.md
   git commit -m "Add project README"
   git push






## 📁 Project Structure

