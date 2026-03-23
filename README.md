# I3 Typing Master 2026

A command-line typing speed assessment application built in Java.  
This project was developed as part of the Introduction to Programming Environment (IPE) course 2025-2026.

---

## Features

- User Registration
- User Login / Authentication
- User Reset Password
- Typing Speed Test (multiple levels)
- View Test Results
- About Us screen

---

## Requirements

- Java JDK 8 or higher
- Terminal / Command Prompt

### Check if Java is installed

```bash
java -version
```

If not installed, download it from: https://www.oracle.com/java/technologies/downloads/

---

## Setup

### 1. Clone the repository

```bash
git clone https://github.com/user/i3_typing_master_2026.git
```

> Replace `user` with the actual GitHub username.

### 2. Navigate into the project folder

```bash
cd i3_typing_master_2026
```

---

## Compile

Compile all Java source files at once:

```bash
javac *.java
```

Or compile individually:

```bash
javac Main.java
javac Register.java
javac Login.java
javac TypingTest.java
```

---

## Run

```bash
java Main
```

This launches the Welcome Menu where you can navigate to Login, Register, or start a Typing Test.

---

## Project Structure

```
i3_typing_master_2026/
│
├── Main.java           # Welcome / landing screen
├── Register.java       # User registration screen
├── Login.java          # User login / authentication screen
├── ResetPassword.java  # User reset password screen
├── TypingTest.java     # Typing test screen (multiple levels)
├── TestResults.java    # List of test results for a user
├── AboutUs.java        # About Us screen
├── users.txt           # Stores registered users (auto-created)
├── results.txt         # Stores typing test results (auto-created)
└── README.md           # Project documentation
```

---

## How to Use

1. Run the program with `java Main`
2. From the Welcome Menu, choose:
   - **Login** — if you already have an account
   - **Register** — to create a new account
   - **Typing Test** — to start a test directly
3. After logging in, select a typing test level
4. Type the displayed paragraph and press **ENTER**
5. View your speed and accuracy results

---

## Contributors

| Name | Task |
|------|------|
| (Your Name) | Welcome menu screen |
| (Classmate 1) | User registering screen |
| (Classmate 2) | User login screen |

> Update this table with actual names and tasks.

---

## License

This project is for educational purposes only.
