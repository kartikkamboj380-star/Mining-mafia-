package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Og0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2186Og0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2238Pg0 f21630a;

    C2186Og0(C2238Pg0 c2238Pg0) {
        Objects.requireNonNull(c2238Pg0);
        this.f21630a = c2238Pg0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            C2238Pg0 c2238Pg0 = this.f21630a;
            c2238Pg0.d(true, c2238Pg0.f());
            c2238Pg0.e(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            C2238Pg0 c2238Pg1 = this.f21630a;
            c2238Pg1.d(false, c2238Pg1.f());
            c2238Pg1.e(false);
        }
    }
}
