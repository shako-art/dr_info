package com.example.dr_info.model.transformator;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(schema = "dbo",name = "DISCONN_HISTORY")
public class ObjectCategory {

	@Id
	private BigDecimal id;

	@Column(name = "TASK_ID")
	private BigDecimal taskId;

	@Column(name = "COMP_CUST_ID")
	private BigDecimal compCustId;


	@Column(name = "CUST_NUMBER")
	private String custNumber;

	@Column(name = "INSERT_DATE")
	private Date insertDate;

	@Column(name = "categ_key")
	private String category;
}
