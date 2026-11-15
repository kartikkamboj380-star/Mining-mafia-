package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17315a = new HashMap();

    AQ() {
    }

    final synchronized void a(String str, C2696Yb0 c2696Yb0) {
        C2048Lp c2048LpB;
        if (this.f17315a.containsKey(str)) {
            return;
        }
        C2048Lp c2048LpC = null;
        if (c2696Yb0 == null) {
            c2048LpB = null;
        } else {
            try {
                c2048LpB = c2696Yb0.b();
            } catch (C1761Gb0 unused) {
                c2048LpB = null;
            }
        }
        if (c2696Yb0 != null) {
            try {
                c2048LpC = c2696Yb0.c();
            } catch (C1761Gb0 unused2) {
            }
        }
        boolean z9 = true;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Oa)).booleanValue()) {
            if (c2696Yb0 == null) {
                z9 = false;
            } else {
                try {
                    c2696Yb0.s();
                } catch (C1761Gb0 unused3) {
                    z9 = false;
                }
            }
        }
        this.f17315a.put(str, new C5996zQ(str, c2048LpB, c2048LpC, z9));
    }

    final synchronized void b(String str, InterfaceC5542vp interfaceC5542vp) {
        if (this.f17315a.containsKey(str)) {
            return;
        }
        try {
            this.f17315a.put(str, new C5996zQ(str, interfaceC5542vp.b(), interfaceC5542vp.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    public final synchronized C5996zQ c(String str) {
        return (C5996zQ) this.f17315a.get(str);
    }

    public final String d(String str) {
        C2048Lp c2048Lp;
        C5996zQ c5996zQC = c(str);
        return (c5996zQC == null || (c2048Lp = c5996zQC.f35739b) == null) ? "" : c2048Lp.toString();
    }
}
