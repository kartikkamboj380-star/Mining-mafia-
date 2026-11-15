package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class UX0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WX0 f24033a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UX0(WX0 wx0, Looper looper) {
        super(looper);
        Objects.requireNonNull(wx0);
        this.f24033a = wx0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f24033a.e(message);
    }
}
