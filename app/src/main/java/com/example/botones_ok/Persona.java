package com.example.botones_ok;

public class Persona {
    private String nombre;
    private String edad;

    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String empleo;
    private String opcionSexo;

    public Persona(String nombre, String edad, String opcion1, String opcion2, String opcion3,String empleo, String opcionSexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcionSexo = opcionSexo;
        this.empleo= empleo;

    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcionSexo() {
        return opcionSexo;

    }

    public Persona(String empleo) {
        this.empleo = empleo;
    }

    public void setOpcionSexo(String opcionSexo) {
        this.opcionSexo = opcionSexo;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return nombre+ "\n"+ edad + "\n" + opcionSexo+ "\n" + empleo + "\n"+
                opcion1+ "\n"+ opcion2+ "\n" + opcion3+ "\n";
    }
}
