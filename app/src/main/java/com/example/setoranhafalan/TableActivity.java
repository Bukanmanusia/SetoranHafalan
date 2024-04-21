package com.example.setoranhafalan;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);

        // Mendapatkan referensi ke TableLayout
        TableLayout tableLayout = findViewById(R.id.tableLayout);

        // Menambahkan data ke dalam tabel secara dinamis
        tambahDataKeTabel("1", "Dwi Jelita Adhliyah", "12250120331", "An-Naba" , tableLayout);
        tambahDataKeTabel("2", "Dwi Jelita Adhliyah", "12250120331", "Al-Infitar" , tableLayout);
        tambahDataKeTabel("3", "Dwi Jelita Adhliyah", "12250120331", "Al-Zalzalah" , tableLayout);


        // Anda dapat menambahkan data lain sesuai kebutuhan
    }

    // Metode untuk menambahkan baris data ke dalam tabel
    private <Surah, Mahasiswa> void tambahDataKeTabel(String No, String Nama, String NIM, String Tersetor, TableLayout tableLayout) {
        TableRow row = new TableRow(this);

        TextView textViewNo = new TextView(this);
        textViewNo.setText(No);
        textViewNo.setPadding(8, 8, 8, 8);

        TextView textViewNama = new TextView(this);
        textViewNama.setText(Nama);
        textViewNama.setPadding(8, 8, 8, 8);

        TextView textViewNIM = new TextView(this);
        textViewNIM.setText(NIM);
        textViewNIM.setPadding(8, 8, 8, 8);

        TextView textViewTersetor = new TextView(this);
        textViewTersetor.setText(Tersetor);
        textViewTersetor.setPadding(8, 8, 8, 8);


        // Menambahkan TextView ke dalam TableRow
        row.addView(textViewNo);
        row.addView(textViewNama);
        row.addView(textViewNIM);
        row.addView(textViewTersetor);

        // Menambahkan TableRow ke dalam TableLayout
        tableLayout.addView(row);
    }
}

