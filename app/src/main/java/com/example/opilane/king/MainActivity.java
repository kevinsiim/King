package com.example.opilane.king;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //A list of objects in the type king is created, which is the programs data source
    private List<King> kings=(new Kings()).getKings();
    private List<String>  lines=new ArrayList<>();
    private ListView view,view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=findViewById(R.id.lstKings1);
        view2=findViewById(R.id.lstKings2);

        view2.setAdapter(new ArrayAdapter<King>(this, android.R.layout.simple_list_item_multiple_choice,kings));
        view2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                update(kings.get(position));

            }
        });



    }
    public void update(King king){
        String line=toString(king);
        if(!lines.remove(line)) lines.add(line);
        view.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, lines));
    }
    private String toString(King king){
        if(king.getFrom() !=0 && king.getTo() != 9999) {
            return String.format("%s: %d - %d", king.getName(), king.getFrom(), king.getTo());
        }
        if (king.getFrom() !=0){
                return String.format("%s: %d -", king.getName(), king.getFrom());
            }
            if (king.getTo() != 9999){
                return String.format("%s - %d",king.getName(), king.getTo());
            }
            return king.getName();
        }
    }
}
