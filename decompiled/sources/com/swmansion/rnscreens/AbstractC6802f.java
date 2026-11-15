package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.D0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.swmansion.rnscreens.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6802f extends ViewGroup {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f42340f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D0 f42341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f42343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f42345e;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbstractC6802f(Context context) {
        super(context);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        float fG = C1356f0.g(i10);
        float fG2 = C1356f0.g(i11);
        float fG3 = C1356f0.g(i12);
        float fG4 = C1356f0.g(i13);
        if (Math.abs(this.f42342b - fG) >= 0.9f || Math.abs(this.f42343c - fG2) >= 0.9f || Math.abs(this.f42344d - fG3) >= 0.9f || Math.abs(this.f42345e - fG4) >= 0.9f) {
            this.f42342b = fG;
            this.f42343c = fG2;
            this.f42344d = fG3;
            this.f42345e = fG4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", fG);
            writableNativeMap.putDouble("frameHeight", fG2);
            writableNativeMap.putDouble("contentOffsetX", fG3);
            writableNativeMap.putDouble("contentOffsetY", fG4);
            D0 d10 = this.f42341a;
            if (d10 != null) {
                d10.updateState(writableNativeMap);
            }
        }
    }

    protected final void b(int i10, int i11, int i12, int i13) {
        a(i10, i11, i12, i13);
    }

    public final void setStateWrapper(@Nullable D0 d10) {
        this.f42341a = d10;
    }
}
