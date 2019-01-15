package com.libraryapp.libraryappwithspring;

import com.libraryapp.libraryappwithspring.library.author.AuthorRepository;
import com.libraryapp.libraryappwithspring.library.book.BookRepository;
import com.libraryapp.libraryappwithspring.library.borrower.BorrowerRepository;
import com.libraryapp.libraryappwithspring.library.author.Author;
import com.libraryapp.libraryappwithspring.library.book.Book;
import com.libraryapp.libraryappwithspring.library.borrower.Borrower;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class LibraryAppWithSpringApplication implements CommandLineRunner {
    private final BorrowerRepository borrowerRepository;
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public LibraryAppWithSpringApplication(BorrowerRepository borrowerRepository, BookRepository bookRepository, AuthorRepository authorRepository) {
        this.borrowerRepository = borrowerRepository;
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

        Author author = new Author();
        author.setAuthorName("Kornel");
        authorRepository.save(author);

        Borrower borrower = new Borrower();
        borrower.setName("BorrowerName");
        borrowerRepository.save(borrower);

    }


}

