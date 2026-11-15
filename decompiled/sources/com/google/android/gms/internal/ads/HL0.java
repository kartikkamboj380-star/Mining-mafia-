package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class HL0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile HL0 f19273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final HL0 f19274c = new HL0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19275a = Collections.EMPTY_MAP;

    HL0(boolean z9) {
    }

    public static HL0 a() {
        int i10 = AbstractC3722hL0.f28900a;
        return f19274c;
    }

    public static HL0 b() {
        HL0 hl0 = f19273b;
        if (hl0 != null) {
            return hl0;
        }
        synchronized (HL0.class) {
            try {
                HL0 hl1 = f19273b;
                if (hl1 != null) {
                    return hl1;
                }
                int i10 = AbstractC3722hL0.f28900a;
                HL0 hl0A = OL0.a(HL0.class);
                f19273b = hl0A;
                return hl0A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SL0 c(InterfaceC5863yM0 interfaceC5863yM0, int i10) {
        p070h.w.a(this.f19275a.get(new GL0(interfaceC5863yM0, i10)));
        return null;
    }
}
