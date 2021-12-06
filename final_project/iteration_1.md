# Iteration 1

## 1.1 ADD Step 1: Review Inputs

Primary Functional Requirements:
- UC-1,2: Registering Students & Professors
- UC-3: Managing Courses
- UC-4: User administration and log in

| Scenario ID | Importance to the Customer | Difficulty of Implementation | Associated Use Case |
| - | - | - | - |
| QA-1 | HIGH | MEDIUM | UC-1,2 |
| QA-2 | HIGH | MEDIUM | UC-3 |
| QA-3 | HIGH | MEDIUM | UC-4 |
| QA-4 | MEDIUM | LOW | UC-1 |
| QA-5 | MEDIUM | LOW | UC-1,2 |

## 1.2 Iteration 1: Establishing an Overall System Structure
## 1.2.1 Step 2: Establish Iteration Goal by Selecting Drivers

This is the first iteration in the design of our university database management system, so the iteration goal is to achieve the architectural concern CNR-1 of establishing an overall system structure.
Although this iteration is driven by a general architectural concern, we must keep in mind all of the drivers that may influence the general structure of the system. In particular, we must be mindful of the following:

- QA-1: Availability
- QA-2: Performance 
- QA-3: Security2
- QA-4: Scalability
- QA-5: Modifiability
- CON-1: The system must be accessed through a web browser running on a Windows 10 or higher platform
- CON-2: A relational database server must be used.
- CON-3: Only administrative accounts can have authorization to change grades.

![step2](images/iteration_1/step2.png)

## 1.2.2 Step 3: Choose One or More Elements of the System to Refine

This is a university database development effort, so in this case the element to refine is the entire FCAPS system, which is shown in the context diagram above. Refinement is performed through decomposition.

## 1.2.3 Step 4: Choose One or More Design Concepts That Satisfy the Selected Drivers

| Design Decisions and Location | Rationale |
| -- | ---------- |
| Web Application | The decision of classifying this as a web application is due to the fact that the user will use a web browser to access the application. |
| Three-Tier Deployment Pattern | The decision to use a three-tier deployment is because the project will consist of the server backend, the database to store users and data and the client web application for the UI component. |
| | Discarded Alternatives <table><tr><th>Alternative</th><th>Reason for Discarding</th></tr><tr><th>Mobile application</th><th>Too limited for the scope of the project! A full desktop experience in the browser is needed</th></tr><tr><th>Rich Internet Application </th><th>Security concerns</th></tr><tr><th>Rich Client</th><th>Does not run in web browser, interacts with desktop OS and can only access local databases</th></tr></table> |

## 1.2.3 Step 5: Instantiate Architectural Elements, Allocate Responsibilities, and Define Interfaces

| Design Decisions and Location | Rationale |
| -- | ---------- |
| Store data on the network | There is no need to store the data locally as the users will need to access them at any time, so the best solution is to use the network. |
| Host the the web application on a different server | This will help with security and will help with performance for the data server. |


## 1.2.5 Step 6: Sketch Views and Record Design Decisions

![Figure 1.1](images/iteration_1/step6.png)

Figure 1.1

## 1.2.6 Step 7: Perform Analysis of Current Design and Review Iteration

