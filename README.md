# Java ATM System

## Overview
This is a Java console-based ATM system designed to practice **Object-Oriented Programming (OOP)** concepts such as encapsulation, composition, and class interaction.  
It supports multiple users with secure PIN authentication and basic banking operations.

---

## Features
- Multi-user support using **HashMap** to store account number → `BankAccount` mapping  
- PIN verification for security  
- Deposit and withdraw functionality with balance validation  
- Check account balance  
- View account information  
- User-friendly console menu  
- Multi-user login without restarting the program  
- Exit option for logging out individual users and shutting down the system  

---



---

## Classes Description

### 1. BankAccount
Represents a single bank account with the following properties:  
- `accountHolder` (String) – name of the account holder  
- `accountNumber` (int) – unique account number  
- `pin` (int) – secure PIN for login  
- `balance` (double) – current account balance  

**Methods:**  
- `verifyPin(int pin)` – returns true if PIN matches  
- `getBalance()` – returns the current balance  
- `getAccountNumber()` – returns account number  
- `getAccountHolder()` – returns account holder name in uppercase  
- `deposit(double amount)` – deposit money into account  
- `withdraw(double amount)` – withdraw money with balance check  
- `toString()` – returns account information  

---

### 2. BankDatabase
Stores and manages multiple `BankAccount` objects using a **HashMap**.  

**Methods:**  
- `addAccount(BankAccount account)` – add a new account to the database  
- `getAccount(int accountNumber)` – fetch account by account number  

---

### 3. ATM
Handles ATM operations for users.  

- Prompts for account number and PIN  
- Provides a menu with options: check balance, deposit, withdraw, view info, and exit  
- Uses a boolean `isLoggedIn` to manage user sessions  
- Supports multiple users without restarting the program  

---

### 4. Main
- Entry point of the application  
- Initializes `BankDatabase` and adds sample accounts  
- Creates an `ATM` instance and starts the ATM system  

---

