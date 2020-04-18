

package com.isi.work.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isi.work.domain.Author;

/**  @Author Salmi Ismail**/

@Repository
public interface AuhtorRepo extends CrudRepository<Author, Long>{

}

