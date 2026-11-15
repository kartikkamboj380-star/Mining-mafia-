package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3568g70 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28582b;

    public C3568g70(int i10, int i11) {
        String string;
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 46);
            sb.append("Player stuck buffering and not loading for ");
            sb.append(i11);
            sb.append(" ms");
            string = sb.toString();
        } else if (i10 == 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 47);
            sb2.append("Player stuck buffering with no progress for ");
            sb2.append(i11);
            sb2.append(" ms");
            string = sb2.toString();
        } else if (i10 == 2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 45);
            sb3.append("Player stuck playing with no progress for ");
            sb3.append(i11);
            sb3.append(" ms");
            string = sb3.toString();
        } else if (i10 != 3) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 31);
            sb4.append("Player stuck suppressed for ");
            sb4.append(i11);
            sb4.append(" ms");
            string = sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i11).length() + 43);
            sb5.append("Player stuck playing without ending for ");
            sb5.append(i11);
            sb5.append(" ms");
            string = sb5.toString();
        }
        super(string);
        this.f28581a = i10;
        this.f28582b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3568g70.class == obj.getClass()) {
            C3568g70 c3568g70 = (C3568g70) obj;
            if (this.f28581a == c3568g70.f28581a && this.f28582b == c3568g70.f28582b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f28581a + 527) * 31) + this.f28582b;
    }
}
