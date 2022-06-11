package com.lucasholanda.app.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExampleInsertDTO implements Serializable {

	private static final long serialVersionUID = -4084564163867412641L;

	@ApiModelProperty(value = "Content Field")
	private String content;

}
