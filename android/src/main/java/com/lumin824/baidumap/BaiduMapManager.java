package com.lumin824.baidumap;

import android.graphics.Color;
import android.view.View;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by lumin on 16/7/1.
 */
public class BaiduMapManager extends SimpleViewManager<View> {

    @Override
    public String getName() {
        return "BaiduMap";
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        MapView view = new MapView(reactContext);
        return view;
    }
}
