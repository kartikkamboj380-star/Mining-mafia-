package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4528nl0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f31881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f31882b;

    C4528nl0(Runnable runnable, long j10) {
        this.f31881a = runnable;
        this.f31882b = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f31882b, ((C4528nl0) obj).f31882b);
    }
}
