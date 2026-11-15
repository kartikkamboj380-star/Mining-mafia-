package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class TA implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3636gf0 f23452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f23453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ L4.w f23454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2821aB f23455d;

    TA(C2821aB c2821aB, C3636gf0 c3636gf0, String str, L4.w wVar) {
        this.f23452a = c3636gf0;
        this.f23453b = str;
        this.f23454c = wVar;
        Objects.requireNonNull(c2821aB);
        this.f23455d = c2821aB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(final Throwable th) {
        final C3636gf0 c3636gf0 = this.f23452a;
        final String str = this.f23453b;
        final L4.w wVar = this.f23454c;
        this.f23455d.j().j0(new Runnable() { // from class: com.google.android.gms.internal.ads.SA
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) H4.B.c().d(AbstractC3892ii.Nb)).booleanValue();
                Throwable th2 = th;
                TA ta = this.f23142a;
                if (zBooleanValue) {
                    C2821aB c2821aB = ta.f23455d;
                    InterfaceC2309Qq interfaceC2309QqE = C2205Oq.e(c2821aB.i());
                    c2821aB.f26447i = interfaceC2309QqE;
                    interfaceC2309QqE.b(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    C2821aB c2821aB2 = ta.f23455d;
                    InterfaceC2309Qq interfaceC2309QqC = C2205Oq.c(c2821aB2.i());
                    c2821aB2.f26446h = interfaceC2309QqC;
                    interfaceC2309QqC.b(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                L4.w wVar2 = wVar;
                c3636gf0.b(str, wVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final C3636gf0 c3636gf0 = this.f23452a;
        final String str = (String) obj;
        final L4.w wVar = this.f23454c;
        this.f23455d.j().j0(new Runnable() { // from class: com.google.android.gms.internal.ads.RA
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c3636gf0.b(str, wVar, null, null);
            }
        });
    }
}
