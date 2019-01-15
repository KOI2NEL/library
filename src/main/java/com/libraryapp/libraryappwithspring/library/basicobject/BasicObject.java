package com.libraryapp.libraryappwithspring.library.basicobject;



import javax.persistence.*;

@Entity
@Table(name = "basic_object")
public class BasicObject {
    @Id
    @GeneratedValue
    private Long id;
}
