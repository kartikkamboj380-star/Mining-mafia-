package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes2.dex */
final class i implements PendingResultUtil.ResultConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Response f17133a;

    i(Response response) {
        this.f17133a = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ Object convert(Result result) {
        this.f17133a.setResult(result);
        return this.f17133a;
    }
}
