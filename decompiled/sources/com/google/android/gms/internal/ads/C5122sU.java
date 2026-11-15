package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C5122sU implements InterfaceC3294dx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C5122sU f33171a = new C5122sU();

    private /* synthetic */ C5122sU() {
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
