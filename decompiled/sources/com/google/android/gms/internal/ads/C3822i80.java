package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3822i80 implements OQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Message f29288a;

    /* synthetic */ C3822i80(byte[] bArr) {
    }

    public final C3822i80 a(Message message, J80 j80) {
        this.f29288a = message;
        return this;
    }

    public final boolean b(Handler handler) {
        Message message = this.f29288a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f29288a = null;
        J80.l(this);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.OQ
    public final void zza() {
        Message message = this.f29288a;
        message.getClass();
        message.sendToTarget();
        this.f29288a = null;
        J80.l(this);
    }
}
