package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1527Bo0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17711b;

    private C1527Bo0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f17710a = interfaceC4864qQ0;
        this.f17711b = interfaceC4864qQ1;
    }

    public static C1527Bo0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C1527Bo0(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        EnumC2647Xd enumC2647XdB = AbstractC3265di0.b((Context) this.f17710a.zzb(), (C1721Fh0) this.f17711b.zzb());
        AbstractC4738pQ0.b(enumC2647XdB);
        return enumC2647XdB;
    }
}
