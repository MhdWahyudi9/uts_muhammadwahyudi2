package com.si5b.uts_muhammadwahyudi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et_NL,et_NP;
    private Button btn_DAFTAR;
    private CheckBox cb_facebook,cb_instagram,cb_website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_NL = findViewById(R.id.et_NL);
        et_NP = findViewById(R.id.et_NP);
        cb_facebook = findViewById(R.id.cb_facebook);
        cb_instagram = findViewById(R.id.cb_instagram);
        cb_website = findViewById(R.id.cb_website);
        btn_DAFTAR = findViewById(R.id.btn_DAFTAR);
        btn_DAFTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NL, NP, DAFTAR, facebook, instagram, website;
                int selectedID;
                NL = et_NL.getText().toString();
                NP = et_NP.getText().toString();
                DAFTAR = btn_DAFTAR.getText().toString();
                facebook = cb_facebook.getText().toString();
                instagram = cb_instagram.getText().toString();
                website = cb_website.getText().toString();

                if (NL.trim().equals("")) {
                    et_NL.setError("Error");
                }

                else if (NP.trim().equals("")) {
                        et_NL.setError("Error");
                }

            }
        });
    }
}