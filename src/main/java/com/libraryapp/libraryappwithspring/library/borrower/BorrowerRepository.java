package com.libraryapp.libraryappwithspring.library.borrower;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {

}
