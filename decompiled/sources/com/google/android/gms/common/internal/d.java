package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes2.dex */
final class d extends zag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f17125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ LifecycleFragment f17126b;

    d(Intent intent, LifecycleFragment lifecycleFragment, int i10) {
        this.f17125a = intent;
        this.f17126b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f17125a;
        if (intent != null) {
            this.f17126b.startActivityForResult(intent, 2);
        }
    }
}
