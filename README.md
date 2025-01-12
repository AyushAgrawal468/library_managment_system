# library_managment_system

Functional requirements:
1. Add , remove and update Books. 
2. Search functionality to find books by title, author, or ISBN.
3. Add , remove and update Accounts(Patrons) which can have different types(member, librarian, assitant librarian etc).
4. Track member's borrowing history
5. Member can lend, renew and return book.
6. Keep track of all available books

Non functional requirements:
1. It should be easily readable and understandable.
2. Should follow SOLID, DRY, YAGNI, KISS, etc principles.
3. Proper Data structures should be used.

Actors: 

1. Account: which have all the common details a patron have 
1.1 Librarian: have some special functions like to maintain books and members
1.2 Member: Have functions related to lending books.

2. Book: This class only contains details that are hardly going to change.

3. BookBorrowDetails: this class contains details related to borrowing such as which member is borrowing on which date 
    and what will be the returning data, etc. 
    The functions are also related to book issuing, returning as the member in bookBorrowDetails will be updated
4. ENUMS: This contains some static values which can be made subclasses if more fields are required.

5. Search System: This class is responsible for searching a book in the system
    based on author, title and isbn no. This is a separate system which can be used by members as well as librarians.

6. Library: This class contains details like libraryName, Id, branchId, the list of books with their status, librarian, etc.
    The BranchId can be used for extension if in near future multiple branches can be open.
    So based on ID and branchId we can keep a record of list of books and its librarians.

Class Diagram: 

![img.png](img.png)

Also added in the directory with name: classDiagram.png