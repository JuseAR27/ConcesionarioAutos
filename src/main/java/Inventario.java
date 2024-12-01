import java.util.ArrayList;
public class Inventario {
  /** @Author José Francisco Aquino Rivera */
  private ArrayList<Auto> autos; //Atributo autos del tipo ArrayList<Auto>
  
  public Inventario(){
    autos = new ArrayList<Auto>(); //Crear un objeto ArrayList<Auto>
  }
  
  public void agregarAuto(Auto auto){
    autos.add(auto); //Agregar un objeto Auto al ArrayList<Auto>
  }
  /**
   * Elimina un objeto Auto del ArrayList<Auto>
   * @param modelo El modelo del objeto Auto a eliminar
   */
  public void eliminarAuto(String modelo){
    boolean encontrado = false; //Variable para indicar si se encontro el auto a eliminar
    for(Auto auto : autos){
      if(auto.getModelo().equalsIgnoreCase(modelo)){
        autos.remove(auto); //Eliminar el auto del ArrayList<Auto>
        encontrado = true; //Indicar que se encontro el auto
        break; //Salir del ciclo for
      }
    }
    if (!encontrado){
      System.out.println("No se encontro el auto con el modelo " + modelo);
    }
  }
  /**
   * Modifica las caracteristicas de un objeto Auto del ArrayList<Auto>
   * @param modelo El modelo del objeto Auto a modificar
   * @param marca La nueva marca del objeto Auto
   * @param anioFabricacion El nuevo anio de fabricacion del objeto Auto
   * @param estado El nuevo estado del objeto Auto
   */
  public void modificarAuto(String modelo, String marca, int anioFabricacion, String estado){
    boolean encontrado = false; //Variable para indicar si se encontro el auto a modificar
    for(Auto auto : autos){
      if(auto.getModelo().equalsIgnoreCase(modelo)){
        auto.setMarca(marca); //Modificar la marca del auto
        auto.setAnioFabricacion(anioFabricacion); //Modificar el anio de fabricacion del auto
        auto.setEstado(estado); //Modificar el estado del auto
        encontrado = true; //Indicar que se encontro el auto
        break; //Salir del ciclo for
      }
    }
    if (!encontrado){
      System.out.println("No se encontro el auto con el modelo " + modelo);
    }
  }
  /**
   * Muestra los objetos Auto del ArrayList<Auto>
   */
  public void mostrarAutos(){
    if(autos.isEmpty()){
      System.out.println("No hay autos en el inventario");
    } 
    else{
      System.out.println("Autos en el inventario:");
      for(Auto auto : autos){
        System.out.println(auto);
      }
    } 
  }
}