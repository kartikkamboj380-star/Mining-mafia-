package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class N extends TaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskApiCall.Builder f17013a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(TaskApiCall.Builder builder, Feature[] featureArr, boolean z9, int i10) {
        super(featureArr, z9, i10);
        this.f17013a = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final void doExecute(Api.AnyClient anyClient, C7094k c7094k) {
        this.f17013a.zaa.accept(anyClient, c7094k);
    }
}
