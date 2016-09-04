package com.apps.abrecht3.applista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Datos extends AppCompatActivity {

    TextView name;
    TextView last;
    TextView mail;
    TextView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        name=(TextView)findViewById(R.id.tv_name1);
        last=(TextView)findViewById(R.id.tv_last1);
        mail=(TextView)findViewById(R.id.tv_mail1);
        pass=(TextView)findViewById(R.id.tv_pass1);

        Intent intent =getIntent();
        Bundle bundle =intent.getExtras();

        if (bundle!=null){
            String name1=(String)bundle.get("Nombre");
            name.setText(name1);
            String last1=(String)bundle.get("Last");
            last.setText(last1);
            String mail1=(String)bundle.get("Correo");
            mail.setText(mail1);
            String pass1=(String)bundle.get("Pass");
            pass.setText(pass1);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_datos, menu);
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
