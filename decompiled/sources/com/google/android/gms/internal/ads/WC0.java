package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class WC0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WC0 f24729b = new WC0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f24730a = new AtomicReference(new C4963rD0(new C4586oD0(null), null));

    WC0() {
    }

    public static WC0 a() {
        return f24729b;
    }

    public final synchronized void b(AbstractC4460nD0 abstractC4460nD0) {
        AtomicReference atomicReference = this.f24730a;
        C4586oD0 c4586oD0 = new C4586oD0((C4963rD0) atomicReference.get(), null);
        c4586oD0.a(abstractC4460nD0);
        atomicReference.set(new C4963rD0(c4586oD0, null));
    }

    public final synchronized void c(InterfaceC5341uD0 interfaceC5341uD0) {
        AtomicReference atomicReference = this.f24730a;
        C4586oD0 c4586oD0 = new C4586oD0((C4963rD0) atomicReference.get(), null);
        c4586oD0.b(interfaceC5341uD0);
        atomicReference.set(new C4963rD0(c4586oD0, null));
    }

    public final Object d(AbstractC4050jy0 abstractC4050jy0, Class cls) {
        return ((C4963rD0) this.f24730a.get()).b(abstractC4050jy0, cls);
    }

    public final Object e(BC0 bc0, JC0 jc0, Class cls) {
        return ((C4963rD0) this.f24730a.get()).c(bc0, jc0, cls);
    }
}
