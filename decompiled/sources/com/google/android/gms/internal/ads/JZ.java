package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class JZ implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3502fb0 f19941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ KZ f19942b;

    JZ(KZ kz, C3502fb0 c3502fb0) {
        this.f19941a = c3502fb0;
        Objects.requireNonNull(kz);
        this.f19942b = kz;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        KZ kz = this.f19942b;
        synchronized (kz) {
            try {
                LZ lzC = kz.c();
                C3502fb0 c3502fb0 = this.f19941a;
                lzC.c(th, c3502fb0);
                C3502fb0 c3502fb0A = kz.c().a();
                if (c3502fb0.f28438v0) {
                    while (c3502fb0A != null) {
                        kz.b(c3502fb0A);
                        c3502fb0A = kz.c().a();
                    }
                } else if (c3502fb0A != null) {
                    kz.b(c3502fb0A);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        KZ kz = this.f19942b;
        InterfaceC2925b00 interfaceC2925b00 = (InterfaceC2925b00) obj;
        synchronized (kz) {
            try {
                kz.c().b(interfaceC2925b00, this.f19941a);
                C3502fb0 c3502fb0A = kz.c().a();
                if (c3502fb0A != null) {
                    kz.b(c3502fb0A);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
