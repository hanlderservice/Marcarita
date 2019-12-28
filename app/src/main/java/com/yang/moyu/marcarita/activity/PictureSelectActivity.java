package com.yang.moyu.marcarita.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.yang.moyu.marcarita.R;
import com.yang.moyu.marcarita.adapter.PictureSelectAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description : 照片选择
 * Created by 10296 on 2019/12/12
 */
public class PictureSelectActivity extends AppCompatActivity {
    private GridView mGdView;
    private List datas = new ArrayList();
    private PictureSelectAdapter selectAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_select);
        initView();
    }

    private void initView() {
        mGdView = (GridView) findViewById(R.id.gd_view);
        selectAdapter = new PictureSelectAdapter(this, datas);
        mGdView.setAdapter(selectAdapter);
        mGdView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == parent.getChildCount() - 1) {
                    Toast.makeText(PictureSelectActivity.this, "添加图片", Toast.LENGTH_SHORT).show();
                } else {

                }
            }
        });

    }
}
