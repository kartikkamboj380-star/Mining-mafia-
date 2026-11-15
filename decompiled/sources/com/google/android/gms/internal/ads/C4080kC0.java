package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4080kC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f30725a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f30726b = new HashMap();

    /* synthetic */ C4080kC0(byte[] bArr) {
    }

    public final C4080kC0 a(Enum r10, Object obj) {
        this.f30725a.put(r10, obj);
        this.f30726b.put(obj, r10);
        return this;
    }

    public final C4206lC0 b() {
        return new C4206lC0(Collections.unmodifiableMap(this.f30725a), Collections.unmodifiableMap(this.f30726b), null);
    }
}
