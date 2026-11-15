package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class G extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V5.E f39802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f39803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f39804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(J j10, C7094k c7094k, long j11) {
        super(j10, c7094k);
        this.f39804e = j10;
        this.f39802c = new V5.E("OnRequestIntegrityTokenCallback");
        this.f39803d = j11;
    }

    @Override // com.google.android.play.core.integrity.E, V5.y
    public final void n0(Bundle bundle) {
        super.n0(bundle);
        this.f39802c.c("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f39804e.f39812e.a(bundle);
        if (apiExceptionA != null) {
            this.f39799a.d(apiExceptionA);
            return;
        }
        F f10 = new F(this, this.f39804e.f39809b, bundle.getLong("request.token.sid"));
        C7094k c7094k = this.f39799a;
        C6710y c6710y = new C6710y();
        c6710y.b(bundle.getString("token"));
        c6710y.a(f10);
        c7094k.e(c6710y.c());
    }
}
