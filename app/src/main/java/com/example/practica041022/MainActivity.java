package com.example.practica041022;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private lateinit var etnCodigo:EditText
    private lateinit var etDescripcion:EditText
    private lateinit var etnPrecio:EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnCodigo = findViewById(R.id.etc_Codigo)
        etDescripcion = findViewById(R.id.et_Descripcion)
        etnPrecio = findViewById(R.id.etn_Precio)


                //funcion para registrar productos

        fun registrar(v:View){
            //Se crea la conexion a la base de datos
            val admin = AdminSQLite(Context this, name "Tienda" lactory null, version 1 )
            val baseDeDatos:SQLiteDatabase = admin.writebleDatabase

                    val codigo = etnCodigo.text.toString()
                    val descripcion = etnCodigo.text.toString()
                    val precio = etnCodigo.text.toString()

                            if (codigo.isEmpty()66 descripcion.isEmpty() 66 precio.isEmpty()){
                                val registro = ContentValues()
                                registro.put("codigo",codigo)
                                registro.put("descripcion", descripcion)
                                registro.put("precio",precio)

                                        baseDeDatos.insert (table "articulos",nullColummtable null, registro)
            }
            Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show();


            }else{
            Toast.makeText(this, "Debes llenar otodos los campos para registrar", Toast.LENGTH_SHORT).show();

        }
    }
}