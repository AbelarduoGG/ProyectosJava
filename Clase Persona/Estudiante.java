class Estudiante extends Persona{

    private String carrera;
    private Int semestre;

    //Constructor
    public Estudiante(String nombre, String direccion, String carrera, Int semestre){
        
        super(nombre, direccion);

        this.carrera = carrera;
        this.semestre = semestre;

    }

    //gets y sets

    public String getcarrera(){
        return carrera;
    }

    public void setcarrera(String carrera){
        this.carrera = carrera;
    }
    public Int semestre(){
        return semestre;
    }

    public void setsemestre(Int semestre){
        this.semestre = semestre;
    }
}