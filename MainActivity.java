import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button Breset;
    Button Btest;
    EditText E1;
    View ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ac=(View)findViewById(R.layout.activity_main);
        Breset=(Button)findViewById(R.id.b2);
        Btest=(Button)findViewById(R.id.b1);
        E1=(EditText) findViewById(R.id.E1);
    }
    public void test(View v){
        Toast.makeText(getApplicationContext(), E1.getText(), Toast.LENGTH_SHORT ).show();
    }
    public void reset(View v){
        E1.setText("");
    }
}
