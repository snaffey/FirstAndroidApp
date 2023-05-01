
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainIntA extends AppCompatActivity {

    Button btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainsoma);

        btnB = (Button) findViewById(R.id.btnActB);

        btnB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        new Intent(origem, destino);

        Intent intent = new Intent(MainIntA.this, MainIntB.class);
        startActivity(intent);

    }
}
