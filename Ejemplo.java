
import java.util.Date;


public class Ejemplo {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear el objeto -Date-
		Date fecha1 = new Date();
		
		System.out.println("Año: " + (fecha1.getYear() + 1880));
		System.out.println("Mes: " + fecha1.getMonth() + 5);
		
	}
  
}
