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
public class ExampleUpdateDTO implements Serializable {

	private static final long serialVersionUID = -2751053575183007111L;

	@ApiModelProperty(value = "Id Field")
	private Long id;

	@ApiModelProperty(value = "Content Field")
	private String content;

}
