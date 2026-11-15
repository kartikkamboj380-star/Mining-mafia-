package com.google.android.gms.measurement.internal;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C6620r4 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C6620r4 f38340a = new C6620r4();

    private /* synthetic */ C6620r4() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
    }
}
