package com.example.setoranhafalan;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RiwayatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);

        // Mendapatkan referensi ke TableLayout
        TableLayout tableLayout = findViewById(R.id.tableLayout);

        // Menambahkan data ke dalam tabel secara dinamis
        tambahDataKeTabel("21 Maret", "An-Naba", "Dwi Jelita Adhliyah", "Selesai" , tableLayout);
        tambahDataKeTabel("21 Maret", "Al-Infithar", "12250120331", "Al-Selesai" , tableLayout);
        tambahDataKeTabel("21 Maret", "Al-Zalzalah", "12250120331", "Al-Selesai" , tableLayout);


        // Anda dapat menambahkan data lain sesuai kebutuhan
    }

    // Metode untuk menambahkan baris data ke dalam tabel
    private <Surah, Mahasiswa> void tambahDataKeTabel(String Tanggal, String Nama, String Mahasiswa, String Status, TableLayout tableLayout) {
        TableRow row = new TableRow(this);

        TextView textViewTanggal = new TextView(this);
        textViewTanggal.setText(Tanggal);
        textViewTanggal.setPadding(8, 8, 8, 8);

        TextView textViewNama = new TextView(this);
        textViewNama.setText(Nama);
        textViewNama.setPadding(8, 8, 8, 8);

        TextView textViewMahasiswa = new TextView(this);
        textViewMahasiswa.setText(Mahasiswa);
        textViewMahasiswa.setPadding(8, 8, 8, 8);

        TextView textViewStatus = new TextView(this);
        textViewStatus.setText(Status);
        textViewStatus.setPadding(8, 8, 8, 8);


        // Menambahkan TextView ke dalam TableRow
        row.addView(textViewTanggal);
        row.addView(textViewNama);
        row.addView(textViewMahasiswa);
        row.addView(textViewStatus);

        // Menambahkan TableRow ke dalam TableLayout
        tableLayout.addView(row);
    }
}

