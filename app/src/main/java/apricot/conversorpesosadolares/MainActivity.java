package apricot.conversorpesosadolares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText cuadro;
    double pesos, dolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cuadro= (EditText) findViewById(R.id.cuadropesos);

    }

    void onClickConvertir (View vista){
        pesos= Double.parseDouble(cuadro.getText().toString());
        dolares= pesos/15;

        Intent envia = new Intent(this, Activity2.class);
        Bundle datos = new Bundle();
        datos.putString("dolares", Double.toString(dolares));
        envia.putExtras(datos);
        finish();
        startActivity(envia);
    }
}