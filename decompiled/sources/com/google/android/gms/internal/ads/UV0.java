package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class UV0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24024d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4966rF f24026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24028h;

    /* synthetic */ UV0(TV0 tv0, byte[] bArr) {
        this.f24021a = tv0.i();
        this.f24022b = tv0.j();
        this.f24023c = tv0.k();
        this.f24025e = tv0.l();
        this.f24026f = tv0.m();
        this.f24027g = tv0.n();
        this.f24028h = tv0.o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UV0.class == obj.getClass()) {
            UV0 uv0 = (UV0) obj;
            if (this.f24021a == uv0.f24021a && this.f24022b == uv0.f24022b && this.f24023c == uv0.f24023c && this.f24025e == uv0.f24025e && this.f24027g == uv0.f24027g && this.f24028h == uv0.f24028h && this.f24026f.equals(uv0.f24026f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f24021a);
        Integer numValueOf2 = Integer.valueOf(this.f24022b);
        Integer numValueOf3 = Integer.valueOf(this.f24023c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, Integer.valueOf(this.f24025e), this.f24026f, Integer.valueOf(this.f24027g), Integer.valueOf(this.f24028h), bool, bool);
    }
}
