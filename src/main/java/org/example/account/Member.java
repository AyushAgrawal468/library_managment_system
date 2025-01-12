package org.example.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Enums.BookStatus;
import org.example.Enums.MemberStatus;
import org.example.Enums.Status;
import org.example.book.BookBorrowDetails;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member extends Account{
    private Date dateOfMembership;
    private MemberStatus memberStatus;
    private Map<BookBorrowDetails, Status> checkedOutBookHistory;

    public MemberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public Map<BookBorrowDetails, Status> getCheckedOutBookHistory() {
        return checkedOutBookHistory;
    }

    public void setCheckedOutBookHistory(Map<BookBorrowDetails, Status> checkedOutBookHistory) {
        this.checkedOutBookHistory = checkedOutBookHistory;
    }

    public void addHistoryEntry(BookBorrowDetails bookDetails, Status status){
        this.checkedOutBookHistory.put(bookDetails,status);
    }

    public void issueBook(BookBorrowDetails bookDetails){
        boolean isBookIssued = bookDetails.issueBook(this);
        if(isBookIssued){
            this.checkedOutBookHistory.put(bookDetails,Status.ISSUED);
        }
    }
    public void returnBook(BookBorrowDetails bookDetails){
        float fine = this.checkForFine(bookDetails);
        if(fine>0){
            System.out.println("Fine details: "+fine);
            this.addHistoryEntry(bookDetails,Status.LATE);
        }else{
            this.addHistoryEntry(bookDetails,Status.ON_TIME);
        }
        bookDetails.returnBook();
    }

    public void renewBook(BookBorrowDetails bookDetails){
        // new login can be implemented based on renew process such as reservation mechanism
        boolean isBookIssued = bookDetails.issueBook(this);
        if(isBookIssued){
            this.checkedOutBookHistory.put(bookDetails,Status.ISSUED);
        }
    }

    public void lostBook(BookBorrowDetails bookDetails){
        // logic to update all the status of book to lost and unavailable
        bookDetails.setBookStatus(BookStatus.LOST);
        this.addHistoryEntry(bookDetails,Status.NEVER);
    }

    public float checkForFine(BookBorrowDetails bookBorrowDetails){
        if(bookBorrowDetails.getDateOfReturn().isBefore(LocalDate.now())){
            return 0;
        }else{
            int noOfDays = bookBorrowDetails.getDateOfReturn().compareTo(LocalDate.now());
            return noOfDays * 5;
        }
    }


}