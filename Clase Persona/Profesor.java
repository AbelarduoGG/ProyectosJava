class Profesor extends Persona{
    
    private String departamento;
    private String categoria;

    //constructor
    public Profesor(String nombre, String direccion, String departamento, String categoria){

        super(nombre, direccion);

        this.departamento = departamento;
        this.categoria = categoria;

    }

    //gets y sets

    public String getdepartamento(){
        return departamento;
    }

    public void setdepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getcategoria(){
        return categoria;
    }

    public void setcategoria(String categoria){
        this.categoria = categoria;
    }

}
