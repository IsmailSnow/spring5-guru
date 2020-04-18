

package com.isi.work.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isi.work.domain.Book;

/**  @Author Salmi Ismail**/

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {

}

