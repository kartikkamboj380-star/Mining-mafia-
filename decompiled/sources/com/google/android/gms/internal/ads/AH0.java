package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17279a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f17280b;

    public final synchronized Map a() {
        try {
            if (this.f17280b == null) {
                this.f17280b = Collections.unmodifiableMap(new HashMap(this.f17279a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17280b;
    }
}
