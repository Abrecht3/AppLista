package com.apps.abrecht3.applista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button enviar;
    EditText name;
    EditText last;
    EditText mail;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviar=(Button)findViewById(R.id.btn_enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Datos.class);

                name=(EditText)findViewById(R.id.edt_name);
                last=(EditText)findViewById(R.id.edt_apel);
                mail=(EditText)findViewById(R.id.edt_mail);
                pass=(EditText)findViewById(R.id.edt_pass);

                String nombre=name.getText().toString();
                String apellido=last.getText().toString();
                String correo=mail.getText().toString();
                String pwrd=pass.getText().toString();

                i.putExtra("Nombre",nombre);
                i.putExtra("Last",apellido);
                i.putExtra("Correo",correo);
                i.putExtra("Pass",pwrd);

                startActivity(i);
            }
        });
    }

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
