package com.rizkykhapidsyah.p_alertdialog__jvm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button B_AlertDemo_IDJAVA;
    TextView TV_Info_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV_Info_IDJAVA = findViewById(R.id.TV_Info_IDXML);
        B_AlertDemo_IDJAVA = findViewById(R.id.B_AlertDemo_IDXML);

        B_AlertDemo_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder PembentukDialogPeringatan = new AlertDialog.Builder(MainActivity.this);

                PembentukDialogPeringatan.setTitle("Keluar?");
                PembentukDialogPeringatan.setIcon(R.drawable.ic_launcher_background);
                PembentukDialogPeringatan.setMessage("Yakin ingin keluar dari aplikasi?");
                PembentukDialogPeringatan.setCancelable(false);

                PembentukDialogPeringatan.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                PembentukDialogPeringatan.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Anda Memilik Tidak", Toast.LENGTH_LONG).show();
                    }
                });

                PembentukDialogPeringatan.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Anda Memilih Batal", Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog PenampilFialogPeringatan = PembentukDialogPeringatan.create();
                PenampilFialogPeringatan.show();
            }
        });

    }
}
