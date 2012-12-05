package org.springframework.nanotrader.data.service;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cloud")
public class PrintDataSource {
	
	final BasicDataSource datasource;
	
	@Autowired
	public PrintDataSource(DataSource ds) {
		this.datasource = (BasicDataSource) ds;
		System.out.println("This class name" + datasource.getClass().getName());
		
		System.out.println("This driver url" + datasource.getUrl());
		System.out.println("This driver name" + datasource.getDriverClassName());
		System.out.println("This user name" + datasource.getUsername());
		System.out.println("This password" + datasource.getPassword());
		System.out.println(java.lang.System.getenv("VCAP_SERVICES"));
	}
	
	
}
