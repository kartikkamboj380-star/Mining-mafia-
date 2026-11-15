package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2815a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26433a;

    public C2815a8(int i10, int i11) {
        this.f26433a = i11;
    }

    public final int a() {
        int i10 = this.f26433a;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
