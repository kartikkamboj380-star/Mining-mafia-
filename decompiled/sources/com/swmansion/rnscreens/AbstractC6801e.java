package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.D0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.swmansion.rnscreens.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6801e extends ViewGroup {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f42333f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D0 f42334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f42336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f42338e;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbstractC6801e(Context context) {
        super(context);
    }

    private final void b(int i10, int i11, int i12, int i13) {
        float fG = C1356f0.g(i10);
        float fG2 = C1356f0.g(i11);
        float fG3 = C1356f0.g(i12);
        float fG4 = C1356f0.g(i13);
        if (Math.abs(this.f42335b - fG) >= 0.9f || Math.abs(this.f42336c - fG2) >= 0.9f || Math.abs(this.f42337d - fG3) >= 0.9f || Math.abs(this.f42338e - fG4) >= 0.9f) {
            this.f42335b = fG;
            this.f42336c = fG2;
            this.f42337d = fG3;
            this.f42338e = fG4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", fG);
            writableNativeMap.putDouble("frameHeight", fG2);
            writableNativeMap.putDouble("paddingStart", fG3);
            writableNativeMap.putDouble("paddingEnd", fG4);
            D0 d10 = this.f42334a;
            if (d10 != null) {
                d10.updateState(writableNativeMap);
            }
        }
    }

    public final void a(int i10, int i11, int i12, int i13) {
        b(i10, i11, i12, i13);
    }

    public final void setStateWrapper(@Nullable D0 d10) {
        this.f42334a = d10;
    }
}
