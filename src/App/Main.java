package App;

import Model.Persona;
import Model.Empleado;
import Model.Rut;
import Model.Direccion;
import Util.RutInvalidoException;


public class Main {
	public static void main(String[] args) {
		System.out.println("========== Gestión de personal Llanquihue Tour ==========");

		try {
			/**
			 * Creando direcciones necesarias para composición
			 */
			Direccion direccion1 = new Direccion(742, "Avenida Siempre Viva", "Springfield");
			Direccion direccion2 = new Direccion(32, "Calle 57 Nueva Nueva York", "Manhattan");
			Direccion direccion3 = new Direccion(142, "Calle Wallaby", "Sydney");
			/**
			 * Creando Ruts necesarios para composición y usar la excepción personalizada
			 */
			Rut rut1 = new Rut("1234508-k");
			Rut rut2 = new Rut("84950234-0");
			Rut rut3 = new Rut("23556233-3");

			/**
			 * Creamos instancias de persona y empleado
			 */
			Persona persona1 = new Persona("Homero Simpson", 140350549, direccion1, rut1);
			Empleado empleado1 = new Empleado("Philip J. Fry", 123456789, direccion2, rut2, "Repartidor", "Día");
			Empleado empleado2 = new Empleado("P. Sherman", 958648697, direccion3, rut3, "Dentista", "Noche");

			System.out.println("-------- Personas Registradas --------");
			System.out.println(persona1);
			System.out.println(empleado1);
			System.out.println(empleado2);

		} catch (RutInvalidoException e) {
			System.err.println("Error al ingresar datos" + e.getMessage());
		}
	}
}
