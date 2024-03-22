package com.porfanid.backend.book;

import com.porfanid.backend.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
