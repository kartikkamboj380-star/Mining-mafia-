package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5744xQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QR f34816a;

    C5744xQ(QR qr) {
        this.f34816a = qr;
    }

    public final boolean a(C4524nj0 c4524nj0) {
        if (c4524nj0.p0()) {
            PR prA = this.f34816a.a();
            prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "aq_ad_closed");
            prA.c("gqi", c4524nj0.h0());
            prA.c("aq_ad_duration", String.valueOf(c4524nj0.i0()));
            prA.c("aq_ad_bounce_cnt", String.valueOf(c4524nj0.j0()));
            prA.c("aq_time_away", String.valueOf(c4524nj0.m0()));
            return prA.e().equals(L4.u.SUCCESS);
        }
        PR prA2 = this.f34816a.a();
        prA2.c(HandleInvocationsFromAdViewer.KEY_ACTION, "aq_ad_kill");
        prA2.c("gqi", c4524nj0.h0());
        prA2.c("aq_ad_duration", String.valueOf(c4524nj0.i0()));
        prA2.c("aq_ad_bounce_cnt", String.valueOf(c4524nj0.j0()));
        prA2.c("aq_time_away", String.valueOf(c4524nj0.m0()));
        prA2.c("aq_is_os_kill", String.valueOf(c4524nj0.l0()));
        return prA2.e().equals(L4.u.SUCCESS);
    }
}
