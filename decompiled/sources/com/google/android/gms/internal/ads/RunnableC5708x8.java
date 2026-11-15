package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC5708x8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f34746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f34747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5960z8 f34748c;

    RunnableC5708x8(AbstractC5960z8 abstractC5960z8, String str, long j10) {
        this.f34746a = str;
        this.f34747b = j10;
        Objects.requireNonNull(abstractC5960z8);
        this.f34748c = abstractC5960z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5960z8 abstractC5960z8 = this.f34748c;
        abstractC5960z8.y().a(this.f34746a, this.f34747b);
        abstractC5960z8.y().b(abstractC5960z8.toString());
    }
}
