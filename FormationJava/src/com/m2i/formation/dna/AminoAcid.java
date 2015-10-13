package com.m2i.formation.dna;

public class AminoAcid
{
	private String longName;
	private String trigram;
	private char code;

	protected AminoAcid()
	{
		// TODO Auto-generated constructor stub
	}
	
	public AminoAcid factory(String code)
	{
		return null;
	}

	public String getLongName()
	{
		return longName;
	}

	public String getTrigram()
	{
		return trigram;
	}

	public char getCode()
	{
		return code;
	}

	public void setLongName(String longName)
	{
		this.longName = longName;
	}

	public void setTrigram(String trigram)
	{
		this.trigram = trigram;
	}

	public void setCode(char code)
	{
		this.code = code;
	}

	
}
