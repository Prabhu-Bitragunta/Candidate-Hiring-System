# Candidate Shortlisting System (Java Console Application)

## Overview

Candidate Shortlisting System is a console-based Java application that simulates the initial screening process used by software companies during campus or fresher recruitment. The application collects candidate details and evaluates them based on predefined eligibility criteria using nested `if-else` statements.

The project is designed to practice decision-making logic in Java while implementing a real-world recruitment scenario.

---

## Features

* Candidate registration through console input
* Age eligibility verification
* Qualification validation
* Specialization verification
* Pass-out year validation
* Percentage eligibility check
* Backlog verification
* Expected salary validation
* Skill-based shortlisting
* Displays appropriate selection or rejection message

---

## Technologies Used

* Java
* Eclipse IDE (or any Java IDE)
* Scanner class for user input

---

## Programming Concepts Used

* Nested if-else statements
* Conditional operators
* Logical operators (`&&`, `||`)
* String methods (`contains()`, `toLowerCase()`, `equals()`)
* User input using Scanner
* Variables and data types

---

## Eligibility Criteria

A candidate is shortlisted only if all of the following conditions are satisfied:

| Criteria        | Requirement                |
| --------------- | -------------------------- |
| Age             | 18 to 30 years             |
| Qualification   | B.Tech, Degree, M.Tech, PG |
| Specialization  | CSE, IT, Computers, B.Com  |
| Pass-out Year   | 2023 – 2026                |
| Percentage      | 65% or above               |
| Backlogs        | No                         |
| Expected Salary | Up to ₹4.5 LPA             |
| Skills          | Java or Spring Boot        |

---

## Program Workflow

1. Welcome the candidate.
2. Collect candidate details.
3. Validate each eligibility criterion one by one.
4. If all conditions are satisfied, shortlist the candidate.
5. Otherwise, display the exact reason for rejection.
6. Show the final application status message.

---

## Project Structure

```text
logicalstatements
│
└── CandidateShortListingSystem.java
```

---

## Sample Output

### Successful Candidate

```text
Welcome to V-Square Software Solutions!!

Enter Your Name:
Anil

Enter Your Age:
22

Enter Highest Qualification:
B.Tech

Enter Your Specialization:
CSE

Enter Passed Out Year:
2025

Enter Percentage:
82

Do You Have Any Backlogs?
No

Enter Your Skills:
Java Spring Boot

Expected Salary (LPA):
4

------------------------
You are Shortlisted!!
V-Square welcomes You!!!!
Thank you for choosing V-Square!!
```

---

### Rejected Candidate

```text
------------------------
Percentage must be greater than 65
Better luck next Time!!
Thanks for your time and Efforts!!
```

---

## Validation Sequence

The application checks the following conditions in order:

1. Age
2. Qualification
3. Specialization
4. Pass-out Year
5. Percentage
6. Backlogs
7. Expected Salary
8. Technical Skills

The evaluation stops immediately when a condition fails, and the corresponding rejection reason is displayed.

---

## Learning Outcomes

This project helps in understanding:

* Nested decision-making using multiple `if-else` statements
* Building real-world business logic
* Input validation
* String comparison techniques
* Logical operator usage
* Flow control in Java
* Designing simple console-based applications

---

## Possible Future Enhancements

* Store candidate details in a database
* Generate a unique candidate ID
* Support multiple candidate registrations
* Menu-driven application
* HR login system
* Resume upload feature
* Email notification for shortlisted candidates
* Interview scheduling
* Score-based ranking system
* GUI using Java Swing or JavaFX

---

## Author

**Anil Bitragunta**

B.Tech Information Technology

Java Developer Aspirant
