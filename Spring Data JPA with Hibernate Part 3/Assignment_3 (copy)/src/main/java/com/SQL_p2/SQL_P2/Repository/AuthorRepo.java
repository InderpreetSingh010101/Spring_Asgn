package com.SQL_p2.SQL_P2.Repository;

import com.SQL_p2.SQL_P2.Entites.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends CrudRepository<Author,Integer> {


}
