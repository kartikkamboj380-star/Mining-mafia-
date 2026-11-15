package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1502Bc extends AbstractC1656Eb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17664c;

    public C1502Bc(String str) {
        this.f17663b = -1L;
        this.f17664c = -1L;
        HashMap mapB = AbstractC1656Eb.b(str);
        if (mapB != null) {
            this.f17663b = ((Long) mapB.get(0)).longValue();
            this.f17664c = ((Long) mapB.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1656Eb
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f17663b));
        map.put(1, Long.valueOf(this.f17664c));
        return map;
    }
}
