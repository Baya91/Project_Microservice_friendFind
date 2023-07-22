package com.user.managment.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class HibernateConfig {


	@Value("${datasource.driverClassName}")
	private String driverClassName;	
	@Value("${datasource.databaseUrl}")
	private String databaseUrl;	
	@Value("${datasource.databaseUser}")
	private String databaseUser;	
	@Value("${datasource.databasePassword}")
	private String databasePassword;	
	@Value("${datasource.platform}")
	private String	platform;		
	@Value("${jpa.hibernate.hibernateDDLAuto}")
	private String  hibernateDDlAuto;	
	@Value("${jpa.hibernate.hibernateDialect}")
	private String hibernateDialect;	
	@Value("${jpa.showSql}")
	private String showSql;
	@Value("${jpa.hibernate.create_empty_composites.enabled}")
    private boolean createEmptyComposites;
	
 

	// kandiro Bean bach nconcto data base	
	@Bean(name = "platformDataSource")
    public DataSource platformDataSource(){
		return DataSourceBuilder.create()
				.username(databaseUser)
				.password(databasePassword)
				.url(databaseUrl)
				.driverClassName(driverClassName)
				.build();
	}
	
	// bach ndiro set lchi  configiration bghitha tkon 3andi 3la data base
	 @Bean("entityManagerFactory")
	    public LocalContainerEntityManagerFactoryBean platformEntityManger(){		
		LocalContainerEntityManagerFactoryBean em =new LocalContainerEntityManagerFactoryBean();
		
		em.setDataSource(platformDataSource());
		em.setPackagesToScan(new String[] {"com.user.managment"});
		em.setPersistenceUnitName("platformPersistenceUnitName");
		HibernateJpaVendorAdapter vendorAdapter=new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		
		HashMap<String, Object> properties= new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", hibernateDDlAuto);
		properties.put("hibernate.dialect", hibernateDialect);
		properties.put("hibernate.show_sql", showSql);
		properties.put("hibernate.create_empty_composites.enabled",
                createEmptyComposites);
		
		em.setJpaPropertyMap(properties);		
		return em;		
	}
	
	//hna kan3arfo transaction dyl JPA bina ghansta·3mlo JPA f app dyalna
	   @Bean(name = "jpaTransactionManager")
	    public PlatformTransactionManager platformTransactionManager(){		
		JpaTransactionManager transactionManager =new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(platformEntityManger().getObject());		
		return transactionManager;
		
	}
	

}
