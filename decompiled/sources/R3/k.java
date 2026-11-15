package R3;

import U3.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C1356f0;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private U3.e f5265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f5266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p f5268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f5270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f5271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private U3.k f5272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f5273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f5274k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5275a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5275a = iArr;
        }
    }

    public k(Context context, U3.e eVar, int i10, float f10, p outlineStyle, float f11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(outlineStyle, "outlineStyle");
        this.f5264a = context;
        this.f5265b = eVar;
        this.f5266c = 0.8f;
        this.f5267d = f10;
        this.f5268e = outlineStyle;
        this.f5269f = i10;
        this.f5270g = f11;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i10);
        paint.setStrokeWidth(f11);
        paint.setPathEffect(d(outlineStyle, f11));
        this.f5271h = paint;
        this.f5273j = new RectF();
        this.f5274k = new Path();
    }

    private final float a(float f10, float f11, float f12) {
        return f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f10 + (f11 * 0.5f) + f12;
    }

    private final void b(Canvas canvas) {
        this.f5274k.addRect(this.f5273j, Path.Direction.CW);
        canvas.drawPath(this.f5274k, this.f5271h);
    }

    private final void c(Canvas canvas) {
        U3.l lVar;
        U3.l lVar2;
        U3.l lVar3;
        U3.l lVar4;
        U3.l lVarB;
        U3.l lVarA;
        U3.l lVarD;
        U3.l lVarC;
        U3.k kVar = this.f5272i;
        if (kVar == null || (lVarC = kVar.c()) == null || (lVar = lVarC.c()) == null) {
            lVar = new U3.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        U3.k kVar2 = this.f5272i;
        if (kVar2 == null || (lVarD = kVar2.d()) == null || (lVar2 = lVarD.c()) == null) {
            lVar2 = new U3.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        U3.k kVar3 = this.f5272i;
        if (kVar3 == null || (lVarA = kVar3.a()) == null || (lVar3 = lVarA.c()) == null) {
            lVar3 = new U3.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        U3.k kVar4 = this.f5272i;
        if (kVar4 == null || (lVarB = kVar4.b()) == null || (lVar4 = lVarB.c()) == null) {
            lVar4 = new U3.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.f5274k.addRoundRect(this.f5273j, new float[]{a(lVar.a(), this.f5270g, this.f5267d), a(lVar.b(), this.f5270g, this.f5267d), a(lVar2.a(), this.f5270g, this.f5267d), a(lVar2.b(), this.f5270g, this.f5267d), a(lVar4.a(), this.f5270g, this.f5267d), a(lVar4.b(), this.f5270g, this.f5267d), a(lVar3.a(), this.f5270g, this.f5267d), a(lVar3.b(), this.f5270g, this.f5267d)}, Path.Direction.CW);
        canvas.drawPath(this.f5274k, this.f5271h);
    }

    private final PathEffect d(p pVar, float f10) {
        int i10 = a.f5275a[pVar.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            float f11 = f10 * 3;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i10 == 3) {
            return new DashPathEffect(new float[]{f10, f10, f10, f10}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        throw new p129m8.k();
    }

    private final void j() {
        this.f5273j.set(getBounds());
        RectF rectF = this.f5273j;
        float f10 = rectF.top;
        float f11 = this.f5270g;
        float f12 = this.f5267d;
        float f13 = this.f5266c;
        rectF.top = f10 - (((f11 * 0.5f) + f12) - f13);
        rectF.bottom += ((f11 * 0.5f) + f12) - f13;
        rectF.left -= ((f11 * 0.5f) + f12) - f13;
        rectF.right += ((f11 * 0.5f) + f12) - f13;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        U3.k kVarD;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f5270g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.f5274k.reset();
        U3.e eVar = this.f5265b;
        if (eVar != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.f5264a;
            C1356f0 c1356f0 = C1356f0.f15679a;
            kVarD = eVar.d(layoutDirection, context, c1356f0.f(getBounds().width()), c1356f0.f(getBounds().height()));
        } else {
            kVarD = null;
        }
        this.f5272i = kVarD;
        j();
        U3.k kVar = this.f5272i;
        if (kVar == null || kVar == null || !kVar.e()) {
            b(canvas);
        } else {
            c(canvas);
        }
    }

    public final void e(U3.e eVar) {
        this.f5265b = eVar;
    }

    public final void f(int i10) {
        if (i10 != this.f5269f) {
            this.f5269f = i10;
            this.f5271h.setColor(i10);
            invalidateSelf();
        }
    }

    public final void g(float f10) {
        if (f10 == this.f5267d) {
            return;
        }
        this.f5267d = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f5271h.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    public final void h(p value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.f5268e) {
            this.f5268e = value;
            this.f5271h.setPathEffect(d(value, this.f5270g));
            invalidateSelf();
        }
    }

    public final void i(float f10) {
        if (f10 == this.f5270g) {
            return;
        }
        this.f5270g = f10;
        this.f5271h.setStrokeWidth(f10);
        this.f5271h.setPathEffect(d(this.f5268e, f10));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5271h.setAlpha(B8.a.c((i10 / 255.0f) * (Color.alpha(this.f5269f) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5271h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
