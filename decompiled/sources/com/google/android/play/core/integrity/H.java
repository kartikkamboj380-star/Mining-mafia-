package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class H extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V5.E f39805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ J f39806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(J j10, C7094k c7094k) {
        super(j10, c7094k);
        this.f39806d = j10;
        this.f39805c = new V5.E("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.E, V5.y
    public final void r5(Bundle bundle) {
        super.r5(bundle);
        this.f39805c.c("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f39806d.f39812e.a(bundle);
        if (apiExceptionA != null) {
            this.f39799a.d(apiExceptionA);
        } else {
            this.f39799a.e(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
