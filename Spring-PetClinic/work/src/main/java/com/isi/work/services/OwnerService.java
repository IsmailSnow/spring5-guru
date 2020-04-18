
package com.isi.work.services;

import com.isi.work.models.Owner;

/** @Author Salmi Ismail **/

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
