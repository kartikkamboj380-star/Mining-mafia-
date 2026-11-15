package R3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C1356f0;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private U3.e f5173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U3.c f5174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f5175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f5176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private U3.k f5177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RectF f5180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Path f5181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f5182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f5183l;

    public a(Context context, U3.e eVar, U3.c cVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5172a = context;
        this.f5173b = eVar;
        this.f5174c = cVar;
        this.f5175d = 0.8f;
        this.f5178g = true;
        this.f5180i = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f5179h);
        this.f5183l = paint;
    }

    private final RectF a() {
        float fB;
        float fB2;
        float fB3;
        U3.c cVar = this.f5174c;
        RectF rectFA = cVar != null ? cVar.a(getLayoutDirection(), this.f5172a) : null;
        float fB4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (rectFA != null) {
            fB = C1356f0.f15679a.b(rectFA.left);
        } else {
            fB = 0.0f;
        }
        if (rectFA != null) {
            fB2 = C1356f0.f15679a.b(rectFA.top);
        } else {
            fB2 = 0.0f;
        }
        if (rectFA != null) {
            fB3 = C1356f0.f15679a.b(rectFA.right);
        } else {
            fB3 = 0.0f;
        }
        if (rectFA != null) {
            fB4 = C1356f0.f15679a.b(rectFA.bottom);
        }
        return new RectF(fB, fB2, fB3, fB4);
    }

    private final Shader c() {
        List<U3.a> list = this.f5182k;
        Shader composeShader = null;
        if (list != null) {
            for (U3.a aVar : list) {
                Rect bounds = getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                Shader shaderA = aVar.a(bounds);
                composeShader = composeShader == null ? shaderA : new ComposeShader(shaderA, composeShader, PorterDuff.Mode.SRC_OVER);
            }
        }
        return composeShader;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    private final void h() {
        U3.k kVarD;
        boolean z9;
        Path path;
        U3.l lVarA;
        U3.l lVarA2;
        U3.l lVarB;
        U3.l lVarB2;
        U3.l lVarD;
        U3.l lVarD2;
        U3.l lVarC;
        U3.l lVarC2;
        U3.e eVar;
        U3.k kVar;
        if (this.f5178g) {
            this.f5178g = false;
            this.f5180i.set(getBounds());
            this.f5176e = a();
            U3.e eVar2 = this.f5173b;
            if (eVar2 != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.f5172a;
                C1356f0 c1356f0 = C1356f0.f15679a;
                kVarD = eVar2.d(layoutDirection, context, c1356f0.f(getBounds().width()), c1356f0.f(getBounds().height()));
            } else {
                kVarD = null;
            }
            this.f5177f = kVarD;
            RectF rectF = this.f5176e;
            Float fValueOf = rectF != null ? Float.valueOf(rectF.left) : null;
            float fB = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (Intrinsics.a(fValueOf, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                RectF rectF2 = this.f5176e;
                if (Intrinsics.a(rectF2 != null ? Float.valueOf(rectF2.top) : null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    RectF rectF3 = this.f5176e;
                    if (Intrinsics.a(rectF3 != null ? Float.valueOf(rectF3.right) : null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        RectF rectF4 = this.f5176e;
                        if (Intrinsics.a(rectF4 != null ? Float.valueOf(rectF4.bottom) : null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                    } else {
                        z9 = true;
                    }
                } else {
                    z9 = true;
                }
            } else {
                z9 = true;
            }
            U3.k kVar2 = this.f5177f;
            if (kVar2 != null && kVar2.e() && (kVar = this.f5177f) != null && !kVar.f()) {
                Path path2 = this.f5181j;
                if (path2 == null) {
                    path2 = new Path();
                }
                this.f5181j = path2;
                path2.reset();
            }
            if (z9 && (eVar = this.f5173b) != null && eVar.c()) {
                RectF rectF5 = this.f5180i;
                float f10 = rectF5.left;
                float f11 = this.f5175d;
                rectF5.left = f10 + f11;
                rectF5.top += f11;
                rectF5.right -= f11;
                rectF5.bottom -= f11;
            }
            U3.e eVar3 = this.f5173b;
            if (eVar3 == null || !eVar3.c()) {
                return;
            }
            U3.k kVar3 = this.f5177f;
            if ((kVar3 == null || !kVar3.f()) && (path = this.f5181j) != null) {
                RectF rectF6 = this.f5180i;
                U3.k kVar4 = this.f5177f;
                float fB2 = (kVar4 == null || (lVarC2 = kVar4.c()) == null) ? 0.0f : C1356f0.f15679a.b(lVarC2.a());
                U3.k kVar5 = this.f5177f;
                float fB3 = (kVar5 == null || (lVarC = kVar5.c()) == null) ? 0.0f : C1356f0.f15679a.b(lVarC.b());
                U3.k kVar6 = this.f5177f;
                float fB4 = (kVar6 == null || (lVarD2 = kVar6.d()) == null) ? 0.0f : C1356f0.f15679a.b(lVarD2.a());
                U3.k kVar7 = this.f5177f;
                float fB5 = (kVar7 == null || (lVarD = kVar7.d()) == null) ? 0.0f : C1356f0.f15679a.b(lVarD.b());
                U3.k kVar8 = this.f5177f;
                float fB6 = (kVar8 == null || (lVarB2 = kVar8.b()) == null) ? 0.0f : C1356f0.f15679a.b(lVarB2.a());
                U3.k kVar9 = this.f5177f;
                float fB7 = (kVar9 == null || (lVarB = kVar9.b()) == null) ? 0.0f : C1356f0.f15679a.b(lVarB.b());
                U3.k kVar10 = this.f5177f;
                float fB8 = (kVar10 == null || (lVarA2 = kVar10.a()) == null) ? 0.0f : C1356f0.f15679a.b(lVarA2.a());
                U3.k kVar11 = this.f5177f;
                if (kVar11 != null && (lVarA = kVar11.a()) != null) {
                    fB = C1356f0.f15679a.b(lVarA.b());
                }
                path.addRoundRect(rectF6, new float[]{fB2, fB3, fB4, fB5, fB6, fB7, fB8, fB}, Path.Direction.CW);
            }
        }
    }

    public final int b() {
        return this.f5179h;
    }

    public final void d(int i10) {
        if (this.f5179h != i10) {
            this.f5179h = i10;
            this.f5183l.setColor(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        U3.e eVar;
        U3.l lVarC;
        U3.l lVarC2;
        U3.e eVar2;
        U3.l lVarC3;
        U3.l lVarC4;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        h();
        canvas.save();
        int alpha = this.f5183l.getAlpha();
        float fB = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (alpha != 0) {
            U3.k kVar = this.f5177f;
            if (kVar == null || !kVar.f() || (eVar2 = this.f5173b) == null || !eVar2.c()) {
                U3.e eVar3 = this.f5173b;
                if (eVar3 == null || !eVar3.c()) {
                    canvas.drawRect(this.f5180i, this.f5183l);
                } else {
                    Path path = this.f5181j;
                    if (path == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path, this.f5183l);
                }
            } else {
                RectF rectF = this.f5180i;
                U3.k kVar2 = this.f5177f;
                float fB2 = (kVar2 == null || (lVarC4 = kVar2.c()) == null) ? 0.0f : C1356f0.f15679a.b(lVarC4.a());
                U3.k kVar3 = this.f5177f;
                canvas.drawRoundRect(rectF, fB2, (kVar3 == null || (lVarC3 = kVar3.c()) == null) ? 0.0f : C1356f0.f15679a.b(lVarC3.b()), this.f5183l);
            }
        }
        this.f5183l.setAlpha(255);
        List list = this.f5182k;
        if (list != null && list != null && (!list.isEmpty())) {
            this.f5183l.setShader(c());
            U3.k kVar4 = this.f5177f;
            if (kVar4 == null || !kVar4.f() || (eVar = this.f5173b) == null || !eVar.c()) {
                U3.e eVar4 = this.f5173b;
                if (eVar4 == null || !eVar4.c()) {
                    canvas.drawRect(this.f5180i, this.f5183l);
                } else {
                    Path path2 = this.f5181j;
                    if (path2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path2, this.f5183l);
                }
            } else {
                RectF rectF2 = this.f5180i;
                U3.k kVar5 = this.f5177f;
                float fB3 = (kVar5 == null || (lVarC2 = kVar5.c()) == null) ? 0.0f : C1356f0.f15679a.b(lVarC2.a());
                U3.k kVar6 = this.f5177f;
                if (kVar6 != null && (lVarC = kVar6.c()) != null) {
                    fB = C1356f0.f15679a.b(lVarC.b());
                }
                canvas.drawRoundRect(rectF2, fB3, fB, this.f5183l);
            }
            this.f5183l.setShader(null);
        }
        this.f5183l.setAlpha(Color.alpha(this.f5179h));
        canvas.restore();
    }

    public final void e(List list) {
        if (Intrinsics.b(this.f5182k, list)) {
            return;
        }
        this.f5182k = list;
        invalidateSelf();
    }

    public final void f(U3.c cVar) {
        this.f5174c = cVar;
    }

    public final void g(U3.e eVar) {
        this.f5173b = eVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f5183l.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f5178g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f5178g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5183l.setAlpha(B8.a.c((i10 / 255.0f) * (Color.alpha(this.f5179h) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
