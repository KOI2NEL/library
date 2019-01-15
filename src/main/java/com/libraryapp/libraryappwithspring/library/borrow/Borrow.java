package com.libraryapp.libraryappwithspring.library.borrow;

import com.libraryapp.libraryappwithspring.library.basicobject.BasicObject;
import com.libraryapp.libraryappwithspring.library.book.Book;
import com.libraryapp.libraryappwithspring.library.user.User;

import java.util.Currency;
import java.util.Date;

public class Borrow extends BasicObject {
//TODO: dodać relację tak aby mieć informacje o dacie wypożyczenia - możliwość trzyman ia historii

private User user;
private Book book;
private Date borrowDate;
private Date returnDate;
private Currency fine;
private boolean isActive;

}
