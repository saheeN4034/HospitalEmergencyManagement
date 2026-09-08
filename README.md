# Mini Hospital Emergency Management System

## Project Description
This project is a simple Java console application that demonstrates the use of core data structures in a hospital emergency management system.

## Features
- Patient records stored in a Binary Search Tree
- Emergency queue for waiting patients
- Treatment records stored in a stack
- Visit history stored in a singly linked list
- Console-based menu for demonstrating required operations

## Data Structures Used
- Binary Search Tree (BST)
- Queue (manual linked queue)
- Stack (manual linked stack)
- Singly Linked List

## BST Explanation
The BST stores patients by Patient ID. The tree keeps patient IDs in sorted order so that in-order traversal displays them in ascending Patient ID order.

## Queue Explanation
The emergency queue follows FIFO (First In, First Out). The patient who arrived first is served first.

## Stack Explanation
The treatment stack follows LIFO (Last In, First Out). The most recently completed treatment is removed first.

## Singly Linked List Explanation
Visit history is stored in a singly linked list. Each visit is stored in a node with a `next` reference to the next visit.

## Project Structure
- Main.java
- Patient.java
- PatientNode.java
- PatientBST.java
- EmergencyNode.java
- EmergencyQueue.java
- Treatment.java
- TreatmentNode.java
- TreatmentStack.java
- Visit.java
- VisitNode.java
- VisitHistory.java

## How to Compile
Open a terminal in the project folder and run:

```bash
javac Main.java Patient.java PatientNode.java PatientBST.java EmergencyNode.java EmergencyQueue.java Treatment.java TreatmentNode.java TreatmentStack.java Visit.java VisitNode.java VisitHistory.java
```

## How to Run
```bash
java Main
```

## Example Operations
- Add patient to the BST
- Search a patient by ID
- Delete a patient
- Display patient list in ascending ID order
- Enqueue an emergency patient
- Dequeue the next patient
- Display waiting patients
- Push a completed treatment
- Pop the most recent treatment
- Display treatment history
- Add a visit
- Remove a visit
- Search a visit
- Display visit history

## Testing Information
The program can be tested by running the menu and selecting each operation in order. The system should handle empty queue, empty stack, and empty visit history cases.
