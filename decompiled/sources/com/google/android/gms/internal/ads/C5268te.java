package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5268te extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC5772xe f33437a;

    C5268te(ViewOnAttachStateChangeListenerC5772xe viewOnAttachStateChangeListenerC5772xe) {
        Objects.requireNonNull(viewOnAttachStateChangeListenerC5772xe);
        this.f33437a = viewOnAttachStateChangeListenerC5772xe;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f33437a.g(3);
    }
}
