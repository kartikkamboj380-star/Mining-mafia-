package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3565g6 implements InterfaceC5828y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f28568a = new P10();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f28569b = new P10();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3439f6 f28570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f28571d;

    public C3565g6(List list) {
        C3439f6 c3439f6 = new C3439f6();
        this.f28570c = c3439f6;
        c3439f6.a(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5828y5
    public final void a(byte[] bArr, int i10, int i11, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        P10 p10 = this.f28568a;
        p10.A(bArr, i11 + i10);
        p10.G(i10);
        if (this.f28571d == null) {
            this.f28571d = new Inflater();
        }
        P10 p11 = this.f28569b;
        if (AbstractC4634ob0.l(p10, p11, this.f28571d)) {
            p10.A(p11.H(), p11.D());
        }
        C3439f6 c3439f6 = this.f28570c;
        c3439f6.d();
        int iC = p10.C();
        KD kdC = null;
        if (iC >= 2 && p10.S() == iC) {
            c3439f6.b(p10);
            kdC = c3439f6.c(p10);
        }
        interfaceC3977jO.zza(new C4695p5(kdC != null ? AbstractC5931yu0.m(kdC) : AbstractC5931yu0.l(), -9223372036854775807L, 5000000L));
    }
}
