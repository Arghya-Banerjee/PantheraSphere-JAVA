# 🐅 PantheraSphere – Tiger Conservation & Tracking System

## 🌿 About PantheraSphere
**PantheraSphere** is a robust **tiger sighting logging and conservation platform**. The platform allows **wildlife enthusiasts, conservationists, and forest officials** to log, track, and verify tiger sightings in different forests. The system ensures **data integrity, role-based access control, and real-time logging** to assist in **wildlife conservation efforts**.

This project is designed with a **controller-service-repository structure** in **Spring Boot**, leveraging **MS SQL Server stored procedures** for efficient data handling.

---

## ✨ Key Features

### 🔹 **Tiger Sighting & Tracking**
- Log tiger sightings with **timestamp, observer details, and location**.
- View **detailed tiger profiles**, including their last sighting and age.
- Maintain **forest-specific sighting records**.

### 🔹 **Role-Based Access Control (RBAC)**
- **Admins** can manage users, verify sightings, and oversee data integrity.
- **Guides & Drivers** can log sightings during safaris.
- **General Users** can browse public sighting data.

### 🔹 **Checklists for Safari Tracking**
- Guides and drivers can **create and update checklists** for safaris.
- Record detailed observations for **each tiger sighted** during a safari.

### 🔹 **Forest & Vehicle Management**
- Maintain **forest details**, including forest type, area, and state.
- Manage **vehicles used for safaris**.

### 🔹 **Stored Procedure-Based Data Handling**
- No ORM; **efficient SQL queries via Spring Data JPA**.
- **Improved performance and security** by calling stored procedures.

---

## 🛠️ Tech Stack

### **Backend**
- **Java Spring Boot** (Controller-Service-Repository Pattern)
- **Spring Data JPA** (For calling stored procedures)
- **MS SQL Server** (Database)
- **Spring Security** (For role-based authentication)
- **Swagger API Documentation**

### **Database**
- **Stored Procedures** for data manipulation
- **MS SQL Server** for high-performance transactions
- **Relational Schema** optimized for conservation data

### **Version Control & Deployment**
- **GitHub** for version control
- **Docker** (Future deployment plan)
- **CI/CD Integration** (Planned for automated builds)

---

## 📂 Database Schema Overview

![Screenshot 2025-02-14 131934](https://github.com/user-attachments/assets/c3e119eb-333c-4db1-95db-a0135d969ed1)

| Table Name         | Description |
|--------------------|------------|
| **UserMaster**     | Stores user data (ID, name, email, role, etc.). |
| **RoleMaster**     | Defines different roles in the system. |
| **TigerMaster**    | Stores tiger details, sightings, and associated forest. |
| **ForestMaster**   | Maintains forest data where tigers are found. |
| **ForestTypeMaster** | Stores forest type classifications. |
| **DriverMaster**   | Holds information about safari drivers. |
| **GuideMaster**    | Stores safari guides' details. |
| **CarMaster**      | Maintains records of safari vehicles. |
| **ChecklistHeader** | Represents a checklist for safari observations. |
| **ChecklistItem**  | Stores tiger sighting details linked to a checklist. |

---

## 🚀 Installation & Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-repo/PantheraSphere.git
cd PantheraSphere
```

### 2️⃣ Configure the Database
- **Create an MS SQL Server database**.
- **Run the SQL schema scripts** to set up tables and stored procedures.

### 3️⃣ Set Up Environment Variables
Create an `.env` file or update `application.properties` with:
```
spring.datasource.url=jdbc:sqlserver://<server>:<port>;databaseName=PantheraSphere
spring.datasource.username=<your-db-username>
spring.datasource.password=<your-db-password>
spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect
```

### 4️⃣ Run the Application
```bash
mvn spring-boot:run
```
or
```bash
java -jar target/PantheraSphere.jar
```

### 5️⃣ API Documentation
- **Swagger UI**: `http://localhost:8080/swagger-ui/index.html`

---

## 🛠️ Future Enhancements

🔹 **Mobile App Integration 📱**  
- Develop an **Android/iOS app** to log sightings on the go.

🔹 **AI-Based Tiger Recognition 🧠**  
- Implement an **image recognition model** to **identify tigers using photos**.

🔹 **Geo-Tagging & Live Location Tracking 🗺️**  
- Integrate **Google Maps API** to plot tiger sightings on an interactive map.

🔹 **Automated Alerts & Notifications 🔔**  
- Send alerts when a **tiger is sighted near human settlements**.

🔹 **Community & Social Features 🌍**  
- Allow **users to discuss sightings, share photos, and collaborate**.

🔹 **Multi-Forest & Multi-Country Support 🌎**  
- Scale the platform for **international conservation efforts**.

---

## 🤝 Contributing
We welcome contributions!  
**To contribute:**
1. Fork the repository.
2. Create a new branch (`feature/new-feature`).
3. Commit changes and push the branch.
4. Open a pull request.

---

## 📜 License
This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Developed By
**Arghya Banerjee** 🚀  
🎯 **Backend Developer | Spring Boot | MS SQL Server**  
📧 [Email](mailto:your-email@example.com) | 🌐 [LinkedIn](https://www.linkedin.com/in/arghya-banerjee/) | 📸 Wildlife & Bird Photographer  

---

## ⭐ Support & Feedback
If you like this project, **give it a star ⭐** on GitHub!  
For feedback, drop an email or **open an issue**.

🐅 **PantheraSphere – Empowering Wildlife Conservation Through Technology** 🌿
