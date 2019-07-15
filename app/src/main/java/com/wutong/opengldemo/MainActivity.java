package com.wutong.opengldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.wutong.opengldemo.TestAndLearn.MyTestActivity;
import com.wutong.opengldemo.demo.MyLesson1.Lesson1Activity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @BindView(R.id.start_lv)
    ListView startLv;

    MyListViewAdapter adapter;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        adapter = new MyListViewAdapter(this);
        startLv.setAdapter(adapter);
        startLv.setOnItemClickListener(this);
        //测试


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                i = new Intent(MainActivity.this, Lesson1Activity.class);
                startActivity(i);
                break;
            case 1:
                i = new Intent(MainActivity.this, MyTestActivity.class);
                startActivity(i);
                break;

        }
    }
}
