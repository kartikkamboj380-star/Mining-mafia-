package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6098k extends ContentObserver {
    C6098k(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        AbstractC6101l.f36109e.set(true);
    }
}
