package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5637wZ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34598e;

    private C5637wZ0(Object obj, int i10, int i11, long j10, int i12) {
        this.f34594a = obj;
        this.f34595b = i10;
        this.f34596c = i11;
        this.f34597d = j10;
        this.f34598e = i12;
    }

    public final C5637wZ0 a(Object obj) {
        return this.f34594a.equals(obj) ? this : new C5637wZ0(obj, this.f34595b, this.f34596c, this.f34597d, this.f34598e);
    }

    public final boolean b() {
        return this.f34595b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5637wZ0)) {
            return false;
        }
        C5637wZ0 c5637wZ0 = (C5637wZ0) obj;
        return this.f34594a.equals(c5637wZ0.f34594a) && this.f34595b == c5637wZ0.f34595b && this.f34596c == c5637wZ0.f34596c && this.f34597d == c5637wZ0.f34597d && this.f34598e == c5637wZ0.f34598e;
    }

    public final int hashCode() {
        return ((((((((this.f34594a.hashCode() + 527) * 31) + this.f34595b) * 31) + this.f34596c) * 31) + ((int) this.f34597d)) * 31) + this.f34598e;
    }

    public C5637wZ0(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public C5637wZ0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public C5637wZ0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
