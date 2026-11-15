package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ue0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5395ue0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33871a;

    public C5395ue0(Context context, Looper looper, InterfaceC3471fM interfaceC3471fM) {
        context.getApplicationContext();
        interfaceC3471fM.a(looper, null);
        interfaceC3471fM.a(Looper.getMainLooper(), null);
    }

    public final void a(boolean z9) {
        if (this.f33871a == z9) {
            return;
        }
        this.f33871a = z9;
    }
}
