public class UpdatingVariable {
	public static void main(String[] args) {
		int salary = 1000;
		//bono 200
		salary += 200;
		System.out.println(salary);
		
		//pension: $50 descuento
		
		salary = salary - 50;
		System.out.println(salary);
		
		// 2 horas extra $30 c/u
		// comida: $45
		
		salary = salary + (30*2) - 45;
		System.out.println(salary);
		
		// Actualizando Cadenas de Texto
		String employeeName = "Gustav Caves";
		employeeName = employeeName + " Días de la Vega";
		System.out.println(employeeName);
		employeeName = "Irene " + employeeName;
		System.out.println("Tu nombre es: " + employeeName);
		
	}

}
