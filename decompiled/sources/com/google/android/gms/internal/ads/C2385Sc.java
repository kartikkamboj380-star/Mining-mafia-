package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2385Sc extends AbstractC1656Eb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f23268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f23269c;

    public C2385Sc(String str) {
        HashMap mapB = AbstractC1656Eb.b(str);
        if (mapB != null) {
            this.f23268b = (Long) mapB.get(0);
            this.f23269c = (Long) mapB.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1656Eb
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f23268b);
        map.put(1, this.f23269c);
        return map;
    }
}
