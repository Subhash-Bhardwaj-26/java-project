
# 📚 Library Management System (Java CLI)

A simple console-based Library Management System built using Java. It follows Object-Oriented Programming and SOLID principles to manage books, members, and lending operations.

---

## ✅ Features

- Add new books to the catalog
- Register library members
- View all available books
- Lend books to members
- Exit the application cleanly

---

## 🧱 Project Structure

```
LibraryManagementSystem/
├── model/         # Data models (Book, Member)
├── service/       # Business logic (Library)
├── utils/         # Utility functions (InputHelper)
└── Main.java      # CLI entry point
```
+----------------+       uses        +----------------+
|     Main       |----------------->|    Library      |
+----------------+                  +----------------+
| - main(args)   |                  | +addBook()      |
+----------------+                  | +registerMember()|
                                    | +showAllBooks() |
                                    | +lendBook()     |
                                    +----------------+
                                           ^
                                           |
                                           | uses
                                           |
    +-------------+         +-------------+             
    |    Book     |         |   Member    |
    +-------------+         +-------------+
    | - id        |         | - id        |
    | - title     |         | - name      |
    | - author    |         +-------------+
    +-------------+            

                uses
                  ^
                  |
         +----------------+
         |  InputHelper   |
         +----------------+
         | +prompt(msg)   |
         +----------------+

---

## 🧠 OOP & Design Principles

- **Encapsulation:** Models keep data and behavior together
- **Abstraction:** Library class abstracts operations
- **Single Responsibility:** Each class handles a specific concern
- **SOLID Principles:** Design allows easy extension and maintainability

---

## 📊 Class Diagram

![UML Class Diagram](UML_Class_Diagram.png)

---

## ▶️ How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/LibraryManagementSystem.git
   cd LibraryManagementSystem
   ```

2. **Compile the Project**
   ```bash
   javac Main.java model/*.java service/*.java utils/*.java
   ```

3. **Run the App**
   ```bash
   java Main
   ```

---

## 💡 Future Enhancements

- Book return & due dates
- Fine calculation
- Search/filter by title/author
- Persistent storage (files or database)
- GUI interface

---

## 📄 License

MIT License - see [LICENSE](LICENSE)

---

**Built with ❤️ in Java**
