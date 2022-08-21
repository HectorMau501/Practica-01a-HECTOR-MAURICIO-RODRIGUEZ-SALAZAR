
package POO;

import java.util.Scanner;



public class Main {
    
    public static void main(String [] args)
    {
        int opcion = 4;
        
        Scanner acceso = new Scanner(System.in);
        Scanner acceso2 = new Scanner(System.in);
        Evento objeto1 = new Evento();
        
        
        System.out.println("\t\t\t---Bienvenido al programa de Eventos---");
       
        do{
            System.out.println("\n\n\t\t---Menu de opciones--?");
             System.out.println("\n\n\t\tCual es la opcion que desea realizar?");
             System.out.println("\n\t1. La opcion de registrar");
             System.out.println("\n\t2. La opcion de editar");
             System.out.println("\n\t3. La opcion de imprimir");
             System.out.println("\n\t4. salir de la aplicacion");
             opcion = acceso.nextInt();
             
             switch(opcion)
             {
                 case 1:
                     System.out.println("\n\n\tUsted eligio la opcion de registrar");
                     System.out.println("\n\n\tRegistre los datos:");
                     System.out.println("\n\tFecha del evento: ");
                     String fecha = acceso2.nextLine();
                     objeto1.setFecha(fecha);
                     System.out.println("\n\tHora del evento: ");  
                     String hora = acceso2.nextLine();
                     objeto1.setHora(hora);
                     System.out.println("\n\tLugar del evento: "); 
                     String lugar = acceso2.nextLine();
                     objeto1.setHora(hora);
                     System.out.println("\n\tCapacidad: ");
                     int capacidad = acceso2.nextInt();
                     objeto1.setCapacidad(capacidad);
                     System.out.println("\n\tEl costo del Boleto: ");
                     double costoBoleto = acceso2.nextDouble();
                     objeto1.setCostoBoleto(costoBoleto);
                         break;
                     
                 case 2:
                     
                     int op;
                     
                     System.out.println("\n\n\tUsted eligio la opcion de editar");
                     
                     Scanner acceso3 = new Scanner(System.in);
                     Scanner acceso4 = new Scanner(System.in);
                     
                     do{
                         System.out.println("\n\n\t---Menu para editar los eventos---");
                         System.out.println("\n\n\t\tCual es la opcion que desea realizar?");
                         System.out.println("\n\t1. Editar fecha");
                         System.out.println("\n\t2. Editar hora");
                         System.out.println("\n\t3. Editar capacidad");
                         System.out.println("\n\t4. Editar costo de boleto");
                         System.out.println("\n\t5. salir del menu de edicion");
                         op = acceso3.nextInt();
                         
                         switch(op)
                         {
                             case 1:
                                 System.out.println("\n\tIntroduzca la fecha nueva ");
                                 fecha = acceso4.nextLine();
                                 objeto1.setFecha(fecha);
                                 break;
                                 
                             case 2:
                                 System.out.println("\n\tIntroduzca la hora nueva ");
                                 hora = acceso4.nextLine();
                                 objeto1.setHora(hora);
                                 break;
                                 
                             case 3:
                                 System.out.println("\n\tIntroduca la capacidad nueva ");
                                 capacidad = acceso4.nextInt();
                                 objeto1.setCapacidad(capacidad);
                                 break;
                                 
                             case 4:
                                 System.out.println("\n\tIntroduzca el costo del boleto nuevo");
                                 costoBoleto = acceso4.nextDouble();
                                 objeto1.setCostoBoleto(costoBoleto);
                                 break;
                             case 5:
                                 break;
                                 
                             default:System.out.println("Usted puso una opcion que no esta el menu, por favor vuelva a intentarlo");    
                                    
                         }
                         
                     }while(op != 5);
                             

                     break;
                 case 3:
                     System.out.println("\n\n\tUsted eligio la opcion de imprimir");
                     System.out.println("\n\tLa fecha es: "+objeto1.getFecha());
                     System.out.println("\n\tLa hora es: "+objeto1.getHora());
                     System.out.println("\n\tLa capacidad es: "+objeto1.getCapacidad());
                     System.out.println("\n\tel costo del boleto es: "+objeto1.getCostoBoleto());
                     
                     break;
                 case 4:
                     System.out.println("\n\n\t\t---Gracias por tu visita:)");
                     break;
                    
                 default: System.out.println("Usted puso una opcion que no esta el menu, por favor vuelva a intentarlo");
                             
             }
            
        }while(opcion != 4);
        
    }
  
}
