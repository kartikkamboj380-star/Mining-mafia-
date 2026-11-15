package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC1144o;

/* JADX INFO: loaded from: classes2.dex */
final class c extends zag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f17122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC1144o f17123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f17124c;

    c(Intent intent, ComponentCallbacksC1144o componentCallbacksC1144o, int i10) {
        this.f17122a = intent;
        this.f17123b = componentCallbacksC1144o;
        this.f17124c = i10;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f17122a;
        if (intent != null) {
            this.f17123b.startActivityForResult(intent, this.f17124c);
        }
    }
}
