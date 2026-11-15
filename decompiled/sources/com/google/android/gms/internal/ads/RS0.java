package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class RS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5270tf f22810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5637wZ0 f22812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC5270tf f22814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5637wZ0 f22816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f22817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f22818j;

    public RS0(long j10, AbstractC5270tf abstractC5270tf, int i10, C5637wZ0 c5637wZ0, long j11, AbstractC5270tf abstractC5270tf2, int i11, C5637wZ0 c5637wZ1, long j12, long j13) {
        this.f22809a = j10;
        this.f22810b = abstractC5270tf;
        this.f22811c = i10;
        this.f22812d = c5637wZ0;
        this.f22813e = j11;
        this.f22814f = abstractC5270tf2;
        this.f22815g = i11;
        this.f22816h = c5637wZ1;
        this.f22817i = j12;
        this.f22818j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RS0.class == obj.getClass()) {
            RS0 rs0 = (RS0) obj;
            if (this.f22809a == rs0.f22809a && this.f22811c == rs0.f22811c && this.f22813e == rs0.f22813e && this.f22815g == rs0.f22815g && this.f22817i == rs0.f22817i && this.f22818j == rs0.f22818j && Objects.equals(this.f22810b, rs0.f22810b) && Objects.equals(this.f22812d, rs0.f22812d) && Objects.equals(this.f22814f, rs0.f22814f) && Objects.equals(this.f22816h, rs0.f22816h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f22809a), this.f22810b, Integer.valueOf(this.f22811c), this.f22812d, Long.valueOf(this.f22813e), this.f22814f, Integer.valueOf(this.f22815g), this.f22816h, Long.valueOf(this.f22817i), Long.valueOf(this.f22818j));
    }
}
