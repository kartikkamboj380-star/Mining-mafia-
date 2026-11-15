package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2844aM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26492a;

    public void a() {
        this.f26492a = 0;
    }

    public final boolean b() {
        return i(4);
    }

    public final boolean c() {
        return i(1);
    }

    public final boolean d() {
        return i(536870912);
    }

    public final boolean e() {
        return i(268435456);
    }

    public final boolean f() {
        return i(67108864);
    }

    public final void g(int i10) {
        this.f26492a = i10;
    }

    public final void h(int i10) {
        this.f26492a |= 536870912;
    }

    protected final boolean i(int i10) {
        return (this.f26492a & i10) == i10;
    }
}
