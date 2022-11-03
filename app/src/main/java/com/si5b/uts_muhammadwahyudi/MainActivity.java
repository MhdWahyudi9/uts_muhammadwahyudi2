package com.si5b.uts_muhammadwahyudi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etnlengkap,etnpendaftaran,;
    private Button btndaftar;
    private CheckBox cbfacebook,cbinstagram,cbwebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnlengkap = findViewById(R.id.et_nlengkap);
        etnpendaftaran = findViewById(R.id.et_npendaftaran);
        cbfacebook = (CheckBox)findViewById(R.id.cb_facebook);
        cbinstagram = (CheckBox)findViewById(R.id.cb_instagram);
        cbwebsite = (CheckBox)findViewById(R.id.cb_website);
        btn = findViewById(R.id.btn_daftar);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nlengkap = etnlengkap.getText().toString();
                etnpendaftaran = etnpendaftaran.getText().toString();

                if (nlengkap.trim().equals("")) {
                    etnlengkap.setError("Tidak Boleh Kosong");
                }

                else if (npendaftaran.trim().equals("")) {
                        etnpendaftaran.setError("Tidak Boleh Kosong");
                }

            }
        });
    }
}
