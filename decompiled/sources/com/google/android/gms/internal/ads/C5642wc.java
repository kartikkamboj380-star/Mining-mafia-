package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5642wc extends AbstractC1656Eb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f34602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f34603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f34604d;

    public C5642wc(String str) {
        HashMap mapB = AbstractC1656Eb.b(str);
        if (mapB != null) {
            this.f34602b = (Long) mapB.get(0);
            this.f34603c = (Long) mapB.get(1);
            this.f34604d = (Long) mapB.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1656Eb
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f34602b);
        map.put(1, this.f34603c);
        map.put(2, this.f34604d);
        return map;
    }
}
