/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;
import jdk.nashorn.api.scripting.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author pipet
 */
public class Estudiante {
    private String nombre;
    private double nota_final;
    private int edad;
    private boolean becado;
    private LinkedList<Cuaderno> misCuadernos;
    public Estudiante(String nombre, double nota_final, int edad, boolean becado) {
        this.nombre = nombre;
        this.nota_final = nota_final;
        this.edad = edad;
        this.becado = becado;
        this.misCuadernos=new LinkedList<>();
    }
    public JSONObject toJSON(){
        JSONObject respuesta=new JSONObject();
        respuesta.put("nombre", this.nombre);
        respuesta.put("nota_final", this.nota_final);
        respuesta.put("edad", this.edad);
        respuesta.put("becado", this.becado);
        respuesta.put("cuadernos", this.getJSONCuadernos());
        return respuesta;
    }
    public JSONArray getJSONCuadernos(){
        JSONArray cuadernos=new JSONArray();
        for(Cuaderno actual:this.misCuadernos){
            cuadernos.add(actual.toJSON());
        }
        return cuadernos;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nota_final
     */
    public double getNota_final() {
        return nota_final;
    }

    /**
     * @param nota_final the nota_final to set
     */
    public void setNota_final(double nota_final) {
        this.nota_final = nota_final;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the becado
     */
    public boolean isBecado() {
        return becado;
    }

    /**
     * @param becado the becado to set
     */
    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    /**
     * @return the misCuadernos
     */
    public LinkedList<Cuaderno> getMisCuadernos() {
        return misCuadernos;
    }

    /**
     * @param misCuadernos the misCuadernos to set
     */
    public void setMisCuadernos(LinkedList<Cuaderno> misCuadernos) {
        this.misCuadernos = misCuadernos;
    }
    
}
