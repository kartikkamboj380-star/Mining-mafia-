package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.on0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4658on0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f32200f;

    C4658on0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, Context context, C5043rr0 c5043rr0) {
        super("PH59Z8k3dpWxORUT8HU0o+g5WN12ilbJvwpqiSzw0bSm8ti3u+Yy1pYDsitXR/IS", "EBTPDqTGNNE4oafrCuyvamIcg1nistjqiNmDYn1J+fs=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(115));
        this.f32200f = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        Object[] objArr = (Object[]) method.invoke("", this.f32200f);
        objArr.getClass();
        synchronized (c1966Ka) {
            try {
                c1966Ka.R(((Integer) objArr[0]).intValue());
                int i10 = 1;
                c1966Ka.s0(((Integer) objArr[1]).intValue());
                c1966Ka.t0(((Integer) objArr[2]).intValue());
                c1966Ka.h0(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    c1966Ka.l0(3);
                } else {
                    c1966Ka.l0(true != bool.booleanValue() ? 1 : 2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    c1966Ka.k0(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i10 = 2;
                    }
                    c1966Ka.k0(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
