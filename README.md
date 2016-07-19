# react-native-baidumap

## iOS 配置
1. Framework Search Paths 增加 $(SRCROOT)/../node_modules/react-native-baidumap/ios
2. Other Linker Flags 增加 -framework BaiduMapAPI_Base 和 -framework BaiduMapAPI_Map

## Android 配置
1. gradle.properties 文件增加 BAIDU_MAP_API_KEY
