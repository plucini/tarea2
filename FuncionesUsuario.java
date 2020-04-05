
import java.util.Scanner;

public class FuncionesUsuario {

    public int calcularImpuestos (Usuario user){

        double impuestos = 0;

        if (user.getEdad() >= 18){
            if (user.getEdad() <= 30){
                impuestos = 2000;
            }else{
                if (user.getEdad() <= 65){
                    impuestos = 7000;
                }else{
                    impuestos = 2000;
                }
            }
        }


        double descuento = 0.3 * user.getCantidad_de_hijos();
        if (descuento > 50){
            descuento = 50;
        }

        if (user.getCantidad_de_hijos() > 0){
            impuestos = impuestos * descuento;
        }



        return (int) impuestos;
    }


    public void agregarSueldo (Usuario user){

        Scanner teclado = new Scanner (System.in);
        int sueldo = teclado.nextInt();

        user.setSaldo(user.getSaldo() + sueldo);
    }

}
