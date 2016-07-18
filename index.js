import {
  NativeModules,
  requireNativeComponent
} from 'react-native';

let { BaiduMapModule } = NativeModules;

export var BaiduMap = requireNativeComponent('BaiduMap');
