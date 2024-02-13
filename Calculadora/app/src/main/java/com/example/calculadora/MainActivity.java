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

        tbh.addTab(tbh.newTabSpec("LONGITUD").setContent(R.id.tabLongitud).setIndicator("LONGITUD", null));
        tbh.addTab(tbh.newTabSpec("ALMACENAMIENTO").setContent(R.id.tabAlmacenamiento).setIndicator("ALMACENAMIENTO", null));
        tbh.addTab(tbh.newTabSpec("MONEDAS").setContent(R.id.tabMonedas).setIndicator("MONEDAS",null));
        tbh.addTab(tbh.newTabSpec("Masa").setContent(R.id.tabMasa).setIndicator("Masa",null));
        tbh.addTab(tbh.newTabSpec("Tiempo").setContent(R.id.tabTiempo).setIndicator("Tiempo",null));
        tbh.addTab(tbh.newTabSpec("Transferencia_de_datos").setContent(R.id.tabTransferencia_de_datos).setIndicator("Transferencia_de_datos",null));
        tbh.addTab(tbh.newTabSpec("Volumen").setContent(R.id.tabVolumen).setIndicator("Volumen",null));
        btn = findViewById(R.id.btnLongitudConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                spn = findViewById(R.id.spnLongitudDe);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnLongitudA);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtLongitudCantidad);
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
        btn = findViewById(R.id.btnMonedasConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                spn = findViewById(R.id.spnMonedasDe);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnMonedasA);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtMonedasCantidad);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = objConversor.convertir(2, de, a, cantidad);
                Toast.makeText(getApplicationContext(),"Respuesta: "+
                        resp, Toast.LENGTH_LONG).show();
                }catch(Exception e){}
            }
        });
        btn = findViewById(R.id.btnMasaConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                spn = findViewById(R.id.spnMasaDe);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnMasaA);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtMasaCantidad);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = objConversor.convertir(3, de, a, cantidad);
                Toast.makeText(getApplicationContext(),"Respuesta: "+
                        resp, Toast.LENGTH_LONG).show();
                }catch(Exception e){}
            }
        });
        btn = findViewById(R.id.btnTiempoConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                spn = findViewById(R.id.spnTiempoDe);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnTiempoA);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtTiempoCantidad);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = objConversor.convertir(4, de, a, cantidad);
                Toast.makeText(getApplicationContext(),"Respuesta: "+
                        resp, Toast.LENGTH_LONG).show();
                }catch(Exception e){}
            }
        });
        btn = findViewById(R.id.btnTransferencia_de_datosConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    spn = findViewById(R.id.spnTransferencia_de_datosDe);
                    int de = spn.getSelectedItemPosition();

                    spn = findViewById(R.id.spnTransferencia_de_datosA);
                    int a = spn.getSelectedItemPosition();

                    tempVal = findViewById(R.id.txtTransferencia_de_datosCantidad);
                    double cantidad = Double.parseDouble(tempVal.getText().toString());

                    double resp = objConversor.convertir(5, de, a, cantidad);
                    Toast.makeText(getApplicationContext(),"Respuesta: "+
                            resp, Toast.LENGTH_LONG).show();
                }catch(Exception e){}
            }
        });
    }
}
class conversores{
    double[][] valores = {
            //LONGITUD
            {1, 100, 39.3701, 3.280841666667, 1.193, 1.0936138888889999077, 0.001, 0.000621371, 0.001, 0.000001, 0.000000001},

            //Almacenamiento
            {1, 8, 1000 * 8, Math.pow(1000, 2) * 8, Math.pow(1000, 3) * 8, Math.pow(1000, 4) * 8, Math.pow(1000, 5) * 8, Math.pow(1000, 6) * 8, Math.pow(1000, 7) * 8,
                    1024 * 8, Math.pow(1024, 2) * 8, Math.pow(1024, 3) * 8, Math.pow(1024, 4) * 8, Math.pow(1024, 5) * 8, Math.pow(1024, 6) * 8, Math.pow(1024, 7) * 8,},
            //Monedas
            {1, 0.93, 7.81, 17.14, 149.27, 0.79, 24.73, 36.78, 1.35, 3946.75, 965.92, 830.67, 8.76},

            //Masa
            {1,1000,1000000,1000000000,5000,0.15747304,2.20462262,0.001,35.273962, 0.01},

            //Timepo
            {1,60,3600,3600000.0,3.600000000,1/24,1/168,1/(30.417*24),1/(24*365),1/(24*365)},

            //Transferencia_de_datos
            {1, 1000000,125000,1000,125, 0.125, 0.001, 0.000125, 0.000125, 0.000000125},

            //Volumen

    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }
}