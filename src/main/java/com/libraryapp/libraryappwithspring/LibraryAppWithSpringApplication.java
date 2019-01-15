package com.libraryapp.libraryappwithspring;

import com.libraryapp.libraryappwithspring.library.author.AuthorRepository;
import com.libraryapp.libraryappwithspring.library.book.BookRepository;
import com.libraryapp.libraryappwithspring.library.user.UserRepository;
import com.libraryapp.libraryappwithspring.library.author.Author;
import com.libraryapp.libraryappwithspring.library.book.Book;
import com.libraryapp.libraryappwithspring.library.user.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class LibraryAppWithSpringApplication implements CommandLineRunner {
    private final UserRepository userRepository;
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public LibraryAppWithSpringApplication(UserRepository userRepository, BookRepository bookRepository, AuthorRepository authorRepository) {
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryAppWithSpringApplication.class, args);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void run(String... args) throws Exception {
        Book book = new Book();
        book.setTitle("Jakiś sobie tam title");
        bookRepository.save(book);

//        Author author = new Author();
//        author.setAuthorName("Kornel");
//        authorRepository.save(author);

        User user = new User();
        user.setName("BorrowerName");
        userRepository.save(user);

    }


}

