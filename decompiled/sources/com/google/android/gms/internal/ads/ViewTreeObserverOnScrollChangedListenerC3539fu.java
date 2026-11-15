package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ViewTreeObserverOnScrollChangedListenerC3539fu extends AbstractC3665gu implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f28505b;

    public ViewTreeObserverOnScrollChangedListenerC3539fu(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f28505b = new WeakReference(onScrollChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3665gu
    protected final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3665gu
    protected final void b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f28505b.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            d();
        }
    }
}
