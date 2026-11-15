package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4819q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4563o2 f32557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N1 f32558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T5 f32559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f32560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4817q3 f32561f;

    static {
        new M01().c();
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ C4819q4(String str, C3426f0 c3426f0, C4563o2 c4563o2, N1 n10, T5 t10, C4817q3 c4817q3, byte[] bArr) {
        this.f32556a = str;
        this.f32557b = c4563o2;
        this.f32558c = n10;
        this.f32559d = t10;
        this.f32560e = c3426f0;
        this.f32561f = c4817q3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4819q4)) {
            return false;
        }
        C4819q4 c4819q4 = (C4819q4) obj;
        return Objects.equals(this.f32556a, c4819q4.f32556a) && this.f32560e.equals(c4819q4.f32560e) && Objects.equals(this.f32557b, c4819q4.f32557b) && Objects.equals(this.f32558c, c4819q4.f32558c) && Objects.equals(this.f32559d, c4819q4.f32559d) && Objects.equals(this.f32561f, c4819q4.f32561f);
    }

    public final int hashCode() {
        int iHashCode = this.f32556a.hashCode() * 31;
        C4563o2 c4563o2 = this.f32557b;
        return (((((((iHashCode + (c4563o2 != null ? c4563o2.hashCode() : 0)) * 31) + this.f32558c.hashCode()) * 31) + this.f32560e.hashCode()) * 31) + this.f32559d.hashCode()) * 31;
    }
}
