package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2798a0 extends C4754pY0 {
    public C2798a0(Throwable th, C4880qY0 c4880qY0, Surface surface) {
        super(th, c4880qY0);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
