package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class S3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ V3 f36486a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S3(V3 v10, Handler handler) {
        super(null);
        Objects.requireNonNull(v10);
        this.f36486a = v10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        this.f36486a.d();
    }
}
