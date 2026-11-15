package com.facebook.react.views.virtualview;

import android.graphics.Rect;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1356f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableMap b(Rect rect) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        C1356f0 c1356f0 = C1356f0.f15679a;
        writableMapCreateMap.putDouble("x", c1356f0.e(rect.left));
        writableMapCreateMap.putDouble("y", c1356f0.e(rect.top));
        writableMapCreateMap.putDouble("width", c1356f0.e(rect.width()));
        writableMapCreateMap.putDouble("height", c1356f0.e(rect.height()));
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }
}
