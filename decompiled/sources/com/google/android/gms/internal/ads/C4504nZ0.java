package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4504nZ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicLong f31838a = new AtomicLong();

    public C4504nZ0(long j10, C4454nA0 c4454nA0, Uri uri, Map map, long j11, long j12, long j13) {
    }

    public static long a() {
        return f31838a.getAndIncrement();
    }
}
