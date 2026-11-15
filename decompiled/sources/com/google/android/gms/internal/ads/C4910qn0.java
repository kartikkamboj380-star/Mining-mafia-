package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4910qn0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1571Ck0 f32726f;

    C4910qn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, C1571Ck0 c1571Ck0, C5043rr0 c5043rr0) {
        super("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(116));
        this.f32726f = c1571Ck0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        Object[] objArr = (Object[]) method.invoke("", this.f32726f.k0());
        objArr.getClass();
        synchronized (c1966Ka) {
            c1966Ka.q0((String) objArr[0]);
            c1966Ka.g0((String) objArr[1]);
        }
    }
}
