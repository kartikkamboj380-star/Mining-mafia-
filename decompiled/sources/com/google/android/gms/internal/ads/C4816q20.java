package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4816q20 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4816q20 f32548c = new C4816q20(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32550b;

    static {
        new C4816q20(0, 0);
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C4816q20(int i10, int i11) {
        boolean z9 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z9 = true;
        }
        AbstractC2418Ss0.a(z9);
        this.f32549a = i10;
        this.f32550b = i11;
    }

    public final int a() {
        return this.f32549a;
    }

    public final int b() {
        return this.f32550b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4816q20) {
            C4816q20 c4816q20 = (C4816q20) obj;
            if (this.f32549a == c4816q20.f32549a && this.f32550b == c4816q20.f32550b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f32549a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f32550b;
    }

    public final String toString() {
        int i10 = this.f32549a;
        int length = String.valueOf(i10).length();
        int i11 = this.f32550b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i11).length());
        sb.append(i10);
        sb.append("x");
        sb.append(i11);
        return sb.toString();
    }
}
