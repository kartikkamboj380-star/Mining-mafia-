package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC2187Oh implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ CallableC2187Oh f21631a = new CallableC2187Oh();

    private /* synthetic */ CallableC2187Oh() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
