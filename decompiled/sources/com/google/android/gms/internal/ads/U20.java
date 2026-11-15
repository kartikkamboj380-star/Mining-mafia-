package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class U20 implements InterfaceC3294dx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ U20 f23896a = new U20();

    private /* synthetic */ U20() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
    public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? AbstractC5685wx0.a(new X20(Integer.toString(17))) : AbstractC5685wx0.a(new X20(null));
    }
}
