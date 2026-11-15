package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class YY0 implements InterfaceC4812q01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4812q01 f25634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ZY0 f25636c;

    public YY0(ZY0 zy0, InterfaceC4812q01 interfaceC4812q01) {
        Objects.requireNonNull(zy0);
        this.f25636c = zy0;
        this.f25634a = interfaceC4812q01;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4812q01
    public final int a(ZR0 zr0, C5741xO0 c5741xO0, int i10) {
        ZY0 zy0 = this.f25636c;
        if (zy0.f()) {
            return -3;
        }
        if (this.f25635b) {
            c5741xO0.g(4);
            return -4;
        }
        long jZzi = zy0.zzi();
        int iA = this.f25634a.a(zr0, c5741xO0, i10);
        if (iA != -5) {
            long j10 = zy0.f26234e;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || c5741xO0.f34805f < j10) && !(iA == -3 && jZzi == Long.MIN_VALUE && !c5741xO0.f34804e))) {
                return iA;
            }
            c5741xO0.a();
            c5741xO0.g(4);
            this.f25635b = true;
            return -4;
        }
        JY0 jy0 = zr0.f26192b;
        jy0.getClass();
        int i11 = jy0.f19909J;
        if (i11 != 0) {
            int i12 = zy0.f26234e == Long.MIN_VALUE ? jy0.f19910K : 0;
            C5507vX0 c5507vX0A = jy0.a();
            c5507vX0A.h(i11);
            c5507vX0A.i(i12);
            zr0.f26192b = c5507vX0A.m();
        } else if (jy0.f19910K != 0) {
            i11 = 0;
            if (zy0.f26234e == Long.MIN_VALUE) {
            }
            C5507vX0 c5507vX0A2 = jy0.a();
            c5507vX0A2.h(i11);
            c5507vX0A2.i(i12);
            zr0.f26192b = c5507vX0A2.m();
        }
        return -5;
    }

    public final void b() {
        this.f25635b = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812q01
    public final int c(long j10) {
        if (this.f25636c.f()) {
            return -3;
        }
        return this.f25634a.c(j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812q01
    public final boolean zzb() {
        return !this.f25636c.f() && this.f25634a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812q01
    public final void zzc() {
        this.f25634a.zzc();
    }
}
