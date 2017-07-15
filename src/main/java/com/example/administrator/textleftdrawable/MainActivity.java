package com.example.administrator.textleftdrawable;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView textView;
    private Button btnGreen;
    private Button btnRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        textView = (TextView)findViewById(R.id.tv_show);
        btnGreen = (Button)findViewById(R.id.btn_green);
        btnGreen.setOnClickListener(this);
        btnRed = (Button)findViewById(R.id.btn_red);
        btnRed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_green:
                textView.setTextColor(Color.GREEN);
                Drawable img = getResources().getDrawable(R.mipmap.normal);
                img.setBounds(0, 0, img.getMinimumWidth(), img.getMinimumHeight());
                textView.setCompoundDrawables(img, null, null, null);
                break;
            case R.id.btn_red:
                textView.setTextColor(Color.RED);
                Drawable img2 = getResources().getDrawable(R.mipmap.change);
                img2.setBounds(0, 0, img2.getMinimumWidth(), img2.getMinimumHeight());
                textView.setCompoundDrawables(img2, null, null, null);
                break;
        }
    }
}
