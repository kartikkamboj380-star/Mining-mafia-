package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Er0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1689Er0 extends AbstractC3662gs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18578c;

    /* synthetic */ C1689Er0(int i10, String str, int i11, byte[] bArr) {
        this.f18576a = i10;
        this.f18577b = str;
        this.f18578c = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3662gs0
    public final int a() {
        return this.f18576a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3662gs0
    public final String b() {
        return this.f18577b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3662gs0
    public final int c() {
        return this.f18578c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3662gs0) {
            AbstractC3662gs0 abstractC3662gs0 = (AbstractC3662gs0) obj;
            if (this.f18576a == abstractC3662gs0.a() && ((str = this.f18577b) != null ? str.equals(abstractC3662gs0.b()) : abstractC3662gs0.b() == null) && this.f18578c == abstractC3662gs0.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18577b;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.f18576a ^ 1000003) * 1000003)) * 1000003) ^ this.f18578c;
    }

    public final String toString() {
        int i10 = this.f18576a;
        int length = String.valueOf(i10).length();
        String str = this.f18577b;
        int length2 = String.valueOf(str).length();
        int i11 = this.f18578c;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i11).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i10);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i11);
        sb.append("}");
        return sb.toString();
    }
}
