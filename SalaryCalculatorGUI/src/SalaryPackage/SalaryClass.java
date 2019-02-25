package SalaryPackage;

	public class SalaryClass {

		public double[] Calculate(double input) {

			double _pit = 0.13; //Personal income tax, подоходный налог

			double _ipt = 0.302; //Insurance premium tax, страховые взносы

			double employeeTax = input * _pit; //Подоходный налог

			double salary = input - employeeTax; //Который вычитается из зарплаты

			double employeerTax = input * _ipt; //Взносы, уплоченные работодателем

			return new double[] { salary, employeeTax, employeerTax };

		}

}