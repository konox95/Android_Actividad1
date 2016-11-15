package konox.actividad1;

import android.content.Intent;
import android.view.View;

/**
 * Created by konox on 08/11/2016.
 */

public class MainActivityController implements View.OnClickListener {
    MainActivity vista;
    public MainActivityController(MainActivity vista){
    this.vista=vista;
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == vista.btn_Editar.getId()) {
            vista.btn_Editar.setText("Guardar");
            vista.btn_cancel.setText("Cancelar");
            vista.textNombre.setEnabled(true);
            vista.textTelefono.setEnabled(true);
            vista.textEmail.setEnabled(true);
            vista.textDireccion.setEnabled(true);
        }

        if (view.getId() == vista.btn_cancel.getId() && vista.btn_cancel.getText().toString().equals("Volver")) {
            Intent inten = new Intent(vista, Main2Activity.class);
            vista.startActivity(inten);
        }else if(view.getId() == vista.btn_cancel.getId() && vista.btn_cancel.getText().toString().equals("Cancelar")){
            vista.btn_Editar.setText("Editar");
            vista.btn_cancel.setText("Volver");
            vista.textNombre.setEnabled(false);
            vista.textTelefono.setEnabled(false);
            vista.textEmail.setEnabled(false);
            vista.textDireccion.setEnabled(false);
        }

    }
}
