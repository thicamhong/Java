
public class Author
{
	private String firstName; 
	private String lastName;

	public Author()
	{
		// TODO Auto-generated constructor stub
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String toString()
	{
		String authorIs = new String("");
		
		authorIs = "\t Author : " + firstName + " " + lastName;
		return authorIs;
	}
}
