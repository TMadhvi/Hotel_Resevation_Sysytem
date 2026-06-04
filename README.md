#  Hotel Reservation System

A simple and efficient **Hotel Reservation System** built using **Java (MVC Architecture)** with **JDBC and MySQL** for database management. The system is designed to handle core hotel operations like room management, customer management, bookings, payments, booking history, and available rooms.

---

##  Modules

###  Room Module

* Add Room
* Update Room
* View Room Details
* Delete Room

---

###  Customer Module

* Add Customer
* Update Customer
* View Customer Details
* Delete Customer

---

###  Booking Module

* Create Booking
* Update Booking
* View Booking Details
* Cancel Booking

---

###  Payment Module

* Add Payment
* Update Payment Status
* View Payment Details
* Delete Payment

---

###  Booking History Module

* View historical booking records
* Read-only module

---

###  Available Rooms Module

* View all available rooms
* Real-time availability check
* Read-only module

---

##  Architecture (MVC Pattern)

### Model

* Room
* Customer
* Booking
* Payment
* availableRoom
* BookingHistory

### DAO Layer

* RoomDAO
* CustomerDAO
* BookingDAO
* PaymentDAO
* AvailableRoomDAO
* BookingHistoryDAO

### View
* RoomView
* CustomerView
* BookingView
* PaymentView
* availableRoomView
* BookingHistoryView
* MainView



### Controller

* Handles business logic
* Connects Model and View

---

##  Database Tables

* rooms
* customers
* bookings
* payments
* available_rooms
* booking_history

## ER Diagram Screenshot:
<img width="858" height="594" alt="hotelscressnsort" src="https://github.com/user-attachments/assets/9f29227e-4720-4461-b94e-67e11e8bdb26" />

---

##  Technology Stack

* Java
* JDBC
* MySQL
* MVC Architecture
* Eclipse IDE

---

##  How to Run

### Step 1: Create Database

CREATE DATABASE hotel_reservation_db;
USE hotel_reservation_db;

---

### Step 2: Import Project

Open project in Eclipse IDE.

---

### Step 3: Configure DB

Update DB credentials in `DBUtil.java`

---

### Step 4: Add JDBC Driver

Add MySQL Connector JAR to build path.

---

### Step 5: Run Project

Run `Main.java`

---

##  Features

* Clean MVC structure
* Core Java
* MySQL datatbase
* JDBC database integration
* CRUD operations for all modules
* Real-time room availability
* Booking history tracking

---

##  Author
Madhvi Tiwari
