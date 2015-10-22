package com.exemple;

// Pour la librairie JDBC
import java.sql.*;

public class App
{

	//Nom du driver JDBC qu'on va utiliser pour la base MySql
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	// URL utilisé pour se connecter a la base
	// On dit qu'on se connecte a une base MySql qui se trouve sur localhost et que la BDD est JEE
	private static final String JDBC_URL = "jdbc:mysql://localhost/jee";
	
	// Login et mot de passe pour se connecter a la base
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";
	
	
	public static void main (String [] args)
	{
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement stmtP = null;
		
		try
		{
			// 1. Connexion
			System.out.println("Connecting ...");
			// Connexion stockee dans l'objet Connection
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			
			// 2. Creation du statement
			System.out.println("Create statement ....");
			stmt = conn.createStatement();
			
			// 3. Envoi la requête SQL et reupère le résultat
			System.out.println("Send SQL ....");
			ResultSet res = stmt.executeQuery("SELECT * FROM user;");
			
			// 4.
			while(res.next())
			{
				System.out.println("User # " + res.getInt("iduser"));
				System.out.print("- " + res.getString("firstname") + " " + res.getString("lastname"));
				System.out.println("- " + res.getString("address"));
			}
			
			res.close();
			stmt.close();
		
/*			
			int resSql  = stmt.executeUpdate("INSERT INTO user VALUES(31, 'Blue', 'Pegasus', 'Magnolia');");
			
			stmt.close();
			
			if(resSql == 1)
			{
				stmt = conn.createStatement();
				res = stmt.executeQuery("SELECT * FROM user;");
				
				System.out.println("Table user :");
				while(res.next())
				{
					System.out.println("User # " + res.getInt("iduser"));
					System.out.print("- " + res.getString("firstname") + " " + res.getString("lastname"));
					System.out.println("- " + res.getString("address"));
				}
			}
			else
			{
				System.out.println("Insert failed");
				
			}
*/			
			System.out.println("Create Prepare Statement .....");
			// Creation du statement
			stmtP = conn.prepareStatement("INSERT INTO user VALUES(?,?,?,?);");
			// On remplit les ? dans la requete SQL
			// Dans le 1er ?, il mettre la valeur 55
			// On n'est pas oblige de mettre dans l'ordre les valeurs 
			stmtP.setInt(1,55);
			stmtP.setString(2, "Princess");
			stmtP.setString(3, "Mononoke");
			stmtP.setString(4, "Forest");
			// On execute la requete
			int resSql = stmtP.executeUpdate();
			System.out.println("Resultat pour la creation de Princess Mononoke : " + resSql);
			
			stmtP.setInt(1,56);
			stmtP.setString(2, "Laputa");
			stmtP.setString(3, "Chateau Dans le ciel");
			stmtP.setString(4, "Air");
			resSql = stmtP.executeUpdate();
			System.out.println("Resultat pour la creation de Laputa : " + resSql);
			
			
			
			
			
			// 5. Tout cloturer
			// res n'est pas ds try catch de finally car res est cree deja ds un try catch. 
			//Donc s'il y a erreur, il sera catche dans le premier catch
			res.close();
			
			
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		// Pour être sûr de fermer la connexion à la base
		finally
		{
			System.out.println("Exiting ...");
			try
			{
				// Le statement peut planté ==> try catch
				if(stmt!=null)
				{
					stmt.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			try
			{
				// La deconnexion peut plantée ==> try catch
				if(conn!=null)
				{
					conn.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
