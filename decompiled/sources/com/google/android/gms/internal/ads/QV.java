package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class QV implements InterfaceC3294dx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ QV f22379a = new QV();

    private /* synthetic */ QV() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
    public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return AbstractC5685wx0.c(cause);
    }
}
