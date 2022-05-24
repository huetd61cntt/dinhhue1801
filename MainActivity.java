package cau2.thd61133694;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> listSong =  new ArrayList<String>();
        listSong.add("To_Huu");
        listSong.add("Tu_ay");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listSong);
        listSong.add("To_Huu");
        listSong.add("Bac_oi");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2,listSong);
        ListView lv= (ListView)findViewById(R.id.listView_Cac_cai_tho);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String tenBaiTho = listSong.get(i);
                // Chuyển Activity
                Intent intentBH = new Intent(MainActivity.this, ShowLyricActivity.class);
                // gói tên vào
                intentBT.putExtra("tenBT",tenBaiTho);
                // Đẩy sang
                startActivity(intentBT);
            }
        });
    }


}