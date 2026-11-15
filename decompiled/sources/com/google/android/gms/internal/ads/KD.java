package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class KD {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f20121A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f20122B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f20123C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f20124D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f20125E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f20126F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final String f20127G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final String f20128H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final String f20129I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f20130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f20131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f20132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f20133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f20134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f20135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f20136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f20137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f20138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f20139z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f20140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f20141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f20142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f20143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f20147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f20149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f20150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f20152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f20153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f20154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f20155p;

    static {
        C3955jD c3955jD = new C3955jD();
        c3955jD.a("");
        c3955jD.r();
        String str = AbstractC4634ob0.f32117a;
        f20130q = Integer.toString(0, 36);
        f20131r = Integer.toString(17, 36);
        f20132s = Integer.toString(1, 36);
        f20133t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f20134u = Integer.toString(18, 36);
        f20135v = Integer.toString(4, 36);
        f20136w = Integer.toString(5, 36);
        f20137x = Integer.toString(6, 36);
        f20138y = Integer.toString(7, 36);
        f20139z = Integer.toString(8, 36);
        f20121A = Integer.toString(9, 36);
        f20122B = Integer.toString(10, 36);
        f20123C = Integer.toString(11, 36);
        f20124D = Integer.toString(12, 36);
        f20125E = Integer.toString(13, 36);
        f20126F = Integer.toString(14, 36);
        f20127G = Integer.toString(15, 36);
        f20128H = Integer.toString(16, 36);
        f20129I = Integer.toString(19, 36);
    }

    /* synthetic */ KD(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z9, int i14, int i15, float f15, int i16, byte[] bArr) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC2418Ss0.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f20140a = SpannedString.valueOf(charSequence);
        } else {
            this.f20140a = charSequence != null ? charSequence.toString() : null;
        }
        this.f20141b = alignment;
        this.f20142c = alignment2;
        this.f20143d = bitmap;
        this.f20144e = f10;
        this.f20145f = i10;
        this.f20146g = i11;
        this.f20147h = f11;
        this.f20148i = i12;
        this.f20149j = f13;
        this.f20150k = f14;
        this.f20151l = i13;
        this.f20152m = f12;
        this.f20153n = i15;
        this.f20154o = f15;
        this.f20155p = i16;
    }

    public final C3955jD a() {
        return new C3955jD(this, null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f20140a;
        if (charSequence != null) {
            bundle.putCharSequence(f20130q, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListA = AbstractC5092sF.a((Spanned) charSequence);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f20131r, arrayListA);
                }
            }
        }
        bundle.putSerializable(f20132s, this.f20141b);
        bundle.putSerializable(f20133t, this.f20142c);
        bundle.putFloat(f20135v, this.f20144e);
        bundle.putInt(f20136w, this.f20145f);
        bundle.putInt(f20137x, this.f20146g);
        bundle.putFloat(f20138y, this.f20147h);
        bundle.putInt(f20139z, this.f20148i);
        bundle.putInt(f20121A, this.f20151l);
        bundle.putFloat(f20122B, this.f20152m);
        bundle.putFloat(f20123C, this.f20149j);
        bundle.putFloat(f20124D, this.f20150k);
        bundle.putBoolean(f20126F, false);
        bundle.putInt(f20125E, -16777216);
        bundle.putInt(f20127G, this.f20153n);
        bundle.putFloat(f20128H, this.f20154o);
        bundle.putInt(f20129I, this.f20155p);
        Bitmap bitmap = this.f20143d;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AbstractC2418Ss0.i(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f20134u, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && KD.class == obj.getClass()) {
            KD kd = (KD) obj;
            if (TextUtils.equals(this.f20140a, kd.f20140a) && this.f20141b == kd.f20141b && this.f20142c == kd.f20142c && ((bitmap = this.f20143d) != null ? !((bitmap2 = kd.f20143d) == null || !bitmap.sameAs(bitmap2)) : kd.f20143d == null) && this.f20144e == kd.f20144e && this.f20145f == kd.f20145f && this.f20146g == kd.f20146g && this.f20147h == kd.f20147h && this.f20148i == kd.f20148i && this.f20149j == kd.f20149j && this.f20150k == kd.f20150k && this.f20151l == kd.f20151l && this.f20152m == kd.f20152m && this.f20153n == kd.f20153n && this.f20154o == kd.f20154o && this.f20155p == kd.f20155p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20140a, this.f20141b, this.f20142c, this.f20143d, Float.valueOf(this.f20144e), Integer.valueOf(this.f20145f), Integer.valueOf(this.f20146g), Float.valueOf(this.f20147h), Integer.valueOf(this.f20148i), Float.valueOf(this.f20149j), Float.valueOf(this.f20150k), Boolean.FALSE, -16777216, Integer.valueOf(this.f20151l), Float.valueOf(this.f20152m), Integer.valueOf(this.f20153n), Float.valueOf(this.f20154o), Integer.valueOf(this.f20155p));
    }
}
