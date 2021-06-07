package sg.edu.rp.c346.id20008460.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] examsTipsArray = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);


        examsTipsArray[0] = getString(R.string.tip1);
        examsTipsArray[1] = getString(R.string.tip2);
        examsTipsArray[2] = getString(R.string.tip3);
        examsTipsArray[3] = getString(R.string.tip4);
        examsTipsArray[4] = getString(R.string.tip5);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, examsTipsArray);

        lvExamTips.setAdapter(adapter);
    }
}