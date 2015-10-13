package com.m2i.formation.dna;

public class Codon
{

	private RNABase[] rnbBases = new RNABase[3]; 
	private AminoAcid aminoAcid;

	public Codon()
	{
		// TODO Auto-generated constructor stub
	}
	
	public RNABase[] getRnbBases()
	{
		return rnbBases;
	}

	public AminoAcid getAminoAcid()
	{
		return aminoAcid;
	}

	
}
