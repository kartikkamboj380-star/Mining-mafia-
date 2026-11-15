package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1356f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15573b;

    public d(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.f15572a = i12;
        this.f15573b = i13;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble("width", C1356f0.g(this.f15572a));
        writableMapCreateMap.putDouble("height", C1356f0.g(this.f15573b));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topContentSizeChange";
    }

    public d(int i10, int i11, int i12) {
        this(-1, i10, i11, i12);
    }
}
