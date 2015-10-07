import java.util.Random;

public class Hello
{

	public static void main(String[] args)
	{
		/* TP1 */
		// System.out.println("Hello World");

		/* TP2 */
		int i = 2;
		int j = 3;

		System.out.println("Premi�re valeur : i = " + i);
		System.out.println("Premi�re valeur : j = " + j);

		// on intervertit les valeurs de i et j
		int temp = i;
		i = j;
		j = temp;
		System.out.println("Deuxi�me valeur : i = " + i);
		System.out.println("Deuxi�me valeur : j = " + j);

		/* TP3 : Afficher les chiffres : 0 a 9 */
		System.out.println("\n\nAfficher les chiffres de 0 � 9 :");
		for (int k = 0; k < 10; k++)
		{
			System.out.println("k = " + k);
		}

		/* Afficher 10, 9, ...2, 1, BOM */
		System.out.println("\n\nAfficher les chiffres de 10 � 1 :");
		for (int k = 10; k > 0; k--)
		{
			System.out.println("k = " + k);
		}
		System.out.println("BOOM");

		/*
		 * Afficher les puissances de 2 sans utiliser l'operateur puissance : 2,
		 * 4, 6, ..., 1024
		 */
		System.out.println("\n\nAfficher les puissances de 2 : 2, 4, ... 1024");
		int x = 1;
		final int MAX_VALEUR = 1024;
		while (x != MAX_VALEUR)
		{
			x = x * 2; // x *= 2;
			System.out.println("x = " + x);
		}

		/* BONUS : Afficher les 50 premiers nb entiers : boucles sur boucles */
		System.out.println("\n\nAfficher les les 50 premiers nombres entiers :");
		/*
		 * final int MAX_A_TROUVER = 50; int nbATrouver = 0; int
		 * nbPremierATester=2; // Nombre sur lequel on definit si c'est un
		 * nombre premier ou pas
		 * 
		 * for (int y=1; nbATrouver<MAX_A_TROUVER; y++) { int quotient=1; //
		 * Quotient de nbPremierATester pour definir son modulo int
		 * nbModuloAZero = 0; // Compte le nombre de modulo a 0
		 * 
		 * // On prend nbPremierATester et on le divise de 1 � nbPremierATester.
		 * Si on trouve qu'il y a plus de 2 modulo 0, le nombre n'est pas entier
		 * while((quotient<=nbPremierATester) && (nbModuloAZero<=2)) { int
		 * resModulo = nbPremierATester % quotient; // on recupere son modulo
		 * 
		 * if(resModulo == 0) { nbModuloAZero++; }
		 * 
		 * quotient++; }
		 * 
		 * 
		 * if (nbModuloAZero == 2) { nbATrouver++; System.out.println(nbATrouver
		 * + " : " + nbPremierATester + " est premier"); }
		 * 
		 * nbPremierATester++;
		 * 
		 * 
		 * }
		 */

		int toTest = 2;
		for (i = 0; i < 500; i++)
		{
			boolean isPrime = true;
			j = 2;

			while ((isPrime) && (j < toTest))
			{
				if (toTest % j == 0)
				{
					isPrime = false;
				}
				j++;
			}

			if (isPrime)
			{
				System.out.println(toTest);
			}
			toTest++;
		}

		/* Appel de la fonction add */
		System.out.println("\n\n3 + 2 =" + add(3, 2));

		// Create a table with 10 values
		int[] myTab = { 1, 3, 15, 11, 5, -17, 7, 9, 13, 19 };

		display(myTab);
		System.out.println("\nSum of the table : " + sum(myTab));
		System.out.println("Max of the table : " + max(myTab));
		System.out.println("Average of the table : " + average(myTab));

		int[] myTab2;
		int tabLength = 10;
		myTab2 = new int[tabLength];

		fillRandomTable(myTab2);
		display(myTab2);
		System.out.println("\nSum of the table : " + sum(myTab2));
		System.out.println("Max of the table : " + max(myTab2));
		System.out.println("Average of the table : " + average(myTab2));

		int[] myTab3 = { 1, 2, 3, 4, 5 };
		put(myTab3, 2, 99);
		display(myTab3);

		myTab3 = initTab(5);
		display(myTab3);
		permut(myTab3, 1, 3);
		display(myTab3);

		myTab3 = initTab(5);
		permut2(myTab3, 2);
		display(myTab3);

		myTab3 = initTab(5);
		removeOK(myTab3, 1);
		display(myTab3);

		myTab3 = initTab(5);
		insertOK(myTab3, 1, 99);
		display(myTab3);

		int[] myTab4 = clone(myTab3);
		display(myTab4);
		display(clone(myTab3));// Cette ligne est identique que les deux
								// precedentes
		display(even(myTab4));
		// int[] myTab5 = inverse(myTab4);
		// display(myTab5);
		display(inverse(myTab4));
		display(remove2(myTab4, 3));
		display(myTab4);
		display(insert2(myTab4, 3, 99));

		display(myTab2);
		//sortBubble(myTab2);
		display(SortMin(myTab2));
		
		
		//display(myTab2);

		int nbFactorial = 5;
		System.out.println("\n" + nbFactorial + "! = " + factorial(nbFactorial));
		
		display(myTab4);
		
		System.out.println("\n Somme de la table : " + sumRecursive(myTab4));
		/*
		 * display(myTab2); permut(myTab2, 2, 4); display(myTab2);
		 * permut2(myTab2, 6); display(myTab2); remove(myTab2,5);
		 * display(myTab2); insert(myTab2, myTab2.length-1, -12);
		 * display(myTab2);
		 */
	}

	/* TP : ecrire la fonction add */
	/**
	 * Fonction add
	 * 
	 * @param a
	 *            Premier op�rande
	 * @param b
	 *            Deuxi�me op�rande
	 * @return Somme de a et b
	 */
	public static int add(int a, int b)
	{
		return a + b;
	}

	/**
	 * Display the content of the table
	 * 
	 * @param lengthTab
	 */
	public static void display(int[] tabToDisplay)
	{
		System.out.println("\n\nContent of the table : ");

		for (int i = 0; i < tabToDisplay.length; i++)
		{
			System.out.print(tabToDisplay[i] + " ");
		}
	}

	/**
	 * Do the sum of the values of the table
	 * 
	 * @param tab
	 *            The table with int values
	 * @return The sum
	 */
	public static int sum(int[] tab)
	{
		int res = 0;

		for (int i = 0; i < tab.length; i++)
		{
			res += tab[i];
		}

		return res;
	}

	/**
	 * Search the max value in the table
	 * 
	 * @param tab
	 *            The table
	 * @return The max value
	 */
	public static int max(int[] tab)
	{
		int maxValue = tab[0]; // mieux que maxValue=0;

		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] > maxValue)
			{
				maxValue = tab[i];
			}
		}

		return maxValue;
	}

	
	/**
	 * Search the min value in the table
	 * 
	 * @param tab
	 *            The table
	 * @return The min value
	 */
	public static int min(int[] tab)
	{
		int minValue = tab[0];

		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] < minValue)
			{
				minValue = tab[i];
			}
		}

		return minValue;
	}

	/**
	 * 
	 * @param tab
	 * @return
	 */
	public static double average(int[] tab)
	{
		return (double) sum(tab) / tab.length;

	}

	/**
	 * Fill randomly a table with values between 0 and 99
	 * 
	 * @param tab
	 *            The table to fill
	 */
	public static void fillRandomTable(int[] tab)
	{
		Random rand = new Random();
		int maxRange = 100;

		for (int it = 0; it < tab.length; it++)
		{
			tab[it] = rand.nextInt(maxRange);
		}

	}

	// Correction de fillRandomTable
	public static int[] createRandomlyTab(int length)
	{
		int[] tab = new int[length];
		Random rnd = new Random();

		for (int i = 0; i < length; i++)
		{
			tab[i] = rnd.nextInt(100);
		}

		return tab;
	}

	/**
	 * Create a table with the values between 1 and 5
	 * 
	 * @param length
	 *            Length of the table
	 * @return The new table
	 */
	public static int[] initTab(int length)
	{
		int[] tab = new int[length];

		for (int i = 0; i < length; i++)
		{
			tab[i] = i + 1;
		}

		return tab;

	}

	/**
	 * Put a value at the index in the table
	 * 
	 * @param tab
	 *            The table where to put the new value
	 * @param index
	 *            The index where to put the new value in the table
	 * @param value
	 *            The new value to save
	 */
	public static void put(int[] tab, int index, int value)
	{
		tab[index] = value;
	}

	/**
	 * Permut the values between the index1 and the index2
	 * 
	 * @param tab
	 *            The table where to do the permutation
	 * @param index1
	 *            Index of the first value to permut
	 * @param index2
	 *            index of the second value to permut
	 */
	public static void permut(int[] tab, int index1, int index2)
	{
		int tmp = tab[index1];
		tab[index1] = tab[index2];
		tab[index2] = tmp;
	}

	/**
	 * Permut two values from the index and index-1
	 * 
	 * @param tab
	 *            The table to permuet the values
	 * @param index
	 *            Index from where the values will be permuted
	 */
	public static void permut2(int[] tab, int index)
	{
		permut(tab, index - 1, index);
	}

	/**
	 * Remove a value in the table and move the others values to the left
	 * 
	 * @param tab
	 * @param index
	 */
	public static void remove(int[] tab, int index)
	{
		int lengthTab = tab.length;
		int lengthTmpTab = (lengthTab - 1) - index;
		int[] tmpTab = new int[lengthTmpTab];
		int it = index + 1;

		// Save the values from the index+1 to the end of the table in the
		// temporary table
		for (int i = 0; i < lengthTmpTab; i++, it++)
		{
			tmpTab[i] = tab[it];
		}

		// Replace the values saved in the temporary table to the table from the
		// index
		for (int k = index, j = 0; k < lengthTab && j < lengthTmpTab; k++, j++)
		{
			tab[k] = tmpTab[j];
		}

	}

	// Correction de remove
	// Cas limite : que mettre dans le dernier element
	public static void removeOK(int[] tab, int index)
	{
		for (int k = index; k < tab.length - 1; k++)
		{
			tab[k] = tab[k + 1];
		}

	}

	/**
	 * Insert a new value in the table and move the others values to the right
	 * 
	 * @param tab
	 *            The table to insert the new value
	 * @param index
	 *            The index where the new value will be put
	 * @param value
	 *            the new value to put
	 */
	public static void insert(int[] tab, int index, int value)
	{
		int lengthTab = tab.length;
		int lengthTmpTab = lengthTab - index;
		int[] tmpTab = new int[lengthTmpTab];
		int it = index;

		// Save the values from the index to the end of the table in the
		// temporary table
		for (int i = 0; i < lengthTmpTab; i++, it++)
		{
			tmpTab[i] = tab[it];
		}

		// insert new value
		tab[index] = value;

		// Replace the values saved in the temporary table to the table from the
		// index+1
		for (int k = index + 1, j = 0; k < lengthTab && j < lengthTmpTab; k++, j++)
		{
			tab[k] = tmpTab[j];
		}
	}

	// Correction de insert
	public static void insertOK(int[] tab, int index, int value)
	{
		for (int k = tab.length - 1; k < index; k--)
		{
			tab[k] = tab[k - 1];
		}

		put(tab, index, value);
	}

	/**
	 * Copy a table into a nnew table
	 * 
	 * @param tab
	 *            the table to copy
	 * @return A new table
	 */
	public static int[] clone(int[] tab)
	{
		int[] tab2 = new int[tab.length];

		// Copy the content of the table tab to the new table
		for (int i = 0; i < tab.length; i++)
		{
			tab2[i] = tab[i];
		}

		return tab2;
	}

	/**
	 * Copy only the even numbers from a table to a new table
	 * 
	 * @param tab
	 *            The table where to take the even numbers
	 * @return A new table with only the even numbers
	 */
	public static int[] even(int[] tab)
	{
		int[] tmpTab = new int[tab.length];
		for (int i = 0, j = 0; i < tab.length && j < tab.length; i++)
		{
			// If the number is even, then save it in the new table
			if (tab[i] % 2 == 0)
			{
				tmpTab[j] = tab[i];
				j++;
			}
		}

		return tmpTab;

	}

	// Correction de even
	public static int[] evenOK(int[] tab)
	{
		int[] tmpTab = new int[tab.length];
		int j = 0;
		for (int i = 0; i < tab.length; i++)
		{
			// If the number is even, then save it in the new table
			if (tab[i] % 2 == 0)
			{
				tmpTab[j] = tab[i]; // ou tmpTab[j++] = tab[i];
				j++;
			}
		}

		return tmpTab;

	}

	/**
	 * Inverse the values from a table to a new table
	 * 
	 * @param tab
	 *            The table which the values will be inversed
	 * @return A table withthe inversed values
	 */
	public static int[] inverse(int[] tab)
	{
		int[] tmpTab = new int[tab.length];

		// Start from the end of tab and save the value in tmpTab
		for (int i = (tab.length - 1), j = 0; i >= 0 && j < tab.length; i--, j++)
		{
			tmpTab[j] = tab[i];
		}

		return tmpTab;
	}

	// Correction de inverse
	public static int[] inverseOK(int[] tab)
	{
		int[] tmpTab = new int[tab.length];

		for (int i = 0; i < tab.length; i++)
		{
			tmpTab[tab.length - 1 - i] = tab[i];
		}

		return tmpTab;
	}

	/**
	 * Remove a value from a table
	 * 
	 * @param tab
	 *            The table where to remove the value
	 * @param index
	 *            The index where the value will be removed
	 * @return A new table without the value at index
	 */
	public static int[] remove2(int[] tab, int index)
	{
		int[] tmpTab = new int[tab.length - 1];

		// Save the left part of the index
		for (int k = 0; k <= index - 1; k++)
		{
			tmpTab[k] = tab[k];
		}

		// Save the rigth part of the index
		for (int k = index; k < tab.length - 1; k++)
		{
			tmpTab[k] = tab[k + 1];
		}

		return tmpTab;

	}

	// Correction de remove2
	public static int[] remove2OK(int[] tab, int index)
	{
		int[] tmpTab = new int[tab.length - 1];

		// Remove the value
		removeOK(tmpTab, index);

		// Clone to tab.length-1
		for (int i = 0; i < tab.length - 1; i++)
		{
			tmpTab[i] = tab[i];
		}

		return tmpTab;

	}

	/**
	 * Insert a new value in the table and return a new table with the new value
	 * 
	 * @param tab
	 *            The table from where the value will be added
	 * @param index
	 *            Index where the value will be added
	 * @param value
	 *            The new value to add
	 * @return A new table with the new value
	 */
	public static int[] insert2(int[] tab, int index, int value)
	{
		int[] tmpTab = new int[tab.length + 1];

		// Save the left part of the index
		for (int k = 0; k <= index - 1; k++)
		{
			tmpTab[k] = tab[k];
		}

		// Add the new value
		put(tmpTab, index, value);

		// Save the right part of the index
		for (int k = tmpTab.length - 1; k > index; k--)
		{
			tmpTab[k] = tab[k - 1];
		}

		return tmpTab;

	}

	// Correction de insert2
	public static int[] insert2OK(int[] tab, int index, int value)
	{
		int[] tmpTab = new int[tab.length + 1];

		// Save the left part of the index
		for (int k = 0; k <= index - 1; k++)
		{
			tmpTab[k] = tab[k];
		}

		// Add the new value
		tmpTab[index] = value;

		// Save the right part of the index
		for (int k = index; k < tab.length; k++)
		{
			tmpTab[k + 1] = tab[k];
		}

		return tmpTab;

	}


	/**
	 * Sort the table according to the bubble way : 
	 * - Compare two first elements of the table. Permut their value if one is greater than the other
	 * - Do the same for the following elements
	 * - At the end, the maximum is at the last index of the table
	 * - Repeat the operations but on the size (length-1), then (length-2) and so on
	 * 
	 * @param tab The table to do the sorting
	 */
	public static void sortBubble(int[] tab)
	{
		int newLength = tab.length;

		for (int i = tab.length; i >= 1; i--)
		{

			for (int j = 0; j < (newLength - 1); j++)
			{
				// Permut the values if tab[j] is greater than tab[j + 1]
				if (tab[j] > tab[j + 1])
				{
					permut2(tab, j + 1);
				}
			}
			newLength -= 1;
		}
	}

	public static int[] SortMin(int[] tab)
	{		
		// Create a new table with the same size as the inou parameter
		int[] newTab = new int[tab.length];
		
		int nbMin = 0;
		
		// Find the maximum in the table
		int nbMax =  max(tab);
		
		int index = 0;
		
		for(int i=0; i<tab.length; i++)
		{
			// Set by default the minimum to tab[0]
			nbMin = tab[0];

			// Find the min value of tab
			for(int k=0; k<tab.length; k++)
			{
				if(tab[k]<=nbMin)
				{
					nbMin = tab[k];
					index=k;
				}				
			}
			
			// Increment nbMax to 1
			nbMax += 1;
			
			// Save the min value from tab to newTab
			newTab[i] = nbMin;
			
			// Change the min value into a new max value into tab
			tab[index] = nbMax +1;
			
		}
		
		return newTab;
	}

	public static int factorial(int n)
	{
		int res = 1;

		for (int i = 0; i < n; i++)
		{
			res *= (n - i);
		}

		return res;
	}

	
	
	public static int sumRecursive(int[] tab)
	{
		int res = 0;
		
		int[] newTab = new int[tab.length];
		
		for(int i=0; i<tab.length; i++)
		{
			for(int j=1+i; j<tab.length; j++)
			{
				res += tab[j];
			}
			 newTab[i] = res + tab[i];
			 res = 0;
		}
		
		
		display(newTab);
		return sum(newTab);
	}
}