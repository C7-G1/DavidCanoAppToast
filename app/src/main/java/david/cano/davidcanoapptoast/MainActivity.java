package david.cano.davidcanoapptoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Context c = getApplicationContext();
        //Toast toast = new Toast(c);
        //toast.setDuration(Toast.LENGTH_LONG);
        //DatePicker calendario = new DatePicker(c);
        //toast.setView(calendario);
        //toast.show();
        Context c = getApplicationContext();
        Toast toast = new Toast(c);
        toast.setDuration(Toast.LENGTH_LONG);
        TimePicker reloj = new TimePicker(c);
        toast.setView(reloj);
        toast.show();
    }
    public void onPulsame(View v){
        Context contexto= getApplicationContext();
        int duracion= Toast.LENGTH_SHORT;
        Toast toast=Toast.makeText(contexto,R.string.mensaje,duracion);
        View v2=toast.getView();
        TextView tv=(TextView) v2.findViewById(android.R.id.message);
        tv.setTextColor(Color.RED);
        toast.show();

    }

}