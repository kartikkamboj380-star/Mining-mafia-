package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2928b10 implements G4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XF f26694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4968rG f26695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4851qK f26696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3845iK f26697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5840yB f26698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicBoolean f26699f = new AtomicBoolean(false);

    C2928b10(XF xf, C4968rG c4968rG, C4851qK c4851qK, C3845iK c3845iK, C5840yB c5840yB) {
        this.f26694a = xf;
        this.f26695b = c4968rG;
        this.f26696c = c4851qK;
        this.f26697d = c3845iK;
        this.f26698e = c5840yB;
    }

    @Override // G4.g
    public final synchronized void a(View view) {
        if (this.f26699f.compareAndSet(false, true)) {
            this.f26698e.m();
            this.f26697d.j1(view);
        }
    }

    @Override // G4.g
    public final void zzb() {
        if (this.f26699f.get()) {
            this.f26694a.onAdClicked();
        }
    }

    @Override // G4.g
    public final void zzc() {
        if (this.f26699f.get()) {
            this.f26695b.zza();
            this.f26696c.zza();
        }
    }
}
