package com.example.mylandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img_info;
    TextView txt_info;
    Button btn_info_back;
    int image = 0;
    int imgs[] = {R.drawable.info1 ,R.drawable.info2 ,R.drawable.info3 ,R.drawable.info4 ,R.drawable.info5 ,};

    String txts[] = {"탑골공원 지도","탑골공원 보덕사","안내문","탑골공원 클라이밍장","탑골공원 삼일문"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        img_info = findViewById(R.id.img_info);
        txt_info = findViewById(R.id.txt_info);
        btn_info_back = findViewById(R.id.btn_info_back);
        img_info.setImageResource(imgs[image]);
        txt_info.setText(txts[image]);
        img_info.setOnClickListener(this);
        btn_info_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btn_info_back){
            finish();
        }else if(view.getId()==R.id.img_info){
            image=++image%5;
            img_info.setImageResource(imgs[image]);
            txt_info.setText(txts[image]);
        }
    }
}