package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC1828Hj extends AbstractBinderC2347Rj {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f19368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f19369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f19370k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19372b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19373c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19378h;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f19368i = iRgb;
        f19369j = Color.rgb(204, 204, 204);
        f19370k = iRgb;
    }

    public BinderC1828Hj(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z9) {
        this.f19371a = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            BinderC1984Kj binderC1984Kj = (BinderC1984Kj) list.get(i12);
            this.f19372b.add(binderC1984Kj);
            this.f19373c.add(binderC1984Kj);
        }
        this.f19374d = num != null ? num.intValue() : f19369j;
        this.f19375e = num2 != null ? num2.intValue() : f19370k;
        this.f19376f = num3 != null ? num3.intValue() : 12;
        this.f19377g = i10;
        this.f19378h = i11;
    }

    public final int A6() {
        return this.f19377g;
    }

    public final int b() {
        return this.f19375e;
    }

    public final int z6() {
        return this.f19376f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2399Sj
    public final String zzb() {
        return this.f19371a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2399Sj
    public final List zzc() {
        return this.f19373c;
    }

    public final List zzd() {
        return this.f19372b;
    }

    public final int zze() {
        return this.f19374d;
    }

    public final int zzi() {
        return this.f19378h;
    }
}
