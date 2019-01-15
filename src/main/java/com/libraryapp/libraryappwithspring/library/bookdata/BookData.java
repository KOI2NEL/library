package com.libraryapp.libraryappwithspring.library.bookdata;


import com.libraryapp.libraryappwithspring.library.author.Author;
import com.libraryapp.libraryappwithspring.library.basicobject.BasicObject;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "book_data")
public class BookData extends BasicObject {
    private String title;
    private Set<Author> authors = new HashSet<>();

}
