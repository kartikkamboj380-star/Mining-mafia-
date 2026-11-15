package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3498fZ0 implements InterfaceC5063s01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5931yu0 f28353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28354b;

    public C3498fZ0(List list, List list2) {
        int i10 = AbstractC5931yu0.f35482c;
        C5553vu0 c5553vu0 = new C5553vu0();
        AbstractC2418Ss0.a(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            c5553vu0.g(new C3372eZ0((InterfaceC5063s01) list.get(i11), (List) list2.get(i11)));
        }
        this.f28353a = c5553vu0.j();
        this.f28354b = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final void a(long j10) {
        int i10 = 0;
        while (true) {
            AbstractC5931yu0 abstractC5931yu0 = this.f28353a;
            if (i10 >= abstractC5931yu0.size()) {
                return;
            }
            ((C3372eZ0) abstractC5931yu0.get(i10)).a(j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean d(C3233dS0 c3233dS0) {
        boolean zD;
        boolean z9 = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zD = false;
            while (true) {
                AbstractC5931yu0 abstractC5931yu0 = this.f28353a;
                if (i10 >= abstractC5931yu0.size()) {
                    break;
                }
                long jZzl2 = ((C3372eZ0) abstractC5931yu0.get(i10)).zzl();
                boolean z10 = jZzl2 != Long.MIN_VALUE && jZzl2 <= c3233dS0.f27418a;
                if (jZzl2 == jZzl || z10) {
                    zD |= ((C3372eZ0) abstractC5931yu0.get(i10)).d(c3233dS0);
                }
                i10++;
            }
            z9 |= zD;
        } while (zD);
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzi() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            AbstractC5931yu0 abstractC5931yu0 = this.f28353a;
            if (i10 >= abstractC5931yu0.size()) {
                break;
            }
            C3372eZ0 c3372eZ0 = (C3372eZ0) abstractC5931yu0.get(i10);
            long jZzi = c3372eZ0.zzi();
            if ((c3372eZ0.b().contains(1) || c3372eZ0.b().contains(2) || c3372eZ0.b().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f28354b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f28354b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzl() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            AbstractC5931yu0 abstractC5931yu0 = this.f28353a;
            if (i10 >= abstractC5931yu0.size()) {
                break;
            }
            long jZzl = ((C3372eZ0) abstractC5931yu0.get(i10)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean zzn() {
        int i10 = 0;
        while (true) {
            AbstractC5931yu0 abstractC5931yu0 = this.f28353a;
            if (i10 >= abstractC5931yu0.size()) {
                return false;
            }
            if (((C3372eZ0) abstractC5931yu0.get(i10)).zzn()) {
                return true;
            }
            i10++;
        }
    }
}
