package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class DV0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ FV0 f18179a;

    /* synthetic */ DV0(FV0 fv0, byte[] bArr) {
        Objects.requireNonNull(fv0);
        this.f18179a = fv0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        FV0 fv0 = this.f18179a;
        fv0.f(AV0.b(context, intent, fv0.j(), fv0.h()));
    }
}
