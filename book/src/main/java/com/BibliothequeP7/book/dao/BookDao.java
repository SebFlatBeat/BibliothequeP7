package com.BibliothequeP7.book.dao;

import com.BibliothequeP7.book.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Integer> {
}
