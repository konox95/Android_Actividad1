package konox.actividad1;

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
    }
}
