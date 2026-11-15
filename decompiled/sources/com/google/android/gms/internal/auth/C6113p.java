package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6113p extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6116q f36128a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6113p(C6116q c6116q, Handler handler) {
        super(null);
        this.f36128a = c6116q;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        this.f36128a.d();
    }
}
