package com.lucasholanda.app.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExampleSearchDTO implements Serializable {

	private static final long serialVersionUID = -2491821272900553882L;

	@ApiModelProperty(value = "Id Field")
	private Long id;

	@ApiModelProperty(value = "Content Field")
	private String content;

	@ApiModelProperty(value = "Insert Date Field")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
	private Date insertDate;

}
