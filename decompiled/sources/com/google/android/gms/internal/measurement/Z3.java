package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Z3 extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z3(C6168b4 c6168b4, Handler handler) {
        super(null);
        Objects.requireNonNull(c6168b4);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        AbstractC6303q4.c();
    }
}
