package konox.actividad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    long T_App;
    long T_Fuera;
    long T_Result;
    long T_Result_dentro;
    long T_Result_fuera;
    public EditText EditText_TApp;
    public EditText editText_TOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T_App = System.currentTimeMillis();

        EditText_TApp = (EditText) this.findViewById(R.id.EditText_TApp);
        editText_TOut = (EditText) this.findViewById(R.id.editText_TOut);



    }

    protected void onPause() {
        super.onPause();
        T_Fuera = System.currentTimeMillis();

    }

    protected void onResume() {
        super.onResume();
        T_Result = System.currentTimeMillis();
        T_Result_dentro = T_Fuera - T_App;
        T_Result_fuera = T_Result - T_Fuera;

        EditText_TApp.setText(T_Result_dentro+"");
        editText_TOut.setText(T_Result_fuera+"");
    }
}
