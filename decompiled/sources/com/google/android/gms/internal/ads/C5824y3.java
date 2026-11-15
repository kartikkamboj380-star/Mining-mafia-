package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5824y3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35236d;

    public C5824y3(String str, String str2, String str3) {
        super("COMM");
        this.f35234b = str;
        this.f35235c = str2;
        this.f35236d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5824y3.class == obj.getClass()) {
            C5824y3 c5824y3 = (C5824y3) obj;
            if (Objects.equals(this.f35235c, c5824y3.f35235c) && Objects.equals(this.f35234b, c5824y3.f35234b) && Objects.equals(this.f35236d, c5824y3.f35236d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f35234b.hashCode() + 527) * 31) + this.f35235c.hashCode();
        String str = this.f35236d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.E3
    public final String toString() {
        String str = this.f18363a;
        int length = String.valueOf(str).length();
        String str2 = this.f35236d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f35234b;
        int length3 = length + 11 + str3.length();
        String str4 = this.f35235c;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 7 + length2);
        sb.append(str);
        sb.append(": language=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        sb.append(", text=");
        sb.append(str2);
        return sb.toString();
    }
}
