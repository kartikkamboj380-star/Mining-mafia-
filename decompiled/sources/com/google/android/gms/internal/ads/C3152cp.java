package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3152cp {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3152cp f27221d = new C3152cp(0, 0, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f27224c;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public C3152cp(int i10, int i11, float f10) {
        this.f27222a = i10;
        this.f27223b = i11;
        this.f27224c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3152cp) {
            C3152cp c3152cp = (C3152cp) obj;
            if (this.f27222a == c3152cp.f27222a && this.f27223b == c3152cp.f27223b && this.f27224c == c3152cp.f27224c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f27222a + 217) * 31) + this.f27223b) * 31) + Float.floatToRawIntBits(this.f27224c);
    }
}
