package Ej1_T5;

public class Ej1_T5_Empleado 
{
	//Una empleado que tiene los atributos: codigo, nombre, apellido, salario, puesto. 
	//La otra clase es departamento que está formado por: codigo, nombre, ubicación y los empleados que tiene.
		private int codigo;
		private String nombre;
		private String apellido;
		private double salario;
		private int puesto;
		
		
		
		public Ej1_T5_Empleado(int codigo, String nombre, String apellido, double salario, int puesto) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.apellido = apellido;
			this.salario = salario;
			this.puesto = puesto;
		}
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public int getPuesto() {
			return puesto;
		}
		public void setPuesto(int puesto) {
			this.puesto = puesto;
		}
}
