import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class AppXML
{

	public AppXML()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
	    SAXParserFactory parserFactor = SAXParserFactory.newInstance();
	    SAXParser parser;
		try
		{
			parser = parserFactor.newSAXParser();
		    SAXHandler handler = new SAXHandler();
		    parser.parse(ClassLoader.getSystemResourceAsStream("employee.xml"),handler);
	
		    //Printing the list of employees obtained from XML
		    for ( Employee emp : handler.empList){
		      System.out.println(emp);
		    }
		} catch (ParserConfigurationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
