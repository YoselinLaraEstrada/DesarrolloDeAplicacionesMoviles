package tesoem.edu.mx.crudfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.ic_add:{
                Toast.makeText(this,"Agregar",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.ic_save:{
                Toast.makeText(this,"Actualizar",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.ic_delete:{
                Toast.makeText(this,"Eliminar",Toast.LENGTH_LONG).show();
                break;
            }
            default:break;
        }

        return true;
    }

}
