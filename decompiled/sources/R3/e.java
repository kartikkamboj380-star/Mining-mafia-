package R3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C0;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.W;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class e extends Drawable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Context f5213B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0 f5215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0 f5216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0 f5217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private U3.f f5218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Path f5219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Path f5220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f5221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f5222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Path f5223i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f5225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f5226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f5227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f5228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RectF f5229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PointF f5230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PointF f5231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PointF f5232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PointF f5233s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f5224j = new Path();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5234t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Paint f5235u = new Paint(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5236v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f5237w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f5238x = 255;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f5239y = 0.8f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private U3.e f5240z = new U3.e();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private U3.k f5212A = new U3.k();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f5214C = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5241a;

        static {
            int[] iArr = new int[U3.f.values().length];
            f5241a = iArr;
            try {
                iArr[U3.f.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5241a[U3.f.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5241a[U3.f.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(Context context) {
        this.f5213B = context;
    }

    private void D() {
        if (this.f5234t) {
            this.f5234t = false;
            if (this.f5219e == null) {
                this.f5219e = new Path();
            }
            if (this.f5220f == null) {
                this.f5220f = new Path();
            }
            if (this.f5221g == null) {
                this.f5221g = new Path();
            }
            if (this.f5222h == null) {
                this.f5222h = new Path();
            }
            if (this.f5225k == null) {
                this.f5225k = new Path();
            }
            if (this.f5226l == null) {
                this.f5226l = new RectF();
            }
            if (this.f5227m == null) {
                this.f5227m = new RectF();
            }
            if (this.f5228n == null) {
                this.f5228n = new RectF();
            }
            if (this.f5229o == null) {
                this.f5229o = new RectF();
            }
            this.f5219e.reset();
            this.f5220f.reset();
            this.f5221g.reset();
            this.f5222h.reset();
            this.f5225k.reset();
            this.f5226l.set(getBounds());
            this.f5227m.set(getBounds());
            this.f5228n.set(getBounds());
            this.f5229o.set(getBounds());
            RectF rectFL = l();
            int iG = g(0);
            int iG2 = g(1);
            int iG3 = g(2);
            int iG4 = g(3);
            int iG5 = g(8);
            int iG6 = g(9);
            int iG7 = g(11);
            int iG8 = g(10);
            if (t(9)) {
                iG2 = iG6;
                iG4 = iG2;
            }
            if (!t(10)) {
                iG8 = iG4;
            }
            if (!t(11)) {
                iG7 = iG2;
            }
            if (Color.alpha(iG) != 0 || Color.alpha(iG7) != 0 || Color.alpha(iG3) != 0 || Color.alpha(iG8) != 0 || Color.alpha(iG5) != 0) {
                RectF rectF = this.f5226l;
                rectF.top += rectFL.top;
                rectF.bottom -= rectFL.bottom;
                rectF.left += rectFL.left;
                rectF.right -= rectFL.right;
            }
            RectF rectF2 = this.f5229o;
            rectF2.top += rectFL.top * 0.5f;
            rectF2.bottom -= rectFL.bottom * 0.5f;
            rectF2.left += rectFL.left * 0.5f;
            rectF2.right -= rectFL.right * 0.5f;
            U3.k kVarD = this.f5240z.d(getLayoutDirection(), this.f5213B, C1356f0.g(this.f5227m.width()), C1356f0.g(this.f5227m.height()));
            this.f5212A = kVarD;
            U3.l lVarC = kVarD.c().c();
            U3.l lVarC2 = this.f5212A.d().c();
            U3.l lVarC3 = this.f5212A.a().c();
            U3.l lVarC4 = this.f5212A.b().c();
            float fO = o(lVarC.a(), rectFL.left);
            float fO2 = o(lVarC.b(), rectFL.top);
            float fO3 = o(lVarC2.a(), rectFL.right);
            float fO4 = o(lVarC2.b(), rectFL.top);
            float fO5 = o(lVarC4.a(), rectFL.right);
            float fO6 = o(lVarC4.b(), rectFL.bottom);
            float fO7 = o(lVarC3.a(), rectFL.left);
            float fO8 = o(lVarC3.b(), rectFL.bottom);
            Path.Direction direction = Path.Direction.CW;
            this.f5219e.addRoundRect(this.f5226l, new float[]{fO, fO2, fO3, fO4, fO5, fO6, fO7, fO8}, direction);
            this.f5220f.addRoundRect(rectFL.left > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.f5226l.left - 0.8f : this.f5226l.left, rectFL.top > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.f5226l.top - 0.8f : this.f5226l.top, rectFL.right > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.f5226l.right + 0.8f : this.f5226l.right, rectFL.bottom > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.f5226l.bottom + 0.8f : this.f5226l.bottom, new float[]{fO, fO2, fO3, fO4, fO5, fO6, fO7, fO8}, direction);
            this.f5221g.addRoundRect(this.f5227m, new float[]{lVarC.a(), lVarC.b(), lVarC2.a(), lVarC2.b(), lVarC4.a(), lVarC4.b(), lVarC3.a(), lVarC3.b()}, direction);
            C0 c10 = this.f5215a;
            float fA = c10 != null ? c10.a(8) / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f5222h.addRoundRect(this.f5228n, new float[]{lVarC.a() + fA, lVarC.b() + fA, lVarC2.a() + fA, lVarC2.b() + fA, lVarC4.a() + fA, lVarC4.b() + fA, lVarC3.a() + fA, lVarC3.b() + fA}, direction);
            this.f5225k.addRoundRect(this.f5229o, new float[]{lVarC.a() - (rectFL.left * 0.5f), lVarC.b() - (rectFL.top * 0.5f), lVarC2.a() - (rectFL.right * 0.5f), lVarC2.b() - (rectFL.top * 0.5f), lVarC4.a() - (rectFL.right * 0.5f), lVarC4.b() - (rectFL.bottom * 0.5f), lVarC3.a() - (rectFL.left * 0.5f), lVarC3.b() - (rectFL.bottom * 0.5f)}, direction);
            if (this.f5230p == null) {
                this.f5230p = new PointF();
            }
            PointF pointF = this.f5230p;
            RectF rectF3 = this.f5226l;
            float f10 = rectF3.left;
            pointF.x = f10;
            float f11 = rectF3.top;
            pointF.y = f11;
            RectF rectF4 = this.f5227m;
            m(f10, f11, (fO * 2.0f) + f10, (fO2 * 2.0f) + f11, rectF4.left, rectF4.top, f10, f11, pointF);
            if (this.f5233s == null) {
                this.f5233s = new PointF();
            }
            PointF pointF2 = this.f5233s;
            RectF rectF5 = this.f5226l;
            float f12 = rectF5.left;
            pointF2.x = f12;
            float f13 = rectF5.bottom;
            pointF2.y = f13;
            RectF rectF6 = this.f5227m;
            m(f12, f13 - (fO8 * 2.0f), (fO7 * 2.0f) + f12, f13, rectF6.left, rectF6.bottom, f12, f13, pointF2);
            if (this.f5231q == null) {
                this.f5231q = new PointF();
            }
            PointF pointF3 = this.f5231q;
            RectF rectF7 = this.f5226l;
            float f14 = rectF7.right;
            pointF3.x = f14;
            float f15 = rectF7.top;
            pointF3.y = f15;
            RectF rectF8 = this.f5227m;
            m(f14 - (fO3 * 2.0f), f15, f14, (fO4 * 2.0f) + f15, rectF8.right, rectF8.top, f14, f15, pointF3);
            if (this.f5232r == null) {
                this.f5232r = new PointF();
            }
            PointF pointF4 = this.f5232r;
            RectF rectF9 = this.f5226l;
            float f16 = rectF9.right;
            pointF4.x = f16;
            float f17 = rectF9.bottom;
            pointF4.y = f17;
            RectF rectF10 = this.f5227m;
            m(f16 - (fO5 * 2.0f), f17 - (fO6 * 2.0f), f16, f17, rectF10.right, rectF10.bottom, f16, f17, pointF4);
        }
    }

    private void E() {
        U3.f fVar = this.f5218d;
        this.f5235u.setPathEffect(fVar != null ? r(fVar, n()) : null);
    }

    private void F(int i10) {
        U3.f fVar = this.f5218d;
        this.f5235u.setPathEffect(fVar != null ? r(fVar, i10) : null);
    }

    private static int a(float f10, float f11) {
        return ((((int) f10) << 24) & (-16777216)) | (((int) f11) & 16777215);
    }

    private void b(Canvas canvas, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (i10 == 0) {
            return;
        }
        if (this.f5223i == null) {
            this.f5223i = new Path();
        }
        this.f5235u.setColor(i10);
        this.f5223i.reset();
        this.f5223i.moveTo(f10, f11);
        this.f5223i.lineTo(f12, f13);
        this.f5223i.lineTo(f14, f15);
        this.f5223i.lineTo(f16, f17);
        this.f5223i.lineTo(f10, f11);
        canvas.drawPath(this.f5223i, this.f5235u);
    }

    private void c(Canvas canvas) {
        int i10;
        e eVar;
        this.f5235u.setStyle(Paint.Style.FILL);
        int iU = u(this.f5236v, this.f5238x);
        if (Color.alpha(iU) != 0) {
            this.f5235u.setColor(iU);
            canvas.drawRect(getBounds(), this.f5235u);
        }
        List list = this.f5237w;
        if (list != null && !list.isEmpty()) {
            this.f5235u.setShader(f());
            canvas.drawRect(getBounds(), this.f5235u);
            this.f5235u.setShader(null);
        }
        RectF rectFL = l();
        int iRound = Math.round(rectFL.left);
        int iRound2 = Math.round(rectFL.top);
        int iRound3 = Math.round(rectFL.right);
        int iRound4 = Math.round(rectFL.bottom);
        if (iRound > 0 || iRound3 > 0 || iRound2 > 0 || iRound4 > 0) {
            Rect bounds = getBounds();
            int iG = g(0);
            int iG2 = g(1);
            int iG3 = g(2);
            int iG4 = g(3);
            int iG5 = g(9);
            int iG6 = g(11);
            int iG7 = g(10);
            if (t(9)) {
                iG2 = iG5;
                iG4 = iG2;
            }
            if (t(10)) {
                iG4 = iG7;
            }
            if (t(11)) {
                iG2 = iG6;
            }
            boolean z9 = getLayoutDirection() == 1;
            int iG8 = g(4);
            int iG9 = g(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f5213B)) {
                if (t(4)) {
                    iG = iG8;
                }
                if (t(5)) {
                    iG3 = iG9;
                }
                int i11 = z9 ? iG3 : iG;
                if (z9) {
                    iG3 = iG;
                }
                i10 = iRound;
                iG = i11;
            } else {
                int i12 = z9 ? iG9 : iG8;
                if (!z9) {
                    iG8 = iG9;
                }
                boolean zT = t(4);
                i10 = iRound;
                boolean zT2 = t(5);
                boolean z10 = z9 ? zT2 : zT;
                if (!z9) {
                    zT = zT2;
                }
                if (z10) {
                    iG = i12;
                }
                if (zT) {
                    iG3 = iG8;
                }
            }
            int i13 = bounds.left;
            int i14 = bounds.top;
            int iE = e(i10, iRound2, iRound3, iRound4, iG, iG2, iG3, iG4);
            int i15 = iG2;
            int i16 = iG3;
            int i17 = iG4;
            if (iE == 0) {
                this.f5235u.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (i10 > 0) {
                    float f10 = i13;
                    float f11 = i13 + i10;
                    int i18 = i14 + iHeight;
                    b(canvas, iG, f10, i14, f11, i14 + iRound2, f11, i18 - iRound4, f10, i18);
                }
                if (iRound2 > 0) {
                    float f12 = i14;
                    float f13 = i14 + iRound2;
                    int i19 = i13 + iWidth;
                    b(canvas, i15, i13, f12, i13 + i10, f13, i19 - iRound3, f13, i19, f12);
                }
                if (iRound3 > 0) {
                    int i20 = i13 + iWidth;
                    float f14 = i20;
                    int i21 = i14 + iHeight;
                    float f15 = i20 - iRound3;
                    b(canvas, i16, f14, i14, f14, i21, f15, i21 - iRound4, f15, i14 + iRound2);
                }
                if (iRound4 > 0) {
                    int i22 = i14 + iHeight;
                    float f16 = i22;
                    int i23 = iWidth + i13;
                    float f17 = i22 - iRound4;
                    eVar = this;
                    eVar.b(canvas, i17, i13, f16, i23, f16, i23 - iRound3, f17, i13 + i10, f17);
                } else {
                    eVar = this;
                }
                eVar.f5235u.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iE) != 0) {
                int i24 = bounds.right;
                int i25 = bounds.bottom;
                this.f5235u.setColor(iE);
                this.f5235u.setStyle(Paint.Style.STROKE);
                if (i10 > 0) {
                    this.f5224j.reset();
                    int iRound5 = Math.round(rectFL.left);
                    F(iRound5);
                    this.f5235u.setStrokeWidth(iRound5);
                    float f18 = (iRound5 / 2) + i13;
                    this.f5224j.moveTo(f18, i14);
                    this.f5224j.lineTo(f18, i25);
                    canvas.drawPath(this.f5224j, this.f5235u);
                }
                if (iRound2 > 0) {
                    this.f5224j.reset();
                    int iRound6 = Math.round(rectFL.top);
                    F(iRound6);
                    this.f5235u.setStrokeWidth(iRound6);
                    float f19 = (iRound6 / 2) + i14;
                    this.f5224j.moveTo(i13, f19);
                    this.f5224j.lineTo(i24, f19);
                    canvas.drawPath(this.f5224j, this.f5235u);
                }
                if (iRound3 > 0) {
                    this.f5224j.reset();
                    int iRound7 = Math.round(rectFL.right);
                    F(iRound7);
                    this.f5235u.setStrokeWidth(iRound7);
                    float f20 = i24 - (iRound7 / 2);
                    this.f5224j.moveTo(f20, i14);
                    this.f5224j.lineTo(f20, i25);
                    canvas.drawPath(this.f5224j, this.f5235u);
                }
                if (iRound4 > 0) {
                    this.f5224j.reset();
                    int iRound8 = Math.round(rectFL.bottom);
                    F(iRound8);
                    this.f5235u.setStrokeWidth(iRound8);
                    float f21 = i25 - (iRound8 / 2);
                    this.f5224j.moveTo(i13, f21);
                    this.f5224j.lineTo(i24, f21);
                    canvas.drawPath(this.f5224j, this.f5235u);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    /* JADX WARN: Code duplicated, block: B:88:0x021f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0242  */
    /* JADX WARN: Code duplicated, block: B:94:0x0265  */
    private void d(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        float f14;
        float f15;
        PointF pointF5;
        PointF pointF6;
        PointF pointF7;
        D();
        canvas.save();
        int i12 = this.f5236v;
        int iK = F.a.k(i12, (Color.alpha(i12) * this.f5238x) >> 8);
        if (Color.alpha(iK) != 0) {
            this.f5235u.setColor(iK);
            this.f5235u.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) N.f.g(this.f5220f), this.f5235u);
        }
        List list = this.f5237w;
        if (list != null && !list.isEmpty()) {
            this.f5235u.setShader(f());
            this.f5235u.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) N.f.g(this.f5220f), this.f5235u);
            this.f5235u.setShader(null);
        }
        RectF rectFL = l();
        int iG = g(0);
        int iG2 = g(1);
        int iG3 = g(2);
        int iG4 = g(3);
        int iG5 = g(9);
        int iG6 = g(11);
        int iG7 = g(10);
        if (t(9)) {
            iG2 = iG5;
            iG4 = iG2;
        }
        if (!t(10)) {
            iG7 = iG4;
        }
        if (!t(11)) {
            iG6 = iG2;
        }
        if (rectFL.top > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectFL.bottom > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectFL.left > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectFL.right > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.clipPath((Path) N.f.g(this.f5221g), Region.Op.INTERSECT);
            float fN = n();
            int iG8 = g(8);
            if (rectFL.top != fN || rectFL.bottom != fN || rectFL.left != fN || rectFL.right != fN || iG != iG8 || iG6 != iG8 || iG3 != iG8 || iG7 != iG8) {
                this.f5235u.setStyle(Paint.Style.FILL);
                canvas.clipPath((Path) N.f.g(this.f5219e), Region.Op.DIFFERENCE);
                boolean z9 = getLayoutDirection() == 1;
                int iG9 = g(4);
                int iG10 = g(5);
                if (com.facebook.react.modules.i18nmanager.a.f().d(this.f5213B)) {
                    if (t(4)) {
                        iG = iG9;
                    }
                    if (t(5)) {
                        iG3 = iG10;
                    }
                    int i13 = z9 ? iG3 : iG;
                    if (z9) {
                        iG3 = iG;
                    }
                    i10 = i13;
                } else {
                    int i14 = z9 ? iG10 : iG9;
                    if (!z9) {
                        iG9 = iG10;
                    }
                    boolean zT = t(4);
                    boolean zT2 = t(5);
                    boolean z10 = z9 ? zT2 : zT;
                    if (!z9) {
                        zT = zT2;
                    }
                    if (z10) {
                        iG = i14;
                    }
                    i10 = iG;
                    if (zT) {
                        i11 = iG9;
                    }
                    RectF rectF = (RectF) N.f.g(this.f5227m);
                    f10 = rectF.left;
                    f11 = rectF.right;
                    f12 = rectF.top;
                    f13 = rectF.bottom;
                    pointF = (PointF) N.f.g(this.f5230p);
                    pointF2 = (PointF) N.f.g(this.f5231q);
                    pointF3 = (PointF) N.f.g(this.f5233s);
                    pointF4 = (PointF) N.f.g(this.f5232r);
                    if (rectFL.left > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f14 = f13;
                        pointF5 = pointF;
                        pointF6 = pointF3;
                        pointF7 = pointF4;
                        b(canvas, i10, f10, f12 - 0.8f, pointF.x, pointF.y - 0.8f, pointF3.x, pointF3.y + 0.8f, f10, f13 + 0.8f);
                        f15 = f10;
                    } else {
                        f14 = f13;
                        f15 = f10;
                        pointF5 = pointF;
                        pointF6 = pointF3;
                        pointF7 = pointF4;
                    }
                    if (rectFL.top > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b(canvas, iG6, f15 - 0.8f, f12, pointF5.x - 0.8f, pointF5.y, pointF2.x + 0.8f, pointF2.y, f11 + 0.8f, f12);
                    }
                    if (rectFL.right > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b(canvas, i11, f11, f12 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f11, f14 + 0.8f);
                    }
                    if (rectFL.bottom > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b(canvas, iG7, f15 - 0.8f, f14, pointF6.x - 0.8f, pointF6.y, pointF7.x + 0.8f, pointF7.y, f11 + 0.8f, f14);
                    }
                }
                i11 = iG3;
                RectF rectF2 = (RectF) N.f.g(this.f5227m);
                f10 = rectF2.left;
                f11 = rectF2.right;
                f12 = rectF2.top;
                f13 = rectF2.bottom;
                pointF = (PointF) N.f.g(this.f5230p);
                pointF2 = (PointF) N.f.g(this.f5231q);
                pointF3 = (PointF) N.f.g(this.f5233s);
                pointF4 = (PointF) N.f.g(this.f5232r);
                if (rectFL.left > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f14 = f13;
                    pointF5 = pointF;
                    pointF6 = pointF3;
                    pointF7 = pointF4;
                    b(canvas, i10, f10, f12 - 0.8f, pointF.x, pointF.y - 0.8f, pointF3.x, pointF3.y + 0.8f, f10, f13 + 0.8f);
                    f15 = f10;
                } else {
                    f14 = f13;
                    f15 = f10;
                    pointF5 = pointF;
                    pointF6 = pointF3;
                    pointF7 = pointF4;
                }
                if (rectFL.top > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    b(canvas, iG6, f15 - 0.8f, f12, pointF5.x - 0.8f, pointF5.y, pointF2.x + 0.8f, pointF2.y, f11 + 0.8f, f12);
                }
                if (rectFL.right > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    b(canvas, i11, f11, f12 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f11, f14 + 0.8f);
                }
                if (rectFL.bottom > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    b(canvas, iG7, f15 - 0.8f, f14, pointF6.x - 0.8f, pointF6.y, pointF7.x + 0.8f, pointF7.y, f11 + 0.8f, f14);
                }
            } else if (fN > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f5235u.setColor(u(iG8, this.f5238x));
                this.f5235u.setStyle(Paint.Style.STROKE);
                this.f5235u.setStrokeWidth(fN);
                canvas.drawPath((Path) N.f.g(this.f5225k), this.f5235u);
            }
        }
        canvas.restore();
    }

    private static int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = (i13 > 0 ? i17 : -1) & (i10 > 0 ? i14 : -1) & (i11 > 0 ? i15 : -1) & (i12 > 0 ? i16 : -1);
        if (i10 <= 0) {
            i14 = 0;
        }
        if (i11 <= 0) {
            i15 = 0;
        }
        int i19 = i14 | i15;
        if (i12 <= 0) {
            i16 = 0;
        }
        int i20 = i19 | i16;
        if (i13 <= 0) {
            i17 = 0;
        }
        if (i18 == (i20 | i17)) {
            return i18;
        }
        return 0;
    }

    private Shader f() {
        List list = this.f5237w;
        Shader composeShader = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Shader shaderA = ((U3.a) it.next()).a(getBounds());
            if (shaderA != null) {
                composeShader = composeShader == null ? shaderA : new ComposeShader(shaderA, composeShader, PorterDuff.Mode.SRC_OVER);
            }
        }
        return composeShader;
    }

    private static void m(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, PointF pointF) {
        double d18 = (d10 + d12) / 2.0d;
        double d19 = (d11 + d13) / 2.0d;
        double d20 = d14 - d18;
        double d21 = d15 - d19;
        double dAbs = Math.abs(d12 - d10) / 2.0d;
        double dAbs2 = Math.abs(d13 - d11) / 2.0d;
        double d22 = ((d17 - d19) - d21) / ((d16 - d18) - d20);
        double d23 = d21 - (d20 * d22);
        double d24 = dAbs2 * dAbs2;
        double d25 = dAbs * dAbs;
        double d26 = d24 + (d25 * d22 * d22);
        double d27 = dAbs * 2.0d * dAbs * d23 * d22;
        double d28 = (-(d25 * ((d23 * d23) - d24))) / d26;
        double d29 = d26 * 2.0d;
        double dSqrt = ((-d27) / d29) - Math.sqrt(d28 + Math.pow(d27 / d29, 2.0d));
        double d30 = (d22 * dSqrt) + d23;
        double d31 = dSqrt + d18;
        double d32 = d30 + d19;
        if (Double.isNaN(d31) || Double.isNaN(d32)) {
            return;
        }
        pointF.x = (float) d31;
        pointF.y = (float) d32;
    }

    private static PathEffect r(U3.f fVar, float f10) {
        int i10 = a.f5241a[fVar.ordinal()];
        if (i10 == 2) {
            float f11 = f10 * 3.0f;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i10 != 3) {
            return null;
        }
        return new DashPathEffect(new float[]{f10, f10, f10, f10}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private boolean t(int i10) {
        C0 c10 = this.f5216b;
        float fA = c10 != null ? c10.a(i10) : Float.NaN;
        C0 c11 = this.f5217c;
        return (Float.isNaN(fA) || Float.isNaN(c11 != null ? c11.a(i10) : Float.NaN)) ? false : true;
    }

    private static int u(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }

    private void w(int i10, float f10) {
        if (this.f5217c == null) {
            this.f5217c = new C0(255.0f);
        }
        if (L.a(this.f5217c.b(i10), f10)) {
            return;
        }
        this.f5217c.c(i10, f10);
        invalidateSelf();
    }

    private void y(int i10, float f10) {
        if (this.f5216b == null) {
            this.f5216b = new C0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (L.a(this.f5216b.b(i10), f10)) {
            return;
        }
        this.f5216b.c(i10, f10);
        invalidateSelf();
    }

    public void A(U3.f fVar) {
        if (this.f5218d != fVar) {
            this.f5218d = fVar;
            this.f5234t = true;
            invalidateSelf();
        }
    }

    public void B(int i10, float f10) {
        if (this.f5215a == null) {
            this.f5215a = new C0();
        }
        if (L.a(this.f5215a.b(i10), f10)) {
            return;
        }
        this.f5215a.c(i10, f10);
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
            this.f5234t = true;
        }
        invalidateSelf();
    }

    public void C(int i10) {
        this.f5236v = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        E();
        if (s()) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    public int g(int i10) {
        C0 c10 = this.f5216b;
        float fA = c10 != null ? c10.a(i10) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        C0 c11 = this.f5217c;
        return a(c11 != null ? c11.a(i10) : 255.0f, fA);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5238x;
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        int i10 = this.f5214C;
        return i10 == -1 ? super.getLayoutDirection() : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int iAlpha = (Color.alpha(this.f5236v) * this.f5238x) >> 8;
        if (iAlpha != 0) {
            return iAlpha != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (!s()) {
            outline.setRect(getBounds());
        } else {
            D();
            outline.setConvexPath((Path) N.f.g(this.f5222h));
        }
    }

    public U3.e h() {
        return this.f5240z;
    }

    public Float i(int i10) {
        C0 c10 = this.f5215a;
        if (c10 == null) {
            return null;
        }
        float fB = c10.b(i10);
        if (Float.isNaN(fB)) {
            return null;
        }
        return Float.valueOf(fB);
    }

    public float j(float f10, int i10) {
        Float fI = i(i10);
        return fI == null ? f10 : fI.floatValue();
    }

    public int k() {
        return this.f5236v;
    }

    public RectF l() {
        float fJ = j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
        float fJ2 = j(fJ, 1);
        float fJ3 = j(fJ, 3);
        float fJ4 = j(fJ, 0);
        float fJ5 = j(fJ, 2);
        if (this.f5215a != null) {
            boolean z9 = getLayoutDirection() == 1;
            float fB = this.f5215a.b(4);
            float fB2 = this.f5215a.b(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f5213B)) {
                if (!Float.isNaN(fB)) {
                    fJ4 = fB;
                }
                if (!Float.isNaN(fB2)) {
                    fJ5 = fB2;
                }
                float f10 = z9 ? fJ5 : fJ4;
                if (z9) {
                    fJ5 = fJ4;
                }
                fJ4 = f10;
            } else {
                float f11 = z9 ? fB2 : fB;
                if (!z9) {
                    fB = fB2;
                }
                if (!Float.isNaN(f11)) {
                    fJ4 = f11;
                }
                if (!Float.isNaN(fB)) {
                    fJ5 = fB;
                }
            }
        }
        return new RectF(fJ4, fJ2, fJ5, fJ3);
    }

    public float n() {
        C0 c10 = this.f5215a;
        return (c10 == null || Float.isNaN(c10.b(8))) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f5215a.b(8);
    }

    public float o(float f10, float f11) {
        return Math.max(f10 - f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5234t = true;
    }

    public Path p() {
        if (!s()) {
            return null;
        }
        D();
        return new Path((Path) N.f.g(this.f5219e));
    }

    public RectF q() {
        RectF rectFL = l();
        return rectFL == null ? new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().width(), getBounds().height()) : new RectF(rectFL.left, rectFL.top, getBounds().width() - rectFL.right, getBounds().height() - rectFL.bottom);
    }

    public boolean s() {
        return this.f5240z.c();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f5238x) {
            this.f5238x = i10;
            invalidateSelf();
        }
    }

    public void v(List list) {
        this.f5237w = list;
        invalidateSelf();
    }

    public void x(int i10, Integer num) {
        float fIntValue = num == null ? Float.NaN : num.intValue() & 16777215;
        float fIntValue2 = num != null ? num.intValue() >>> 24 : Float.NaN;
        y(i10, fIntValue);
        w(i10, fIntValue2);
        this.f5234t = true;
    }

    public void z(U3.d dVar, W w10) {
        if (Objects.equals(w10, this.f5240z.b(dVar))) {
            return;
        }
        this.f5240z.e(dVar, w10);
        this.f5234t = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
