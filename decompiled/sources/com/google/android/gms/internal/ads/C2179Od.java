package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2179Od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21615a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                Map map = this.f21615a;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.f21615a.get(str);
    }
}
