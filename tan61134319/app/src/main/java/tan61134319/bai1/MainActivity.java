package tan61134319.bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import tan611134319.bai1.R;


public class MainActivity extends AppCompatActivity {

    EditText nhapa, nhapb, nhaph;
    Button tinhChuvi = (Button)findViewById(R.id.tinhChuVi), tinhDientich;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nhapa = (EditText)findViewById(R.id.nhapa);
        nhapb = (EditText)findViewById(R.id.nhapb);
        nhaph = (EditText)findViewById(R.id.nhaph);
        tinhDientich = (Button)findViewById(R.id.tinhDienTich);
        ketqua = (TextView)findViewById(R.id.ketqua);

        tinhChuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int canha = Integer.parseInt(nhapa.getText().toString());
                int canhb = Integer.parseInt(nhapb.getText().toString());
                int kqua = (canha + canhb) / 2;
                ketqua.setText("Chu vi hinh hinh binh hanh la: " + kqua);
            }
        });


        tinhDientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int canha = Integer.parseInt(nhapa.getText().toString());
                int canhh = Integer.parseInt(nhaph.getText().toString());

                int kqua = canha * canhh;
                ketqua.setText("Dien tich hinh binh hanh la: " + kqua);

            }
        });



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}