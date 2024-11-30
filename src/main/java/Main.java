import java.util.Scanner; //Se importa la clase Scanner para leer datos ingresados por el usuario
public class Main {
  public static void main(String[] args) {
    int opcion = 0; //Variable para almacenar la opcion del menu
    Scanner leer = new Scanner(System.in); //Crear un objeto Scanner para leer la entrada del usuario
    Inventario inventario = new Inventario(); //Crear un objeto Inventario con capacidad para 10 autos
    do {
      System.out.println("Bienvenido al sistema de inventario del concesionario de autos");
      System.out.println("1.-Agregar automovil del inventario");
      System.out.println("2.-Eliminar automovil del inventario");
      System.out.println("3.-Modificar caracteristicas del automovil");
      System.out.println("4.-Mostrar automoviles en existencia");
      System.out.println("5.-Salir");
      System.out.println("Ingrese la opcion que desea realizar");
      opcion = leer.nextInt(); //Leer la opcion ingresada por el usuario
  
      switch(opcion){
        case 1: //Opcion para agregar un automovil al inventario
          System.out.println("Ingrese la marca del automovil");
          String marca = leer.next(); //Leer la marca del automovil
          System.out.println("Ingrese el modelo del automovil");  
          String modelo = leer.next(); //Leer el modelo del automovil
          leer.nextLine(); //Limpiar el buffer de entrada
          System.out.println("Ingrese el año de fabricacion del automovil");
          int anioFabricacion = leer.nextInt();
          leer.nextLine(); //Limpiar el buffer del scanner
          System.out.println("Ingrese el estado del automovil (Nuevo/usado)");
          String estado = leer.next(); //Leer el estado del automovil
          Auto nuevoAuto = new Auto (marca, modelo, anioFabricacion, estado);
          inventario.agregarAuto(nuevoAuto); //Agregar el automovil al inventario
          System.out.println("El automovil ha sido agregado al inventario exitosamente");
          break;
        case 2: //Opcion para eliminar un automovil del inventario
          System.out.println("Ingrese el modelo del automovil que desea eliminar");
          String modeloEliminar = leer.next(); //Leer el modelo del automovil a eliminar
          inventario.eliminarAuto(modeloEliminar);
          System.out.println("El automovil ha sido eliminado del inventario");
          break;
        case 3: //Opcion para modificar las caracteristicas de un automovil
          System.out.println("Ingrese el modelo del automovil que desea modificar");
          String modeloModificar = leer.next(); //Leer el modelo del automovil a modificar
          System.out.println("Ingrese la nueva marca del automovil");
          String marcaModificar = leer.next(); //Leer la marca del automovil
          System.out.println("Ingrese el nuevo año de fabricacion del automovil");
          int anioFabricacionModificar = leer.nextInt();
          leer.nextLine();
          System.out.println("Ingrese el nuevo estado: (Nuevo/usado)");
          String estadoModificar = leer.next(); //Leer el estado del automovil
          inventario.modificarAuto(modeloModificar, marcaModificar, anioFabricacionModificar, estadoModificar);
          System.out.println("Las caracteristicas del automovil han sido modificadas exitosamente");
          break;
        case 4: //Opcion para mostrar los automoviles en existencia
          inventario.mostrarAutos();
          break;
        case 5: //Opcion para salir del programa
          System.out.println("Saliendo del menu...");
          break;
        default: //Opcion para mostrar un mensaje de error si la opcion ingresada no es valida
          System.out.println("Opcion invalida");
          break;
        }
    }while(opcion !=5);
    PruebasAutos test = new PruebasAutos();
    test.runTest();
  }
}