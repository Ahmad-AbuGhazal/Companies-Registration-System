package edu.mum.eroc.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROC_COMPANY")
public class Company implements Serializable {
	private static final long serialVersionUID = -5004085573551580113L;
@Id
   @Column(name="COM_ID")
    private long companyId;
@Column(name="COM_NAME")
    private String companyName;
@Column(name="COM_REG_DATE")
    private Date registationDate;
public long getCompanyId() {
	return companyId;
}
public void setCompanyId(long companyId) {
	this.companyId = companyId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public Date getRegistationDate() {
	return registationDate;
}
public void setRegistationDate(Date registationDate) {
	this.registationDate = registationDate;
}
   
}
