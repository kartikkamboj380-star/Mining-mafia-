package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class DC0 implements InterfaceC4302ly0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f18106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Class f18107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final EnumC2832aG0 f18108c;

    DC0(String str, Class cls, EnumC2832aG0 enumC2832aG0, FM0 fm0) {
        this.f18106a = str;
        this.f18107b = cls;
        this.f18108c = enumC2832aG0;
    }

    public static InterfaceC4302ly0 c(String str, Class cls, EnumC2832aG0 enumC2832aG0, FM0 fm0) {
        return new DC0(str, cls, enumC2832aG0, fm0);
    }

    public static InterfaceC1547By0 d(String str, Class cls, FM0 fm0) {
        return new CC0(str, cls, fm0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4302ly0
    public final Object a(AbstractC5231tL0 abstractC5231tL0) throws GeneralSecurityException {
        return WC0.a().d(ZC0.a().g(C5467vD0.a(this.f18106a, abstractC5231tL0, this.f18108c, EnumC5725xG0.RAW, null), AbstractC3800hy0.a()), this.f18107b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4302ly0
    public final C2958bG0 b(AbstractC5231tL0 abstractC5231tL0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A(this.f18106a);
        c3209dG0H0.B(abstractC5231tL0);
        c3209dG0H0.C(EnumC5725xG0.RAW);
        C5467vD0 c5467vD0 = (C5467vD0) ZC0.a().h(PC0.a().c(ZC0.a().j(C5593wD0.c((C3334eG0) c3209dG0H0.w())), null), C5467vD0.class, AbstractC3800hy0.a());
        ZF0 zf0G0 = C2958bG0.g0();
        zf0G0.A(c5467vD0.g());
        zf0G0.B(c5467vD0.c());
        zf0G0.C(c5467vD0.d());
        return (C2958bG0) zf0G0.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4302ly0
    public final String zzb() {
        return this.f18106a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4302ly0
    public final Class zzc() {
        return this.f18107b;
    }
}
