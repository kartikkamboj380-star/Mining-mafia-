package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3929j00 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ M00 f30268a;

    /* synthetic */ C3929j00(M00 m00, byte[] bArr) {
        Objects.requireNonNull(m00);
        this.f30268a = m00;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.f30268a.f().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.IZ
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f19572a.f30268a.d(context);
            }
        });
    }
}
