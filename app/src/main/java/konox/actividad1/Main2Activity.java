package konox.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public Main2ActivityController main2ActivityController;
    public Button B_perfil;
    public EditText Titulo;
    public TextView Contenido;
    public Button siguiente;
    public Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        B_perfil =(Button) this.findViewById(R.id.Button_Perfil);
        siguiente =(Button) this.findViewById(R.id.siguiente);
        atras =(Button) this.findViewById(R.id.atras);
        Titulo = (EditText) this.findViewById(R.id.editText_capitulos);
        Contenido = (TextView) this.findViewById(R.id.contenido);


        main2ActivityController = new Main2ActivityController(this);

        B_perfil.setOnClickListener(main2ActivityController);
        siguiente.setOnClickListener(main2ActivityController);
        atras.setOnClickListener(main2ActivityController);
        Titulo.setOnClickListener(main2ActivityController);
        Contenido.setOnClickListener(main2ActivityController);



    }
}
