package com.google.android.gms.internal.ads;

import android.view.InputEvent;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4611oQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile InputEvent f32069a;

    public final void a(InputEvent inputEvent) {
        this.f32069a = inputEvent;
    }

    public final InputEvent b() {
        return this.f32069a;
    }
}
