package com.BibliothequeP7.user.dao;

import com.BibliothequeP7.user.entities.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserBook, Long> {
}
