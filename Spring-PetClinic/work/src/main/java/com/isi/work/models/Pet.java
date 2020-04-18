

package com.isi.work.models;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

/**  @Author Salmi Ismail**/


@Getter
@Setter
public class Pet extends BaseEntity{
	
	private static final long serialVersionUID = 1591577447094853490L;
	
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

}

