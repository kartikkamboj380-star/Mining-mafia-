package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4499nX extends AbstractC4877qX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable f31831c;

    C4499nX(String str, String str2, Drawable drawable) {
        this.f31829a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f31830b = str2;
        this.f31831c = drawable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4877qX
    final String a() {
        return this.f31829a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4877qX
    final String b() {
        return this.f31830b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4877qX
    final Drawable c() {
        return this.f31831c;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4877qX) {
            AbstractC4877qX abstractC4877qX = (AbstractC4877qX) obj;
            String str = this.f31829a;
            if (str != null ? str.equals(abstractC4877qX.a()) : abstractC4877qX.a() == null) {
                if (this.f31830b.equals(abstractC4877qX.b()) && ((drawable = this.f31831c) != null ? drawable.equals(abstractC4877qX.c()) : abstractC4877qX.c() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f31829a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f31830b.hashCode();
        Drawable drawable = this.f31831c;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f31831c);
        String str = this.f31829a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.f31830b;
        StringBuilder sb = new StringBuilder(length + 42 + str2.length() + 7 + length2 + 1);
        sb.append("OfflineAdAssets{advertiserName=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
