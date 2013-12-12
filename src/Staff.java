import java.util.Date;
public class Staff 
{
	private int staff_ssn;
	private int user_id;
	private String work_desc;
	private String position;
	private Date hire_date;
	private String staff_username;
	
	public int getstaff_ssn()
	{
		return staff_ssn;
	}
	public void setstaff_ssn(int staff_ssn)
	{
		this.staff_ssn=staff_ssn;
	}
	public int getuser_id()
	{
		return user_id;
	}
	public void setuser_id(int user_id)
	{
		this.user_id=user_id;
	}
	public String getwork_desc()
	{
		return work_desc;
	}
	public void setwork_desc(String work_desc)
	{
		this.work_desc=work_desc;
	}
	public String getposition()
	{
		return position;
	}
	public void setposition(String position)
	{
		this.position=position;
	}
	public Date gethire_date()
	{
		return hire_date;
	}
	public void sethire_date(Date hire_date)
	{
		this.hire_date=hire_date;
	}
	public String getstaff_username()
	{
		return staff_username;
	}
	public void setstaff_username(String staff_username)
	{
		this.staff_username=staff_username;
	}
	

}
