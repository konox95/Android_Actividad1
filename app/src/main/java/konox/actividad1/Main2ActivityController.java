package konox.actividad1;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/**
 * Created by konox on 15/11/2016.
 */

public class Main2ActivityController implements View.OnClickListener {
    Main2Activity vista2;

    String titulos[];
    String contenido[];
    int contador = 0;



    public Main2ActivityController(Main2Activity vista2) {
        this.vista2 = vista2;
        titulos = new String[]{
                vista2.getResources().getString(R.string.Capitulo1),
                vista2.getResources().getString(R.string.Capitulo2),
                vista2.getResources().getString(R.string.Capitulo3)
        };
        contenido = new String[]{
                vista2.getResources().getString(R.string.text1DonQuijote),
                vista2.getResources().getString(R.string.text2DonQuijote),
                vista2.getResources().getString(R.string.text3DonQuijo)
        };
        vista2.Titulo.setText(titulos[0]);
        vista2.Contenido.setText(contenido[0]);

    }

    public void onClick(View view) {
        if (view.getId() == vista2.B_perfil.getId()) {
            Intent intent = new Intent(vista2, MainActivity.class);
            vista2.startActivity(intent);
        }
        if(view.getId() == vista2.siguiente.getId()){

            if(contador < contenido.length-1) {
                contador++;
                vista2.Contenido.setText(contenido[contador]);
                vista2.Titulo.setText(titulos[contador]);
            }

        }
        if(view.getId() == vista2.atras.getId()){

            if(contador > 0) {
                contador--;
                vista2.Contenido.setText(contenido[contador]);
                vista2.Titulo.setText(titulos[contador]);
            }

        }

    }
}
