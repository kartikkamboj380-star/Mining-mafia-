package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class N3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ P3 f36419a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N3(P3 p10, Handler handler) {
        super(null);
        Objects.requireNonNull(p10);
        this.f36419a = p10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        this.f36419a.b().set(true);
    }
}
