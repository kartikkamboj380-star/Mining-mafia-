package J5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f2323i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f2324j = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f2325k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f2326l = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f2327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f2328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f2329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f2333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f2334h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z9 = f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Path path = this.f2333g;
        if (z9) {
            int[] iArr = f2325k;
            iArr[0] = 0;
            iArr[1] = this.f2332f;
            iArr[2] = this.f2331e;
            iArr[3] = this.f2330d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f2325k;
            iArr2[0] = 0;
            iArr2[1] = this.f2330d;
            iArr2[2] = this.f2331e;
            iArr2[3] = this.f2332f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f2326l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f2328b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f2325k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z9) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f2334h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f2328b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -i10);
        int[] iArr = f2323i;
        iArr[0] = this.f2332f;
        iArr[1] = this.f2331e;
        iArr[2] = this.f2330d;
        Paint paint = this.f2329c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f2324j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f2329c);
        canvas.restore();
    }

    public Paint c() {
        return this.f2327a;
    }

    public void d(int i10) {
        this.f2330d = F.a.k(i10, 68);
        this.f2331e = F.a.k(i10, 20);
        this.f2332f = F.a.k(i10, 0);
        this.f2327a.setColor(this.f2330d);
    }

    public a(int i10) {
        this.f2333g = new Path();
        Paint paint = new Paint();
        this.f2334h = paint;
        this.f2327a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f2328b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f2329c = new Paint(paint2);
    }
}
