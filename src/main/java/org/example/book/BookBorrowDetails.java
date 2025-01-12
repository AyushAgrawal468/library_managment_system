package org.example.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Enums.BookStatus;
import org.example.Enums.MemberStatus;
import org.example.Enums.Status;
import org.example.account.Member;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowDetails extends Book {

    private LocalDate dateOfBorrow;
    private LocalDate dateOfReturn;
    private Member member;
    private BookStatus bookStatus;

    public LocalDate getDateOfBorrow() {
        return dateOfBorrow;
    }

    public void setDateOfBorrow(LocalDate dateOfBorrow) {
        this.dateOfBorrow = dateOfBorrow;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public BookBorrowDetails(LocalDate dateOfBorrow, LocalDate dateOfReturn, Member member, BookStatus bookStatus) {
        super();
        this.dateOfBorrow = dateOfBorrow;
        this.dateOfReturn = dateOfReturn;
        this.member = member;
        this.bookStatus = bookStatus;
    }


    public Boolean issueBook(Member member){
        if(!member.getMemberStatus().equals(MemberStatus.ACTIVE)){
            System.out.println("Cant issue book to this Member");
            return false;
        }
        if(member.getCheckedOutBookHistory().containsValue(Status.NEVER)){
            System.out.println("Cant issue book to this Member");
            return false;
        }
        if(!this.bookStatus.equals(BookStatus.AVAILABLE)){
            System.out.println("Book is  not available");
            return false;
        }else {
            this.dateOfBorrow = LocalDate.now();
            this.dateOfReturn = LocalDate.now().plusMonths(1);
            this.member = member;
            this.bookStatus = BookStatus.LOANED;
            return true;
        }
    }

    public void returnBook(){
        this.setMember(null);
        this.setDateOfReturn(LocalDate.now());
        this.setBookStatus(BookStatus.AVAILABLE);
    }

}