 package com.unionbank.processor;
 import java.sql.Connection;
 import java.sql.SQLException;
 import javax.naming.Context;
 import javax.naming.InitialContext;
 import javax.naming.NamingException;
 import javax.sql.DataSource;
 import oracle.jdbc.pool.OracleDataSource;
 import org.apache.log4j.Logger;
 public class GetConnection
 {
   static Logger logger = null;
   public DataSource getPrConn()
     throws NamingException
   {
     Context c = new InitialContext();
     return (DataSource)c.lookup("jdbc/AcctServiceDatasource");
   }
   public static Connection getFCCConnection()
   {
     Connection connection = null;
     OracleDataSource oracleDataSource = null;
     try {
       InitialContext ctx = new InitialContext();
       DataSource ds = (DataSource)ctx.lookup("jdbc/FundsTDDatasource");
       oracleDataSource = (OracleDataSource)ds.unwrap(OracleDataSource.class);
       connection = oracleDataSource.getConnection();
     } catch (SQLException ex) {
       logger.fatal(ex.getMessage());
     } catch (NamingException ex) {
       logger.fatal(ex.getMessage());
     }
     return connection;
   }
 }