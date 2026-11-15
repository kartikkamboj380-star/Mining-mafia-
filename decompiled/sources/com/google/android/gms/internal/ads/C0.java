package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
abstract class C0 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Choreographer f17760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final DisplayManager f17761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile long f17762c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile long f17763d = -9223372036854775807L;

    /* synthetic */ C0(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        this.f17760a = choreographer;
        this.f17761b = displayManager;
    }

    void a() {
        this.f17761b.registerDisplayListener(this, AbstractC4634ob0.y(null));
    }

    abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
