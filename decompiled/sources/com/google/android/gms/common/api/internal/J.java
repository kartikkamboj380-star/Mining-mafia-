package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class J extends RegisterListenerMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RegistrationMethods.Builder f17008a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z9, int i10) {
        super(listenerHolder, featureArr, z9, i10);
        this.f17008a = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final void registerListener(Api.AnyClient anyClient, C7094k c7094k) {
        this.f17008a.zaa.accept(anyClient, c7094k);
    }
}
