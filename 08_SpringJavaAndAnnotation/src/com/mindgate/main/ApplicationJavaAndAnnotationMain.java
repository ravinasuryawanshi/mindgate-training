package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.FinancialApplicationConfig;

import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthsDetails;

public class ApplicationJavaAndAnnotationMain {
public static void main(String[] args) {
	
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(FinancialApplicationConfig.class);
	FinancialYearDetails financialyearsdetails = applicationContext.getBean("financialyearsdetails", FinancialYearDetails.class);
	financialyearsdetails.setYearId(101);
	financialyearsdetails.setYearStartDate(LocalDate.of(2022, 05, 16));
	financialyearsdetails.setYearEndDate(LocalDate.of(2022, 10, 20));
	System.out.println(financialyearsdetails);
	System.out.println("_".repeat(50));
	
	MonthsDetails monthdetails = applicationContext.getBean("monthdetails",MonthsDetails .class);
	monthdetails.setMonthId(102);
	monthdetails.setMonthStartDate(LocalDate.of(2022, 02, 10));
	monthdetails.setMonthEndDate(LocalDate.of(2022, 04, 13));
	
	System.out.println(monthdetails);
}
}
