package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.myapplication.core.services.impl.SalaryCalculationServiceImpl;


public class ExampleUnitTest {
    @Test
    public void calculate_salary_is_correct() {

        SalaryCalculationServiceImpl salaryCalculationService= new SalaryCalculationServiceImpl();
        assertEquals(915000.0f,salaryCalculationService.calculateMonthSalary(
                1000000f,0,false),3000f);

    }

    @Test
    public void calculate_salary_is_correct_with_extra_bonus() {

        SalaryCalculationServiceImpl salaryCalculationService= new SalaryCalculationServiceImpl();
        assertEquals(2355255f,salaryCalculationService.calculateMonthSalary(
                2355255f,2,true),3000f);
    }
}