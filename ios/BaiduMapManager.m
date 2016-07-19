#import "RCTViewManager.h"
#import <MapKit/MapKit.h>

@interface BaiduMapManager : RCTViewManager

@end

@implementation BaiduMapManager

RCT_EXPORT_MODULE()

- (UIView *)view
{
  return [[MKMapView alloc] init];
}



@end
