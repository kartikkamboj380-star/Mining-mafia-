package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class K3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20051c;

    public K3(String str, String str2, String str3) {
        super(str);
        this.f20050b = str2;
        this.f20051c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K3.class == obj.getClass()) {
            K3 k10 = (K3) obj;
            if (this.f18363a.equals(k10.f18363a) && Objects.equals(this.f20050b, k10.f20050b) && Objects.equals(this.f20051c, k10.f20051c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18363a.hashCode() + 527;
        String str = this.f20050b;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f20051c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.E3
    public final String toString() {
        String str = this.f18363a;
        int length = String.valueOf(str).length();
        String str2 = this.f20051c;
        StringBuilder sb = new StringBuilder(length + 6 + str2.length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }
}
