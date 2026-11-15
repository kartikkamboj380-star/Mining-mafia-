package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1636Dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f18289a = new WeakHashMap();

    public final Future a(Context context) {
        return AbstractC2315Qt.f22473a.e0(new CallableC6050zr(this, context));
    }

    final /* synthetic */ WeakHashMap b() {
        return this.f18289a;
    }
}
