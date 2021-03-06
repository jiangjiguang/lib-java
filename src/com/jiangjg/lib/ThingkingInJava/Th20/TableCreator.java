package com.jiangjg.lib.ThingkingInJava.Th20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {

	public static void main(String[] args) throws Exception {
		if(args.length < 1){
			System.out.println("");
			System.exit(0);
		}
		for(String className:args){
			Class<?> cl = Class.forName(className);
			DBTable dbTable = cl.getAnnotation(DBTable.class);
			if(dbTable == null){
				System.out.println("no dbtable");
				continue;
			}
			String tableName = dbTable.name();
			if(tableName.length() < 1){
				tableName = cl.getName().toUpperCase();
			}
			List<String> columnDefs = new ArrayList<String>();
			for(Field field : cl.getDeclaredFields()){
				String columnName = null;
				Annotation[] anns = field.getDeclaredAnnotations();
				if(anns.length < 1){
					continue;
				}
				if(anns[0] instanceof SQLInteger){
					SQLInteger sInt = (SQLInteger)anns[0];
					if(sInt.name().length() < 1){
						columnName = field.getName().toUpperCase();
					}
					else {
						columnName = sInt.name();
					}
					columnDefs.add(columnName + " INT" + getConstrains(sInt.constraints()));
				}
				if(anns[0] instanceof SQLString){
					SQLString sString = (SQLString)anns[0];
					if(sString.name().length() < 1){
						columnName = field.getName().toUpperCase();
					}
					else {
						columnName = sString.name();
					}
					columnDefs.add(columnName + " VARCHAR(" + sString.value() + ")" + getConstrains(sString.constraints()));
				}
				StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
				for(String columnDef: columnDefs){
					createCommand.append("\n " + columnDef + ",");
					
				}
				String tableCreate = createCommand.substring(0, createCommand.length() - 1) + ");";
				System.out.println("Table Creation SQL for " + className + " is :\n" + tableCreate);
			}
			
			
			
		}

	}

	private static String getConstrains(Constraints con) {
		// TODO Auto-generated method stub
		String constrains = "";
		if(!con.allowNUll()){
			constrains += " NOT NULL ";
		}
		if(con.primaryKey()){
			constrains += "PRIMARY KEY";
		}
		if(con.unique()){
			constrains +=  " UNIQUE";
		}
		return constrains;
	}

}
