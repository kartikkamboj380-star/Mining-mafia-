package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public interface ES0 extends InterfaceC6001zS0 {
    InterfaceC4812q01 A();

    boolean C();

    boolean G();

    void a();

    boolean e();

    void f();

    void g();

    void h(int i10, C4748pV0 c4748pV0, InterfaceC3471fM interfaceC3471fM);

    default boolean i(long j10) {
        return false;
    }

    void j(long j10, boolean z9);

    default long k(long j10, long j11) {
        if (zze() == 1) {
            return (x() || G()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    void l();

    void m(AbstractC5270tf abstractC5270tf);

    String n();

    void o(JY0[] jy0Arr, InterfaceC4812q01 interfaceC4812q01, long j10, long j11, C5637wZ0 c5637wZ0);

    void q(float f10, float f11);

    default void r() {
    }

    void t(long j10, long j11);

    void u();

    boolean x();

    void z(HS0 hs0, JY0[] jy0Arr, InterfaceC4812q01 interfaceC4812q01, long j10, boolean z9, boolean z10, long j11, long j12, C5637wZ0 c5637wZ0);

    int zza();

    GS0 zzb();

    InterfaceC3358eS0 zzd();

    int zze();

    long zzk();

    void zzl();

    void zzn();
}
