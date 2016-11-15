package konox.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public MainActivityController mainActivityController;
    public Button btn_Editar;
    public Button btn_cancel;
    public EditText textNombre;
    public EditText textTelefono;
    public EditText textEmail;
    public EditText textDireccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityController = new MainActivityController(this);


        btn_Editar=(Button) this.findViewById(R.id.button_Editar);
        btn_cancel=(Button) this.findViewById(R.id.button_Volver);
        textNombre=(EditText) this.findViewById(R.id.editText_Name);
        textTelefono=(EditText) this.findViewById(R.id.editText_Telefono);
        textEmail=(EditText) this.findViewById(R.id.editText_Email);
        textDireccion=(EditText) this.findViewById(R.id.editText_Adress);


        btn_Editar.setOnClickListener(mainActivityController);
        btn_cancel.setOnClickListener(mainActivityController);
        textNombre.setOnClickListener(mainActivityController);
        textTelefono.setOnClickListener(mainActivityController);
        textEmail.setOnClickListener(mainActivityController);
        textDireccion.setOnClickListener(mainActivityController);
    }
}
