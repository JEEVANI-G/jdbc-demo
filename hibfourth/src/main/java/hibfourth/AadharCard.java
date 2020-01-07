package hibfourth;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AadharCard
{
	@Id
	int aid;
	@Column(name="issue_authority")
	String issue_Auth;
	@Column(name="issue_date")
	Date issue_date;
	public AadharCard(int aid, String issue_Auth, Date issue_date) 
	{
		super();
		this.aid = aid;
		this.issue_Auth = issue_Auth;
		this.issue_date = issue_date;
	}
 public AadharCard() {}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getIssue_Auth() {
	return issue_Auth;
}
public void setIssue_Auth(String issue_Auth) {
	this.issue_Auth = issue_Auth;
}
public Date getIssue_date() {
	return issue_date;
}
public void setIssue_date(Date issue_date) {
	this.issue_date = issue_date;
}

}
