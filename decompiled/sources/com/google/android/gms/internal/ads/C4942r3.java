package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4942r3 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f32776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f32777h;

    public C4942r3(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f32770a = i10;
        this.f32771b = str;
        this.f32772c = str2;
        this.f32773d = i11;
        this.f32774e = i12;
        this.f32775f = i13;
        this.f32776g = i14;
        this.f32777h = bArr;
    }

    public static C4942r3 b(P10 p10) {
        int iB = p10.b();
        String strH = A8.h(p10.k(p10.b(), StandardCharsets.US_ASCII));
        String strK = p10.k(p10.b(), StandardCharsets.UTF_8);
        int iB2 = p10.b();
        int iB3 = p10.b();
        int iB4 = p10.b();
        int iB5 = p10.b();
        int iB6 = p10.b();
        byte[] bArr = new byte[iB6];
        p10.L(bArr, 0, iB6);
        return new C4942r3(iB, strH, strK, iB2, iB3, iB4, iB5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326u6
    public final void a(C5072s5 c5072s5) {
        c5072s5.C(this.f32777h, this.f32770a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4942r3.class == obj.getClass()) {
            C4942r3 c4942r3 = (C4942r3) obj;
            if (this.f32770a == c4942r3.f32770a && this.f32771b.equals(c4942r3.f32771b) && this.f32772c.equals(c4942r3.f32772c) && this.f32773d == c4942r3.f32773d && this.f32774e == c4942r3.f32774e && this.f32775f == c4942r3.f32775f && this.f32776g == c4942r3.f32776g && Arrays.equals(this.f32777h, c4942r3.f32777h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f32770a + 527) * 31) + this.f32771b.hashCode()) * 31) + this.f32772c.hashCode()) * 31) + this.f32773d) * 31) + this.f32774e) * 31) + this.f32775f) * 31) + this.f32776g) * 31) + Arrays.hashCode(this.f32777h);
    }

    public final String toString() {
        String str = this.f32771b;
        int length = String.valueOf(str).length();
        String str2 = this.f32772c;
        StringBuilder sb = new StringBuilder(length + 32 + str2.length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }
}
