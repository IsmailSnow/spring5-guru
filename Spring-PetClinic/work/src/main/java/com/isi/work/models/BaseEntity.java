

package com.isi.work.models;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**  @Author Salmi Ismail**/

@Getter
@Setter
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -5993599583119201324L;

	private Long id;
}

