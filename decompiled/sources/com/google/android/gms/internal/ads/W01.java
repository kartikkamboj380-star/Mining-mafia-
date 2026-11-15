package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class W01 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24634b;

    public W01(JY0 jy0, int i10) {
        this.f24633a = 1 == (jy0.f19919e & 1);
        this.f24634b = GS0.b(i10, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(W01 w01) {
        return AbstractC4168ku0.f().d(this.f24634b, w01.f24634b).d(this.f24633a, w01.f24633a).e();
    }
}
