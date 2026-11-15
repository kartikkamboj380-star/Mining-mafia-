package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: loaded from: classes2.dex */
public final class MB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QR f20783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5011rb0 f20784b;

    MB(QR qr, C5011rb0 c5011rb0) {
        this.f20783a = qr;
        this.f20784b = c5011rb0;
    }

    public final void a(long j10, int i10) {
        String str;
        PR prA = this.f20783a.a();
        prA.a(this.f20784b.f32991b.f32672b);
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "ad_closed");
        prA.c("show_time", String.valueOf(j10));
        prA.c("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        if (i11 == 0) {
            str = "h";
        } else if (i11 == 1) {
            str = "bb";
        } else if (i11 == 2) {
            str = "cc";
        } else if (i11 != 3) {
            str = i11 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        prA.c("acr", str);
        prA.d();
    }
}
