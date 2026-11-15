package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2177Oc extends AbstractC1656Eb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f21606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f21607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f21608d;

    public C2177Oc(String str) {
        HashMap mapB = AbstractC1656Eb.b(str);
        if (mapB != null) {
            this.f21606b = (Long) mapB.get(0);
            this.f21607c = (Boolean) mapB.get(1);
            this.f21608d = (Boolean) mapB.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1656Eb
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f21606b);
        map.put(1, this.f21607c);
        map.put(2, this.f21608d);
        return map;
    }
}
