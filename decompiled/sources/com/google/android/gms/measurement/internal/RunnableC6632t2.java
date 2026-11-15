package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC6632t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6625s2 f38367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f38369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f38370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f38372f;

    /* synthetic */ RunnableC6632t2(String str, InterfaceC6625s2 interfaceC6625s2, int i10, Throwable th, byte[] bArr, Map map, byte[] bArr2) {
        Preconditions.checkNotNull(interfaceC6625s2);
        this.f38367a = interfaceC6625s2;
        this.f38368b = i10;
        this.f38369c = th;
        this.f38370d = bArr;
        this.f38371e = str;
        this.f38372f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38367a.a(this.f38371e, this.f38368b, this.f38369c, this.f38370d, this.f38372f);
    }
}
