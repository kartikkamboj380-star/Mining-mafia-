package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6780l extends AbstractC6785q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f41581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f41582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f41583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f41584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f41585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f41586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    EnumC6789u f41587i;

    /* JADX INFO: renamed from: com.horcrux.svg.l$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41588a;

        static {
            int[] iArr = new int[EnumC6789u.values().length];
            f41588a = iArr;
            try {
                iArr[EnumC6789u.OVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41588a[EnumC6789u.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41588a[EnumC6789u.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41588a[EnumC6789u.ATOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41588a[EnumC6789u.XOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41588a[EnumC6789u.ARITHMETIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C6780l(ReactContext reactContext) {
        super(reactContext);
    }

    public void D(String str) {
        this.f41581c = str;
        invalidate();
    }

    public void E(String str) {
        this.f41582d = str;
        invalidate();
    }

    public void F(Float f10) {
        this.f41583e = f10.floatValue();
        invalidate();
    }

    public void G(Float f10) {
        this.f41584f = f10.floatValue();
        invalidate();
    }

    public void H(Float f10) {
        this.f41585g = f10.floatValue();
        invalidate();
    }

    public void I(Float f10) {
        this.f41586h = f10.floatValue();
        invalidate();
    }

    public void J(String str) {
        this.f41587i = EnumC6789u.d(str);
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC6785q
    public Bitmap v(HashMap map, Bitmap bitmap) {
        Bitmap bitmapX = AbstractC6785q.x(map, bitmap, this.f41581c);
        Bitmap bitmapX2 = AbstractC6785q.x(map, bitmap, this.f41582d);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapX.getWidth(), bitmapX.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapX, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        switch (a.f41588a[this.f41587i.ordinal()]) {
            case 1:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                break;
            case 2:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case 3:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case 4:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case 5:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
            case 6:
                int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
                int[] iArr = new int[width];
                bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                int width2 = bitmapCreateBitmap.getWidth();
                int width3 = bitmapCreateBitmap.getWidth();
                int height = bitmapCreateBitmap.getHeight();
                int[] iArr2 = new int[width];
                bitmapX2.getPixels(iArr2, 0, width2, 0, 0, width3, height);
                int i10 = 0;
                while (i10 < width) {
                    int i11 = iArr[i10];
                    int i12 = iArr2[i10];
                    int i13 = width;
                    int[] iArr3 = iArr2;
                    float f10 = this.f41583e;
                    float f11 = (i11 >> 16) & 255;
                    float f12 = (i12 >> 16) & 255;
                    float f13 = f10 * f11 * f12;
                    float f14 = this.f41584f;
                    float f15 = f13 + (f11 * f14);
                    float f16 = this.f41585g;
                    float f17 = f15 + (f12 * f16);
                    float f18 = this.f41586h;
                    int i14 = (int) (f17 + f18);
                    float f19 = (i11 >> 8) & 255;
                    float f20 = (i12 >> 8) & 255;
                    int i15 = (int) ((f10 * f19 * f20) + (f19 * f14) + (f20 * f16) + f18);
                    float f21 = i11 & 255;
                    float f22 = i12 & 255;
                    int i16 = (int) ((f10 * f21 * f22) + (f21 * f14) + (f22 * f16) + f18);
                    float f23 = i11 >>> 24;
                    float f24 = i12 >>> 24;
                    int i17 = (int) ((f10 * f23 * f24) + (f23 * f14) + (f16 * f24) + f18);
                    int iMin = Math.min(255, Math.max(0, i14));
                    iArr[i10] = (Math.min(255, Math.max(0, i15)) << 8) | (iMin << 16) | (Math.min(255, Math.max(0, i17)) << 24) | Math.min(255, Math.max(0, i16));
                    i10++;
                    width = i13;
                    iArr2 = iArr3;
                }
                int width4 = bitmapCreateBitmap.getWidth();
                int width5 = bitmapCreateBitmap.getWidth();
                bitmapCreateBitmap = bitmapCreateBitmap;
                bitmapCreateBitmap.setPixels(iArr, 0, width4, 0, 0, width5, bitmapCreateBitmap.getHeight());
                break;
        }
        if (this.f41587i != EnumC6789u.ARITHMETIC) {
            canvas.drawBitmap(bitmapX2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        }
        return bitmapCreateBitmap;
    }
}
