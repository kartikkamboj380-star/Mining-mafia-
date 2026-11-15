package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4571o6 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3941j6 f31964b;

    public C4571o6(int i10, C3941j6 c3941j6) {
        this.f31963a = i10;
        this.f31964b = c3941j6;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f31963a, ((C4571o6) obj).f31963a);
    }
}
