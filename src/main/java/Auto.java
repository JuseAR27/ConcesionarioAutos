public class Auto {
  private String marca; //Atributo marca del tipo String
  private String modelo; //Atributo modelo del tipo String
  private int anioFabricacion; //Atributo anioFabricacion del tipo int
  private String estado; //Atributo estado del tipo String

  //Constructor para el objeto Auto
  public Auto(String marca, String modelo, int anioFabricacion, String   estado){
    this.marca = marca;
    this.modelo = modelo;
    this.anioFabricacion = anioFabricacion;
    this.estado = estado;
  }
  //Metodo para obtener la marca del objeto Auto
  public String getMarca(){
    return marca;
  }
  //Metodo para obtener el modelo del objeto Auto
  public String getModelo(){
    return modelo;
  }
  //Metodo para obtener el anio de fabricacion del objeto Auto
  public int getAnioFabricacion(){
    return anioFabricacion;
  }
  //Metodo para obtener el estado del objeto Auto
  public String getEstado(){
    return estado;
  }
  //Metodo para establecer la marca del objeto Auto
  public void setMarca(String marca){
    this.marca = marca;
  }
  //Metodo para establecer el modelo del objeto Auto
  public void setModelo(String modelo){
    this.modelo = modelo;
  }
  //Metodo para establecer el anio de fabricacion del objeto Auto
  public void setAnioFabricacion(int anioFabricacion){
    this.anioFabricacion = anioFabricacion;
  }
  //Metodo para establecer el estado del objeto Auto
  public void setEstado(String estado){
    this.estado = estado;
  }
  //Metodo para mostrar los datos del objeto Auto
  public String toString(){
    return "Marca: " + marca + ", Modelo: " + modelo + ", Año de fabricación: " + anioFabricacion + ", Estado: " + estado;
  }
}