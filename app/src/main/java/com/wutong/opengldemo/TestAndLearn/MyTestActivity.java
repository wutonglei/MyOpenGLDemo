package com.wutong.opengldemo.TestAndLearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wutong.opengldemo.R;

public class MyTestActivity extends AppCompatActivity {
    /**
     * 1、创建一个View命名为DGLView继承GLSurfaceView实现Renderer接口；

     2、创建一个Renderer命名为DGLRender实现Renderer接口。
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_test);
    }
}
