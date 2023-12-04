

public class testCliente {
   
    public static void main(String [] args){
       
   
    Cliente Cliente01 = new Cliente();
    Cliente Cliente02 = new Cliente();
   
    Cliente01.CargoAdeudo(23.0);
    Cliente01.CargoAdeudo(23.0);
    Cliente01.AbonoAdeudo(23.0);
    Cliente01.setNombre("Pancho");
    Cliente01.setApellidos("Hernandez");
    Cliente01.setEmail("Pancho@soy.utj.edu");
    Cliente01.setRFC("44dds");
    Cliente01.MostrarAtributos();
      
   
    Cliente02.CargoAdeudo(10.0);
    Cliente02.CargoAdeudo(10.0);
    Cliente02.AbonoAdeudo(5.0);
    Cliente02.setNombre("Tití");
    Cliente02.setApellidos("Perez");
    Cliente02.setEmail("Titi@Soy.utj.edu.mx");
    Cliente02.setRFC("4asda");
    Cliente02.MostrarAtributos();
     
    }
}