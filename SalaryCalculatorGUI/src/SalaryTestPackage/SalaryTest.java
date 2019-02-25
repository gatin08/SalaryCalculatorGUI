package SalaryTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SalaryPackage.SalaryClass;

class SalaryTest {

	@Test
	void test1() {
		SalaryClass salaryClass = new SalaryClass();
		//Задание входного значения
		double[] outputValues = salaryClass.Calculate(10000);
		
		//Проверка решенного примера с полученными значениями
		assertArrayEquals(new double[] { 8700, 1300, 3020 }, outputValues);
	}
	
	@Test
	void test2() {
		SalaryClass salaryClass = new SalaryClass();
		//Задание входного значения
		double[] outputValues = salaryClass.Calculate(20000);
		
		//Проверка решенного примера с полученными значениями
		assertArrayEquals(new double[] { 17400, 2600, 6040 }, outputValues);
	}

}
