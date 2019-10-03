package phb.com.explisit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    public static final String EXTRA_AGE = "12 Tahun";
    public static final String EXTRA_NAME = "Naufal Islam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TextView tvDataReceived = findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "Nama : " + name + ",\nUmur Kamu : " + age;
        tvDataReceived.setText(text);
    }
}
