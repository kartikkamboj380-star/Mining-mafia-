package com.horcrux.svg.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.events.e;

/* JADX INFO: loaded from: classes3.dex */
public class SvgOnLayoutEvent extends e {
    public static final String EVENT_NAME = "topSvgLayout";
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f41524x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f41525y;

    public SvgOnLayoutEvent(int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i10, i11);
        this.f41524x = i12;
        this.f41525y = i13;
        this.width = i14;
        this.height = i15;
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", C1356f0.g(this.f41524x));
        writableMapCreateMap.putDouble("y", C1356f0.g(this.f41525y));
        writableMapCreateMap.putDouble("width", C1356f0.g(this.width));
        writableMapCreateMap.putDouble("height", C1356f0.g(this.height));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return EVENT_NAME;
    }
}
