package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3174d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2495Uf f27267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f27268b;

    public C3174d(C2495Uf c2495Uf, int[] iArr, int i10) {
        if (iArr.length == 0) {
            YU.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f27267a = c2495Uf;
        this.f27268b = iArr;
    }
}
