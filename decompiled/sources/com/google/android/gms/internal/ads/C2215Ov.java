package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2215Ov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f21717a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f21718b;

    C2215Ov() {
    }

    final long a() {
        Iterator it = this.f21717a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((UD0) it.next()).d().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f21718b = Math.max(this.f21718b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f21718b;
    }

    final void b(UD0 ud0) {
        this.f21717a.add(ud0);
    }
}
