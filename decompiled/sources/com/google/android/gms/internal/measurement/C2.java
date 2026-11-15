package com.google.android.gms.internal.measurement;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class C2 extends AbstractC6205f5 implements G5 {
    private static final C2 zzn;
    private int zzb;
    private long zzg;
    private long zzk;
    private C6382z5 zzl = C6382z5.b();
    private C6382z5 zzm = C6382z5.b();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C2 c10 = new C2();
        zzn = c10;
        AbstractC6205f5.s(C2.class, c10);
    }

    private C2() {
    }

    public static C6371y2 f0() {
        return (C6371y2) zzn.o();
    }

    public static C2 g0() {
        return zzn;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", AbstractC6379z2.f37034a, "zzm", A2.f36239a});
        }
        if (i11 == 3) {
            return new C2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6371y2(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        throw null;
    }

    final /* synthetic */ void C(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    final /* synthetic */ void D() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    final /* synthetic */ void E(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    final /* synthetic */ void F() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    final /* synthetic */ void G(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void H() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    final /* synthetic */ void I(long j10) {
        this.zzb |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.zzk = j10;
    }

    final /* synthetic */ Map K() {
        if (!this.zzl.g()) {
            this.zzl = this.zzl.e();
        }
        return this.zzl;
    }

    final /* synthetic */ Map L() {
        if (!this.zzm.g()) {
            this.zzm = this.zzm.e();
        }
        return this.zzm;
    }

    public final boolean N() {
        return (this.zzb & 1) != 0;
    }

    public final String O() {
        return this.zzd;
    }

    public final boolean P() {
        return (this.zzb & 2) != 0;
    }

    public final String Q() {
        return this.zze;
    }

    public final boolean R() {
        return (this.zzb & 4) != 0;
    }

    public final String U() {
        return this.zzf;
    }

    public final boolean V() {
        return (this.zzb & 8) != 0;
    }

    public final long W() {
        return this.zzg;
    }

    public final boolean X() {
        return (this.zzb & 16) != 0;
    }

    public final String Y() {
        return this.zzh;
    }

    public final boolean Z() {
        return (this.zzb & 32) != 0;
    }

    public final String a0() {
        return this.zzi;
    }

    public final boolean b0() {
        return (this.zzb & 64) != 0;
    }

    public final String c0() {
        return this.zzj;
    }

    public final boolean d0() {
        return (this.zzb & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
    }

    public final long e0() {
        return this.zzk;
    }

    final /* synthetic */ void h0(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void i0() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    final /* synthetic */ void j0(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void k0() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    final /* synthetic */ void l0(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    final /* synthetic */ void m0() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    final /* synthetic */ void n0(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }
}
