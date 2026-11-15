package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1356f0;
import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    public static final Map a(a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return E.j(p129m8.q.a("top", Float.valueOf(C1356f0.g(insets.d()))), p129m8.q.a("right", Float.valueOf(C1356f0.g(insets.c()))), p129m8.q.a("bottom", Float.valueOf(C1356f0.g(insets.a()))), p129m8.q.a("left", Float.valueOf(C1356f0.g(insets.b()))));
    }

    public static final WritableMap b(a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble("top", C1356f0.g(insets.d()));
        writableMapCreateMap.putDouble("right", C1356f0.g(insets.c()));
        writableMapCreateMap.putDouble("bottom", C1356f0.g(insets.a()));
        writableMapCreateMap.putDouble("left", C1356f0.g(insets.b()));
        return writableMapCreateMap;
    }

    public static final Map c(c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return E.j(p129m8.q.a("x", Float.valueOf(C1356f0.g(rect.c()))), p129m8.q.a("y", Float.valueOf(C1356f0.g(rect.d()))), p129m8.q.a("width", Float.valueOf(C1356f0.g(rect.b()))), p129m8.q.a("height", Float.valueOf(C1356f0.g(rect.a()))));
    }

    public static final WritableMap d(c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble("x", C1356f0.g(rect.c()));
        writableMapCreateMap.putDouble("y", C1356f0.g(rect.d()));
        writableMapCreateMap.putDouble("width", C1356f0.g(rect.b()));
        writableMapCreateMap.putDouble("height", C1356f0.g(rect.a()));
        return writableMapCreateMap;
    }
}
