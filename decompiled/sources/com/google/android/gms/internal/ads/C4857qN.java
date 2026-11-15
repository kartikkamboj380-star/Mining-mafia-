package com.google.android.gms.internal.ads;

import K4.AbstractC0761c;
import android.view.View;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4857qN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QR f32626a;

    C4857qN(QR qr) {
        this.f32626a = qr;
    }

    public final void a(View view, C3502fb0 c3502fb0) {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.te)).booleanValue() || view == null) {
            return;
        }
        String str = true != AbstractC0761c.a(view) ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        PR prA = this.f32626a.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "hcp");
        prA.c("hcp", str);
        prA.b(c3502fb0);
        prA.d();
    }
}
