package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
final class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f39299n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f39300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f39301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39302c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39304e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39311l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39303d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f39305f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39306g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f39307h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f39308i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39309j = f39299n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39310k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f39312m = null;

    static class a extends Exception {
    }

    private h(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f39300a = charSequence;
        this.f39301b = textPaint;
        this.f39302c = i10;
        this.f39304e = charSequence.length();
    }

    public static h b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new h(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f39300a == null) {
            this.f39300a = "";
        }
        int iMax = Math.max(0, this.f39302c);
        CharSequence charSequenceEllipsize = this.f39300a;
        if (this.f39306g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f39301b, iMax, this.f39312m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f39304e);
        this.f39304e = iMin;
        if (this.f39311l && this.f39306g == 1) {
            this.f39305f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f39303d, iMin, this.f39301b, iMax);
        builderObtain.setAlignment(this.f39305f);
        builderObtain.setIncludePad(this.f39310k);
        builderObtain.setTextDirection(this.f39311l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f39312m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f39306g);
        float f10 = this.f39307h;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f39308i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f39308i);
        }
        if (this.f39306g > 1) {
            builderObtain.setHyphenationFrequency(this.f39309j);
        }
        return builderObtain.build();
    }

    public h c(Layout.Alignment alignment) {
        this.f39305f = alignment;
        return this;
    }

    public h d(TextUtils.TruncateAt truncateAt) {
        this.f39312m = truncateAt;
        return this;
    }

    public h e(int i10) {
        this.f39309j = i10;
        return this;
    }

    public h f(boolean z9) {
        this.f39310k = z9;
        return this;
    }

    public h g(boolean z9) {
        this.f39311l = z9;
        return this;
    }

    public h h(float f10, float f11) {
        this.f39307h = f10;
        this.f39308i = f11;
        return this;
    }

    public h i(int i10) {
        this.f39306g = i10;
        return this;
    }

    public h j(i iVar) {
        return this;
    }
}
