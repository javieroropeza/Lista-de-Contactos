package com.example.javier.contactos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Javier on 17/10/2015.
 */
public class Listado_Contactos extends Activity{

    private Hashtable<String, String> Contactos = new Hashtable<String ,String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_contactos);

        Contactos.put("n1", "Juan");
        Contactos.put("t1", "3314329857");

        Contactos.put("n2", "Ivette");
        Contactos.put("t2", "3318211444");

        Contactos.put("n3", "Sandy");
        Contactos.put("t3", "3331998199");

        Contactos.put("n4", "Giovanni");
        Contactos.put("t4", "3339702572");

        Object Nombre;
        Object Telefono;

        Bundle pos = this.getIntent().getExtras();
        int po =pos.getInt("po");
     /*   Bundle o = this.getIntent().getExtras();
        int nom1 =o.getInt("o");*/



        if (po == 0) {
            // clave = lis.nextElement();
            Nombre = this.Contactos.get("n1");
            Telefono = this.Contactos.get("t1");

            TextView nombre = (TextView) findViewById(R.id.munom);
            nombre.setText(" "+ Nombre);
            TextView telefono = (TextView) findViewById(R.id.mutel);
            telefono.setText(" "+ Telefono);

            ImageView imagen = (ImageView)findViewById(R.id.imagen);
            imagen.setImageResource(R.drawable.juan);

        }

       else if (po == 1) {
            // clave = lis.nextElement();
            Nombre = this.Contactos.get("n2");
            Telefono = this.Contactos.get("t2");

            TextView nombre = (TextView) findViewById(R.id.munom);
            nombre.setText(" "+ Nombre);
            TextView telefono = (TextView) findViewById(R.id.mutel);
            telefono.setText(" "+ Telefono);

            ImageView imagen = (ImageView)findViewById(R.id.imagen);
            imagen.setImageResource(R.drawable.ivette);

        }

        else if (po == 2) {
            // clave = lis.nextElement();
            Nombre = this.Contactos.get("n3");
            Telefono = this.Contactos.get("t3");

            TextView nombre = (TextView) findViewById(R.id.munom);
            nombre.setText(" "+ Nombre);
            TextView telefono = (TextView) findViewById(R.id.mutel);
            telefono.setText(" "+ Telefono);

            ImageView imagen = (ImageView)findViewById(R.id.imagen);
            imagen.setImageResource(R.drawable.sandy);

        }

        else if (po == 3) {
            // clave = lis.nextElement();
            Nombre = this.Contactos.get("n4");
            Telefono = this.Contactos.get("t4");

            TextView nombre = (TextView) findViewById(R.id.munom);
            nombre.setText(" "+ Nombre);
            TextView telefono = (TextView) findViewById(R.id.mutel);
            telefono.setText(" "+ Telefono);

            ImageView imagen = (ImageView)findViewById(R.id.imagen);
            imagen.setImageResource(R.drawable.giovas);

        }

    }


}

   /* private Hashtable<String, String> Contactos;

    public   Listado_Contactos() {
        this.Contactos = new Hashtable< String, String>();


    }

    public int AgregarContacto (String Nombre, String Telefono){    //retorna 0 si no se pudo agregar y 1 si se agrego

        int resultado = 0;       //Definimos una variable resultado.

        if(!this.Contactos.containsKey(Nombre)){   //validamos que el contacto no existe
            this.Contactos.put(Nombre, Telefono);  //Agregamos el contaco
            resultado = 1;                          //Actualizamos el valor de la variable
        }
        return resultado;                           //retornamos el resultado de la aoperacion

    }

    public int BorrarContacto(){
        int resultado = 0;
        //definir el metodo

        return resultado;
    }

    public void BorrarTodo(){
        //definir metodo
    }

    public String BuscarContacto(String Nombre){
        String resultado= "";

        //definir metodo
        return resultado;
    }

    public void ListarContactos(){
        Enumeration lista = this.Contactos.keys();
        Object Nombre;
        Object Telefono;
        while (lista.hasMoreElements()){
            Nombre = lista.nextElement();
            Telefono = this.Contactos.get(Nombre);
            //mostrar el nombre
        }
    }*/




