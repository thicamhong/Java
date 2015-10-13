package com.m2i.formation.dna;

import java.util.ArrayList;
import java.util.List;

public abstract class Strand
{

	public List<Base> bases = new ArrayList<Base>();
	
	public Strand()
	{
		// TODO Auto-generated constructor stub
	}

	public List<Base> getBases()
	{
		return bases;
	}
	
	

}
