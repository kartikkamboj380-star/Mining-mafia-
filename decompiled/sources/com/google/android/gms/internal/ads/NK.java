package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class NK implements J4.B, InterfaceC0580a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5492vQ f21171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3880ib0 f21172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f21173c = new AtomicBoolean(false);

    NK(C5492vQ c5492vQ, C3880ib0 c3880ib0) {
        this.f21171a = c5492vQ;
        this.f21172b = c3880ib0;
    }

    private final void b() {
        if (this.f21173c.getAndSet(true)) {
            return;
        }
        this.f21171a.d();
    }

    @Override // J4.B
    public final void B2() {
        b();
    }

    @Override // J4.B
    public final void F4() {
    }

    @Override // J4.B
    public final void H1() {
    }

    @Override // J4.B
    public final void N0() {
    }

    @Override // J4.B
    public final void S3(int i10) {
        b();
    }

    @Override // J4.B
    public final void Z1() {
    }

    @Override // J4.B
    public final void Z2() {
    }

    @Override // J4.B
    public final void Z4() {
    }

    @Override // J4.B
    public final void b4() {
    }

    @Override // J4.B
    public final void c() {
        this.f21171a.b(this.f21172b.f29455b);
    }

    @Override // H4.InterfaceC0580a
    public final void onAdClicked() {
        this.f21171a.c();
    }

    @Override // J4.B
    public final void t4() {
    }
}
