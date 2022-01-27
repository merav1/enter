package is.gravendef.enter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit_name = findViewById(R.id.edit_name);
        final EditText edit_position = findViewById(R.id.edit_position);
        Button btn = findViewById(R.id.btn_submit);
        daoemployee dao =new daoemployee();
        btn.setOnClickListener(v ->
        {
            employee emp = new employee(edit_name.getText().toString(),edit_position.getText().toString());
            dao.add(emp).addOnSuccessListener(suc->
            {
                Toast.makeText(this,"record is inserted",Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this,""+er.getMessage(),Toast.LENGTH_SHORT).show();

            });
        });
    }
}