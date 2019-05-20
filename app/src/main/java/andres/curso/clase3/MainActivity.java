package andres.curso.clase3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.txt_num);
        et2 = findViewById(R.id.txt_num2);
        tv1 = findViewById(R.id.txt_resultado);
    }

public void Sumar(View view){
   String valor1 = et1.getText().toString();
   String valor2 = et2.getText().toString();

   float num1 = Float.parseFloat(valor1);
   float num2 = Float.parseFloat(valor2);

   float result = num1 + num2 ;

   String totalSuma = String.valueOf(result);

   tv1.setText(totalSuma);

}
}
