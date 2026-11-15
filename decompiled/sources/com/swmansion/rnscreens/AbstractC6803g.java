package com.swmansion.rnscreens;

import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.D0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.swmansion.rnscreens.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6803g extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D0 f42347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f42349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42350d;

    public AbstractC6803g(ReactContext reactContext) {
        super(reactContext);
    }

    protected final void b(int i10, int i11, int i12) {
        c(i10, i11, i12);
    }

    public final void c(int i10, int i11, int i12) {
        float fG = C1356f0.g(i10);
        float fG2 = C1356f0.g(i11);
        float fG3 = C1356f0.g(i12);
        if (Math.abs(this.f42348b - fG) >= 0.9f || Math.abs(this.f42349c - fG2) >= 0.9f || Math.abs(this.f42350d - fG3) >= 0.9f) {
            this.f42348b = fG;
            this.f42349c = fG2;
            this.f42350d = fG3;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", fG);
            writableNativeMap.putDouble("frameHeight", fG2);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", fG3);
            D0 d10 = this.f42347a;
            if (d10 != null) {
                d10.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(@Nullable D0 d10) {
        this.f42347a = d10;
    }
}
