package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4406mn0 extends AbstractC1681En0 {
    C4406mn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, C5043rr0 c5043rr0) {
        super("0t12poYWosmBpngKvXFsIJ660Q+4XUg0b7zXGmPDXQpDG3a/Lo5YnElAjbhGuK/3", "2X8cf0JDVCgUXbkJnirLCT8PfoAeQLAghvQ5pw2PRcc=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(114));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        synchronized (c1966Ka) {
            c1966Ka.f0("E");
            c1966Ka.B(0L);
            c1966Ka.a0("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (c1966Ka) {
            c1966Ka.f0((String) objArr[0]);
            c1966Ka.B(((Long) objArr[1]).longValue());
            c1966Ka.a0((String) objArr[2]);
        }
    }
}
