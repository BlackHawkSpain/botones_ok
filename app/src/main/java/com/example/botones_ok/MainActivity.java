package com.example.botones_ok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tit_nombre, tit_edad, sexo, tit_profesion, tit_hobbies, resultado;
    EditText nombre, edad;
    RadioButton opcionFemenino, opcionMasculino;
    Spinner lista_profesiones;
    String valor;
    CheckBox opcion1, opcion2, opcion3;
    Button boton_enviar, boton_limpiar;
    String resultado2="";
    String opcion = "";
int contador=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opcion1= findViewById(R.id.opcion1);
        opcion2= findViewById(R.id.opcion2);
        opcion3= findViewById(R.id.opcion3);
        boton_limpiar= findViewById(R.id.boton_limpiar);
        boton_enviar = findViewById(R.id.boton_enviar);
        opcionFemenino = findViewById(R.id.opcionFemenino);
        opcionMasculino = findViewById(R.id.opcionMasculino);
        resultado= findViewById(R.id.resultado);
        nombre= findViewById(R.id.nombre);
        edad= findViewById(R.id.edad);
        lista_profesiones= findViewById(R.id.lista_profesiones);



        nombre.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textview, int actionID, KeyEvent keyEvent){
                if(actionID == EditorInfo.IME_ACTION_GO){
                    resultado2=resultado2 +(nombre.getText()+"\n");

                    InputMethodManager imm =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(nombre.getWindowToken(), 0);
                    return true;

                }
                return false;

            }



        });



        edad.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textview, int actionID, KeyEvent keyEvent){
                if(actionID == EditorInfo.IME_ACTION_GO){
                    resultado2=resultado2 +(edad.getText()+"\n");

                    InputMethodManager imm =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(edad.getWindowToken(), 0);
                    return true;

                }
                return false;

            }



        });

        boton_enviar.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // boton_enviar.setText(" Enviado ");
                resultado.setText(resultado2);
            }
        });

        boton_limpiar.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // boton_limpiar.setText(" rellene de nuevo los campos ");
                resultado.setText("");
                resultado2="";
                nombre.setText("");
                edad.setText("");
                opcion="";
                valor="";
            }
        });




        opcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = ((CheckBox)view).isChecked();

                if(isChecked){
                    resultado2+="Hobbie1"+"\n";
                }
            }
        });


        opcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = ((CheckBox)view).isChecked();

                if(isChecked){
                    resultado2+="Hobbie2"+"\n";
                }

            }
        });


        opcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = ((CheckBox)view).isChecked();

                if(isChecked){
                    resultado2+="Hobbie3"+"\n";
                }
            }
        });

        View.OnClickListener list = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcion = "";
                switch(view.getId()){
                    case R.id.opcionFemenino:
                        opcion = "Femenino";
                        break;
                    case R.id.opcionMasculino:
                        opcion = "Masculino";
                        break;
                }
                resultado2+=opcion+"\n";

            }
        };
        opcionFemenino.setOnClickListener(list);
        opcionMasculino.setOnClickListener(list);



        lista_profesiones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                contador++;
                valor = lista_profesiones.getSelectedItem().toString();
                Log.i("LISTA", valor);
                if (contador>=2)
                resultado2+= valor+ "\n";
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    };







}
