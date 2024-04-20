package com.example.ftiprj.repository;

import com.example.ftiprj.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest-api-postgresql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-18
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByName(String name);
}