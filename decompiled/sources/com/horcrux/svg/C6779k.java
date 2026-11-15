package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6779k extends AbstractC6785q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f41574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    EnumC6788t f41575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ReadableArray f41576e;

    /* JADX INFO: renamed from: com.horcrux.svg.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41577a;

        static {
            int[] iArr = new int[EnumC6788t.values().length];
            f41577a = iArr;
            try {
                iArr[EnumC6788t.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41577a[EnumC6788t.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41577a[EnumC6788t.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41577a[EnumC6788t.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C6779k(ReactContext reactContext) {
        super(reactContext);
    }

    public void D(String str) {
        this.f41574c = str;
        invalidate();
    }

    public void E(String str) {
        this.f41575d = EnumC6788t.d(str);
        invalidate();
    }

    public void F(ReadableArray readableArray) {
        this.f41576e = readableArray;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC6785q
    public Bitmap v(HashMap map, Bitmap bitmap) {
        Bitmap bitmapX = AbstractC6785q.x(map, bitmap, this.f41574c);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i10 = a.f41577a[this.f41575d.ordinal()];
        if (i10 == 1) {
            if (this.f41576e.size() >= 20) {
                float[] fArr = new float[this.f41576e.size()];
                for (int i11 = 0; i11 < this.f41576e.size(); i11++) {
                    fArr[i11] = ((float) this.f41576e.getDouble(i11)) * (i11 % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapX);
            }
            return bitmapX;
        }
        if (i10 == 2) {
            if (this.f41576e.size() == 1) {
                colorMatrix.setSaturation((float) this.f41576e.getDouble(0));
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapX);
            }
            return bitmapX;
        }
        if (i10 == 3) {
            if (this.f41576e.size() == 1) {
                double d10 = (((double) ((float) this.f41576e.getDouble(0))) * 3.141592653589793d) / 180.0d;
                float fCos = (float) Math.cos(d10);
                float fSin = (float) Math.sin(d10);
                float f10 = 0.715f - (fCos * 0.715f);
                float f11 = fSin * 0.715f;
                float f12 = 0.072f - (fCos * 0.072f);
                float f13 = 0.213f - (fCos * 0.213f);
                colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f10 - f11, f12 + (fSin * 0.928f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13 + (0.143f * fSin), (0.285f * fCos) + 0.715f + (0.14f * fSin), f12 - (0.283f * fSin), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13 - (0.787f * fSin), f10 + f11, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
            }
            return bitmapX;
        }
        if (i10 == 4) {
            colorMatrix.set(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2125f, 0.7154f, 0.0721f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapX);
    }
}
