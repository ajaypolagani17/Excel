# 📄 Excel Form Data Storage using Spring Boot

A simple Java Spring Boot web application that allows users to submit form data, which is automatically stored in an Excel file (`.xlsx`) using Apache POI. No database required — the form entries are saved directly in a structured Excel sheet.

## 🚀 Key Features

- ✅ User-friendly web form built with HTML & CSS  
- 📥 Automatically saves form data into Excel file  
- 🔁 Each submission adds a new row  
- 💾 Data stored in `.xlsx` format using Apache POI  
- 🖥 Backend powered by Spring Boot  
- 📂 No need for a database  

## 🧰 Tech Stack

| Technology   | Purpose                  |
|--------------|--------------------------|
| Java         | Backend development      |
| Spring Boot  | Web framework            |
| Apache POI   | Excel file generation    |
| HTML, CSS    | Frontend form            |
| Maven        | Build tool and dependency management |

## 🖼 Project Overview

This project is designed to collect user input through a form and store the data directly into an Excel spreadsheet. It is useful for:

- 💼 Employee Data Collection  
- 📝 Student Registrations  
- 📋 Feedback or Survey Forms  

## 📁 Project Structure

src/
├── main/
│ ├── java/
│ │ └── com/example/excelform/
│ │ ├── controller/
│ │ ├── model/
│ │ └── service/
│ └── resources/
│ ├── templates/ (form.html)
│ └── application.properties


## ▶️ How to Run the Project

1. Clone the repository:

2. Open the project in your IDE.

3. Build using Maven.

4. Run the application:

5. Open in browser:

6. Fill and submit the form. Check the generated Excel file (`form-data.xlsx`) in your project folder.

## 📌 Form Fields Example

- Name  
- Email  
- Phone  
- Department  

## 🧑‍💻 Author

**Ajay Polagani**  
Java | Spring Boot Developer  

## 📝 License

This project is licensed under the MIT License.
