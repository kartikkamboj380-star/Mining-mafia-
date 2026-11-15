package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3269dk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27500b;

    public C3269dk0() {
        this.f27499a = null;
        this.f27500b = -1L;
    }

    public final String a() {
        return this.f27499a;
    }

    public final long b() {
        return this.f27500b;
    }

    public final boolean c() {
        return this.f27499a != null && this.f27500b > 0;
    }

    public C3269dk0(String str, long j10) {
        this.f27499a = str;
        this.f27500b = j10;
    }
}
