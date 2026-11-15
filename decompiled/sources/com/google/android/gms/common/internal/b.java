package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class b extends zag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f17119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f17120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f17121c;

    b(Intent intent, Activity activity, int i10) {
        this.f17119a = intent;
        this.f17120b = activity;
        this.f17121c = i10;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f17119a;
        if (intent != null) {
            this.f17120b.startActivityForResult(intent, this.f17121c);
        }
    }
}
