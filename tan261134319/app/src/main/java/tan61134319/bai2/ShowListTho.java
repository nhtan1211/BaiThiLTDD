package tan61134319.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ShowListTho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_tho);
        //
        Intent BT = getIntent();
        // Lấy ra tên BH   , ==> ten file là:  tenBT.txt
        String tenBai = BT.getStringExtra("tenBT");



    }
}