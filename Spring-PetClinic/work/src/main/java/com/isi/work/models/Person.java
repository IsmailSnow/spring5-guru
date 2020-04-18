

package com.isi.work.models;

import lombok.Getter;
import lombok.Setter;

/**  @Author Salmi Ismail**/



@Getter
@Setter
public class Person extends BaseEntity {

	private static final long serialVersionUID = -8219254733814272660L;

	private String firstName;
	private String lastName;
}

