package p173r2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p183s2.b;
import p193t2.q;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable implements b {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f48204G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f48205H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f48206I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f48207J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f48208K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f48209L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private String f48210M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f48218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f48219g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f48222j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap f48220h = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f48223k = 80;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f48224l = new Paint(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Matrix f48225m = new Matrix();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Rect f48226v = new Rect();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final RectF f48227w = new RectF();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f48211N = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f48212O = 0;

    public a() {
        i();
    }

    private void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    private void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    private void e(Canvas canvas, String str, String str2, int i10) {
        String str3 = str + ": ";
        float fMeasureText = this.f48224l.measureText(str3);
        float fMeasureText2 = this.f48224l.measureText(str2);
        this.f48224l.setColor(1711276032);
        int i11 = this.f48207J;
        int i12 = this.f48208K;
        canvas.drawRect(i11 - 4, i12 + 8, i11 + fMeasureText + fMeasureText2 + 4.0f, i12 + this.f48206I + 8, this.f48224l);
        this.f48224l.setColor(-1);
        canvas.drawText(str3, this.f48207J, this.f48208K, this.f48224l);
        this.f48224l.setColor(i10);
        canvas.drawText(str2, this.f48207J + fMeasureText, this.f48208K, this.f48224l);
        this.f48208K += this.f48206I;
    }

    private static String g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void h(Rect rect, int i10, int i11) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i11, rect.height() / i10)));
        this.f48224l.setTextSize(iMin);
        int i12 = iMin + 8;
        this.f48206I = i12;
        int i13 = this.f48223k;
        if (i13 == 80) {
            this.f48206I = i12 * (-1);
        }
        this.f48204G = rect.left + 10;
        this.f48205H = i13 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // p183s2.b
    public void a(long j10) {
        this.f48209L = j10;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f48220h.put(str, str2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f48224l.setStyle(Paint.Style.STROKE);
        this.f48224l.setStrokeWidth(2.0f);
        this.f48224l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f48224l);
        Paint paint = this.f48224l;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f48224l.setColor(this.f48212O);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f48224l);
        this.f48224l.setStyle(style);
        this.f48224l.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f48224l.setColor(-1);
        this.f48207J = this.f48204G;
        this.f48208K = this.f48205H;
        String str = this.f48214b;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f48213a, str));
        } else {
            d(canvas, "ID", this.f48213a);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f48215c), Integer.valueOf(this.f48216d)), f(this.f48215c, this.f48216d, this.f48219g));
        int i10 = this.f48216d;
        if (i10 > 0) {
            c(canvas, "IAR", Float.valueOf(this.f48215c / i10));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f48217e / IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET)));
        String str2 = this.f48218f;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i11 = this.f48221i;
        if (i11 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i11), Integer.valueOf(this.f48222j)));
        }
        q qVar = this.f48219g;
        if (qVar != null) {
            c(canvas, "scale", qVar);
        }
        long j10 = this.f48209L;
        if (j10 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j10)));
        }
        String str3 = this.f48210M;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f48211N);
        }
        for (Map.Entry entry : this.f48220h.entrySet()) {
            d(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    int f(int i10, int i11, q qVar) {
        int i12;
        int i13;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i10 > 0 && i11 > 0) {
            if (qVar != null) {
                Rect rect = this.f48226v;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f48225m.reset();
                i12 = i10;
                i13 = i11;
                qVar.a(this.f48225m, this.f48226v, i12, i13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                RectF rectF = this.f48227w;
                rectF.top = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                rectF.left = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                rectF.right = i12;
                rectF.bottom = i13;
                this.f48225m.mapRect(rectF);
                int iWidth2 = (int) this.f48227w.width();
                int iHeight2 = (int) this.f48227w.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            } else {
                i12 = i10;
                i13 = i11;
            }
            float f10 = iWidth;
            float f11 = f10 * 0.1f;
            float f12 = f10 * 0.5f;
            float f13 = iHeight;
            float f14 = 0.1f * f13;
            float f15 = f13 * 0.5f;
            int iAbs = Math.abs(i12 - iWidth);
            int iAbs2 = Math.abs(i13 - iHeight);
            float f16 = iAbs;
            if (f16 < f11 && iAbs2 < f14) {
                return -16711936;
            }
            if (f16 < f12 && iAbs2 < f15) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i() {
        this.f48215c = -1;
        this.f48216d = -1;
        this.f48217e = -1;
        this.f48220h = new HashMap();
        this.f48221i = -1;
        this.f48222j = -1;
        this.f48218f = null;
        j(null);
        this.f48209L = -1L;
        this.f48210M = null;
        this.f48211N = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f48213a = str;
        invalidateSelf();
    }

    public void k(int i10, int i11) {
        this.f48215c = i10;
        this.f48216d = i11;
        invalidateSelf();
    }

    public void l(int i10) {
        this.f48217e = i10;
    }

    public void m(q qVar) {
        this.f48219g = qVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
