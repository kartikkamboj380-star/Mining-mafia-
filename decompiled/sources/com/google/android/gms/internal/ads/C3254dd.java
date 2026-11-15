package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3254dd extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC3379ed f27481a;

    C3254dd(ViewOnAttachStateChangeListenerC3379ed viewOnAttachStateChangeListenerC3379ed) {
        Objects.requireNonNull(viewOnAttachStateChangeListenerC3379ed);
        this.f27481a = viewOnAttachStateChangeListenerC3379ed;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f27481a.d();
    }
}
