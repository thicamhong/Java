
public class Publisher
{
	private String name; 
	private int siret;
	private String webSite;
	private String phoneStandard;
	private String mailStandard;
	
	
	public void display()
	{
		System.out.println("\t Information on the publisher :");
		System.out.println("\t\t Name\t: " + name);
		System.out.println("\t\t SIRET\t: " + siret);
		System.out.println("\t\t WebSite\t: " + webSite);
		System.out.println("\t\t Phone Standard\t: " + phoneStandard);
		System.out.println("\t\t Mail Standard\t: " + mailStandard);

	}

	public Publisher()
	{
		// TODO Auto-generated constructor stub
	}

	public String getName()
	{
		return name;
	}

	public int getSiret()
	{
		return siret;
	}

	public String getWebSite()
	{
		return webSite;
	}

	public String getPhoneStandard()
	{
		return phoneStandard;
	}

	public String getMailStandard()
	{
		return mailStandard;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setSiret(int siret)
	{
		this.siret = siret;
	}

	public void setWebSite(String webSite)
	{
		this.webSite = webSite;
	}

	public void setPhoneStandard(String phoneStandard)
	{
		this.phoneStandard = phoneStandard;
	}

	public void setMailStandard(String mailStandard)
	{
		this.mailStandard = mailStandard;
	}

	
}
