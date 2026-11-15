package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes3.dex */
class K extends B {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final float[] f41364J = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    String f41365G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f41366H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Matrix f41367I;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVGLength f41368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f41369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f41370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f41371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C6769a.b f41372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C6769a.b f41373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f41374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f41375m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f41376v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f41377w;

    public K(ReactContext reactContext) {
        super(reactContext);
        this.f41367I = null;
    }

    public void G(Dynamic dynamic) {
        this.f41371i = SVGLength.b(dynamic);
        invalidate();
    }

    public void H(int i10) {
        if (i10 == 0) {
            this.f41373k = C6769a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f41373k = C6769a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void I(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f41364J;
            int iC = M.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f41367I == null) {
                    this.f41367I = new Matrix();
                }
                this.f41367I.setValues(fArr);
            } else if (iC != -1) {
                Z1.a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f41367I = null;
        }
        invalidate();
    }

    public void J(int i10) {
        if (i10 == 0) {
            this.f41372j = C6769a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f41372j = C6769a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void K(Dynamic dynamic) {
        this.f41370h = SVGLength.b(dynamic);
        invalidate();
    }

    public void L(Dynamic dynamic) {
        this.f41368f = SVGLength.b(dynamic);
        invalidate();
    }

    public void M(Dynamic dynamic) {
        this.f41369g = SVGLength.b(dynamic);
        invalidate();
    }

    RectF getViewBox() {
        float f10 = this.f41374l;
        float f11 = this.mScale;
        float f12 = this.f41375m;
        return new RectF(f10 * f11, f12 * f11, (f10 + this.f41376v) * f11, (f12 + this.f41377w) * f11);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C6769a c6769a = new C6769a(C6769a.EnumC0384a.PATTERN, new SVGLength[]{this.f41368f, this.f41369g, this.f41370h, this.f41371i}, this.f41372j);
            c6769a.d(this.f41373k);
            c6769a.g(this);
            Matrix matrix = this.f41367I;
            if (matrix != null) {
                c6769a.f(matrix);
            }
            SvgView svgView = getSvgView();
            C6769a.b bVar = this.f41372j;
            C6769a.b bVar2 = C6769a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f41373k == bVar2) {
                c6769a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c6769a, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f41365G = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f41366H = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f41374l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f41375m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f41377w = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f41376v = f10;
        invalidate();
    }
}
