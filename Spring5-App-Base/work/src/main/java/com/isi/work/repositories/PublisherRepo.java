

package com.isi.work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isi.work.domain.Publisher;

/**  @Author Salmi Ismail**/

@Repository
public interface PublisherRepo extends JpaRepository<Publisher, Long> {

}

