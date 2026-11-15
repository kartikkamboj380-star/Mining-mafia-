package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Br0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1533Br0 extends AbstractC3284ds0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder f17718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f17721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f17723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f17724g;

    C1533Br0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3284ds0
    public final AbstractC3284ds0 a(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.f17718a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3284ds0
    public final AbstractC3284ds0 b(String str) {
        this.f17719b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3284ds0
    public final AbstractC3284ds0 c(int i10) {
        this.f17720c = i10;
        this.f17724g = (byte) (this.f17724g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3284ds0
    public final AbstractC3284ds0 d(float f10) {
        this.f17721d = f10;
        this.f17724g = (byte) (this.f17724g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3284ds0
    public final AbstractC3284ds0 e(int i10) {
        this.f17724g = (byte) (this.f17724g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3284ds0
    public final AbstractC3284ds0 f(int i10) {
        this.f17724g = (byte) (this.f17724g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3284ds0
    public final AbstractC3284ds0 g(int i10) {
        this.f17722e = i10;
        this.f17724g = (byte) (this.f17724g | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3284ds0
    public final AbstractC3284ds0 h(String str) {
        this.f17723f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3284ds0
    public final AbstractC3410es0 i() {
        IBinder iBinder;
        if (this.f17724g == 31 && (iBinder = this.f17718a) != null) {
            return new C1585Cr0(iBinder, this.f17719b, this.f17720c, this.f17721d, 0, 0, null, this.f17722e, null, this.f17723f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f17718a == null) {
            sb.append(" windowToken");
        }
        if ((this.f17724g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f17724g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f17724g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f17724g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f17724g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
