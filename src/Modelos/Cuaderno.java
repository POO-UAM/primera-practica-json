/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import org.json.simple.JSONObject;

/**
 *
 * @author pipet
 */
public class Cuaderno {
    private String id;
    private int hojas;
    private String nombre;

    public Cuaderno(String id, int hojas, String nombre) {
        this.id = id;
        this.hojas = hojas;
        this.nombre = nombre;
    }
    public JSONObject toJSON(){
        JSONObject respuesta=new JSONObject();
        respuesta.put("id", this.id);
        respuesta.put("hojas", this.hojas);
        respuesta.put("nombre", this.nombre);
        return respuesta;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the hojas
     */
    public int getHojas() {
        return hojas;
    }

    /**
     * @param hojas the hojas to set
     */
    public void setHojas(int hojas) {
        this.hojas = hojas;
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
    
}
