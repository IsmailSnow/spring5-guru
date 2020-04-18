

package com.isi.work.services;

import java.util.Set;

/**  @Author Salmi Ismail**/

public interface CrudService<T,ID> {

	
	Set<T> findAll();
	
	T findById(ID id);
	
	T save(T Object);
	
	void delete(T object);
	
	void deleteById(ID id);
}

