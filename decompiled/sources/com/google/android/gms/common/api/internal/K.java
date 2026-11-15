package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class K extends UnregisterListenerMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RegistrationMethods.Builder f17009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.f17009a = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final void unregisterListener(Api.AnyClient anyClient, C7094k c7094k) {
        this.f17009a.zab.accept(anyClient, c7094k);
    }
}
