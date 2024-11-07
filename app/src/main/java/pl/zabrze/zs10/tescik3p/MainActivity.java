package pl.zabrze.zs10.tescik3p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Pytanie> pytania = new ArrayList<>();
    private TextView textView;
    private RadioButton[] radioButtons = new RadioButton[3];

    private Button buttonSprawdz;
    private Button buttonDalej;

    private RadioGroup radioGroup;

    private int aktualne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pytania.add(new Pytanie("Na jakim systemie operacyjnym został zbudowany Android",
                "Windows", "Dos", "Linux", 2));
        pytania.add(new Pytanie("Nazwa wersji Andorida to często",
                "ciasteczko.", "owoc", "warzywko", 0));
        pytania.add(new Pytanie("Językiem rekomendowanym przez Google do pisania \n aplikacji na Androida  jest",
                "Java", "Kotlin", "C++", 1));
        textView = findViewById(R.id.textViewPytanie);
        radioButtons[0] = findViewById(R.id.radioButton);
        radioButtons[1] = findViewById(R.id.radioButton2);
        radioButtons[2] = findViewById(R.id.radioButton3);
        radioGroup = findViewById(R.id.radioGroup);
        buttonDalej = findViewById(R.id.buttonDalej);
        buttonSprawdz = findViewById(R.id.buttonSprawdz);
        wyswietlPytanie();




    }
    private void wyswietlPytanie(){
        Pytanie pytanie = pytania.get(aktualne);
        textView.setText(pytanie.getTrescPytania());

        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i].setText(pytanie.getOdpowiedzi()[i]);
        }
    }

}