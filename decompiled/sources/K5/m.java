package K5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f2883g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f2884h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2885i;

    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f2886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f2887d;

        a(List list, Matrix matrix) {
            this.f2886c = list;
            this.f2887d = matrix;
        }

        @Override // K5.m.g
        public void b(Matrix matrix, J5.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f2886c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(this.f2887d, aVar, i10, canvas);
            }
        }
    }

    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f2889c;

        public b(d dVar) {
            this.f2889c = dVar;
        }

        @Override // K5.m.g
        public void b(Matrix matrix, J5.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f2889c.k(), this.f2889c.o(), this.f2889c.l(), this.f2889c.j()), i10, this.f2889c.m(), this.f2889c.n());
        }
    }

    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f2890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f2891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f2892e;

        public c(e eVar, float f10, float f11) {
            this.f2890c = eVar;
            this.f2891d = f10;
            this.f2892e = f11;
        }

        @Override // K5.m.g
        public void b(Matrix matrix, J5.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.hypot(this.f2890c.f2901c - this.f2892e, this.f2890c.f2900b - this.f2891d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f2904a.set(matrix);
            this.f2904a.preTranslate(this.f2891d, this.f2892e);
            this.f2904a.preRotate(c());
            aVar.b(canvas, this.f2904a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f2890c.f2901c - this.f2892e) / (this.f2890c.f2900b - this.f2891d)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f2893h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2899g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f2897e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f2894b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f2896d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f2898f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f2899g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f2895c;
        }

        private void p(float f10) {
            this.f2897e = f10;
        }

        private void q(float f10) {
            this.f2894b = f10;
        }

        private void r(float f10) {
            this.f2896d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f2898f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f2899g = f10;
        }

        private void u(float f10) {
            this.f2895c = f10;
        }

        @Override // K5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2902a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f2893h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f2900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f2901c;

        @Override // K5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2902a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f2900b, this.f2901c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f2902a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f2903b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f2904a = new Matrix();

        g() {
        }

        public final void a(J5.a aVar, int i10, Canvas canvas) {
            b(f2903b, aVar, i10, canvas);
        }

        public abstract void b(Matrix matrix, J5.a aVar, int i10, Canvas canvas);
    }

    public m() {
        n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f2884h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f2884h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f2881e;
    }

    private float h() {
        return this.f2882f;
    }

    private void p(float f10) {
        this.f2881e = f10;
    }

    private void q(float f10) {
        this.f2882f = f10;
    }

    private void r(float f10) {
        this.f2879c = f10;
    }

    private void s(float f10) {
        this.f2880d = f10;
    }

    private void t(float f10) {
        this.f2877a = f10;
    }

    private void u(float f10) {
        this.f2878b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f2883g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z9 = f15 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z9) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z9 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f2883g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f2883g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f2885i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f2884h), new Matrix(matrix));
    }

    float i() {
        return this.f2879c;
    }

    float j() {
        return this.f2880d;
    }

    float k() {
        return this.f2877a;
    }

    float l() {
        return this.f2878b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f2900b = f10;
        eVar.f2901c = f11;
        this.f2883g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f2883g.clear();
        this.f2884h.clear();
        this.f2885i = false;
    }
}
