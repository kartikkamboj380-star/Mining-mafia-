package R3;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.K;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f5278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f5279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f5280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f5281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private U3.e f5282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f5283h;

    public m(Context context, int i10, float f10, float f11, float f12, float f13, U3.e eVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5276a = context;
        this.f5277b = i10;
        this.f5278c = f10;
        this.f5279d = f11;
        this.f5280e = f12;
        this.f5281f = f13;
        this.f5282g = eVar;
        Paint paint = new Paint();
        paint.setColor(i10);
        float fX = K.f15352a.x(f12 * 0.5f);
        if (fX > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            paint.setMaskFilter(new BlurMaskFilter(fX, BlurMaskFilter.Blur.NORMAL));
        }
        this.f5283h = paint;
    }

    private final void a(Canvas canvas, RectF rectF) {
        canvas.clipOutRect(getBounds());
        canvas.drawRect(rectF, this.f5283h);
    }

    private final void b(Canvas canvas, RectF rectF, float f10, U3.k kVar) {
        RectF rectF2 = new RectF(getBounds());
        rectF2.inset(0.4f, 0.4f);
        Path path = new Path();
        float[] fArr = {kVar.c().a(), kVar.c().b(), kVar.d().a(), kVar.d().b(), kVar.b().a(), kVar.b().b(), kVar.a().a(), kVar.a().b()};
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, fArr, direction);
        canvas.clipOutPath(path);
        Path path2 = new Path();
        path2.addRoundRect(rectF, new float[]{d.a(kVar.c().a(), f10), d.a(kVar.c().b(), f10), d.a(kVar.d().a(), f10), d.a(kVar.d().b(), f10), d.a(kVar.b().a(), f10), d.a(kVar.b().b(), f10), d.a(kVar.a().a(), f10), d.a(kVar.a().b(), f10)}, direction);
        canvas.drawPath(path2, this.f5283h);
    }

    public final void c(U3.e eVar) {
        this.f5282g = eVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        U3.k kVarD;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        C1356f0 c1356f0 = C1356f0.f15679a;
        float fE = c1356f0.e(getBounds().width());
        float fE2 = c1356f0.e(getBounds().height());
        U3.e eVar = this.f5282g;
        U3.k kVar = (eVar == null || (kVarD = eVar.d(getLayoutDirection(), this.f5276a, fE, fE2)) == null) ? null : new U3.k(new U3.l(c1356f0.b(kVarD.c().a()), c1356f0.b(kVarD.c().b())), new U3.l(c1356f0.b(kVarD.d().a()), c1356f0.b(kVarD.d().b())), new U3.l(c1356f0.b(kVarD.a().a()), c1356f0.b(kVarD.a().b())), new U3.l(c1356f0.b(kVarD.b().a()), c1356f0.b(kVarD.b().b())));
        float fB = c1356f0.b(this.f5281f);
        RectF rectF = new RectF(getBounds());
        float f10 = -fB;
        rectF.inset(f10, f10);
        rectF.offset(c1356f0.b(this.f5278c), c1356f0.b(this.f5279d));
        int iSave = canvas.save();
        if (kVar == null || !kVar.e()) {
            a(canvas, rectF);
        } else {
            b(canvas, rectF, fB, kVar);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f5283h.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5283h.setAlpha(B8.a.c((i10 / 255.0f) * (Color.alpha(this.f5277b) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5283h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
