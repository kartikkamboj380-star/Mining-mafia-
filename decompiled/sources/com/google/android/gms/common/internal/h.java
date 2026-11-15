package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class h implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PendingResult f17129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7094k f17130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PendingResultUtil.ResultConverter f17131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zas f17132d;

    h(PendingResult pendingResult, C7094k c7094k, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.f17129a = pendingResult;
        this.f17130b = c7094k;
        this.f17131c = resultConverter;
        this.f17132d = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (!status.isSuccess()) {
            this.f17130b.b(ApiExceptionUtil.fromStatus(status));
        } else {
            this.f17130b.c(this.f17131c.convert(this.f17129a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
