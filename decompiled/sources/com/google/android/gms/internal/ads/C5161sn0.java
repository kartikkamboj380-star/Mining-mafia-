package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5161sn0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile Long f33232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f33233g = new Object();

    C5161sn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, C5043rr0 c5043rr0) {
        super("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(117));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        if (f33232f == null) {
            synchronized (f33233g) {
                try {
                    if (f33232f == null) {
                        Long l10 = (Long) method.invoke("", null);
                        if (l10 == null) {
                            throw null;
                        }
                        f33232f = l10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (c1966Ka) {
            try {
                if (f33232f != null) {
                    c1966Ka.B0(f33232f.longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
