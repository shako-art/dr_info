package com.example.dr_info.model.transformator;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(schema = "dbo", name = "V_METER_HIERARCHY_NET")
public class ObjectSubscriber {

	@Id
	private BigDecimal id;

	@Column(name = "UNIT_NUMBER")
	private String unitNumber;

	@Column(name = "SERIAL_NUMBER")
	private String serialNumber;

	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@Column(name = "TRANSFORMER_CUST_NUMBER")
	private String transformerCustNumber;

	@Column(name = "IS_SUPPLY_CUSTOMER")
	private Integer isSupplyCustomer;

	@Column(name = "CUST_NUMBER")
	private String custNumber;

	@Transient
	private Date reconnectedDate;

	@Transient
	private String reconnectedTime;

	@Transient
	private Date disconnectedDate;

	@Transient
	private String disconnectedTime;
}
