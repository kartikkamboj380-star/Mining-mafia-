package p193t2;

import V2.b;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class j extends m {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static boolean f49569a0 = false;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Paint f49570U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final Paint f49571V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final Bitmap f49572W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private WeakReference f49573X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f49574Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private RectF f49575Z;

    public j(Resources resources, Bitmap bitmap, Paint paint, boolean z9) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f49570U = paint2;
        Paint paint3 = new Paint(1);
        this.f49571V = paint3;
        this.f49575Z = null;
        this.f49572W = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f49574Y = z9;
    }

    public static boolean m() {
        return f49569a0;
    }

    private void p() {
        Shader shader;
        WeakReference weakReference = this.f49573X;
        if (weakReference == null || weakReference.get() != this.f49572W) {
            this.f49573X = new WeakReference(this.f49572W);
            if (this.f49572W != null) {
                Paint paint = this.f49570U;
                Bitmap bitmap = this.f49572W;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f49631f = true;
            }
        }
        if (this.f49631f && (shader = this.f49570U.getShader()) != null) {
            shader.setLocalMatrix(this.f49620O);
            this.f49631f = false;
        }
        this.f49570U.setFilterBitmap(e());
    }

    @Override // p193t2.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (b.d()) {
            b.a("RoundedBitmapDrawable#draw");
        }
        if (!g()) {
            super.draw(canvas);
            if (b.d()) {
                b.b();
                return;
            }
            return;
        }
        l();
        h();
        p();
        int iSave = canvas.save();
        canvas.concat(this.f49617L);
        if (this.f49574Y || this.f49575Z == null) {
            canvas.drawPath(this.f49630e, this.f49570U);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f49575Z);
            canvas.drawPath(this.f49630e, this.f49570U);
            canvas.restoreToCount(iSave2);
        }
        float f10 = this.f49629d;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f49571V.setStrokeWidth(f10);
            this.f49571V.setColor(C7133e.c(this.f49632g, this.f49570U.getAlpha()));
            canvas.drawPath(this.f49633h, this.f49571V);
        }
        canvas.restoreToCount(iSave);
        if (b.d()) {
            b.b();
        }
    }

    @Override // p193t2.m
    boolean g() {
        return super.g() && this.f49572W != null;
    }

    @Override // p193t2.m, p193t2.i
    public void k(boolean z9) {
        this.f49574Y = z9;
    }

    @Override // p193t2.m
    protected void l() {
        super.l();
        if (this.f49574Y) {
            return;
        }
        if (this.f49575Z == null) {
            this.f49575Z = new RectF();
        }
        this.f49620O.mapRect(this.f49575Z, this.f49639v);
    }

    @Override // p193t2.m, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        if (i10 != this.f49570U.getAlpha()) {
            this.f49570U.setAlpha(i10);
            super.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // p193t2.m, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f49570U.setColorFilter(colorFilter);
    }
}
