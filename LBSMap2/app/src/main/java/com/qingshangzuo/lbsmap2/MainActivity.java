package com.qingshangzuo.lbsmap2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;

public class MainActivity extends Activity {

    //地图控件
    private MapView mapView;
    //百度地图
    private BaiduMap baiduMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         *   百度地图SDK的全局初始化
         *   必须在布局前面，否则会报错：报错提示：xml 的第8行问题
         */
        //SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        SDKInitializer.initialize(getApplicationContext());
        mapView = findViewById(R.id.bmapView);

    }

}
