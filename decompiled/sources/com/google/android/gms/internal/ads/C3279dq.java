package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3279dq extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4739pR f27521a;

    /* synthetic */ C3279dq(C2777Zq c2777Zq, InterfaceC4739pR interfaceC4739pR, InterfaceC5922yq interfaceC5922yq, byte[] bArr) {
        Objects.requireNonNull(c2777Zq);
        this.f27521a = interfaceC4739pR;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f27521a.g(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Dp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                }
            });
        }
    }
}
