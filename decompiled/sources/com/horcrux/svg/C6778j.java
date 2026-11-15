package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6778j extends AbstractC6785q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f41567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f41568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    EnumC6787s f41569e;

    /* JADX INFO: renamed from: com.horcrux.svg.j$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41570a;

        static {
            int[] iArr = new int[EnumC6787s.values().length];
            f41570a = iArr;
            try {
                iArr[EnumC6787s.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41570a[EnumC6787s.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41570a[EnumC6787s.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41570a[EnumC6787s.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41570a[EnumC6787s.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41570a[EnumC6787s.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C6778j(ReactContext reactContext) {
        super(reactContext);
        this.f41626b.mX = new SVGLength(0.0d);
        this.f41626b.mY = new SVGLength(0.0d);
        this.f41626b.mW = new SVGLength("100%");
        this.f41626b.mH = new SVGLength("100%");
    }

    public static /* synthetic */ float[] D(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = 1.0f - f10;
        float f12 = fArr2[0];
        float f13 = 1.0f - f12;
        float f14 = fArr[1] * f10;
        float f15 = fArr2[1];
        float f16 = (f14 * f13) + (f15 * f12 * f11) + (f14 * f15 * f12);
        float f17 = fArr[2] * f10;
        float f18 = fArr2[2];
        float f19 = fArr[3] * f10;
        float f20 = fArr2[3];
        return new float[]{1.0f - (f11 * f13), f16, (f17 * f13) + (f18 * f12 * f11) + (f17 * f18 * f12), (f13 * f19) + (f20 * f12 * f11) + (f19 * f20 * f12)};
    }

    public void E(String str) {
        this.f41567c = str;
        invalidate();
    }

    public void F(String str) {
        this.f41568d = str;
        invalidate();
    }

    public void G(String str) {
        this.f41569e = EnumC6787s.d(str);
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC6785q
    public Bitmap v(HashMap map, Bitmap bitmap) {
        Bitmap bitmapX = AbstractC6785q.x(map, bitmap, this.f41567c);
        Bitmap bitmapX2 = AbstractC6785q.x(map, bitmap, this.f41568d);
        if (this.f41569e == EnumC6787s.MULTIPLY) {
            return CustomFilter.apply(bitmapX, bitmapX2, new InterfaceC6772d() { // from class: com.horcrux.svg.i
                @Override // com.horcrux.svg.InterfaceC6772d
                public final float[] a(float[] fArr, float[] fArr2) {
                    return C6778j.D(fArr, fArr2);
                }
            });
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapX.getWidth(), bitmapX.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapX, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        int i10 = a.f41570a[this.f41569e.ordinal()];
        if (i10 == 1 || i10 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i10 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i10 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i10 == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(bitmapX2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        return bitmapCreateBitmap;
    }
}
