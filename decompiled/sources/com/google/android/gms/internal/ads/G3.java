package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class G3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18903d;

    public G3(String str, String str2, String str3) {
        super("----");
        this.f18901b = str;
        this.f18902c = str2;
        this.f18903d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G3.class == obj.getClass()) {
            G3 g10 = (G3) obj;
            if (Objects.equals(this.f18902c, g10.f18902c) && Objects.equals(this.f18901b, g10.f18901b) && Objects.equals(this.f18903d, g10.f18903d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18901b.hashCode() + 527) * 31) + this.f18902c.hashCode()) * 31) + this.f18903d.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.E3
    public final String toString() {
        String str = this.f18363a;
        int length = String.valueOf(str).length();
        String str2 = this.f18901b;
        int length2 = length + 9 + str2.length();
        String str3 = this.f18902c;
        StringBuilder sb = new StringBuilder(length2 + 14 + str3.length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }
}
