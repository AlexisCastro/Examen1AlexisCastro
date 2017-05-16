package apricot.conversorpesosadolares;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alexiscastro on 15/05/17.
 */

public class Activity2 extends AppCompatActivity {

    TextView resultado;
    String dollars, minombre, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        resultado= (TextView) findViewById(R.id.resultadoconver);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        dollars = recibe.getString("dolares");
        minombre="Alexis Castro Olvera";

        resultado.setText(minombre+",\n Resultado: "+dollars+" dólares \n" );
    }

    public void onClickEnviar(View sendmail){

        correo="eoropezag@ipn.mx";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Examen primer parcial");
        intent.putExtra(Intent.EXTRA_TEXT,  resultado.getText().toString()+"Listooo ");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { correo} );
        startActivity(intent);
    }
}