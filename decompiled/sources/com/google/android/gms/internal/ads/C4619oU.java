package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4619oU extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32093a;

    public C4619oU(int i10) {
        this.f32093a = i10;
    }

    public final int a() {
        return this.f32093a;
    }

    public C4619oU(int i10, String str) {
        super(str);
        this.f32093a = i10;
    }

    public C4619oU(int i10, String str, Throwable th) {
        super(str, th);
        this.f32093a = 1;
    }
}
