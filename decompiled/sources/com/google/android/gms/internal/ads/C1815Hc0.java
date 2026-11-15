package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1815Hc0 implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1971Kc0 f19326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2074Mc0 f19327b;

    C1815Hc0(C2074Mc0 c2074Mc0, InterfaceC1971Kc0 interfaceC1971Kc0) {
        this.f19326a = interfaceC1971Kc0;
        Objects.requireNonNull(c2074Mc0);
        this.f19327b = c2074Mc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        C2074Mc0 c2074Mc0 = this.f19327b;
        synchronized (c2074Mc0) {
            c2074Mc0.f(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C2074Mc0 c2074Mc0 = this.f19327b;
        synchronized (c2074Mc0) {
            try {
                c2074Mc0.f(null);
                c2074Mc0.e().addFirst(this.f19326a);
                if (c2074Mc0.g() == 1) {
                    c2074Mc0.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
