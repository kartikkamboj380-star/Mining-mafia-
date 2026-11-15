package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1793Gr0 extends AbstractC4038js0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19149b;

    /* synthetic */ C1793Gr0(String str, String str2, byte[] bArr) {
        this.f19148a = str;
        this.f19149b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4038js0
    public final String a() {
        return this.f19148a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4038js0
    public final String b() {
        return this.f19149b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4038js0) {
            AbstractC4038js0 abstractC4038js0 = (AbstractC4038js0) obj;
            String str = this.f19148a;
            if (str != null ? str.equals(abstractC4038js0.a()) : abstractC4038js0.a() == null) {
                String str2 = this.f19149b;
                if (str2 != null ? str2.equals(abstractC4038js0.b()) : abstractC4038js0.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19148a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f19149b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f19148a;
        int length = String.valueOf(str).length();
        String str2 = this.f19149b;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        sb.append("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(str);
        sb.append(", appId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
