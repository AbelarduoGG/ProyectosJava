class Persona{
    //propidades
    private String nombre;
    private String direccion;

    //Constructor
    public Persona(String nombre, String direccion){

    this.nombre = nombre;
    this.direccion = direccion;

}

//Gets y sets

public String getnombre(){
    return nombre;
}

public void setnombre(String nombre){
    this.nombre = nombre;
}

public String getdireccion(){
    return direccion;
}

public void setdireccion(String direccion){
    this.direccion = direccion;
}


}

