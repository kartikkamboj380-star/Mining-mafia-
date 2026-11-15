package com.facebook.yoga;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class YogaValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final YogaValue f16606c = new YogaValue(Float.NaN, w.UNDEFINED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final YogaValue f16607d = new YogaValue(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, w.POINT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final YogaValue f16608e = new YogaValue(Float.NaN, w.AUTO);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f16610b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16611a;

        static {
            int[] iArr = new int[w.values().length];
            f16611a = iArr;
            try {
                iArr[w.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16611a[w.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16611a[w.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16611a[w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public YogaValue(float f10, w wVar) {
        this.f16609a = f10;
        this.f16610b = wVar;
    }

    public static YogaValue a(String str) {
        if (str == null) {
            return null;
        }
        if ("undefined".equals(str)) {
            return f16606c;
        }
        if ("auto".equals(str)) {
            return f16608e;
        }
        return str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), w.PERCENT) : new YogaValue(Float.parseFloat(str), w.POINT);
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            w wVar = this.f16610b;
            if (wVar == yogaValue.f16610b) {
                return wVar == w.UNDEFINED || wVar == w.AUTO || Float.compare(this.f16609a, yogaValue.f16609a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f16609a) + this.f16610b.e();
    }

    public String toString() {
        int i10 = a.f16611a[this.f16610b.ordinal()];
        if (i10 == 1) {
            return "undefined";
        }
        if (i10 == 2) {
            return Float.toString(this.f16609a);
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f16609a + "%";
    }

    YogaValue(float f10, int i10) {
        this(f10, w.d(i10));
    }
}
