package com.libraryapp.libraryappwithspring.library.book;

import com.libraryapp.libraryappwithspring.library.author.Author;
import com.libraryapp.libraryappwithspring.library.user.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
public class  Book {

    @Id
    @GeneratedValue
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors ;


    @ManyToMany
    @JoinTable(
            name = "books_borrowers",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "borrower_id")}
    )
    private Set<User> users = new HashSet<>();


    public Book(Long bookId, String title, Set<Author> authors, Set<User> users) {
        this.bookId = bookId;
        this.title = title;
        this.authors = authors;
        this.users = users;
    }

    public Book() {
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", users=" + users +
                '}';
    }
}
