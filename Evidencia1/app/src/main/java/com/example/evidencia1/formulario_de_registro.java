package com.example.evidencia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class formulario_de_registro extends AppCompatActivity {

    private EditText et_nombre, et_apellido, et_correo, et_numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_de_registro);

        et_nombre = (EditText)findViewById(R.id.txt_nombre);
        et_apellido = (EditText)findViewById(R.id.txt_apellido);
        et_correo = (EditText)findViewById(R.id.txt_correo);
        et_numero = (EditText)findViewById(R.id.txt_numero);

    }

    public void Registrar(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administración", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String nombre = et_nombre.getText().toString();
        String apellido = et_apellido.getText().toString();
        String correo = et_correo.getText().toString();
        String numero = et_numero.getText().toString();

        if (!nombre.isEmpty() && !apellido.isEmpty() && !correo.isEmpty() && !numero.isEmpty()) {
            ContentValues registro = new ContentValues();

            registro.put("nombre", nombre);
            registro.put("apellido", apellido);
            registro.put("correo", correo);
            registro.put("numero", numero);

            BaseDeDatos.insert("articulos", null, registro);

            BaseDeDatos.close();
            et_nombre.setText("");
            et_apellido.setText("");
            et_correo.setText("");
            et_numero.setText("");

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(formulario_de_registro.this, menu_principal.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "Llena todos los campos", Toast.LENGTH_SHORT).show();
        }

    }
}