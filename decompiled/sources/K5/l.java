package K5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m[] f2859a = new m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f2860b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f2861c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f2862d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f2863e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f2864f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f2865g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f2866h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f2867i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f2868j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f2869k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2870l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f2871a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f2872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f2873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f2874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f2875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f2876e;

        c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f2875d = bVar;
            this.f2872a = kVar;
            this.f2876e = f10;
            this.f2874c = rectF;
            this.f2873b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f2859a[i10] = new m();
            this.f2860b[i10] = new Matrix();
            this.f2861c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f2866h[0] = this.f2859a[i10].k();
        this.f2866h[1] = this.f2859a[i10].l();
        this.f2860b[i10].mapPoints(this.f2866h);
        if (i10 == 0) {
            Path path = cVar.f2873b;
            float[] fArr = this.f2866h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f2873b;
            float[] fArr2 = this.f2866h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f2859a[i10].d(this.f2860b[i10], cVar.f2873b);
        b bVar = cVar.f2875d;
        if (bVar != null) {
            bVar.a(this.f2859a[i10], this.f2860b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f2866h[0] = this.f2859a[i10].i();
        this.f2866h[1] = this.f2859a[i10].j();
        this.f2860b[i10].mapPoints(this.f2866h);
        this.f2867i[0] = this.f2859a[i11].k();
        this.f2867i[1] = this.f2859a[i11].l();
        this.f2860b[i11].mapPoints(this.f2867i);
        float[] fArr = this.f2866h;
        float f10 = fArr[0];
        float[] fArr2 = this.f2867i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float fI = i(cVar.f2874c, i10);
        this.f2865g.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        f fVarJ = j(i10, cVar.f2872a);
        fVarJ.b(fMax, fI, cVar.f2876e, this.f2865g);
        this.f2868j.reset();
        this.f2865g.d(this.f2861c[i10], this.f2868j);
        if (this.f2870l && (fVarJ.a() || l(this.f2868j, i10) || l(this.f2868j, i11))) {
            Path path = this.f2868j;
            path.op(path, this.f2864f, Path.Op.DIFFERENCE);
            this.f2866h[0] = this.f2865g.k();
            this.f2866h[1] = this.f2865g.l();
            this.f2861c[i10].mapPoints(this.f2866h);
            Path path2 = this.f2863e;
            float[] fArr3 = this.f2866h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f2865g.d(this.f2861c[i10], this.f2863e);
        } else {
            this.f2865g.d(this.f2861c[i10], cVar.f2873b);
        }
        b bVar = cVar.f2875d;
        if (bVar != null) {
            bVar.b(this.f2865g, this.f2861c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private K5.c g(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.l();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.t() : kVar.r();
        }
        return kVar.j();
    }

    private d h(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.k();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.s() : kVar.q();
        }
        return kVar.i();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f2866h;
        m mVar = this.f2859a[i10];
        fArr[0] = mVar.f2879c;
        fArr[1] = mVar.f2880d;
        this.f2860b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f2866h[0]) : Math.abs(rectF.centerY() - this.f2866h[1]);
    }

    private f j(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.h();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.o() : kVar.p();
        }
        return kVar.n();
    }

    public static l k() {
        return a.f2871a;
    }

    private boolean l(Path path, int i10) {
        this.f2869k.reset();
        this.f2859a[i10].d(this.f2860b[i10], this.f2869k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f2869k.computeBounds(rectF, true);
        path.op(this.f2869k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f2872a).b(this.f2859a[i10], 90.0f, cVar.f2876e, cVar.f2874c, g(i10, cVar.f2872a));
        float fA = a(i10);
        this.f2860b[i10].reset();
        f(i10, cVar.f2874c, this.f2862d);
        Matrix matrix = this.f2860b[i10];
        PointF pointF = this.f2862d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f2860b[i10].preRotate(fA);
    }

    private void n(int i10) {
        this.f2866h[0] = this.f2859a[i10].i();
        this.f2866h[1] = this.f2859a[i10].j();
        this.f2860b[i10].mapPoints(this.f2866h);
        float fA = a(i10);
        this.f2861c[i10].reset();
        Matrix matrix = this.f2861c[i10];
        float[] fArr = this.f2866h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f2861c[i10].preRotate(fA);
    }

    public void d(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f2863e.rewind();
        this.f2864f.rewind();
        this.f2864f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f2863e.close();
        if (this.f2863e.isEmpty()) {
            return;
        }
        path.op(this.f2863e, Path.Op.UNION);
    }

    public void e(k kVar, float f10, RectF rectF, Path path) {
        d(kVar, f10, rectF, null, path);
    }
}
