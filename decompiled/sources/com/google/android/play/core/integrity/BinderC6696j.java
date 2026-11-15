package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import p176r5.C7094k;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC6696j extends V5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V5.E f39865a = new V5.E("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7094k f39866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6697k f39867c;

    BinderC6696j(C6697k c6697k, C7094k c7094k) {
        this.f39867c = c6697k;
        this.f39866b = c7094k;
    }

    @Override // V5.D
    public final void r0(Bundle bundle) {
        this.f39867c.f39873e.v(this.f39866b);
        this.f39865a.c("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f39867c.f39872d.a(bundle);
        if (apiExceptionA != null) {
            this.f39866b.d(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f39866b.d(new C6687a(-100, null));
            return;
        }
        C6695i c6695i = new C6695i(this, this.f39867c.f39870b, bundle.getLong("request.token.sid"));
        C7094k c7094k = this.f39866b;
        C6690d c6690d = new C6690d();
        c6690d.b(string);
        c6690d.a(c6695i);
        c7094k.e(c6690d.c());
    }
}
