package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2749Zc extends AbstractC1656Eb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f26246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f26247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f26248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f26249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f26250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f26251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f26252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f26253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f26254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Long f26255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f26256l;

    public C2749Zc(String str) {
        HashMap mapB = AbstractC1656Eb.b(str);
        if (mapB != null) {
            this.f26246b = (Long) mapB.get(0);
            this.f26247c = (Long) mapB.get(1);
            this.f26248d = (Long) mapB.get(2);
            this.f26249e = (Long) mapB.get(3);
            this.f26250f = (Long) mapB.get(4);
            this.f26251g = (Long) mapB.get(5);
            this.f26252h = (Long) mapB.get(6);
            this.f26253i = (Long) mapB.get(7);
            this.f26254j = (Long) mapB.get(8);
            this.f26255k = (Long) mapB.get(9);
            this.f26256l = (Long) mapB.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1656Eb
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f26246b);
        map.put(1, this.f26247c);
        map.put(2, this.f26248d);
        map.put(3, this.f26249e);
        map.put(4, this.f26250f);
        map.put(5, this.f26251g);
        map.put(6, this.f26252h);
        map.put(7, this.f26253i);
        map.put(8, this.f26254j);
        map.put(9, this.f26255k);
        map.put(10, this.f26256l);
        return map;
    }
}
