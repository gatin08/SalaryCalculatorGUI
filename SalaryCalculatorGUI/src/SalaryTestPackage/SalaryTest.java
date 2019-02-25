package SalaryTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SalaryPackage.SalaryClass;

class SalaryTest {

	@Test
	void test1() {
		SalaryClass salaryClass = new SalaryClass();
		//Задание входного значения
		double[] outputValues = salaryClass.Calculate(1000000);
		
		//Проверка решенного примера с полученными значениями
		assertArrayEquals(new double[] { 8700000, 1300000, 3020000 }, outputValues);
	}
	
	@Test
	void test2() {
		SalaryClass salaryClass = new SalaryClass();
		//Задание входного значения
		double[] outputValues = salaryClass.Calculate(20000000);
		
		//Проверка решенного примера с полученными значениями
		assertArrayEquals(new double[] { 17400000, 2600000, 6040000 }, outputValues);
	}

}
