package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC5298tt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f33510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2575Vt f33511b;

    RunnableC5298tt(C5424ut c5424ut, Context context, C2575Vt c2575Vt) {
        this.f33510a = context;
        this.f33511b = c2575Vt;
        Objects.requireNonNull(c5424ut);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f33511b.b(AdvertisingIdClient.getAdvertisingIdInfo(this.f33510a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.f33511b.c(e10);
            L4.p.d("Exception while getting advertising Id info", e10);
        }
    }
}
