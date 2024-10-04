# 2024-25: Coding exercises

 **Exercise 1: Problem Statement on Design patterns** - [Repo Link](https://github.com/Jhanvik23/design_patterns_java)
 
 **Exercise 2: Problem Statements for Mini-projects** - This Repo

---

# Satellite Command System

## Overview
The Satellite Command System is a Java-based application designed to manage and control various satellite operations. This project demonstrates the implementation of several key software design patterns, including Command, Singleton, and Observer patterns. The system simulates real-world scenarios where commands are issued to satellites, and various actions are performed, such as activating solar panels, checking satellite status, and more.

## Features
- **Command Pattern:** Allows encapsulation of requests as objects, supporting parameterization of clients with different requests, queuing of requests, and logging the history of requests.
- **Singleton Pattern:** Ensures a class has only one instance and provides a global point of access to it.
- **Observer Pattern:** Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

## Table of Contents
- Installation
- Usage
- Project Structure
- Design Patterns Implemented
- Examples

## Installation
## Prerequisites
- **Java Development Kit (JDK):** Make sure JDK 8 or above is installed on your machine.
- **IDE (Optional):** You can use any IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code.

## Steps

**1. Clone the repository:** 
```bash
git clone https://github.com/Jhanvik23/SatelliteCommandSystem.git
```

**2. Compile the project:**
Navigate to the src directory and compile the Java files.
```bash
javac com/satellitesystem/*.java
```
**3. Run the application:**
```bash
java com.satellitesystem.SatelliteCommandExecutor
```

## Usage
After running the application, you will be prompted with a menu to perform various satellite operations such as:

- Activating solar panels
- Deactivating solar panels
- Checking satellite status
- Sending commands

You can interact with the application by selecting the desired options from the menu.

## Project Structure

```
├── src/
│   └── com/
│       └── satellitesystem/
│           ├── Action.java
│           ├── DataCaptureCommand.java
│           ├── OrientationChangeCommand.java
│           ├── SatelliteActionException.java
│           ├── SatelliteCommandExecutor.java
│           ├── SatelliteController.java
│           ├── SatelliteMonitor.java
│           ├── SatelliteOrientation.java
│           ├── SatelliteStateDisplay.java
│           ├── SolarPanelActivationCommand.java
│           ├── SolarPanelActivationException.java
│           ├── SolarPanelDeactivationCommand.java
│
├── .gitattributes
├── LICENSE
└── README.md
```

## Design Patterns Implemented

**Command Pattern:**

The Action interface represents the base command interface. The concrete command classes (`SolarPanelActivationCommand`, `SolarPanelDeactivationCommand`, `DataCaptureCommand`, `OrientationChangeCommand`) encapsulate various satellite actions like activating/deactivating solar panels, capturing data, and changing orientation. These commands decouple the satellite's logic from the invoker (SatelliteCommandExecutor), enabling flexibility in extending functionality.

**Singleton Pattern:**

The `SatelliteController` class is implemented as a Singleton, ensuring only one instance of the satellite controller is used throughout the system to manage satellite operations.

**Observer Pattern:**

The `SatelliteMonitor` acts as the subject in the Observer Pattern, notifying observers (`SatelliteStateDisplay`) whenever the satellite's state changes, such as solar panel activation or orientation changes. This decouples the logic of managing the satellite's state from displaying it.

## Running the Satellite Command System

After running the system , the first screen which you will see is:

![image](https://github.com/user-attachments/assets/ba840830-4860-481e-92dc-c956ba7edc56)

Rotating the satellite

![image](https://github.com/user-attachments/assets/535cbc9b-41c5-4d6c-bda3-7ff9abb3d015)


Activating solar panels

![image](https://github.com/user-attachments/assets/11af8dde-9977-4ca4-81cb-b8e6025bce6c)

Collecting data

![image](https://github.com/user-attachments/assets/aa252354-e4d1-4632-9577-f5bcd9187b1b)

Again after entering collect command

![image](https://github.com/user-attachments/assets/368634b5-6cfe-4450-8bc6-b98008e46bd9)

Deactivating solar panels

![image](https://github.com/user-attachments/assets/84208f7b-74f6-4656-a039-7bca73392982)

Existing out of the system and displaying final output

![image](https://github.com/user-attachments/assets/967a573c-8ea0-4613-be10-a601ce971440)












  
