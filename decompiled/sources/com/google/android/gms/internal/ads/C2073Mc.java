package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2073Mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4819q4 f20878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20884i;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public C2073Mc(Object obj, int i10, C4819q4 c4819q4, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        AbstractC2418Ss0.a(i10 >= 0);
        AbstractC2418Ss0.a(i11 >= 0);
        this.f20876a = obj;
        this.f20877b = i10;
        this.f20878c = c4819q4;
        this.f20879d = obj2;
        this.f20880e = i11;
        this.f20881f = j10;
        this.f20882g = j11;
        this.f20883h = i12;
        this.f20884i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2073Mc.class == obj.getClass()) {
            C2073Mc c2073Mc = (C2073Mc) obj;
            if (this.f20877b == c2073Mc.f20877b && this.f20880e == c2073Mc.f20880e && this.f20881f == c2073Mc.f20881f && this.f20882g == c2073Mc.f20882g && this.f20883h == c2073Mc.f20883h && this.f20884i == c2073Mc.f20884i && Objects.equals(this.f20878c, c2073Mc.f20878c) && Objects.equals(this.f20876a, c2073Mc.f20876a) && Objects.equals(this.f20879d, c2073Mc.f20879d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20876a, Integer.valueOf(this.f20877b), this.f20878c, this.f20879d, Integer.valueOf(this.f20880e), Long.valueOf(this.f20881f), Long.valueOf(this.f20882g), Integer.valueOf(this.f20883h), Integer.valueOf(this.f20884i));
    }

    public final String toString() {
        int i10 = this.f20877b;
        int length = String.valueOf(i10).length();
        int i11 = this.f20880e;
        int length2 = String.valueOf(i11).length();
        long j10 = this.f20881f;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j10).length());
        sb.append("mediaItem=");
        sb.append(i10);
        sb.append(", period=");
        sb.append(i11);
        sb.append(", pos=");
        sb.append(j10);
        String string = sb.toString();
        int i12 = this.f20883h;
        if (i12 == -1) {
            return string;
        }
        long j11 = this.f20882g;
        int i13 = this.f20884i;
        int length3 = string.length();
        StringBuilder sb2 = new StringBuilder(length3 + 13 + String.valueOf(j11).length() + 10 + String.valueOf(i12).length() + 5 + String.valueOf(i13).length());
        sb2.append(string);
        sb2.append(", contentPos=");
        sb2.append(j11);
        sb2.append(", adGroup=");
        sb2.append(i12);
        sb2.append(", ad=");
        sb2.append(i13);
        return sb2.toString();
    }
}
