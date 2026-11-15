package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ViewOnClickListenerC2411Sp implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2515Up f23325a;

    ViewOnClickListenerC2411Sp(C2515Up c2515Up) {
        Objects.requireNonNull(c2515Up);
        this.f23325a = c2515Up;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f23325a.i(true);
    }
}
