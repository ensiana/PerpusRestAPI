package id.ac.ub.restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {

    TextView judul, deskripsi;
    Button kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        kirim = findViewById(R.id.buttonkirs);
        judul = findViewById(R.id.tvjuds);
        deskripsi = findViewById(R.id.tvdesc);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}