package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TabHost tbh;
    TextView tempVal;
    Button btn;
    Spinner spn;
    conversores objConversor = new conversores();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbh = findViewById(R.id.tbhConversores);
        tbh.setup();

        tbh.addTab(tbh.newTabSpec("Área").setContent(R.id.tabÁrea).setIndicator("Área", null));
        tbh.addTab(tbh.newTabSpec("ALMACENAMIENTO").setContent(R.id.tabAlmacenamiento).setIndicator("ALMACENAMIENTO", null));
        btn = findViewById(R.id.btnÁreaConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                spn = findViewById(R.id.spnÁreaDe);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnÁreaA);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtÁreaCantidad);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = objConversor.convertir(0, de, a, cantidad);
                Toast.makeText(getApplicationContext(),"Respuesta: "+
                        resp, Toast.LENGTH_LONG).show();
                }catch(Exception e){}
            }
        });
        btn = findViewById(R.id.btnAlmacenamientoConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                spn = findViewById(R.id.spnAlmacenamientoDe);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnAlmacenamientoA);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtAlmacenamientoCantidad);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = 1/objConversor.convertir(1, de, a, cantidad);
                Toast.makeText(getApplicationContext(),"Respuesta: "+
                        resp, Toast.LENGTH_LONG).show();
                }catch(Exception e){}
            }
        });
    }
}
class conversores{
    double[][] valores = {
            //Área
            {1, 0.6988,7.52, 0.0001, 0.0001726,1.296,628.8},

            //Almacenamiento
            {1, 8, 1000 * 8, Math.pow(1000, 2) * 8, Math.pow(1000, 3) * 8, Math.pow(1000, 4) * 8, Math.pow(1000, 5) * 8, Math.pow(1000, 6) * 8, Math.pow(1000, 7) * 8,
                    1024 * 8, Math.pow(1024, 2) * 8, Math.pow(1024, 3) * 8, Math.pow(1024, 4) * 8, Math.pow(1024, 5) * 8, Math.pow(1024, 6) * 8, Math.pow(1024, 7) * 8,},
            //Monedas
            {1, 0.93, 7.81, 17.14, 149.27, 0.79, 24.73, 36.78, 1.35, 3946.75, 965.92, 830.67, 8.76},

            //Masa
            {1,1000,1000000,1000000000,5000,0.15747304,2.20462262,0.001,35.273962, 0.01},

            //Timepo
            {1,60,3600,3600000,3600000000.0,1.0/24.0,1.0/168.0, 1.0/(30.417*24.0),1.0/(24.0*365.0),1/(24.0*3650.0)},

            //Transferencia_de_datos
            {1, 1000000,125000,1000,125, 0.125, 0.001, 0.000125, 0.000125, 0.000000125},

            //Volumen
            {1,4,8,128,256,768,3785.41,3.78541,15.7725, 0.00378541},
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }
}