package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ar0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1481Ar0 extends AbstractC1897Ir0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17421b;

    /* synthetic */ C1481Ar0(String str, String str2, byte[] bArr) {
        this.f17420a = str;
        this.f17421b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1897Ir0
    public final String a() {
        return this.f17420a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1897Ir0
    public final String b() {
        return this.f17421b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1897Ir0) {
            AbstractC1897Ir0 abstractC1897Ir0 = (AbstractC1897Ir0) obj;
            String str = this.f17420a;
            if (str != null ? str.equals(abstractC1897Ir0.a()) : abstractC1897Ir0.a() == null) {
                String str2 = this.f17421b;
                if (str2 != null ? str2.equals(abstractC1897Ir0.b()) : abstractC1897Ir0.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17420a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f17421b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f17420a;
        int length = String.valueOf(str).length();
        String str2 = this.f17421b;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        sb.append("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(str);
        sb.append(", appId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
