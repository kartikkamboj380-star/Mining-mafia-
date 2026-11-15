package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class UR0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5623wS0 f24008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24011e;

    public UR0(C5623wS0 c5623wS0) {
        this.f24008b = c5623wS0;
    }

    public final void a(int i10) {
        this.f24007a = 1 == ((this.f24007a ? 1 : 0) | i10);
        this.f24009c += i10;
    }

    public final void b(C5623wS0 c5623wS0) {
        this.f24007a |= this.f24008b != c5623wS0;
        this.f24008b = c5623wS0;
    }

    public final void c(int i10) {
        if (this.f24010d && this.f24011e != 5) {
            AbstractC2418Ss0.a(i10 == 5);
            return;
        }
        this.f24007a = true;
        this.f24010d = true;
        this.f24011e = i10;
    }

    final /* synthetic */ boolean d() {
        return this.f24007a;
    }
}
