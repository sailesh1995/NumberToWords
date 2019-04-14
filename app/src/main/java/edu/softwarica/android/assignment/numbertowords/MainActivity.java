package edu.softwarica.android.assignment.numbertowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    NumberToWords numberToWords;
    EditText etxt_number;
    TextView txt_words;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         numberToWords =  new NumberToWords();

        etxt_number = findViewById(R.id.etxt_number);
        txt_words = findViewById(R.id.txt_words);
        btn_convert = findViewById(R.id.btn_convert);
        btn_convert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String words;
        switch (v.getId()) {
            case R.id.btn_convert:
                words = numberToWords.converter(Integer.parseInt(etxt_number.getText().toString()));
                txt_words.setText(words);
                break;
            default:;
                break;
        }
    }
}
