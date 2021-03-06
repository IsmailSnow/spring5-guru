

package com.isi.work.services.map;

import java.util.Set;

import com.isi.work.models.Owner;
import com.isi.work.services.CrudService;

/**  @Author Salmi Ismail**/

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
	super.deleteById(id);
	}

}

