package com.example.javier.contactos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;

public class MainActivity extends Activity {

    private ListView lista;
    String[] antecedentes =
            {" Juan"," Ivette","Sandy","Giovanni"};
   // private Hashtable<String, String> Contactos = new Hashtable<String ,String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Contactos.put("n1", "Juan");
        Contactos.put("t1", "3314329857");

        Contactos.put("n2", "Ivette");
        Contactos.put("t2", "3311893156");

        Contactos.put("n3", "Sandy");
        Contactos.put("t3", "3345908735");

        Contactos.put("n4", "Giovanni");
        Contactos.put("t4", "3391783901");*/

       /* Enumeration lis = this.Contactos.keys();
        Object Nombre;
        Object Telefono;
        while (lis.hasMoreElements()){
            Nombre = lis.nextElement();
            Telefono = this.Contactos.get(Nombre);

        }*/



       lista = (ListView)findViewById(R.id.lista);
        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, antecedentes);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();

                   /* if (posicion == 1) {

                        Intent juan = new Intent(getApplicationContext(), Listado_Contactos.class);
                        startActivity(juan);
                    }*/


                switch (posicion) {
                    case 0:
                        String Nombre;
                        /*Object Telefono;*/
                      //  int i =0;
                       // Nombre = Contactos.get("n1");
                       /* Telefono = Contactos.get("t1");

                        TextView nombre = (TextView) findViewById(R.id.munom);
                        nombre.setText(" "+ Nombre);
                        TextView telefono = (TextView) findViewById(R.id.mutel);
                        telefono.setText(" "+ Telefono);

                        ImageView imagen = (ImageView)findViewById(R.id.imagen);
                        imagen.setImageResource(R.drawable.juan);*/

                        Intent juan = new Intent(getApplicationContext(), Listado_Contactos.class);
                        juan.putExtra("po",  posicion);
                        startActivity(juan);

                        break;
                    case 1:
                         //int o = 1;
                            Intent ivette = new Intent(getApplicationContext(), Listado_Contactos.class);
                            ivette.putExtra("po", posicion);
                            startActivity(ivette);

                        break;
                    case 2:

                        Intent sandy = new Intent(getApplicationContext(), Listado_Contactos.class);
                        sandy.putExtra("po", posicion);
                        startActivity(sandy);
                        break;
                    case 3:

                        Intent giovas = new Intent(getApplicationContext(), Listado_Contactos.class);
                        giovas.putExtra("po",  posicion);
                        startActivity(giovas);
                        break;
                   /* default:
                        Toast.makeText(getApplicationContext(), "no soy ramiro ni pablo", Toast.LENGTH_SHORT).show();*/
                }
            }
        });

    }




   /* public void  Directorio() {
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

        }
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
