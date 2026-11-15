package com.facebook.react.views.virtualview;

import android.graphics.Rect;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f16486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReadableMap f16488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReadableMap f16489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, int i11, f mode, Rect targetRect, Rect thresholdRect, boolean z9) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(targetRect, "targetRect");
        Intrinsics.checkNotNullParameter(thresholdRect, "thresholdRect");
        this.f16486a = mode;
        this.f16487b = z9;
        this.f16488c = h.b(targetRect);
        this.f16489d = h.b(thresholdRect);
    }

    @Override // com.facebook.react.uimanager.events.e
    protected boolean experimental_isSynchronous() {
        return this.f16487b;
    }

    @Override // com.facebook.react.uimanager.events.e
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("mode", this.f16486a.d());
        writableMapCreateMap.putMap("targetRect", this.f16488c);
        writableMapCreateMap.putMap("thresholdRect", this.f16489d);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "modeChange";
    }
}
