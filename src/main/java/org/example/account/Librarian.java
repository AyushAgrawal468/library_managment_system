package org.example.account;

import org.example.Enums.AccountType;
import org.example.Enums.MemberStatus;
import org.example.Enums.Status;
import org.example.book.Book;

public class Librarian extends Account{

    public void addBook(Book book){
        // add book to library
    }

    public void addMember(Member member){
        //add the member to library
    }

    public void blacklistMember(Member member){
        if(member.getCheckedOutBookHistory().containsValue(Status.NEVER)){
        member.setMemberStatus(MemberStatus.BLACKLISTED);
        }
    }
    public void cancelMemberShip(Member member){
        member.setMemberStatus(MemberStatus.CANCELED);
    }

    public void removeMemberFromBlacklist(Member member){
        member.setMemberStatus(MemberStatus.ACTIVE);
    }

    public Librarian(String firstName, String lastName, String id, String password, AccountType accountType) {
        super(firstName, lastName, id, password, accountType);
    }

    public Librarian() {
    }
}