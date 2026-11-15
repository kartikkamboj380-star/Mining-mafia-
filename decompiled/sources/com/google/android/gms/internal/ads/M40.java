package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class M40 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20751c;

    private M40(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f20749a = interfaceC4864qQ0;
        this.f20750b = interfaceC4864qQ1;
        this.f20751c = interfaceC4864qQ2;
    }

    public static M40 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new M40(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((G20) this.f20749a).zzb();
        C4190l40 c4190l40 = (C4190l40) this.f20750b.zzb();
        if (true == ((List) this.f20751c.zzb()).contains(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
            objZzb = c4190l40;
        }
        AbstractC4738pQ0.b(objZzb);
        return objZzb;
    }
}
