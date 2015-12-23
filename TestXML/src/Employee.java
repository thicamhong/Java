
public class Employee
{

	private String id;
	private String firstName;
	private String lastName;
	private String location;

	@Override
    public String toString()
	{
	    return firstName+" "+lastName+"("+id+")"+location;
	}
	
	public Employee()
	{
		// TODO Auto-generated constructor stub
	}

	public String getId()
	{
		return id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getLocation()
	{
		return location;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	
}
