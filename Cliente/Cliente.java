
public class Cliente {
   
    private String Nombre;
    private String Apellidos;
    private String RFC;
    private String Email;
    private Double Adeudo;
    private Double Cargo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre.toUpperCase();
    }

    public String getApellidos() {
        return this.Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos.toUpperCase();
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC.toUpperCase();
    }

    public String getEmail() {
        return Email;
    }

    public boolean setEmail(String Email) {
        if(Email.contains ("@") && Email.contains(".") && !Email.contains(" ")){
            this.Email = Email.toLowerCase();
            return true;
        }else{
            return false;
        }
        }
   
    public Cliente(){
   
    Nombre="";
    Apellidos="";
    RFC="";
    Email="";
    Adeudo=0.0;
    Cargo = 0.0;
    }
   
    public void CargoAdeudo(Double Cargo){
        Adeudo = Adeudo + Cargo;
    }
   
    public void AbonoAdeudo(Double Cargo){
        Adeudo = Adeudo - Cargo;
    }
    
    public void MostrarAtributos(){
        System.out.println(getNombre()+ " " +getApellidos()+ ". Su RFC es " +getRFC()+ ". Su email es " +getEmail()+ " y dispone de un adeudo de " +Adeudo);       
    }
   
   
}
