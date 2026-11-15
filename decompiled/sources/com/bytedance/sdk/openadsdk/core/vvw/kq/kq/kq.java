package com.bytedance.sdk.openadsdk.core.vvw.kq.kq;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static com.bytedance.sdk.openadsdk.core.vvw.bob kq(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        csi.kq kqVar;
        int i10;
        byte b10;
        if (context == null) {
            csi.kq(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        int i13 = (int) (i11 / f10);
        int i14 = (int) (i12 / f10);
        float f11 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.vvw.bob bobVar = null;
        while (true) {
            int i15 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return bobVar;
            }
            xmlPullParser.next();
            int i16 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = csi.rjo;
                int iOq = csi.oq(xmlPullParser.getAttributeValue(str, "width"));
                int iOq2 = csi.oq(xmlPullParser.getAttributeValue(str, "height"));
                if (iOq < 300 || iOq2 < 250) {
                    csi.kq(xmlPullParser);
                    f11 = f11;
                    bobVar = bobVar;
                } else {
                    csi.kq kqVar2 = new csi.kq();
                    while (true) {
                        if (xmlPullParser.getEventType() != i15 || !xmlPullParser.getName().equals("Companion")) {
                            iOq2 = iOq2;
                            iOq = iOq;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i16) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                f11 = f11;
                                bobVar = bobVar;
                                byte b11 = -1;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            b10 = 0;
                                            b11 = b10;
                                            break;
                                        }
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            b10 = 1;
                                            b11 = b10;
                                            break;
                                        }
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            b11 = 2;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            b11 = 3;
                                        }
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            b10 = 4;
                                            b11 = b10;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            b10 = 5;
                                            b11 = b10;
                                            break;
                                        }
                                        break;
                                }
                                switch (b11) {
                                    case 0:
                                        csi.kq kqVar3 = kqVar2;
                                        i10 = 2;
                                        Point pointKq = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.kq(context, iOq, iOq2, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.HTML_RESOURCE);
                                        int i17 = pointKq.x;
                                        int i18 = pointKq.y;
                                        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq oqVar = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.IFRAME_RESOURCE;
                                        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.NONE;
                                        float fKq = com.bytedance.sdk.openadsdk.core.vvw.bob.kq(i13, i14, i17, i18, oqVar, enumC0289kq);
                                        String strOq = csi.oq(xmlPullParser, "IFrameResource");
                                        if (!TextUtils.isEmpty(strOq) && fKq > kqVar3.rjo && fKq > f11) {
                                            kqVar3.rjo = fKq;
                                            kqVar3.kq(strOq, enumC0289kq, oqVar);
                                            kqVar2 = kqVar3;
                                            i16 = i10;
                                            iOq = iOq;
                                            iOq2 = iOq2;
                                            f11 = f11;
                                            bobVar = bobVar;
                                            i15 = 3;
                                        } else {
                                            csi.kq(xmlPullParser, "IFrameResource", 3);
                                            kqVar2 = kqVar3;
                                            i15 = 3;
                                            i16 = 2;
                                        }
                                        break;
                                    case 1:
                                        i10 = 2;
                                        kqVar2.fou = csi.oq(xmlPullParser, "CompanionClickThrough");
                                        i16 = i10;
                                        iOq = iOq;
                                        iOq2 = iOq2;
                                        f11 = f11;
                                        bobVar = bobVar;
                                        i15 = 3;
                                        break;
                                    case 2:
                                        kqVar = kqVar2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                kqVar2 = kqVar;
                                                iOq2 = iOq2;
                                                f11 = f11;
                                                bobVar = bobVar;
                                                i15 = 3;
                                                i16 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                kqVar.oq(csi.oq(xmlPullParser, "Tracking"));
                                            }
                                        }
                                        break;
                                    case 3:
                                        kqVar = kqVar2;
                                        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq2 = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(csi.rjo, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.kq;
                                        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq3 = set.contains(lowerCase) ? com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.IMAGE : com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.JAVASCRIPT;
                                        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq oqVar2 = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.STATIC_RESOURCE;
                                        Point pointKq2 = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.kq(context, iOq, iOq2, oqVar2);
                                        float fKq2 = com.bytedance.sdk.openadsdk.core.vvw.bob.kq(i13, i14, pointKq2.x, pointKq2.y, oqVar2, enumC0289kq3);
                                        String strOq2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.contains(lowerCase)) ? csi.oq(xmlPullParser, "StaticResource") : null;
                                        if (fKq2 >= kqVar.rjo && fKq2 > f11 && !TextUtils.isEmpty(strOq2)) {
                                            kqVar.rjo = fKq2;
                                            kqVar.kq(strOq2, enumC0289kq3, oqVar2);
                                            kqVar2 = kqVar;
                                            iOq2 = iOq2;
                                            f11 = f11;
                                            bobVar = bobVar;
                                            i15 = 3;
                                            i16 = 2;
                                        } else {
                                            csi.kq(xmlPullParser, "StaticResource", 3);
                                            iOq = iOq;
                                            kqVar2 = kqVar;
                                            iOq2 = iOq2;
                                            f11 = f11;
                                            i16 = 2;
                                            i15 = 3;
                                            bobVar = bobVar;
                                        }
                                        break;
                                    case 4:
                                        kqVar2.kq(csi.oq(xmlPullParser, "CompanionClickTracking"));
                                        iOq2 = iOq2;
                                        f11 = f11;
                                        bobVar = bobVar;
                                        i15 = 3;
                                        i16 = 2;
                                        break;
                                    case 5:
                                        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq oqVar3 = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.HTML_RESOURCE;
                                        Point pointKq3 = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.kq(context, iOq, iOq2, oqVar3);
                                        int i19 = pointKq3.x;
                                        int i20 = pointKq3.y;
                                        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq4 = com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.NONE;
                                        kqVar = kqVar2;
                                        float fKq3 = com.bytedance.sdk.openadsdk.core.vvw.bob.kq(i13, i14, i19, i20, oqVar3, enumC0289kq4);
                                        String strOq3 = csi.oq(xmlPullParser, "HTMLResource");
                                        if (!TextUtils.isEmpty(strOq3) && fKq3 > kqVar.rjo && fKq3 > f11) {
                                            kqVar.rjo = fKq3;
                                            kqVar.kq(strOq3, enumC0289kq4, oqVar3);
                                            kqVar2 = kqVar;
                                            iOq2 = iOq2;
                                            f11 = f11;
                                            bobVar = bobVar;
                                            i15 = 3;
                                            i16 = 2;
                                        } else {
                                            csi.kq(xmlPullParser, "HTMLResource", 3);
                                            kqVar2 = kqVar;
                                            i16 = 2;
                                            i15 = 3;
                                        }
                                        break;
                                    default:
                                        csi.kq(xmlPullParser);
                                        kqVar = kqVar2;
                                        kqVar2 = kqVar;
                                        iOq2 = iOq2;
                                        f11 = f11;
                                        bobVar = bobVar;
                                        i15 = 3;
                                        i16 = 2;
                                        break;
                                }
                            } else {
                                iOq = iOq;
                                iOq2 = iOq2;
                            }
                        } else if (!TextUtils.isEmpty(kqVar2.kq) && kqVar2.rjo >= f11) {
                            com.bytedance.sdk.openadsdk.core.vvw.bob bobVar2 = new com.bytedance.sdk.openadsdk.core.vvw.bob(iOq, iOq2, kqVar2.oq, kqVar2.bob, kqVar2.kq, kqVar2.csi, kqVar2.rhi, kqVar2.fou);
                            f11 = kqVar2.rjo;
                            bobVar = bobVar2;
                        }
                    }
                }
            } else {
                f11 = f11;
                bobVar = bobVar;
            }
        }
    }
}
