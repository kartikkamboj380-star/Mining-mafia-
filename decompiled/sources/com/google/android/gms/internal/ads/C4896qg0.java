package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4896qg0 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5147sg0 f32703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Timer f32704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5273tg0 f32705c;

    C4896qg0(C5273tg0 c5273tg0, InterfaceC5147sg0 interfaceC5147sg0, Timer timer) {
        this.f32703a = interfaceC5147sg0;
        this.f32704b = timer;
        Objects.requireNonNull(c5273tg0);
        this.f32705c = c5273tg0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f32705c.e();
        this.f32703a.h0(true);
        this.f32704b.cancel();
    }
}
