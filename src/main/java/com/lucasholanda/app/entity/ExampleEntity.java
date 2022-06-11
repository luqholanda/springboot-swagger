package com.lucasholanda.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EXAMPLE")
@Proxy(lazy = true)
public class ExampleEntity implements Serializable {

	private static final long serialVersionUID = 6359109992803201653L;

	@Id
	@Column(name = "ID", updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "CONTENT")
	private String content;

	@Column(name = "INSERT_DATE")
	private Date insertDate;

}
