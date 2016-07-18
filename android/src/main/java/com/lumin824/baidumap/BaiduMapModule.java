package com.lumin824.baidumap;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class BaiduMapModule extends ReactContextBaseJavaModule {

  public BaiduMapModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName(){
    return "BaiduMapModule";
  }

  @ReactMethod
  public void test(Promise promise){
    promise.resolve("ok");
  }
}
