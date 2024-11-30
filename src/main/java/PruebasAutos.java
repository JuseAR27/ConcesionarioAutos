public class PruebasAutos 

{  
  public void runTest()
  {
    testanioFabricacion();
    testmarca();
  }

  private static void testanioFabricacion(){
    Auto auto = new Auto("Toyota", "Corolla", 2020, "Nuevo");
    if(auto.getAnioFabricacion() == 2020){
      System.out.println("El anio de fabricacion del auto es correcto");
    }
    else
    {
      System.out.println("El anio de fabricacion del auto es incorrecto");
    }
  }

  private static void testmarca() {
    Auto auto = new Auto("Toyota", "Corolla", 2020, "Nuevo");
    if (auto.getMarca().equals("Toyota")) {
      System.out.println("La marca del auto es correcta");
    } else {
      System.out.println("La marca del auto es incorrecta");
    }
  }
}