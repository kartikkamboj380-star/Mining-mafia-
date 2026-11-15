package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ZC0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ZC0 f26135b = (ZC0) GD0.a(YC0.f25565a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f26136a = new AtomicReference(new ED0(new BD0(), null));

    public static ZC0 a() {
        return f26135b;
    }

    public final synchronized void b(AC0 ac0) {
        AtomicReference atomicReference = this.f26136a;
        BD0 bd0 = new BD0((ED0) atomicReference.get());
        bd0.a(ac0);
        atomicReference.set(new ED0(bd0, null));
    }

    public final synchronized void c(AbstractC5717xC0 abstractC5717xC0) {
        AtomicReference atomicReference = this.f26136a;
        BD0 bd0 = new BD0((ED0) atomicReference.get());
        bd0.b(abstractC5717xC0);
        atomicReference.set(new ED0(bd0, null));
    }

    public final synchronized void d(AbstractC3580gD0 abstractC3580gD0) {
        AtomicReference atomicReference = this.f26136a;
        BD0 bd0 = new BD0((ED0) atomicReference.get());
        bd0.c(abstractC3580gD0);
        atomicReference.set(new ED0(bd0, null));
    }

    public final synchronized void e(AbstractC3203dD0 abstractC3203dD0) {
        AtomicReference atomicReference = this.f26136a;
        BD0 bd0 = new BD0((ED0) atomicReference.get());
        bd0.d(abstractC3203dD0);
        atomicReference.set(new ED0(bd0, null));
    }

    public final boolean f(AD0 ad0) {
        return ((ED0) this.f26136a.get()).a(ad0);
    }

    public final AbstractC4050jy0 g(AD0 ad0, C1703Ey0 c1703Ey0) {
        return ((ED0) this.f26136a.get()).b(ad0, c1703Ey0);
    }

    public final AD0 h(AbstractC4050jy0 abstractC4050jy0, Class cls, C1703Ey0 c1703Ey0) {
        return ((ED0) this.f26136a.get()).c(abstractC4050jy0, cls, c1703Ey0);
    }

    public final boolean i(AD0 ad0) {
        return ((ED0) this.f26136a.get()).d(ad0);
    }

    public final AbstractC1495Ay0 j(AD0 ad0) {
        return ((ED0) this.f26136a.get()).e(ad0);
    }

    public final AD0 k(AbstractC1495Ay0 abstractC1495Ay0, Class cls) {
        return ((ED0) this.f26136a.get()).f(abstractC1495Ay0, cls);
    }
}
