package lockdown.org.gridviewdemoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity
{
    GridView gvCourses;
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        gvCourses = findViewById(R.id.gvCourses);
        ArrayList al = new ArrayList();
        al.add("Vegetable ");
        al.add("Potato ");
        al.add("Fruit ");
        al.add("Apple ");
        al.add("Place ");
        al.add("Bhubaneswar ");
        al.add("Animal ");
        al.add("Lion ");
        al.add("Bird ");
        al.add("Sparrow ");


        ArrayAdapter aa = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,al);
        gvCourses.setAdapter(aa);
        gvCourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                TextView tv = (TextView)view;
                String data = tv.getText().toString();
                Toast.makeText(MainActivity.this,"Selected Course : "+data,Toast.LENGTH_LONG).show();
            }
        });
    }
}