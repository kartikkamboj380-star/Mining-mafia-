package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3287du {
    public static final void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new ViewTreeObserverOnGlobalLayoutListenerC3413eu(view, onGlobalLayoutListener).c();
    }

    public static final void b(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new ViewTreeObserverOnScrollChangedListenerC3539fu(view, onScrollChangedListener).c();
    }
}
