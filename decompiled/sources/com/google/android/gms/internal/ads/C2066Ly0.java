package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ly0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2066Ly0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20699a;

    public C2066Ly0(int i10) {
        this.f20699a = i10;
    }

    public C2066Ly0(String str, int i10) {
        super(str);
        this.f20699a = i10;
    }

    public C2066Ly0(String str, Throwable th, int i10) {
        super(str, th);
        this.f20699a = i10;
    }

    public C2066Ly0(Throwable th, int i10) {
        super(th);
        this.f20699a = i10;
    }
}
