package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3610gS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5637wZ0 f28643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f28647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f28649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f28650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f28651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f28652j;

    C3610gS0(C5637wZ0 c5637wZ0, long j10, long j11, long j12, long j13, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        AbstractC2418Ss0.a(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        AbstractC2418Ss0.a(z14);
        this.f28643a = c5637wZ0;
        this.f28644b = j10;
        this.f28645c = j11;
        this.f28646d = j12;
        this.f28647e = j13;
        this.f28648f = false;
        this.f28649g = false;
        this.f28650h = z11;
        this.f28651i = z12;
        this.f28652j = z13;
    }

    public final C3610gS0 a(long j10) {
        return j10 == this.f28644b ? this : new C3610gS0(this.f28643a, j10, this.f28645c, this.f28646d, this.f28647e, false, false, this.f28650h, this.f28651i, this.f28652j);
    }

    public final C3610gS0 b(long j10) {
        return j10 == this.f28645c ? this : new C3610gS0(this.f28643a, this.f28644b, j10, this.f28646d, this.f28647e, false, false, this.f28650h, this.f28651i, this.f28652j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3610gS0.class == obj.getClass()) {
            C3610gS0 c3610gS0 = (C3610gS0) obj;
            if (this.f28644b == c3610gS0.f28644b && this.f28645c == c3610gS0.f28645c && this.f28646d == c3610gS0.f28646d && this.f28647e == c3610gS0.f28647e && this.f28650h == c3610gS0.f28650h && this.f28651i == c3610gS0.f28651i && this.f28652j == c3610gS0.f28652j && Objects.equals(this.f28643a, c3610gS0.f28643a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f28643a.hashCode() + 527;
        long j10 = this.f28647e;
        long j11 = this.f28646d;
        return (((((((((((((iHashCode * 31) + ((int) this.f28644b)) * 31) + ((int) this.f28645c)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 29791) + (this.f28650h ? 1 : 0)) * 31) + (this.f28651i ? 1 : 0)) * 31) + (this.f28652j ? 1 : 0);
    }
}
