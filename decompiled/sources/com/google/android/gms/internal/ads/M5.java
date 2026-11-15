package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class M5 implements InterfaceC5828y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f20752a = new P10();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f20753b = new P10();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L5 f20754c = new L5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f20755d;

    @Override // com.google.android.gms.internal.ads.InterfaceC5828y5
    public final void a(byte[] bArr, int i10, int i11, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        P10 p10 = this.f20752a;
        p10.A(bArr, i11 + i10);
        p10.G(i10);
        if (this.f20755d == null) {
            this.f20755d = new Inflater();
        }
        P10 p11 = this.f20753b;
        if (AbstractC4634ob0.l(p10, p11, this.f20755d)) {
            p10.A(p11.H(), p11.D());
        }
        L5 l10 = this.f20754c;
        l10.b();
        ArrayList arrayList = new ArrayList();
        while (p10.C() >= 3) {
            int iD = p10.D();
            int iR = p10.R();
            int iS = p10.S();
            int iF = p10.F() + iS;
            KD kdA = null;
            if (iF > iD) {
                p10.G(iD);
            } else {
                if (iR != 128) {
                    switch (iR) {
                        case 20:
                            l10.c(p10, iS);
                            break;
                        case 21:
                            l10.d(p10, iS);
                            break;
                        case 22:
                            l10.e(p10, iS);
                            break;
                    }
                } else {
                    kdA = l10.a();
                    l10.b();
                }
                p10.G(iF);
            }
            if (kdA != null) {
                arrayList.add(kdA);
            }
        }
        interfaceC3977jO.zza(new C4695p5(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
