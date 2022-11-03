/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Estudiante;
import Modelos.Cuaderno;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author pipet
 */
public class IntroduccionJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        JSONObject estudiante1=new JSONObject();
//        estudiante1.put("nombre", "Felipe");
//        estudiante1.put("nota", 4.5);
//        estudiante1.put("edad", 19);
//        estudiante1.put("becado", true);
//        System.out.println(estudiante1);
          Estudiante estudiante=new Estudiante("Felipe", 4.2, 19, true);
          Estudiante estudiante2=new Estudiante("Ana", 4.2, 25, false);
          Estudiante estudiante3=new Estudiante("Lucia", 4.2, 34, true);
          Cuaderno c1=new Cuaderno("a1", 100, "Matematicas");
          Cuaderno c2=new Cuaderno("a2", 50, "Fisica");
          Cuaderno c3=new Cuaderno("a3", 100, "Programacion");
          estudiante.getMisCuadernos().add(c1);
          estudiante.getMisCuadernos().add(c2);
          estudiante.getMisCuadernos().add(c3);
          
          JSONArray los_estudiantes=new JSONArray();
          los_estudiantes.add(estudiante.toJSON());
          los_estudiantes.add(estudiante2.toJSON());
          los_estudiantes.add(estudiante3.toJSON());
          
          System.out.println(los_estudiantes);
          //System.out.println(estudiante.toJSON());
          



//        
//        JSONObject computador1=new JSONObject();
//        computador1.put("marca", "dell");
//        computador1.put("serial", "abc123");
//        computador1.put("avaluo",1000000);
//        
//        estudiante1.put("computador", computador1);
//        
//        JSONObject estudiante2=new JSONObject();
//        estudiante2.put("nombre", "Lucas");
//        estudiante2.put("nota", 4.7);
//        estudiante2.put("edad", 23);
//        estudiante2.put("becado", false);
//        
//        JSONObject cursoPOO=new JSONObject();
//        cursoPOO.put("nombre","POO");
//        
//        JSONArray listadoEstudiantes=new JSONArray();
//        listadoEstudiantes.add(estudiante1);
//        listadoEstudiantes.add(estudiante2);
//        
//        cursoPOO.put("listado", listadoEstudiantes);
//        
//        System.out.println(cursoPOO);
//        System.out.println("El promedio del grupo es "+promedioGrupo(cursoPOO));
        
    }
    public static double promedioGrupo(JSONObject grupo){
        double respuesta=0.0;
        JSONArray listado= (JSONArray) grupo.get("listado");
        for(Object  estudianteActual : listado){
            JSONObject estuActual=(JSONObject) estudianteActual;
            respuesta+=(double)estuActual.get("nota");
            
        }
        return respuesta/listado.size();
    }
    
}
