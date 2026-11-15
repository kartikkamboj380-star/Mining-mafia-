package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4952r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32800b;

    public C4952r8(String str, String str2) {
        this.f32799a = str;
        this.f32800b = str2;
    }

    public final String a() {
        return this.f32799a;
    }

    public final String b() {
        return this.f32800b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4952r8.class == obj.getClass()) {
            C4952r8 c4952r8 = (C4952r8) obj;
            if (TextUtils.equals(this.f32799a, c4952r8.f32799a) && TextUtils.equals(this.f32800b, c4952r8.f32800b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32799a.hashCode() * 31) + this.f32800b.hashCode();
    }

    public final String toString() {
        String str = this.f32799a;
        int length = String.valueOf(str).length();
        String str2 = this.f32800b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
