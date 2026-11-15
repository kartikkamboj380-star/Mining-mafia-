package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1585Cr0 extends AbstractC3410es0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f17950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f17953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f17954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f17955f;

    /* synthetic */ C1585Cr0(IBinder iBinder, String str, int i10, float f10, int i11, int i12, String str2, int i13, String str3, String str4, String str5, byte[] bArr) {
        this.f17950a = iBinder;
        this.f17951b = str;
        this.f17952c = i10;
        this.f17953d = f10;
        this.f17954e = i13;
        this.f17955f = str4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final IBinder a() {
        return this.f17950a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final String b() {
        return this.f17951b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final int c() {
        return this.f17952c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final float d() {
        return this.f17953d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3410es0) {
            AbstractC3410es0 abstractC3410es0 = (AbstractC3410es0) obj;
            if (this.f17950a.equals(abstractC3410es0.a()) && ((str = this.f17951b) != null ? str.equals(abstractC3410es0.b()) : abstractC3410es0.b() == null) && this.f17952c == abstractC3410es0.c() && Float.floatToIntBits(this.f17953d) == Float.floatToIntBits(abstractC3410es0.d())) {
                abstractC3410es0.e();
                abstractC3410es0.f();
                abstractC3410es0.g();
                if (this.f17954e == abstractC3410es0.h()) {
                    abstractC3410es0.i();
                    String str2 = this.f17955f;
                    if (str2 != null ? str2.equals(abstractC3410es0.j()) : abstractC3410es0.j() == null) {
                        abstractC3410es0.k();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final String g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final int h() {
        return this.f17954e;
    }

    public final int hashCode() {
        int iHashCode = this.f17950a.hashCode() ^ 1000003;
        String str = this.f17951b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f17952c) * 1000003) ^ Float.floatToIntBits(this.f17953d);
        int i10 = this.f17954e;
        String str2 = this.f17955f;
        return ((((iHashCode2 * 1525764945) ^ i10) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final String i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final String j() {
        return this.f17955f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3410es0
    public final String k() {
        return null;
    }

    public final String toString() {
        String string = this.f17950a.toString();
        int length = string.length();
        String str = this.f17951b;
        int length2 = String.valueOf(str).length();
        int i10 = this.f17952c;
        int length3 = String.valueOf(i10).length();
        float f10 = this.f17953d;
        int length4 = String.valueOf(f10).length();
        int i11 = this.f17954e;
        int length5 = String.valueOf(i11).length();
        String str2 = this.f17955f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        sb.append("OverlayDisplayShowRequest{windowToken=");
        sb.append(string);
        sb.append(", appId=");
        sb.append(str);
        sb.append(", layoutGravity=");
        sb.append(i10);
        sb.append(", layoutVerticalMargin=");
        sb.append(f10);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(i11);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
