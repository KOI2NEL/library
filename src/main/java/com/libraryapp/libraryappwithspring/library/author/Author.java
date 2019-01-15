package com.libraryapp.libraryappwithspring.library.author;


import com.libraryapp.libraryappwithspring.library.bookdata.BookData;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {



    @Column(name = "author_name")
    private String authorName;

    @Column(name = "author_surname")
    private String authorSurname;

    //TODO: MTM, OTM, MTO
    @ManyToMany
    @JoinTable(
            name = "authors_books",
            joinColumns = {@JoinColumn(name = "author_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")}
    )
    private Set<BookData> books = new HashSet<>();

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public Set<BookData> getBooks() {
        return books;
    }

    public void setBooks(Set<BookData> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", books=" + books +
                '}';
    }
}
