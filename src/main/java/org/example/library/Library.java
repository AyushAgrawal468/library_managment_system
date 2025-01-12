package org.example.library;

import org.example.Enums.BookStatus;
import org.example.account.Account;
import org.example.account.Librarian;
import org.example.book.BookBorrowDetails;
import org.example.search_system.SearchSystem;

import java.util.List;
import java.util.Map;


public class Library {
    private Map<BookStatus, List<BookBorrowDetails>> bookList;
    private Librarian librarian;
    private SearchSystem searchSystem;
    private String LibraryBranch;

    public Map<BookStatus, List<BookBorrowDetails>> getBookList() {
        return bookList;
    }

    public void setBookList(Map<BookStatus, List<BookBorrowDetails>> bookList) {
        this.bookList = bookList;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public SearchSystem getSearchSystem() {
        return searchSystem;
    }

    public void setSearchSystem(SearchSystem searchSystem) {
        this.searchSystem = searchSystem;
    }

    public String getLibraryBranch() {
        return LibraryBranch;
    }

    public void setLibraryBranch(String libraryBranch) {
        LibraryBranch = libraryBranch;
    }

    public Library(Map<BookStatus, List<BookBorrowDetails>> bookList, Librarian librarian, SearchSystem searchSystem, String libraryBranch) {
        this.bookList = bookList;
        this.librarian = librarian;
        this.searchSystem = searchSystem;
        LibraryBranch = libraryBranch;
    }

    public Library() {
    }


}
