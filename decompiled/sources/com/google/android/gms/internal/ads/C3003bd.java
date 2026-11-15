package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3003bd extends AbstractC1656Eb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f26868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f26869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f26870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f26871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f26872f;

    public C3003bd(String str) {
        HashMap mapB = AbstractC1656Eb.b(str);
        if (mapB != null) {
            this.f26868b = (Long) mapB.get(0);
            this.f26869c = (Long) mapB.get(1);
            this.f26870d = (Long) mapB.get(2);
            this.f26871e = (Long) mapB.get(3);
            this.f26872f = (Long) mapB.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1656Eb
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f26868b);
        map.put(1, this.f26869c);
        map.put(2, this.f26870d);
        map.put(3, this.f26871e);
        map.put(4, this.f26872f);
        return map;
    }
}
