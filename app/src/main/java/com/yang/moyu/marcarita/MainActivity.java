package com.yang.moyu.marcarita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yang.moyu.marcarita.activity.PictureSelectActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTv1;
    private TextView mTv2;
    private TextView mTv3;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        mTv1 = (TextView) findViewById(R.id.tv1);
        mTv2 = (TextView) findViewById(R.id.tv2);
        mTv3 = (TextView) findViewById(R.id.tv3);
        mTv1.setOnClickListener(this);
        mTv2.setOnClickListener(this);
        mTv3.setOnClickListener(this);
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setClickable(true);
        mBtn.setSelected(true);
        mBtn.setPressed(true);

//        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv1:
                Intent intent = new Intent(MainActivity.this, PictureSelectActivity.class);
                startActivity(intent);


                break;
            case R.id.tv2:
                break;
            case R.id.tv3:
                break;
            case R.id.btn:
                break;
        }
    }
}
