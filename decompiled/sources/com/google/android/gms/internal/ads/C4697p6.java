package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4697p6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f32292c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32290a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f32291b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32293d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f32294e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32295f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32296g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f32297h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32298i = LinearLayoutManager.INVALID_OFFSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f32299j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32300k = LinearLayoutManager.INVALID_OFFSET;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    public final C3955jD a() {
        Layout.Alignment alignment;
        float f10 = this.f32297h;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i10 = this.f32293d;
            if (i10 != 4) {
                f10 = i10 != 5 ? 0.5f : 1.0f;
            } else {
                f10 = 0.0f;
            }
        }
        int i11 = this.f32298i;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.f32293d;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 3) {
                i11 = 2;
            } else if (i12 == 4) {
                i11 = 0;
            } else if (i12 != 5) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        C3955jD c3955jD = new C3955jD();
        int i13 = this.f32293d;
        if (i13 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i13 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i13 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 != 5) {
            StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 23);
            sb.append("Unknown textAlignment: ");
            sb.append(i13);
            YU.c("WebvttCueParser", sb.toString());
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c3955jD.d(alignment);
        float f12 = this.f32294e;
        int i14 = this.f32295f;
        if (f12 != -3.4028235E38f && i14 == 0 && (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i14 == 0) {
            f11 = 1.0f;
        }
        c3955jD.f(f11, i14);
        c3955jD.g(this.f32296g);
        c3955jD.i(f10);
        c3955jD.j(i11);
        float f13 = this.f32299j;
        if (i11 == 0) {
            f10 = 1.0f - f10;
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException(String.valueOf(i11));
            }
        } else if (f10 <= 0.5f) {
            f10 += f10;
        } else {
            float f14 = 1.0f - f10;
            f10 = f14 + f14;
        }
        c3955jD.m(Math.min(f13, f10));
        c3955jD.o(this.f32300k);
        CharSequence charSequence = this.f32292c;
        if (charSequence != null) {
            c3955jD.a(charSequence);
        }
        return c3955jD;
    }
}
