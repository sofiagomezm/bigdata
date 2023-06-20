/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.beam.examples.Aire;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sofi
 */
public class JsonUrlReader2 {

    public JsonUrlReader2()
    {
        
    }
      
    public ArrayList<Farmacia> cargarURL() throws StreamReadException, DatabindException, MalformedURLException, IOException {
        String url = "https://midas.minsal.cl/farmacia_v2/WS/getLocalesTurnos.php";
        
        ArrayList<Farmacia> aFarmacia = new ArrayList();

        //JsonNode node = new JsonUrlReader().get(url);
        //System.out.println(node.toPrettyString());
        
        
        ObjectMapper mapper = new ObjectMapper();

	System.out.println("Inicando mapper en JsonUrlReader");
        JsonNode node = mapper.readTree(new URL(url));

        System.out.println("Finalizando mapper en JsonUrlReader");
        
        
        Iterator<JsonNode> it = node.iterator();
        
        Farmacia a = null;
        a = new Farmacia();
        a.setId("ID");
        a.setFecha("FECHA");
        a.setLocal_id("LOCAL_ID");
        a.setFk_region("FK_REGION");
        a.setFk_comuna("FK_COMUNA");
        a.setFk_localidad("FK_LOCALIDAD");
        a.setLocal_nombre("LOCAL_NOMBRE");
        a.setComuna_nombre("COMUNA_NOMBRE");
        a.setLocalidad_nombre("LOCALIDAD_NOMBRE");
        a.setLocal_direccion("LOCAL_DIRECCION");
        a.setFuncionamiento_hora_apertura("FUNCIONAMIENTO_HORA_APERTURA");
        a.setFuncionamiento_hora_cierre("FUNCIONAMIENTO_HORA_CIERRE");
        a.setLocal_telefono("LOCAL_TELEFONO");
        a.setLocal_lat("LOCAL_LAT");
        a.setLocal_lng("LOCAL_LNG");
        a.setFuncionamiento_dia("FUNCIONAMIENTO_DIA");
	    
	    aFarmacia.add(a);    

        int i = 1;
           

        }   
        return aFarmacia;
    }
//JsonUrlReader
