package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Objects;
import p016b5.g;
import p141o0.c;

/* JADX INFO: loaded from: classes2.dex */
final class a implements androidx.loader.app.a.InterfaceC0162a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f16974a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.f16974a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0162a
    public final c a(int i10, Bundle bundle) {
        return new g(this.f16974a, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.a.InterfaceC0162a
    public final /* bridge */ /* synthetic */ void c(c cVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f16974a;
        signInHubActivity.setResult(signInHubActivity.J(), signInHubActivity.K());
        signInHubActivity.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0162a
    public final void b(c cVar) {
    }
}
