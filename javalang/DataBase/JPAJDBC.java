			Connection con = DriverManager.getConnection("jdbc:teradata://udwdev/LOGMECH=LDAP", sUser, sPassword);
			
			statement stmt = con.createStatement();
			//PreparedStatement
			//CallableStatement
			
			Pasted from <http://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html> 
			
			String sSelAll = "select top 10 UDW_MED_CLM_ID from udw4baseview1.adjd_mce";

			ResultSet rset = stmt.executeQuery(sSelAll);
			//stmt.execute
			//stmt.executeQuery
			//stmt.executeUpdate
			

			while(rset.next()){
				System.out.println( " CLM Id :  " +  rset.getInt("UDW_MED_CLM_ID"));
			}
			stmt.close();
			
			
			Process ResultSet
			getString
			getInt
getFloat