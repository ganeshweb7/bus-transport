# 🚍 Bus Transport REST API

Spring Boot REST API for managing Bus Routes and Buses with One-to-Many relationship.

---

## 📌 Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* Maven

---

## 📂 Project Features

✅ Create Bus Route
✅ Get Route by Id
✅ Delete Route
✅ Create Bus
✅ Search Buses by Route
✅ One-to-Many Relationship (Route → Buses)
✅ Exception Handling

---

## ▶️ How to Run

### 1. Clone / Download Project

Open project in VS Code / IntelliJ.

### 2. Run Application

```
mvn spring-boot:run
```

Server runs on:

```
http://localhost:8080
```

---

## 🧪 API Endpoints

### 1️⃣ Create Route

**POST**

```
/transport/route
```

**Payload**

```json
{
  "title": "PUNE_TO_MUMBAI_BUS",
  "source": "Pune",
  "destination": "Mumbai",
  "stations": "Pune,Lonavala,Karjat,Dadar,CST"
}
```

**Response:** 201 Created

---

### 2️⃣ Get Route By Id

**GET**

```
/transport/route/{routeId}
```

Example:

```
/transport/route/1
```

**Response:** 200 OK

---

### 3️⃣ Delete Route

**DELETE**

```
/transport/route/{routeId}
```

Example:

```
/transport/route/1
```

**Response:** true

---

### 4️⃣ Create Bus

**POST**

```
/transport/bus?routeId=1
```

**Payload**

```json
{
  "busNo": "MH12 AU-3456",
  "color": "Green",
  "capacity": 50
}
```

**Response:** 200 OK

---

### 5️⃣ Search Buses By Route

**GET**

```
/transport/bus/search/{routeId}
```

Example:

```
/transport/bus/search/1
```

---

## 🔗 Relationship

* One Route → Many Buses
* One Bus → One Route

Implemented using:

```
@OneToMany
@ManyToOne
```

---

## ❗ Error Handling

* Invalid Route Id → 404
* Blank Route Fields → 400
* Create Bus with Invalid Route → 404

---

## 🗄 H2 Database

Open:

```
http://localhost:8080/h2-console
```

JDBC URL:

```
jdbc:h2:mem:testdb
```

---

## ⭐ Testing Order

1. Create Route
2. Create Bus
3. Get Route
4. Search Bus
5. Delete Route

---

## 👨‍💻 Author

Ganesh Mali
Frontend Team Lead | React | Next.js | Java | Spring Boot

