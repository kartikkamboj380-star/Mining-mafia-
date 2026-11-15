package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1812Hb extends AbstractC1656Eb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f19318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19319f;

    public C1812Hb(String str) {
        this.f19315b = "E";
        this.f19316c = -1L;
        this.f19317d = "E";
        this.f19318e = "E";
        this.f19319f = "E";
        HashMap mapB = AbstractC1656Eb.b(str);
        if (mapB != null) {
            this.f19315b = mapB.get(0) == null ? "E" : (String) mapB.get(0);
            this.f19316c = mapB.get(1) != null ? ((Long) mapB.get(1)).longValue() : -1L;
            this.f19317d = mapB.get(2) == null ? "E" : (String) mapB.get(2);
            this.f19318e = mapB.get(3) == null ? "E" : (String) mapB.get(3);
            this.f19319f = mapB.get(4) != null ? (String) mapB.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1656Eb
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f19315b);
        map.put(4, this.f19319f);
        map.put(3, this.f19318e);
        map.put(2, this.f19317d);
        map.put(1, Long.valueOf(this.f19316c));
        return map;
    }
}
