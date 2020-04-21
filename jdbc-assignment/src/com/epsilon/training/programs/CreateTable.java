package com.epsilon.training.programs;

import com.epsilon.training.util.DbUtil;
import com.sun.corba.se.spi.monitoring.StatisticMonitoredAttribute;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

    public static void main(String args[]){
        String sql = "create table products (\n" +
                "id int primary key,\n" +
                "name varchar(100) not null,\n" +
                "description varchar(255),\n" +
                "dateadded Date,\n " +
                "price double)";

        try(Connection conn = DbUtil.getConnection();
            Statement stmt = conn.createStatement();
        ){
            stmt.execute(sql);
            System.out.println("Product Table Created!");
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
