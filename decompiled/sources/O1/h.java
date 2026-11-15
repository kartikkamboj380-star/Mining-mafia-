package O1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static HashSet f4256i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f4257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f4258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private O1.g f4259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0073h f4260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Stack f4261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Stack f4262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Stack f4263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private O1.b.q f4264h = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f4267c;

        static {
            int[] iArr = new int[O1.g.E.d.values().length];
            f4267c = iArr;
            try {
                iArr[O1.g.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4267c[O1.g.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4267c[O1.g.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[O1.g.E.c.values().length];
            f4266b = iArr2;
            try {
                iArr2[O1.g.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4266b[O1.g.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4266b[O1.g.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[O1.e.a.values().length];
            f4265a = iArr3;
            try {
                iArr3[O1.e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4265a[O1.e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4265a[O1.e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4265a[O1.e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4265a[O1.e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4265a[O1.e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4265a[O1.e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4265a[O1.e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private class b implements O1.g.InterfaceC0913x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f4269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f4270c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f4275h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f4268a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f4271d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4272e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4273f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f4274g = -1;

        b(O1.g.C0912w c0912w) {
            if (c0912w == null) {
                return;
            }
            c0912w.h(this);
            if (this.f4275h) {
                this.f4271d.b((c) this.f4268a.get(this.f4274g));
                this.f4268a.set(this.f4274g, this.f4271d);
                this.f4275h = false;
            }
            c cVar = this.f4271d;
            if (cVar != null) {
                this.f4268a.add(cVar);
            }
        }

        @Override // O1.g.InterfaceC0913x
        public void a(float f10, float f11, float f12, float f13) {
            this.f4271d.a(f10, f11);
            this.f4268a.add(this.f4271d);
            this.f4271d = h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f4275h = false;
        }

        @Override // O1.g.InterfaceC0913x
        public void b(float f10, float f11) {
            if (this.f4275h) {
                this.f4271d.b((c) this.f4268a.get(this.f4274g));
                this.f4268a.set(this.f4274g, this.f4271d);
                this.f4275h = false;
            }
            c cVar = this.f4271d;
            if (cVar != null) {
                this.f4268a.add(cVar);
            }
            this.f4269b = f10;
            this.f4270c = f11;
            this.f4271d = h.this.new c(f10, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f4274g = this.f4268a.size();
        }

        @Override // O1.g.InterfaceC0913x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f4273f || this.f4272e) {
                this.f4271d.a(f10, f11);
                this.f4268a.add(this.f4271d);
                this.f4272e = false;
            }
            this.f4271d = h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f4275h = false;
        }

        @Override // O1.g.InterfaceC0913x
        public void close() {
            this.f4268a.add(this.f4271d);
            e(this.f4269b, this.f4270c);
            this.f4275h = true;
        }

        @Override // O1.g.InterfaceC0913x
        public void d(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14) {
            this.f4272e = true;
            this.f4273f = false;
            c cVar = this.f4271d;
            h.h(cVar.f4277a, cVar.f4278b, f10, f11, f12, z9, z10, f13, f14, this);
            this.f4273f = true;
            this.f4275h = false;
        }

        @Override // O1.g.InterfaceC0913x
        public void e(float f10, float f11) {
            this.f4271d.a(f10, f11);
            this.f4268a.add(this.f4271d);
            h hVar = h.this;
            c cVar = this.f4271d;
            this.f4271d = hVar.new c(f10, f11, f10 - cVar.f4277a, f11 - cVar.f4278b);
            this.f4275h = false;
        }

        List f() {
            return this.f4268a;
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f4277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f4278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f4279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f4280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f4281e = false;

        c(float f10, float f11, float f12, float f13) {
            this.f4279c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f4280d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f4277a = f10;
            this.f4278b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f4279c = (float) (((double) f12) / dSqrt);
                this.f4280d = (float) (((double) f13) / dSqrt);
            }
        }

        void a(float f10, float f11) {
            float f12 = f10 - this.f4277a;
            float f13 = f11 - this.f4278b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f4279c;
            if (f12 != (-f14) || f13 != (-this.f4280d)) {
                this.f4279c = f14 + f12;
                this.f4280d += f13;
            } else {
                this.f4281e = true;
                this.f4279c = -f13;
                this.f4280d = f12;
            }
        }

        void b(c cVar) {
            float f10 = cVar.f4279c;
            float f11 = this.f4279c;
            if (f10 == (-f11)) {
                float f12 = cVar.f4280d;
                if (f12 == (-this.f4280d)) {
                    this.f4281e = true;
                    this.f4279c = -f12;
                    this.f4280d = cVar.f4279c;
                    return;
                }
            }
            this.f4279c = f11 + f10;
            this.f4280d += cVar.f4280d;
        }

        public String toString() {
            return "(" + this.f4277a + "," + this.f4278b + " " + this.f4279c + "," + this.f4280d + ")";
        }
    }

    private class d implements O1.g.InterfaceC0913x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Path f4283a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f4284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f4285c;

        d(O1.g.C0912w c0912w) {
            if (c0912w == null) {
                return;
            }
            c0912w.h(this);
        }

        @Override // O1.g.InterfaceC0913x
        public void a(float f10, float f11, float f12, float f13) {
            this.f4283a.quadTo(f10, f11, f12, f13);
            this.f4284b = f12;
            this.f4285c = f13;
        }

        @Override // O1.g.InterfaceC0913x
        public void b(float f10, float f11) {
            this.f4283a.moveTo(f10, f11);
            this.f4284b = f10;
            this.f4285c = f11;
        }

        @Override // O1.g.InterfaceC0913x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f4283a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f4284b = f14;
            this.f4285c = f15;
        }

        @Override // O1.g.InterfaceC0913x
        public void close() {
            this.f4283a.close();
        }

        @Override // O1.g.InterfaceC0913x
        public void d(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14) {
            h.h(this.f4284b, this.f4285c, f10, f11, f12, z9, z10, f13, f14, this);
            this.f4284b = f13;
            this.f4285c = f14;
        }

        @Override // O1.g.InterfaceC0913x
        public void e(float f10, float f11) {
            this.f4283a.lineTo(f10, f11);
            this.f4284b = f10;
            this.f4285c = f11;
        }

        Path f() {
            return this.f4283a;
        }
    }

    private class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Path f4287e;

        e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f4287e = path;
        }

        @Override // O1.h.f, O1.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                if (h.this.f4260d.f4297b) {
                    str2 = str;
                    h.this.f4257a.drawTextOnPath(str2, this.f4287e, this.f4289b, this.f4290c, h.this.f4260d.f4299d);
                } else {
                    str2 = str;
                }
                if (h.this.f4260d.f4298c) {
                    h.this.f4257a.drawTextOnPath(str2, this.f4287e, this.f4289b, this.f4290c, h.this.f4260d.f4300e);
                }
            } else {
                str2 = str;
            }
            this.f4289b += h.this.f4260d.f4299d.measureText(str2);
        }
    }

    private class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f4289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f4290c;

        f(float f10, float f11) {
            super(h.this, null);
            this.f4289b = f10;
            this.f4290c = f11;
        }

        @Override // O1.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f4260d.f4297b) {
                    h.this.f4257a.drawText(str, this.f4289b, this.f4290c, h.this.f4260d.f4299d);
                }
                if (h.this.f4260d.f4298c) {
                    h.this.f4257a.drawText(str, this.f4289b, this.f4290c, h.this.f4260d.f4300e);
                }
            }
            this.f4289b += h.this.f4260d.f4299d.measureText(str);
        }
    }

    private class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f4292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f4293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f4294d;

        g(float f10, float f11, Path path) {
            super(h.this, null);
            this.f4292b = f10;
            this.f4293c = f11;
            this.f4294d = path;
        }

        @Override // O1.h.j
        public boolean a(O1.g.Y y9) {
            if (!(y9 instanceof O1.g.Z)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // O1.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                h.this.f4260d.f4299d.getTextPath(str2, 0, str.length(), this.f4292b, this.f4293c, path);
                this.f4294d.addPath(path);
            } else {
                str2 = str;
            }
            this.f4292b += h.this.f4260d.f4299d.measureText(str2);
        }
    }

    private class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f4305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f4306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RectF f4307d;

        i(float f10, float f11) {
            super(h.this, null);
            this.f4307d = new RectF();
            this.f4305b = f10;
            this.f4306c = f11;
        }

        @Override // O1.h.j
        public boolean a(O1.g.Y y9) {
            if (!(y9 instanceof O1.g.Z)) {
                return true;
            }
            O1.g.Z z9 = (O1.g.Z) y9;
            O1.g.N nP = y9.f4146a.p(z9.f4159o);
            if (nP == null) {
                h.F("TextPath path reference '%s' not found", z9.f4159o);
                return false;
            }
            O1.g.C0911v c0911v = (O1.g.C0911v) nP;
            Path pathF = h.this.new d(c0911v.f4241o).f();
            Matrix matrix = c0911v.f4213n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            RectF rectF = new RectF();
            pathF.computeBounds(rectF, true);
            this.f4307d.union(rectF);
            return false;
        }

        @Override // O1.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f4260d.f4299d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f4305b, this.f4306c);
                this.f4307d.union(rectF);
            }
            this.f4305b += h.this.f4260d.f4299d.measureText(str);
        }
    }

    private abstract class j {
        private j() {
        }

        public boolean a(O1.g.Y y9) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    h(Canvas canvas, float f10) {
        this.f4257a = canvas;
        this.f4258b = f10;
    }

    private boolean A() {
        Boolean bool = this.f4260d.f4296a.f4057R;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(O1.g.N n10) {
        if (n10 instanceof O1.g.InterfaceC0909t) {
            return;
        }
        S0();
        u(n10);
        if (n10 instanceof O1.g.F) {
            x0((O1.g.F) n10);
        } else if (n10 instanceof O1.g.e0) {
            E0((O1.g.e0) n10);
        } else if (n10 instanceof O1.g.S) {
            B0((O1.g.S) n10);
        } else if (n10 instanceof O1.g.C0902m) {
            q0((O1.g.C0902m) n10);
        } else if (n10 instanceof O1.g.C0904o) {
            r0((O1.g.C0904o) n10);
        } else if (n10 instanceof O1.g.C0911v) {
            t0((O1.g.C0911v) n10);
        } else if (n10 instanceof O1.g.B) {
            w0((O1.g.B) n10);
        } else if (n10 instanceof O1.g.C0894d) {
            o0((O1.g.C0894d) n10);
        } else if (n10 instanceof O1.g.C0898i) {
            p0((O1.g.C0898i) n10);
        } else if (n10 instanceof O1.g.C0906q) {
            s0((O1.g.C0906q) n10);
        } else if (n10 instanceof O1.g.A) {
            v0((O1.g.A) n10);
        } else if (n10 instanceof O1.g.C0915z) {
            u0((O1.g.C0915z) n10);
        } else if (n10 instanceof O1.g.W) {
            D0((O1.g.W) n10);
        }
        R0();
    }

    private void B(O1.g.K k10, Path path) {
        O1.g.O o10 = this.f4260d.f4296a.f4068b;
        if (o10 instanceof O1.g.C0910u) {
            O1.g.N nP = this.f4259c.p(((O1.g.C0910u) o10).f4239a);
            if (nP instanceof O1.g.C0914y) {
                L(k10, path, (O1.g.C0914y) nP);
                return;
            }
        }
        this.f4257a.drawPath(path, this.f4260d.f4299d);
    }

    private void B0(O1.g.S s10) {
        y("Switch render", new Object[0]);
        W0(this.f4260d, s10);
        if (A()) {
            Matrix matrix = s10.f4214o;
            if (matrix != null) {
                this.f4257a.concat(matrix);
            }
            p(s10);
            boolean zM0 = m0();
            K0(s10);
            if (zM0) {
                j0(s10);
            }
            U0(s10);
        }
    }

    private void C(Path path) {
        C0073h c0073h = this.f4260d;
        if (c0073h.f4296a.f4071c0 != O1.g.E.i.NonScalingStroke) {
            this.f4257a.drawPath(path, c0073h.f4300e);
            return;
        }
        Matrix matrix = this.f4257a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f4257a.setMatrix(new Matrix());
        Shader shader = this.f4260d.f4300e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f4257a.drawPath(path2, this.f4260d.f4300e);
        this.f4257a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(O1.g.T t10, O1.g.C0892b c0892b) {
        y("Symbol render", new Object[0]);
        if (c0892b.f4169c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || c0892b.f4170d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        O1.e eVar = t10.f4148o;
        if (eVar == null) {
            eVar = O1.e.f4003e;
        }
        W0(this.f4260d, t10);
        C0073h c0073h = this.f4260d;
        c0073h.f4301f = c0892b;
        if (!c0073h.f4296a.f4052M.booleanValue()) {
            O1.g.C0892b c0892b2 = this.f4260d.f4301f;
            O0(c0892b2.f4167a, c0892b2.f4168b, c0892b2.f4169c, c0892b2.f4170d);
        }
        O1.g.C0892b c0892b3 = t10.f4154p;
        if (c0892b3 != null) {
            this.f4257a.concat(o(this.f4260d.f4301f, c0892b3, eVar));
            this.f4260d.f4302g = t10.f4154p;
        } else {
            Canvas canvas = this.f4257a;
            O1.g.C0892b c0892b4 = this.f4260d.f4301f;
            canvas.translate(c0892b4.f4167a, c0892b4.f4168b);
        }
        boolean zM0 = m0();
        F0(t10, true);
        if (zM0) {
            j0(t10);
        }
        U0(t10);
    }

    private float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    private void D0(O1.g.W w10) {
        y("Text render", new Object[0]);
        W0(this.f4260d, w10);
        if (A()) {
            Matrix matrix = w10.f4158s;
            if (matrix != null) {
                this.f4257a.concat(matrix);
            }
            List list = w10.f4163o;
            float fG = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f10 = (list == null || list.size() == 0) ? 0.0f : ((O1.g.C0905p) w10.f4163o.get(0)).f(this);
            List list2 = w10.f4164p;
            float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : ((O1.g.C0905p) w10.f4164p.get(0)).g(this);
            List list3 = w10.f4165q;
            float f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((O1.g.C0905p) w10.f4165q.get(0)).f(this);
            List list4 = w10.f4166r;
            if (list4 != null && list4.size() != 0) {
                fG = ((O1.g.C0905p) w10.f4166r.get(0)).g(this);
            }
            O1.g.E.f fVarO = O();
            if (fVarO != O1.g.E.f.Start) {
                float fN = n(w10);
                if (fVarO == O1.g.E.f.Middle) {
                    fN /= 2.0f;
                }
                f10 -= fN;
            }
            if (w10.f4136h == null) {
                i iVar = new i(f10, fG2);
                E(w10, iVar);
                RectF rectF = iVar.f4307d;
                w10.f4136h = new O1.g.C0892b(rectF.left, rectF.top, rectF.width(), iVar.f4307d.height());
            }
            U0(w10);
            r(w10);
            p(w10);
            boolean zM0 = m0();
            E(w10, new f(f10 + f11, fG2 + fG));
            if (zM0) {
                j0(w10);
            }
        }
    }

    private void E(O1.g.Y y9, j jVar) {
        if (A()) {
            Iterator it = y9.f4125i.iterator();
            boolean z9 = true;
            while (it.hasNext()) {
                O1.g.N n10 = (O1.g.N) it.next();
                if (n10 instanceof O1.g.c0) {
                    jVar.b(T0(((O1.g.c0) n10).f4175c, z9, !it.hasNext()));
                } else {
                    l0(n10, jVar);
                }
                z9 = false;
            }
        }
    }

    private void E0(O1.g.e0 e0Var) {
        y("Use render", new Object[0]);
        O1.g.C0905p c0905p = e0Var.f4194s;
        if (c0905p == null || !c0905p.i()) {
            O1.g.C0905p c0905p2 = e0Var.f4195t;
            if (c0905p2 == null || !c0905p2.i()) {
                W0(this.f4260d, e0Var);
                if (A()) {
                    O1.g.N nP = e0Var.f4146a.p(e0Var.f4191p);
                    if (nP == null) {
                        F("Use reference '%s' not found", e0Var.f4191p);
                        return;
                    }
                    Matrix matrix = e0Var.f4214o;
                    if (matrix != null) {
                        this.f4257a.concat(matrix);
                    }
                    O1.g.C0905p c0905p3 = e0Var.f4192q;
                    float fG = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float f10 = c0905p3 != null ? c0905p3.f(this) : 0.0f;
                    O1.g.C0905p c0905p4 = e0Var.f4193r;
                    if (c0905p4 != null) {
                        fG = c0905p4.g(this);
                    }
                    this.f4257a.translate(f10, fG);
                    p(e0Var);
                    boolean zM0 = m0();
                    i0(e0Var);
                    if (nP instanceof O1.g.F) {
                        O1.g.C0892b c0892bF0 = f0(null, null, e0Var.f4194s, e0Var.f4195t);
                        S0();
                        y0((O1.g.F) nP, c0892bF0);
                        R0();
                    } else if (nP instanceof O1.g.T) {
                        O1.g.C0905p c0905p5 = e0Var.f4194s;
                        if (c0905p5 == null) {
                            c0905p5 = new O1.g.C0905p(100.0f, O1.g.d0.percent);
                        }
                        O1.g.C0905p c0905p6 = e0Var.f4195t;
                        if (c0905p6 == null) {
                            c0905p6 = new O1.g.C0905p(100.0f, O1.g.d0.percent);
                        }
                        O1.g.C0892b c0892bF1 = f0(null, null, c0905p5, c0905p6);
                        S0();
                        C0((O1.g.T) nP, c0892bF1);
                        R0();
                    } else {
                        A0(nP);
                    }
                    h0();
                    if (zM0) {
                        j0(e0Var);
                    }
                    U0(e0Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(O1.g.J j10, boolean z9) {
        if (z9) {
            i0(j10);
        }
        Iterator it = j10.a().iterator();
        while (it.hasNext()) {
            A0((O1.g.N) it.next());
        }
        if (z9) {
            h0();
        }
    }

    private void G(O1.g.Y y9, StringBuilder sb) {
        Iterator it = y9.f4125i.iterator();
        boolean z9 = true;
        while (it.hasNext()) {
            O1.g.N n10 = (O1.g.N) it.next();
            if (n10 instanceof O1.g.Y) {
                G((O1.g.Y) n10, sb);
            } else if (n10 instanceof O1.g.c0) {
                sb.append(T0(((O1.g.c0) n10).f4175c, z9, !it.hasNext()));
            }
            z9 = false;
        }
    }

    private void H(O1.g.AbstractC0899j abstractC0899j, String str) {
        O1.g.N nP = abstractC0899j.f4146a.p(str);
        if (nP == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(nP instanceof O1.g.AbstractC0899j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (nP == abstractC0899j) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        O1.g.AbstractC0899j abstractC0899j2 = (O1.g.AbstractC0899j) nP;
        if (abstractC0899j.f4205i == null) {
            abstractC0899j.f4205i = abstractC0899j2.f4205i;
        }
        if (abstractC0899j.f4206j == null) {
            abstractC0899j.f4206j = abstractC0899j2.f4206j;
        }
        if (abstractC0899j.f4207k == null) {
            abstractC0899j.f4207k = abstractC0899j2.f4207k;
        }
        if (abstractC0899j.f4204h.isEmpty()) {
            abstractC0899j.f4204h = abstractC0899j2.f4204h;
        }
        try {
            if (abstractC0899j instanceof O1.g.M) {
                I((O1.g.M) abstractC0899j, (O1.g.M) nP);
            } else {
                J((O1.g.Q) abstractC0899j, (O1.g.Q) nP);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC0899j2.f4208l;
        if (str2 != null) {
            H(abstractC0899j, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H0(O1.g.C0907r r12, O1.h.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.h.H0(O1.g$r, O1.h$c):void");
    }

    private void I(O1.g.M m10, O1.g.M m11) {
        if (m10.f4142m == null) {
            m10.f4142m = m11.f4142m;
        }
        if (m10.f4143n == null) {
            m10.f4143n = m11.f4143n;
        }
        if (m10.f4144o == null) {
            m10.f4144o = m11.f4144o;
        }
        if (m10.f4145p == null) {
            m10.f4145p = m11.f4145p;
        }
    }

    private void I0(O1.g.AbstractC0901l abstractC0901l) {
        O1.g.C0907r c0907r;
        O1.g.C0907r c0907r2;
        O1.g.C0907r c0907r3;
        List listK;
        int size;
        O1.g.E e10 = this.f4260d.f4296a;
        String str = e10.f4054O;
        if (str == null && e10.f4055P == null && e10.f4056Q == null) {
            return;
        }
        if (str == null) {
            c0907r = null;
        } else {
            O1.g.N nP = abstractC0901l.f4146a.p(str);
            if (nP != null) {
                c0907r = (O1.g.C0907r) nP;
            } else {
                F("Marker reference '%s' not found", this.f4260d.f4296a.f4054O);
                c0907r = null;
            }
        }
        String str2 = this.f4260d.f4296a.f4055P;
        if (str2 == null) {
            c0907r2 = null;
        } else {
            O1.g.N nP2 = abstractC0901l.f4146a.p(str2);
            if (nP2 != null) {
                c0907r2 = (O1.g.C0907r) nP2;
            } else {
                F("Marker reference '%s' not found", this.f4260d.f4296a.f4055P);
                c0907r2 = null;
            }
        }
        String str3 = this.f4260d.f4296a.f4056Q;
        if (str3 == null) {
            c0907r3 = null;
        } else {
            O1.g.N nP3 = abstractC0901l.f4146a.p(str3);
            if (nP3 != null) {
                c0907r3 = (O1.g.C0907r) nP3;
            } else {
                F("Marker reference '%s' not found", this.f4260d.f4296a.f4056Q);
                c0907r3 = null;
            }
        }
        if (abstractC0901l instanceof O1.g.C0911v) {
            listK = new b(((O1.g.C0911v) abstractC0901l).f4241o).f();
        } else {
            listK = abstractC0901l instanceof O1.g.C0906q ? k((O1.g.C0906q) abstractC0901l) : l((O1.g.C0915z) abstractC0901l);
        }
        if (listK == null || (size = listK.size()) == 0) {
            return;
        }
        O1.g.E e11 = this.f4260d.f4296a;
        e11.f4056Q = null;
        e11.f4055P = null;
        e11.f4054O = null;
        if (c0907r != null) {
            H0(c0907r, (c) listK.get(0));
        }
        if (c0907r2 != null && listK.size() > 2) {
            c cVarN0 = (c) listK.get(0);
            c cVar = (c) listK.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = (c) listK.get(i10);
                cVarN0 = cVar.f4281e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(c0907r2, cVarN0);
                cVar = cVar2;
            }
        }
        if (c0907r3 != null) {
            H0(c0907r3, (c) listK.get(size - 1));
        }
    }

    private void J(O1.g.Q q10, O1.g.Q q11) {
        if (q10.f4149m == null) {
            q10.f4149m = q11.f4149m;
        }
        if (q10.f4150n == null) {
            q10.f4150n = q11.f4150n;
        }
        if (q10.f4151o == null) {
            q10.f4151o = q11.f4151o;
        }
        if (q10.f4152p == null) {
            q10.f4152p = q11.f4152p;
        }
        if (q10.f4153q == null) {
            q10.f4153q = q11.f4153q;
        }
    }

    private void J0(O1.g.C0908s c0908s, O1.g.K k10, O1.g.C0892b c0892b) {
        float f10;
        float fG;
        y("Mask render", new Object[0]);
        Boolean bool = c0908s.f4233o;
        if (bool == null || !bool.booleanValue()) {
            O1.g.C0905p c0905p = c0908s.f4237s;
            float fE = c0905p != null ? c0905p.e(this, 1.0f) : 1.2f;
            O1.g.C0905p c0905p2 = c0908s.f4238t;
            float fE2 = c0905p2 != null ? c0905p2.e(this, 1.0f) : 1.2f;
            f10 = fE * c0892b.f4169c;
            fG = fE2 * c0892b.f4170d;
        } else {
            O1.g.C0905p c0905p3 = c0908s.f4237s;
            f10 = c0905p3 != null ? c0905p3.f(this) : c0892b.f4169c;
            O1.g.C0905p c0905p4 = c0908s.f4238t;
            fG = c0905p4 != null ? c0905p4.g(this) : c0892b.f4170d;
        }
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fG == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        S0();
        C0073h c0073hM = M(c0908s);
        this.f4260d = c0073hM;
        c0073hM.f4296a.f4082m = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f4257a.save();
        Boolean bool2 = c0908s.f4234p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f4257a.translate(c0892b.f4167a, c0892b.f4168b);
            this.f4257a.scale(c0892b.f4169c, c0892b.f4170d);
        }
        F0(c0908s, false);
        this.f4257a.restore();
        if (zM0) {
            k0(k10, c0892b);
        }
        R0();
    }

    private void K(O1.g.C0914y c0914y, String str) {
        O1.g.N nP = c0914y.f4146a.p(str);
        if (nP == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(nP instanceof O1.g.C0914y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (nP == c0914y) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        O1.g.C0914y c0914y2 = (O1.g.C0914y) nP;
        if (c0914y.f4247q == null) {
            c0914y.f4247q = c0914y2.f4247q;
        }
        if (c0914y.f4248r == null) {
            c0914y.f4248r = c0914y2.f4248r;
        }
        if (c0914y.f4249s == null) {
            c0914y.f4249s = c0914y2.f4249s;
        }
        if (c0914y.f4250t == null) {
            c0914y.f4250t = c0914y2.f4250t;
        }
        if (c0914y.f4251u == null) {
            c0914y.f4251u = c0914y2.f4251u;
        }
        if (c0914y.f4252v == null) {
            c0914y.f4252v = c0914y2.f4252v;
        }
        if (c0914y.f4253w == null) {
            c0914y.f4253w = c0914y2.f4253w;
        }
        if (c0914y.f4125i.isEmpty()) {
            c0914y.f4125i = c0914y2.f4125i;
        }
        if (c0914y.f4154p == null) {
            c0914y.f4154p = c0914y2.f4154p;
        }
        if (c0914y.f4148o == null) {
            c0914y.f4148o = c0914y2.f4148o;
        }
        String str2 = c0914y2.f4254x;
        if (str2 != null) {
            K(c0914y, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(O1.g.S s10) {
        Set setB;
        String language = Locale.getDefault().getLanguage();
        O1.g.k();
        for (O1.g.N n10 : s10.a()) {
            if (n10 instanceof O1.g.G) {
                O1.g.G g10 = (O1.g.G) n10;
                if (g10.c() == null && ((setB = g10.b()) == null || (!setB.isEmpty() && setB.contains(language)))) {
                    Set requiredFeatures = g10.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f4256i == null) {
                            V();
                        }
                        if (requiredFeatures.isEmpty() || !f4256i.containsAll(requiredFeatures)) {
                        }
                    }
                    Set setL = g10.l();
                    if (setL != null) {
                        setL.isEmpty();
                    } else {
                        Set setM = g10.m();
                        if (setM == null) {
                            A0(n10);
                            return;
                        }
                        setM.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    private void L(O1.g.K k10, Path path, O1.g.C0914y c0914y) {
        float f10;
        float fG;
        float fG2;
        float f11;
        boolean z9;
        boolean z10;
        Boolean bool = c0914y.f4247q;
        boolean z11 = bool != null && bool.booleanValue();
        String str = c0914y.f4254x;
        if (str != null) {
            K(c0914y, str);
        }
        if (z11) {
            O1.g.C0905p c0905p = c0914y.f4250t;
            f10 = c0905p != null ? c0905p.f(this) : 0.0f;
            O1.g.C0905p c0905p2 = c0914y.f4251u;
            fG2 = c0905p2 != null ? c0905p2.g(this) : 0.0f;
            O1.g.C0905p c0905p3 = c0914y.f4252v;
            f11 = c0905p3 != null ? c0905p3.f(this) : 0.0f;
            O1.g.C0905p c0905p4 = c0914y.f4253w;
            fG = c0905p4 != null ? c0905p4.g(this) : 0.0f;
        } else {
            O1.g.C0905p c0905p5 = c0914y.f4250t;
            float fE = c0905p5 != null ? c0905p5.e(this, 1.0f) : 0.0f;
            O1.g.C0905p c0905p6 = c0914y.f4251u;
            float fE2 = c0905p6 != null ? c0905p6.e(this, 1.0f) : 0.0f;
            O1.g.C0905p c0905p7 = c0914y.f4252v;
            float fE3 = c0905p7 != null ? c0905p7.e(this, 1.0f) : 0.0f;
            O1.g.C0905p c0905p8 = c0914y.f4253w;
            float fE4 = c0905p8 != null ? c0905p8.e(this, 1.0f) : 0.0f;
            O1.g.C0892b c0892b = k10.f4136h;
            float f12 = c0892b.f4167a;
            float f13 = c0892b.f4169c;
            f10 = (fE * f13) + f12;
            float f14 = c0892b.f4168b;
            float f15 = c0892b.f4170d;
            float f16 = fE3 * f13;
            fG = fE4 * f15;
            fG2 = (fE2 * f15) + f14;
            f11 = f16;
        }
        if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fG == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        O1.e eVar = c0914y.f4148o;
        if (eVar == null) {
            eVar = O1.e.f4003e;
        }
        S0();
        this.f4257a.clipPath(path);
        C0073h c0073h = new C0073h();
        V0(c0073h, O1.g.E.b());
        c0073h.f4296a.f4052M = Boolean.FALSE;
        this.f4260d = N(c0914y, c0073h);
        O1.g.C0892b c0892b2 = k10.f4136h;
        Matrix matrix = c0914y.f4249s;
        if (matrix != null) {
            this.f4257a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (c0914y.f4249s.invert(matrix2)) {
                O1.g.C0892b c0892b3 = k10.f4136h;
                float f17 = c0892b3.f4167a;
                float f18 = c0892b3.f4168b;
                float fB = c0892b3.b();
                O1.g.C0892b c0892b4 = k10.f4136h;
                z9 = false;
                float f19 = c0892b4.f4168b;
                float fB2 = c0892b4.b();
                z10 = true;
                float fC = k10.f4136h.c();
                O1.g.C0892b c0892b5 = k10.f4136h;
                float[] fArr = {f17, f18, fB, f19, fB2, fC, c0892b5.f4167a, c0892b5.c()};
                matrix2.mapPoints(fArr);
                float f20 = fArr[0];
                float f21 = fArr[1];
                RectF rectF = new RectF(f20, f21, f20, f21);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f22 = fArr[i10];
                    if (f22 < rectF.left) {
                        rectF.left = f22;
                    }
                    if (f22 > rectF.right) {
                        rectF.right = f22;
                    }
                    float f23 = fArr[i10 + 1];
                    if (f23 < rectF.top) {
                        rectF.top = f23;
                    }
                    if (f23 > rectF.bottom) {
                        rectF.bottom = f23;
                    }
                }
                float f24 = rectF.left;
                float f25 = rectF.top;
                c0892b2 = new O1.g.C0892b(f24, f25, rectF.right - f24, rectF.bottom - f25);
            } else {
                z9 = false;
                z10 = true;
            }
        } else {
            z9 = false;
            z10 = true;
        }
        float fFloor = f10 + (((float) Math.floor((c0892b2.f4167a - f10) / f11)) * f11);
        float fB3 = c0892b2.b();
        float fC2 = c0892b2.c();
        O1.g.C0892b c0892b6 = new O1.g.C0892b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, fG);
        boolean zM0 = m0();
        for (float fFloor2 = fG2 + (((float) Math.floor((c0892b2.f4168b - fG2) / fG)) * fG); fFloor2 < fC2; fFloor2 += fG) {
            float f26 = fFloor;
            while (f26 < fB3) {
                c0892b6.f4167a = f26;
                c0892b6.f4168b = fFloor2;
                S0();
                if (!this.f4260d.f4296a.f4052M.booleanValue()) {
                    O0(c0892b6.f4167a, c0892b6.f4168b, c0892b6.f4169c, c0892b6.f4170d);
                }
                O1.g.C0892b c0892b7 = c0914y.f4154p;
                if (c0892b7 != null) {
                    this.f4257a.concat(o(c0892b6, c0892b7, eVar));
                } else {
                    Boolean bool2 = c0914y.f4248r;
                    boolean z12 = (bool2 == null || bool2.booleanValue()) ? z10 : z9;
                    this.f4257a.translate(f26, fFloor2);
                    if (!z12) {
                        Canvas canvas = this.f4257a;
                        O1.g.C0892b c0892b8 = k10.f4136h;
                        canvas.scale(c0892b8.f4169c, c0892b8.f4170d);
                    }
                }
                Iterator it = c0914y.f4125i.iterator();
                while (it.hasNext()) {
                    A0((O1.g.N) it.next());
                }
                R0();
                f26 += f11;
                fFloor = fFloor;
            }
        }
        if (zM0) {
            j0(c0914y);
        }
        R0();
    }

    private void L0(O1.g.Z z9) {
        y("TextPath render", new Object[0]);
        W0(this.f4260d, z9);
        if (A() && Y0()) {
            O1.g.N nP = z9.f4146a.p(z9.f4159o);
            if (nP == null) {
                F("TextPath reference '%s' not found", z9.f4159o);
                return;
            }
            O1.g.C0911v c0911v = (O1.g.C0911v) nP;
            Path pathF = new d(c0911v.f4241o).f();
            Matrix matrix = c0911v.f4213n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathF, false);
            O1.g.C0905p c0905p = z9.f4160p;
            float fE = c0905p != null ? c0905p.e(this, pathMeasure.getLength()) : 0.0f;
            O1.g.E.f fVarO = O();
            if (fVarO != O1.g.E.f.Start) {
                float fN = n(z9);
                if (fVarO == O1.g.E.f.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            r((O1.g.K) z9.e());
            boolean zM0 = m0();
            E(z9, new e(pathF, fE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            if (zM0) {
                j0(z9);
            }
        }
    }

    private C0073h M(O1.g.N n10) {
        C0073h c0073h = new C0073h();
        V0(c0073h, O1.g.E.b());
        return N(n10, c0073h);
    }

    private boolean M0() {
        return this.f4260d.f4296a.f4082m.floatValue() < 1.0f || this.f4260d.f4296a.f4063X != null;
    }

    private C0073h N(O1.g.N n10, C0073h c0073h) {
        int i10;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i10 = 0;
            if (n10 instanceof O1.g.L) {
                arrayList.add(0, (O1.g.L) n10);
            }
            Object obj = n10.f4147b;
            if (obj == null) {
                break;
            }
            n10 = (O1.g.N) obj;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            W0(c0073h, (O1.g.L) obj2);
        }
        C0073h c0073h2 = this.f4260d;
        c0073h.f4302g = c0073h2.f4302g;
        c0073h.f4301f = c0073h2.f4301f;
        return c0073h;
    }

    private void N0() {
        this.f4260d = new C0073h();
        this.f4261e = new Stack();
        V0(this.f4260d, O1.g.E.b());
        C0073h c0073h = this.f4260d;
        c0073h.f4301f = null;
        c0073h.f4303h = false;
        this.f4261e.push(new C0073h(c0073h));
        this.f4263g = new Stack();
        this.f4262f = new Stack();
    }

    private O1.g.E.f O() {
        O1.g.E.f fVar;
        O1.g.E e10 = this.f4260d.f4296a;
        if (e10.f4050K == O1.g.E.h.LTR || (fVar = e10.f4051L) == O1.g.E.f.Middle) {
            return e10.f4051L;
        }
        O1.g.E.f fVar2 = O1.g.E.f.Start;
        return fVar == fVar2 ? O1.g.E.f.End : fVar2;
    }

    private void O0(float f10, float f11, float f12, float f13) {
        float f14 = f12 + f10;
        float fG = f13 + f11;
        O1.g.C0893c c0893c = this.f4260d.f4296a.f4053N;
        if (c0893c != null) {
            f10 += c0893c.f4174d.f(this);
            f11 += this.f4260d.f4296a.f4053N.f4171a.g(this);
            f14 -= this.f4260d.f4296a.f4053N.f4172b.f(this);
            fG -= this.f4260d.f4296a.f4053N.f4173c.g(this);
        }
        this.f4257a.clipRect(f10, f11, f14, fG);
    }

    private Path.FillType P() {
        O1.g.E.a aVar = this.f4260d.f4296a.f4062W;
        return (aVar == null || aVar != O1.g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0073h c0073h, boolean z9, O1.g.O o10) {
        int i10;
        O1.g.E e10 = c0073h.f4296a;
        float fFloatValue = (z9 ? e10.f4072d : e10.f4075f).floatValue();
        if (o10 instanceof O1.g.C0896f) {
            i10 = ((O1.g.C0896f) o10).f4198a;
        } else if (!(o10 instanceof O1.g.C0072g)) {
            return;
        } else {
            i10 = c0073h.f4296a.f4083v.f4198a;
        }
        int iX = x(i10, fFloatValue);
        if (z9) {
            c0073h.f4299d.setColor(iX);
        } else {
            c0073h.f4300e.setColor(iX);
        }
    }

    private void Q0(boolean z9, O1.g.C c10) {
        if (z9) {
            if (W(c10.f4139e, 2147483648L)) {
                C0073h c0073h = this.f4260d;
                O1.g.E e10 = c0073h.f4296a;
                O1.g.O o10 = c10.f4139e.f4064Y;
                e10.f4068b = o10;
                c0073h.f4297b = o10 != null;
            }
            if (W(c10.f4139e, 4294967296L)) {
                this.f4260d.f4296a.f4072d = c10.f4139e.f4065Z;
            }
            if (W(c10.f4139e, 6442450944L)) {
                C0073h c0073h2 = this.f4260d;
                P0(c0073h2, z9, c0073h2.f4296a.f4068b);
                return;
            }
            return;
        }
        if (W(c10.f4139e, 2147483648L)) {
            C0073h c0073h3 = this.f4260d;
            O1.g.E e11 = c0073h3.f4296a;
            O1.g.O o11 = c10.f4139e.f4064Y;
            e11.f4074e = o11;
            c0073h3.f4298c = o11 != null;
        }
        if (W(c10.f4139e, 4294967296L)) {
            this.f4260d.f4296a.f4075f = c10.f4139e.f4065Z;
        }
        if (W(c10.f4139e, 6442450944L)) {
            C0073h c0073h4 = this.f4260d;
            P0(c0073h4, z9, c0073h4.f4296a.f4074e);
        }
    }

    private void R0() {
        this.f4257a.restore();
        this.f4260d = (C0073h) this.f4261e.pop();
    }

    private void S0() {
        this.f4257a.save();
        this.f4261e.push(this.f4260d);
        this.f4260d = new C0073h(this.f4260d);
    }

    private String T0(String str, boolean z9, boolean z10) {
        if (this.f4260d.f4303h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z9) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        O1.g.E.a aVar = this.f4260d.f4296a.f4070c;
        return (aVar == null || aVar != O1.g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(O1.g.K k10) {
        if (k10.f4147b == null || k10.f4136h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f4263g.peek()).invert(matrix)) {
            O1.g.C0892b c0892b = k10.f4136h;
            float f10 = c0892b.f4167a;
            float f11 = c0892b.f4168b;
            float fB = c0892b.b();
            O1.g.C0892b c0892b2 = k10.f4136h;
            float f12 = c0892b2.f4168b;
            float fB2 = c0892b2.b();
            float fC = k10.f4136h.c();
            O1.g.C0892b c0892b3 = k10.f4136h;
            float[] fArr = {f10, f11, fB, f12, fB2, fC, c0892b3.f4167a, c0892b3.c()};
            matrix.preConcat(this.f4257a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            O1.g.K k11 = (O1.g.K) this.f4262f.peek();
            O1.g.C0892b c0892b4 = k11.f4136h;
            if (c0892b4 == null) {
                k11.f4136h = O1.g.C0892b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c0892b4.e(O1.g.C0892b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        HashSet hashSet = new HashSet();
        f4256i = hashSet;
        hashSet.add("Structure");
        f4256i.add("BasicStructure");
        f4256i.add("ConditionalProcessing");
        f4256i.add("Image");
        f4256i.add("Style");
        f4256i.add("ViewportAttribute");
        f4256i.add("Shape");
        f4256i.add("BasicText");
        f4256i.add("PaintAttribute");
        f4256i.add("BasicPaintAttribute");
        f4256i.add("OpacityAttribute");
        f4256i.add("BasicGraphicsAttribute");
        f4256i.add("Marker");
        f4256i.add("Gradient");
        f4256i.add("Pattern");
        f4256i.add("Clip");
        f4256i.add("BasicClip");
        f4256i.add("Mask");
        f4256i.add("View");
    }

    private void V0(C0073h c0073h, O1.g.E e10) {
        if (W(e10, 4096L)) {
            c0073h.f4296a.f4083v = e10.f4083v;
        }
        if (W(e10, 2048L)) {
            c0073h.f4296a.f4082m = e10.f4082m;
        }
        if (W(e10, 1L)) {
            c0073h.f4296a.f4068b = e10.f4068b;
            O1.g.O o10 = e10.f4068b;
            c0073h.f4297b = (o10 == null || o10 == O1.g.C0896f.f4197c) ? false : true;
        }
        if (W(e10, 4L)) {
            c0073h.f4296a.f4072d = e10.f4072d;
        }
        if (W(e10, 6149L)) {
            P0(c0073h, true, c0073h.f4296a.f4068b);
        }
        if (W(e10, 2L)) {
            c0073h.f4296a.f4070c = e10.f4070c;
        }
        if (W(e10, 8L)) {
            c0073h.f4296a.f4074e = e10.f4074e;
            O1.g.O o11 = e10.f4074e;
            c0073h.f4298c = (o11 == null || o11 == O1.g.C0896f.f4197c) ? false : true;
        }
        if (W(e10, 16L)) {
            c0073h.f4296a.f4075f = e10.f4075f;
        }
        if (W(e10, 6168L)) {
            P0(c0073h, false, c0073h.f4296a.f4074e);
        }
        if (W(e10, 34359738368L)) {
            c0073h.f4296a.f4071c0 = e10.f4071c0;
        }
        if (W(e10, 32L)) {
            O1.g.E e11 = c0073h.f4296a;
            O1.g.C0905p c0905p = e10.f4076g;
            e11.f4076g = c0905p;
            c0073h.f4300e.setStrokeWidth(c0905p.d(this));
        }
        if (W(e10, 64L)) {
            c0073h.f4296a.f4077h = e10.f4077h;
            int i10 = a.f4266b[e10.f4077h.ordinal()];
            if (i10 == 1) {
                c0073h.f4300e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                c0073h.f4300e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                c0073h.f4300e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e10, 128L)) {
            c0073h.f4296a.f4078i = e10.f4078i;
            int i11 = a.f4267c[e10.f4078i.ordinal()];
            if (i11 == 1) {
                c0073h.f4300e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                c0073h.f4300e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                c0073h.f4300e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e10, 256L)) {
            c0073h.f4296a.f4079j = e10.f4079j;
            c0073h.f4300e.setStrokeMiter(e10.f4079j.floatValue());
        }
        if (W(e10, 512L)) {
            c0073h.f4296a.f4080k = e10.f4080k;
        }
        if (W(e10, 1024L)) {
            c0073h.f4296a.f4081l = e10.f4081l;
        }
        Typeface typefaceT = null;
        if (W(e10, 1536L)) {
            O1.g.C0905p[] c0905pArr = c0073h.f4296a.f4080k;
            if (c0905pArr == null) {
                c0073h.f4300e.setPathEffect(null);
            } else {
                int length = c0905pArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fD = c0073h.f4296a.f4080k[i13 % length].d(this);
                    fArr[i13] = fD;
                    f10 += fD;
                }
                if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    c0073h.f4300e.setPathEffect(null);
                } else {
                    float fD2 = c0073h.f4296a.f4081l.d(this);
                    if (fD2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        fD2 = (fD2 % f10) + f10;
                    }
                    c0073h.f4300e.setPathEffect(new DashPathEffect(fArr, fD2));
                }
            }
        }
        if (W(e10, 16384L)) {
            float fQ = Q();
            c0073h.f4296a.f4046G = e10.f4046G;
            c0073h.f4299d.setTextSize(e10.f4046G.e(this, fQ));
            c0073h.f4300e.setTextSize(e10.f4046G.e(this, fQ));
        }
        if (W(e10, 8192L)) {
            c0073h.f4296a.f4084w = e10.f4084w;
        }
        if (W(e10, 32768L)) {
            if (e10.f4047H.intValue() == -1 && c0073h.f4296a.f4047H.intValue() > 100) {
                O1.g.E e12 = c0073h.f4296a;
                e12.f4047H = Integer.valueOf(e12.f4047H.intValue() - 100);
            } else if (e10.f4047H.intValue() != 1 || c0073h.f4296a.f4047H.intValue() >= 900) {
                c0073h.f4296a.f4047H = e10.f4047H;
            } else {
                O1.g.E e13 = c0073h.f4296a;
                e13.f4047H = Integer.valueOf(e13.f4047H.intValue() + 100);
            }
        }
        if (W(e10, 65536L)) {
            c0073h.f4296a.f4048I = e10.f4048I;
        }
        if (W(e10, 106496L)) {
            if (c0073h.f4296a.f4084w != null && this.f4259c != null) {
                O1.g.k();
                for (String str : c0073h.f4296a.f4084w) {
                    O1.g.E e14 = c0073h.f4296a;
                    typefaceT = t(str, e14.f4047H, e14.f4048I);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                O1.g.E e15 = c0073h.f4296a;
                typefaceT = t("serif", e15.f4047H, e15.f4048I);
            }
            c0073h.f4299d.setTypeface(typefaceT);
            c0073h.f4300e.setTypeface(typefaceT);
        }
        if (W(e10, 131072L)) {
            c0073h.f4296a.f4049J = e10.f4049J;
            Paint paint = c0073h.f4299d;
            O1.g.E.EnumC0071g enumC0071g = e10.f4049J;
            O1.g.E.EnumC0071g enumC0071g2 = O1.g.E.EnumC0071g.LineThrough;
            paint.setStrikeThruText(enumC0071g == enumC0071g2);
            Paint paint2 = c0073h.f4299d;
            O1.g.E.EnumC0071g enumC0071g3 = e10.f4049J;
            O1.g.E.EnumC0071g enumC0071g4 = O1.g.E.EnumC0071g.Underline;
            paint2.setUnderlineText(enumC0071g3 == enumC0071g4);
            c0073h.f4300e.setStrikeThruText(e10.f4049J == enumC0071g2);
            c0073h.f4300e.setUnderlineText(e10.f4049J == enumC0071g4);
        }
        if (W(e10, 68719476736L)) {
            c0073h.f4296a.f4050K = e10.f4050K;
        }
        if (W(e10, 262144L)) {
            c0073h.f4296a.f4051L = e10.f4051L;
        }
        if (W(e10, 524288L)) {
            c0073h.f4296a.f4052M = e10.f4052M;
        }
        if (W(e10, 2097152L)) {
            c0073h.f4296a.f4054O = e10.f4054O;
        }
        if (W(e10, 4194304L)) {
            c0073h.f4296a.f4055P = e10.f4055P;
        }
        if (W(e10, 8388608L)) {
            c0073h.f4296a.f4056Q = e10.f4056Q;
        }
        if (W(e10, 16777216L)) {
            c0073h.f4296a.f4057R = e10.f4057R;
        }
        if (W(e10, 33554432L)) {
            c0073h.f4296a.f4058S = e10.f4058S;
        }
        if (W(e10, 1048576L)) {
            c0073h.f4296a.f4053N = e10.f4053N;
        }
        if (W(e10, 268435456L)) {
            c0073h.f4296a.f4061V = e10.f4061V;
        }
        if (W(e10, 536870912L)) {
            c0073h.f4296a.f4062W = e10.f4062W;
        }
        if (W(e10, 1073741824L)) {
            c0073h.f4296a.f4063X = e10.f4063X;
        }
        if (W(e10, 67108864L)) {
            c0073h.f4296a.f4059T = e10.f4059T;
        }
        if (W(e10, 134217728L)) {
            c0073h.f4296a.f4060U = e10.f4060U;
        }
        if (W(e10, 8589934592L)) {
            c0073h.f4296a.f4067a0 = e10.f4067a0;
        }
        if (W(e10, 17179869184L)) {
            c0073h.f4296a.f4069b0 = e10.f4069b0;
        }
        if (W(e10, 137438953472L)) {
            c0073h.f4296a.f4073d0 = e10.f4073d0;
        }
    }

    private boolean W(O1.g.E e10, long j10) {
        return (e10.f4066a & j10) != 0;
    }

    private void W0(C0073h c0073h, O1.g.L l10) {
        c0073h.f4296a.c(l10.f4147b == null);
        O1.g.E e10 = l10.f4139e;
        if (e10 != null) {
            V0(c0073h, e10);
        }
        if (this.f4259c.n()) {
            for (O1.b.p pVar : this.f4259c.d()) {
                if (O1.b.l(this.f4264h, pVar.f3982a, l10)) {
                    V0(c0073h, pVar.f3983b);
                }
            }
        }
        O1.g.E e11 = l10.f4140f;
        if (e11 != null) {
            V0(c0073h, e11);
        }
    }

    private void X(boolean z9, O1.g.C0892b c0892b, O1.g.M m10) {
        float fE;
        float f10;
        float fE2;
        float f11;
        String str = m10.f4208l;
        if (str != null) {
            H(m10, str);
        }
        Boolean bool = m10.f4205i;
        int i10 = 0;
        boolean z10 = bool != null && bool.booleanValue();
        C0073h c0073h = this.f4260d;
        Paint paint = z9 ? c0073h.f4299d : c0073h.f4300e;
        if (z10) {
            O1.g.C0892b c0892bS = S();
            O1.g.C0905p c0905p = m10.f4142m;
            float f12 = c0905p != null ? c0905p.f(this) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            O1.g.C0905p c0905p2 = m10.f4143n;
            fE = c0905p2 != null ? c0905p2.g(this) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            O1.g.C0905p c0905p3 = m10.f4144o;
            float f13 = c0905p3 != null ? c0905p3.f(this) : c0892bS.f4169c;
            O1.g.C0905p c0905p4 = m10.f4145p;
            f11 = f13;
            f10 = f12;
            fE2 = c0905p4 != null ? c0905p4.g(this) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            O1.g.C0905p c0905p5 = m10.f4142m;
            float fE3 = c0905p5 != null ? c0905p5.e(this, 1.0f) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            O1.g.C0905p c0905p6 = m10.f4143n;
            fE = c0905p6 != null ? c0905p6.e(this, 1.0f) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            O1.g.C0905p c0905p7 = m10.f4144o;
            float fE4 = c0905p7 != null ? c0905p7.e(this, 1.0f) : 1.0f;
            O1.g.C0905p c0905p8 = m10.f4145p;
            f10 = fE3;
            fE2 = c0905p8 != null ? c0905p8.e(this, 1.0f) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f11 = fE4;
        }
        float f14 = fE;
        S0();
        this.f4260d = M(m10);
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(c0892b.f4167a, c0892b.f4168b);
            matrix.preScale(c0892b.f4169c, c0892b.f4170d);
        }
        Matrix matrix2 = m10.f4206j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m10.f4204h.size();
        if (size == 0) {
            R0();
            if (z9) {
                this.f4260d.f4297b = false;
                return;
            } else {
                this.f4260d.f4298c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = m10.f4204h.iterator();
        float f15 = -1.0f;
        while (it.hasNext()) {
            O1.g.D d10 = (O1.g.D) ((O1.g.N) it.next());
            Float f16 = d10.f4045h;
            float fFloatValue = f16 != null ? f16.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i10 == 0 || fFloatValue >= f15) {
                fArr[i10] = fFloatValue;
                f15 = fFloatValue;
            } else {
                fArr[i10] = f15;
            }
            S0();
            W0(this.f4260d, d10);
            O1.g.E e10 = this.f4260d.f4296a;
            O1.g.C0896f c0896f = (O1.g.C0896f) e10.f4059T;
            if (c0896f == null) {
                c0896f = O1.g.C0896f.f4196b;
            }
            iArr[i10] = x(c0896f.f4198a, e10.f4060U.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f11 && f14 == fE2) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        O1.g.EnumC0900k enumC0900k = m10.f4207k;
        if (enumC0900k != null) {
            if (enumC0900k == O1.g.EnumC0900k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC0900k == O1.g.EnumC0900k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f14, f11, fE2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f4260d.f4296a.f4072d.floatValue()));
    }

    private void X0() {
        int iX;
        O1.g.E e10 = this.f4260d.f4296a;
        O1.g.O o10 = e10.f4067a0;
        if (o10 instanceof O1.g.C0896f) {
            iX = ((O1.g.C0896f) o10).f4198a;
        } else if (!(o10 instanceof O1.g.C0072g)) {
            return;
        } else {
            iX = e10.f4083v.f4198a;
        }
        Float f10 = e10.f4069b0;
        if (f10 != null) {
            iX = x(iX, f10.floatValue());
        }
        this.f4257a.drawColor(iX);
    }

    private Path Y(O1.g.C0894d c0894d) {
        O1.g.C0905p c0905p = c0894d.f4177o;
        float fG = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f10 = c0905p != null ? c0905p.f(this) : 0.0f;
        O1.g.C0905p c0905p2 = c0894d.f4178p;
        if (c0905p2 != null) {
            fG = c0905p2.g(this);
        }
        float f11 = fG;
        float fD = c0894d.f4179q.d(this);
        float f12 = f10 - fD;
        float f13 = f11 - fD;
        float f14 = f10 + fD;
        float f15 = f11 + fD;
        if (c0894d.f4136h == null) {
            float f16 = 2.0f * fD;
            c0894d.f4136h = new O1.g.C0892b(f12, f13, f16, f16);
        }
        float f17 = fD * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f13);
        float f18 = f10 + f17;
        float f19 = f11 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, f11);
        float f20 = f11 + f17;
        path.cubicTo(f14, f20, f18, f15, f10, f15);
        float f21 = f10 - f17;
        path.cubicTo(f21, f15, f12, f20, f12, f11);
        path.cubicTo(f12, f19, f21, f13, f10, f13);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.f4260d.f4296a.f4058S;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(O1.g.C0898i c0898i) {
        O1.g.C0905p c0905p = c0898i.f4200o;
        float fG = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f10 = c0905p != null ? c0905p.f(this) : 0.0f;
        O1.g.C0905p c0905p2 = c0898i.f4201p;
        if (c0905p2 != null) {
            fG = c0905p2.g(this);
        }
        float f11 = fG;
        float f12 = c0898i.f4202q.f(this);
        float fG2 = c0898i.f4203r.g(this);
        float f13 = f10 - f12;
        float f14 = f11 - fG2;
        float f15 = f10 + f12;
        float f16 = f11 + fG2;
        if (c0898i.f4136h == null) {
            c0898i.f4136h = new O1.g.C0892b(f13, f14, f12 * 2.0f, 2.0f * fG2);
        }
        float f17 = f12 * 0.5522848f;
        float f18 = fG2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f14);
        float f19 = f10 + f17;
        float f20 = f11 - f18;
        path.cubicTo(f19, f14, f15, f20, f15, f11);
        float f21 = f11 + f18;
        path.cubicTo(f15, f21, f19, f16, f10, f16);
        float f22 = f10 - f17;
        path.cubicTo(f22, f16, f13, f21, f13, f11);
        path.cubicTo(f13, f20, f22, f14, f10, f14);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(O1.g.C0906q c0906q) {
        O1.g.C0905p c0905p = c0906q.f4223o;
        float fG = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f10 = c0905p == null ? 0.0f : c0905p.f(this);
        O1.g.C0905p c0905p2 = c0906q.f4224p;
        float fG2 = c0905p2 == null ? 0.0f : c0905p2.g(this);
        O1.g.C0905p c0905p3 = c0906q.f4225q;
        float f11 = c0905p3 == null ? 0.0f : c0905p3.f(this);
        O1.g.C0905p c0905p4 = c0906q.f4226r;
        if (c0905p4 != null) {
            fG = c0905p4.g(this);
        }
        if (c0906q.f4136h == null) {
            c0906q.f4136h = new O1.g.C0892b(Math.min(f10, f11), Math.min(fG2, fG), Math.abs(f11 - f10), Math.abs(fG - fG2));
        }
        Path path = new Path();
        path.moveTo(f10, fG2);
        path.lineTo(f11, fG);
        return path;
    }

    private Path b0(O1.g.C0915z c0915z) {
        Path path = new Path();
        float[] fArr = c0915z.f4255o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = c0915z.f4255o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (c0915z instanceof O1.g.A) {
            path.close();
        }
        if (c0915z.f4136h == null) {
            c0915z.f4136h = m(path);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    private Path c0(O1.g.B b10) {
        float f10;
        float fG;
        float fMin;
        O1.g.C0905p c0905p;
        float f11;
        O1.g.C0905p c0905p2;
        float fG2;
        float f12;
        float fG3;
        float f13;
        float f14;
        Path path;
        O1.g.C0905p c0905p3 = b10.f4043s;
        if (c0905p3 == null && b10.f4044t == null) {
            f10 = 0.0f;
        } else {
            if (c0905p3 != null) {
                if (b10.f4044t == null) {
                    f10 = c0905p3.f(this);
                } else {
                    f10 = c0905p3.f(this);
                    fG = b10.f4044t.g(this);
                }
                fMin = Math.min(f10, b10.f4041q.f(this) / 2.0f);
                float fMin2 = Math.min(fG, b10.f4042r.g(this) / 2.0f);
                c0905p = b10.f4039o;
                if (c0905p != null) {
                    f11 = c0905p.f(this);
                } else {
                    f11 = 0.0f;
                }
                c0905p2 = b10.f4040p;
                if (c0905p2 != null) {
                    fG2 = c0905p2.g(this);
                } else {
                    fG2 = 0.0f;
                }
                f12 = b10.f4041q.f(this);
                fG3 = b10.f4042r.g(this);
                if (b10.f4136h == null) {
                    b10.f4136h = new O1.g.C0892b(f11, fG2, f12, fG3);
                }
                f13 = f12 + f11;
                f14 = fG2 + fG3;
                path = new Path();
                if (fMin != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fMin2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    path.moveTo(f11, fG2);
                    path.lineTo(f13, fG2);
                    path.lineTo(f13, f14);
                    path.lineTo(f11, f14);
                    path.lineTo(f11, fG2);
                } else {
                    float f15 = fMin * 0.5522848f;
                    float f16 = 0.5522848f * fMin2;
                    float f17 = fG2 + fMin2;
                    path.moveTo(f11, f17);
                    float f18 = f17 - f16;
                    float f19 = f11 + fMin;
                    float f20 = f19 - f15;
                    path.cubicTo(f11, f18, f20, fG2, f19, fG2);
                    float f21 = f13 - fMin;
                    path.lineTo(f21, fG2);
                    float f22 = f21 + f15;
                    path.cubicTo(f22, fG2, f13, f18, f13, f17);
                    float f23 = f14 - fMin2;
                    path.lineTo(f13, f23);
                    float f24 = f23 + f16;
                    path.cubicTo(f13, f24, f22, f14, f21, f14);
                    path.lineTo(f19, f14);
                    float f25 = f11;
                    path.cubicTo(f20, f14, f25, f24, f11, f23);
                    path.lineTo(f25, f17);
                }
                path.close();
                return path;
            }
            f10 = b10.f4044t.g(this);
        }
        fG = f10;
        fMin = Math.min(f10, b10.f4041q.f(this) / 2.0f);
        float fMin3 = Math.min(fG, b10.f4042r.g(this) / 2.0f);
        c0905p = b10.f4039o;
        if (c0905p != null) {
            f11 = c0905p.f(this);
        } else {
            f11 = 0.0f;
        }
        c0905p2 = b10.f4040p;
        if (c0905p2 != null) {
            fG2 = c0905p2.g(this);
        } else {
            fG2 = 0.0f;
        }
        f12 = b10.f4041q.f(this);
        fG3 = b10.f4042r.g(this);
        if (b10.f4136h == null) {
            b10.f4136h = new O1.g.C0892b(f11, fG2, f12, fG3);
        }
        f13 = f12 + f11;
        f14 = fG2 + fG3;
        path = new Path();
        if (fMin != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            path.moveTo(f11, fG2);
            path.lineTo(f13, fG2);
            path.lineTo(f13, f14);
            path.lineTo(f11, f14);
            path.lineTo(f11, fG2);
        } else {
            path.moveTo(f11, fG2);
            path.lineTo(f13, fG2);
            path.lineTo(f13, f14);
            path.lineTo(f11, f14);
            path.lineTo(f11, fG2);
        }
        path.close();
        return path;
    }

    private Path d0(O1.g.W w10) {
        List list = w10.f4163o;
        float fG = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f10 = (list == null || list.size() == 0) ? 0.0f : ((O1.g.C0905p) w10.f4163o.get(0)).f(this);
        List list2 = w10.f4164p;
        float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : ((O1.g.C0905p) w10.f4164p.get(0)).g(this);
        List list3 = w10.f4165q;
        float f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((O1.g.C0905p) w10.f4165q.get(0)).f(this);
        List list4 = w10.f4166r;
        if (list4 != null && list4.size() != 0) {
            fG = ((O1.g.C0905p) w10.f4166r.get(0)).g(this);
        }
        if (this.f4260d.f4296a.f4051L != O1.g.E.f.Start) {
            float fN = n(w10);
            if (this.f4260d.f4296a.f4051L == O1.g.E.f.Middle) {
                fN /= 2.0f;
            }
            f10 -= fN;
        }
        if (w10.f4136h == null) {
            i iVar = new i(f10, fG2);
            E(w10, iVar);
            RectF rectF = iVar.f4307d;
            w10.f4136h = new O1.g.C0892b(rectF.left, rectF.top, rectF.width(), iVar.f4307d.height());
        }
        Path path = new Path();
        E(w10, new g(f10 + f11, fG2 + fG, path));
        return path;
    }

    private void e0(boolean z9, O1.g.C0892b c0892b, O1.g.Q q10) {
        float f10;
        float fE;
        float f11;
        String str = q10.f4208l;
        if (str != null) {
            H(q10, str);
        }
        Boolean bool = q10.f4205i;
        int i10 = 0;
        boolean z10 = bool != null && bool.booleanValue();
        C0073h c0073h = this.f4260d;
        Paint paint = z9 ? c0073h.f4299d : c0073h.f4300e;
        if (z10) {
            O1.g.C0905p c0905p = new O1.g.C0905p(50.0f, O1.g.d0.percent);
            O1.g.C0905p c0905p2 = q10.f4149m;
            float f12 = c0905p2 != null ? c0905p2.f(this) : c0905p.f(this);
            O1.g.C0905p c0905p3 = q10.f4150n;
            float fG = c0905p3 != null ? c0905p3.g(this) : c0905p.g(this);
            O1.g.C0905p c0905p4 = q10.f4151o;
            fE = c0905p4 != null ? c0905p4.d(this) : c0905p.d(this);
            f10 = f12;
            f11 = fG;
        } else {
            O1.g.C0905p c0905p5 = q10.f4149m;
            float fE2 = c0905p5 != null ? c0905p5.e(this, 1.0f) : 0.5f;
            O1.g.C0905p c0905p6 = q10.f4150n;
            float fE3 = c0905p6 != null ? c0905p6.e(this, 1.0f) : 0.5f;
            O1.g.C0905p c0905p7 = q10.f4151o;
            f10 = fE2;
            fE = c0905p7 != null ? c0905p7.e(this, 1.0f) : 0.5f;
            f11 = fE3;
        }
        S0();
        this.f4260d = M(q10);
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(c0892b.f4167a, c0892b.f4168b);
            matrix.preScale(c0892b.f4169c, c0892b.f4170d);
        }
        Matrix matrix2 = q10.f4206j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q10.f4204h.size();
        if (size == 0) {
            R0();
            if (z9) {
                this.f4260d.f4297b = false;
                return;
            } else {
                this.f4260d.f4298c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = q10.f4204h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            O1.g.D d10 = (O1.g.D) ((O1.g.N) it.next());
            Float f14 = d10.f4045h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f4260d, d10);
            O1.g.E e10 = this.f4260d.f4296a;
            O1.g.C0896f c0896f = (O1.g.C0896f) e10.f4059T;
            if (c0896f == null) {
                c0896f = O1.g.C0896f.f4196b;
            }
            iArr[i10] = x(c0896f.f4198a, e10.f4060U.floatValue());
            i10++;
            R0();
        }
        if (fE == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        O1.g.EnumC0900k enumC0900k = q10.f4207k;
        if (enumC0900k != null) {
            if (enumC0900k == O1.g.EnumC0900k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC0900k == O1.g.EnumC0900k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fE, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f4260d.f4296a.f4072d.floatValue()));
    }

    private O1.g.C0892b f0(O1.g.C0905p c0905p, O1.g.C0905p c0905p2, O1.g.C0905p c0905p3, O1.g.C0905p c0905p4) {
        float fG = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f10 = c0905p != null ? c0905p.f(this) : 0.0f;
        if (c0905p2 != null) {
            fG = c0905p2.g(this);
        }
        O1.g.C0892b c0892bS = S();
        return new O1.g.C0892b(f10, fG, c0905p3 != null ? c0905p3.f(this) : c0892bS.f4169c, c0905p4 != null ? c0905p4.g(this) : c0892bS.f4170d);
    }

    private Path g0(O1.g.K k10, boolean z9) {
        Path pathD0;
        Path pathJ;
        this.f4261e.push(this.f4260d);
        C0073h c0073h = new C0073h(this.f4260d);
        this.f4260d = c0073h;
        W0(c0073h, k10);
        if (!A() || !Y0()) {
            this.f4260d = (C0073h) this.f4261e.pop();
            return null;
        }
        if (k10 instanceof O1.g.e0) {
            if (!z9) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            O1.g.e0 e0Var = (O1.g.e0) k10;
            O1.g.N nP = k10.f4146a.p(e0Var.f4191p);
            if (nP == null) {
                F("Use reference '%s' not found", e0Var.f4191p);
                this.f4260d = (C0073h) this.f4261e.pop();
                return null;
            }
            if (!(nP instanceof O1.g.K)) {
                this.f4260d = (C0073h) this.f4261e.pop();
                return null;
            }
            pathD0 = g0((O1.g.K) nP, false);
            if (pathD0 == null) {
                return null;
            }
            if (e0Var.f4136h == null) {
                e0Var.f4136h = m(pathD0);
            }
            Matrix matrix = e0Var.f4214o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (k10 instanceof O1.g.AbstractC0901l) {
            O1.g.AbstractC0901l abstractC0901l = (O1.g.AbstractC0901l) k10;
            if (k10 instanceof O1.g.C0911v) {
                pathD0 = new d(((O1.g.C0911v) k10).f4241o).f();
                if (k10.f4136h == null) {
                    k10.f4136h = m(pathD0);
                }
            } else if (k10 instanceof O1.g.B) {
                pathD0 = c0((O1.g.B) k10);
            } else if (k10 instanceof O1.g.C0894d) {
                pathD0 = Y((O1.g.C0894d) k10);
            } else if (k10 instanceof O1.g.C0898i) {
                pathD0 = Z((O1.g.C0898i) k10);
            } else {
                pathD0 = k10 instanceof O1.g.C0915z ? b0((O1.g.C0915z) k10) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (abstractC0901l.f4136h == null) {
                abstractC0901l.f4136h = m(pathD0);
            }
            Matrix matrix2 = abstractC0901l.f4213n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(k10 instanceof O1.g.W)) {
                F("Invalid %s element found in clipPath definition", k10.n());
                return null;
            }
            O1.g.W w10 = (O1.g.W) k10;
            pathD0 = d0(w10);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = w10.f4158s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f4260d.f4296a.f4061V != null && (pathJ = j(k10, k10.f4136h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f4260d = (C0073h) this.f4261e.pop();
        return pathD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z9, boolean z10, float f15, float f16, O1.g.InterfaceC0913x interfaceC0913x) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            interfaceC0913x.e(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(((double) f14) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((double) (f10 - f15)) / 2.0d;
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = (dCos * d10) + (dSin * d11);
        double d13 = ((-dSin) * d10) + (dCos * d11);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z9 == z10 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = d19 * Math.sqrt(d23);
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        double d27 = (-((d25 * d12) / d24)) * dSqrt2;
        double d28 = (((double) (f10 + f15)) / 2.0d) + ((dCos * d26) - (dSin * d27));
        double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double dV = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z10 && dV > 0.0d) {
            dV -= 6.283185307179586d;
        } else if (z10 && dV < 0.0d) {
            dV += 6.283185307179586d;
        }
        float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrI);
        fArrI[fArrI.length - 2] = f15;
        fArrI[fArrI.length - 1] = f16;
        for (int i10 = 0; i10 < fArrI.length; i10 += 6) {
            interfaceC0913x.c(fArrI[i10], fArrI[i10 + 1], fArrI[i10 + 2], fArrI[i10 + 3], fArrI[i10 + 4], fArrI[i10 + 5]);
        }
    }

    private void h0() {
        this.f4262f.pop();
        this.f4263g.pop();
    }

    private static float[] i(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iCeil) {
            double d14 = d10 + (((double) i10) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (dCos - (dSin * dSin2));
            fArr2[i11 + 1] = (float) (dSin2 + (dCos * dSin));
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            fArr2[i11 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i11 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) dCos2;
            i11 += 6;
            fArr2[i12] = (float) dSin3;
            i10++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private void i0(O1.g.J j10) {
        this.f4262f.push(j10);
        this.f4263g.push(this.f4257a.getMatrix());
    }

    private Path j(O1.g.K k10, O1.g.C0892b c0892b) {
        Path pathG0;
        O1.g.N nP = k10.f4146a.p(this.f4260d.f4296a.f4061V);
        if (nP == null) {
            F("ClipPath reference '%s' not found", this.f4260d.f4296a.f4061V);
            return null;
        }
        O1.g.C0895e c0895e = (O1.g.C0895e) nP;
        this.f4261e.push(this.f4260d);
        this.f4260d = M(c0895e);
        Boolean bool = c0895e.f4190p;
        boolean z9 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z9) {
            matrix.preTranslate(c0892b.f4167a, c0892b.f4168b);
            matrix.preScale(c0892b.f4169c, c0892b.f4170d);
        }
        Matrix matrix2 = c0895e.f4214o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (O1.g.N n10 : c0895e.f4125i) {
            if ((n10 instanceof O1.g.K) && (pathG0 = g0((O1.g.K) n10, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f4260d.f4296a.f4061V != null) {
            if (c0895e.f4136h == null) {
                c0895e.f4136h = m(path);
            }
            Path pathJ = j(c0895e, c0895e.f4136h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f4260d = (C0073h) this.f4261e.pop();
        return path;
    }

    private void j0(O1.g.K k10) {
        k0(k10, k10.f4136h);
    }

    private List k(O1.g.C0906q c0906q) {
        O1.g.C0905p c0905p = c0906q.f4223o;
        float fG = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f10 = c0905p != null ? c0905p.f(this) : 0.0f;
        O1.g.C0905p c0905p2 = c0906q.f4224p;
        float fG2 = c0905p2 != null ? c0905p2.g(this) : 0.0f;
        O1.g.C0905p c0905p3 = c0906q.f4225q;
        float f11 = c0905p3 != null ? c0905p3.f(this) : 0.0f;
        O1.g.C0905p c0905p4 = c0906q.f4226r;
        if (c0905p4 != null) {
            fG = c0905p4.g(this);
        }
        float f12 = fG;
        ArrayList arrayList = new ArrayList(2);
        float f13 = f11 - f10;
        float f14 = f12 - fG2;
        arrayList.add(new c(f10, fG2, f13, f14));
        arrayList.add(new c(f11, f12, f13, f14));
        return arrayList;
    }

    private void k0(O1.g.K k10, O1.g.C0892b c0892b) {
        if (this.f4260d.f4296a.f4063X != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f4257a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2127f, 0.7151f, 0.0722f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT})));
            this.f4257a.saveLayer(null, paint2, 31);
            O1.g.C0908s c0908s = (O1.g.C0908s) this.f4259c.p(this.f4260d.f4296a.f4063X);
            J0(c0908s, k10, c0892b);
            this.f4257a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f4257a.saveLayer(null, paint3, 31);
            J0(c0908s, k10, c0892b);
            this.f4257a.restore();
            this.f4257a.restore();
        }
        R0();
    }

    private List l(O1.g.C0915z c0915z) {
        int length = c0915z.f4255o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c0915z.f4255o;
        c cVar = new c(fArr[0], fArr[1], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = c0915z.f4255o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f4277a, f13 - cVar.f4278b);
            f10 = f12;
            f11 = f13;
        }
        if (!(c0915z instanceof O1.g.A)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = c0915z.f4255o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f4277a, f15 - cVar.f4278b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    private void l0(O1.g.N n10, j jVar) {
        float f10;
        float fG;
        float f11;
        O1.g.E.f fVarO;
        if (jVar.a((O1.g.Y) n10)) {
            if (n10 instanceof O1.g.Z) {
                S0();
                L0((O1.g.Z) n10);
                R0();
                return;
            }
            if (!(n10 instanceof O1.g.V)) {
                if (n10 instanceof O1.g.U) {
                    S0();
                    O1.g.U u10 = (O1.g.U) n10;
                    W0(this.f4260d, u10);
                    if (A()) {
                        r((O1.g.K) u10.e());
                        O1.g.N nP = n10.f4146a.p(u10.f4155o);
                        if (nP == null || !(nP instanceof O1.g.Y)) {
                            F("Tref reference '%s' not found", u10.f4155o);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            G((O1.g.Y) nP, sb);
                            if (sb.length() > 0) {
                                jVar.b(sb.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            O1.g.V v10 = (O1.g.V) n10;
            W0(this.f4260d, v10);
            if (A()) {
                List list = v10.f4163o;
                boolean z9 = list != null && list.size() > 0;
                boolean z10 = jVar instanceof f;
                float fG2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (z10) {
                    float f12 = !z9 ? ((f) jVar).f4289b : ((O1.g.C0905p) v10.f4163o.get(0)).f(this);
                    List list2 = v10.f4164p;
                    fG = (list2 == null || list2.size() == 0) ? ((f) jVar).f4290c : ((O1.g.C0905p) v10.f4164p.get(0)).g(this);
                    List list3 = v10.f4165q;
                    f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((O1.g.C0905p) v10.f4165q.get(0)).f(this);
                    List list4 = v10.f4166r;
                    if (list4 != null && list4.size() != 0) {
                        fG2 = ((O1.g.C0905p) v10.f4166r.get(0)).g(this);
                    }
                    f10 = fG2;
                    fG2 = f12;
                } else {
                    f10 = 0.0f;
                    fG = 0.0f;
                    f11 = 0.0f;
                }
                if (z9 && (fVarO = O()) != O1.g.E.f.Start) {
                    float fN = n(v10);
                    if (fVarO == O1.g.E.f.Middle) {
                        fN /= 2.0f;
                    }
                    fG2 -= fN;
                }
                r((O1.g.K) v10.e());
                if (z10) {
                    f fVar = (f) jVar;
                    fVar.f4289b = fG2 + f11;
                    fVar.f4290c = fG + f10;
                }
                boolean zM0 = m0();
                E(v10, jVar);
                if (zM0) {
                    j0(v10);
                }
            }
            R0();
        }
    }

    private O1.g.C0892b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new O1.g.C0892b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        O1.g.N nP;
        if (!M0()) {
            return false;
        }
        this.f4257a.saveLayerAlpha(null, w(this.f4260d.f4296a.f4082m.floatValue()), 31);
        this.f4261e.push(this.f4260d);
        C0073h c0073h = new C0073h(this.f4260d);
        this.f4260d = c0073h;
        String str = c0073h.f4296a.f4063X;
        if (str != null && ((nP = this.f4259c.p(str)) == null || !(nP instanceof O1.g.C0908s))) {
            F("Mask reference '%s' not found", this.f4260d.f4296a.f4063X);
            this.f4260d.f4296a.f4063X = null;
        }
        return true;
    }

    private float n(O1.g.Y y9) {
        k kVar = new k(this, null);
        E(y9, kVar);
        return kVar.f4310b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f4279c, cVar2.f4280d, cVar2.f4277a - cVar.f4277a, cVar2.f4278b - cVar.f4278b);
        if (fD == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fD = D(cVar2.f4279c, cVar2.f4280d, cVar3.f4277a - cVar2.f4277a, cVar3.f4278b - cVar2.f4278b);
        }
        if (fD > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (fD == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (cVar2.f4279c > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || cVar2.f4280d >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
            return cVar2;
        }
        cVar2.f4279c = -cVar2.f4279c;
        cVar2.f4280d = -cVar2.f4280d;
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Matrix o(O1.g.C0892b r10, O1.g.C0892b r11, O1.e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            O1.e$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f4169c
            float r2 = r11.f4169c
            float r1 = r1 / r2
            float r2 = r10.f4170d
            float r3 = r11.f4170d
            float r2 = r2 / r3
            float r3 = r11.f4167a
            float r3 = -r3
            float r4 = r11.f4168b
            float r4 = -r4
            O1.e r5 = O1.e.f4002d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f4167a
            float r10 = r10.f4168b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            O1.e$b r5 = r12.b()
            O1.e$b r6 = O1.e.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f4169c
            float r2 = r2 / r1
            float r5 = r10.f4170d
            float r5 = r5 / r1
            int[] r6 = O1.h.a.f4265a
            O1.e$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f4169c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f4169c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            O1.e$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f4170d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f4170d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f4167a
            float r10 = r10.f4168b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.h.o(O1.g$b, O1.g$b, O1.e):android.graphics.Matrix");
    }

    private void o0(O1.g.C0894d c0894d) {
        y("Circle render", new Object[0]);
        O1.g.C0905p c0905p = c0894d.f4179q;
        if (c0905p == null || c0905p.i()) {
            return;
        }
        W0(this.f4260d, c0894d);
        if (A() && Y0()) {
            Matrix matrix = c0894d.f4213n;
            if (matrix != null) {
                this.f4257a.concat(matrix);
            }
            Path pathY = Y(c0894d);
            U0(c0894d);
            r(c0894d);
            p(c0894d);
            boolean zM0 = m0();
            if (this.f4260d.f4297b) {
                B(c0894d, pathY);
            }
            if (this.f4260d.f4298c) {
                C(pathY);
            }
            if (zM0) {
                j0(c0894d);
            }
        }
    }

    private void p(O1.g.K k10) {
        q(k10, k10.f4136h);
    }

    private void p0(O1.g.C0898i c0898i) {
        y("Ellipse render", new Object[0]);
        O1.g.C0905p c0905p = c0898i.f4202q;
        if (c0905p == null || c0898i.f4203r == null || c0905p.i() || c0898i.f4203r.i()) {
            return;
        }
        W0(this.f4260d, c0898i);
        if (A() && Y0()) {
            Matrix matrix = c0898i.f4213n;
            if (matrix != null) {
                this.f4257a.concat(matrix);
            }
            Path pathZ = Z(c0898i);
            U0(c0898i);
            r(c0898i);
            p(c0898i);
            boolean zM0 = m0();
            if (this.f4260d.f4297b) {
                B(c0898i, pathZ);
            }
            if (this.f4260d.f4298c) {
                C(pathZ);
            }
            if (zM0) {
                j0(c0898i);
            }
        }
    }

    private void q(O1.g.K k10, O1.g.C0892b c0892b) {
        Path pathJ;
        if (this.f4260d.f4296a.f4061V == null || (pathJ = j(k10, c0892b)) == null) {
            return;
        }
        this.f4257a.clipPath(pathJ);
    }

    private void q0(O1.g.C0902m c0902m) {
        y("Group render", new Object[0]);
        W0(this.f4260d, c0902m);
        if (A()) {
            Matrix matrix = c0902m.f4214o;
            if (matrix != null) {
                this.f4257a.concat(matrix);
            }
            p(c0902m);
            boolean zM0 = m0();
            F0(c0902m, true);
            if (zM0) {
                j0(c0902m);
            }
            U0(c0902m);
        }
    }

    private void r(O1.g.K k10) {
        O1.g.O o10 = this.f4260d.f4296a.f4068b;
        if (o10 instanceof O1.g.C0910u) {
            z(true, k10.f4136h, (O1.g.C0910u) o10);
        }
        O1.g.O o11 = this.f4260d.f4296a.f4074e;
        if (o11 instanceof O1.g.C0910u) {
            z(false, k10.f4136h, (O1.g.C0910u) o11);
        }
    }

    private void r0(O1.g.C0904o c0904o) {
        O1.g.C0905p c0905p;
        String str;
        y("Image render", new Object[0]);
        O1.g.C0905p c0905p2 = c0904o.f4218s;
        if (c0905p2 == null || c0905p2.i() || (c0905p = c0904o.f4219t) == null || c0905p.i() || (str = c0904o.f4215p) == null) {
            return;
        }
        O1.e eVar = c0904o.f4148o;
        if (eVar == null) {
            eVar = O1.e.f4003e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            O1.g.k();
            return;
        }
        O1.g.C0892b c0892b = new O1.g.C0892b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f4260d, c0904o);
        if (A() && Y0()) {
            Matrix matrix = c0904o.f4220u;
            if (matrix != null) {
                this.f4257a.concat(matrix);
            }
            O1.g.C0905p c0905p3 = c0904o.f4216q;
            float f10 = c0905p3 != null ? c0905p3.f(this) : 0.0f;
            O1.g.C0905p c0905p4 = c0904o.f4217r;
            this.f4260d.f4301f = new O1.g.C0892b(f10, c0905p4 != null ? c0905p4.g(this) : 0.0f, c0904o.f4218s.f(this), c0904o.f4219t.f(this));
            if (!this.f4260d.f4296a.f4052M.booleanValue()) {
                O1.g.C0892b c0892b2 = this.f4260d.f4301f;
                O0(c0892b2.f4167a, c0892b2.f4168b, c0892b2.f4169c, c0892b2.f4170d);
            }
            c0904o.f4136h = this.f4260d.f4301f;
            U0(c0904o);
            p(c0904o);
            boolean zM0 = m0();
            X0();
            this.f4257a.save();
            this.f4257a.concat(o(this.f4260d.f4301f, c0892b, eVar));
            this.f4257a.drawBitmap(bitmapS, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new Paint(this.f4260d.f4296a.f4073d0 != O1.g.E.e.optimizeSpeed ? 2 : 0));
            this.f4257a.restore();
            if (zM0) {
                j0(c0904o);
            }
        }
    }

    private Bitmap s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    private void s0(O1.g.C0906q c0906q) {
        y("Line render", new Object[0]);
        W0(this.f4260d, c0906q);
        if (A() && Y0() && this.f4260d.f4298c) {
            Matrix matrix = c0906q.f4213n;
            if (matrix != null) {
                this.f4257a.concat(matrix);
            }
            Path pathA0 = a0(c0906q);
            U0(c0906q);
            r(c0906q);
            p(c0906q);
            boolean zM0 = m0();
            C(pathA0);
            I0(c0906q);
            if (zM0) {
                j0(c0906q);
            }
        }
    }

    private Typeface t(String str, Integer num, O1.g.E.b bVar) {
        int i10;
        boolean z9 = bVar == O1.g.E.b.Italic;
        if (num.intValue() > 500) {
            i10 = z9 ? 3 : 1;
        } else {
            i10 = z9 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            default:
                return null;
        }
    }

    private void t0(O1.g.C0911v c0911v) {
        y("Path render", new Object[0]);
        if (c0911v.f4241o == null) {
            return;
        }
        W0(this.f4260d, c0911v);
        if (A() && Y0()) {
            C0073h c0073h = this.f4260d;
            if (c0073h.f4298c || c0073h.f4297b) {
                Matrix matrix = c0911v.f4213n;
                if (matrix != null) {
                    this.f4257a.concat(matrix);
                }
                Path pathF = new d(c0911v.f4241o).f();
                if (c0911v.f4136h == null) {
                    c0911v.f4136h = m(pathF);
                }
                U0(c0911v);
                r(c0911v);
                p(c0911v);
                boolean zM0 = m0();
                if (this.f4260d.f4297b) {
                    pathF.setFillType(U());
                    B(c0911v, pathF);
                }
                if (this.f4260d.f4298c) {
                    C(pathF);
                }
                I0(c0911v);
                if (zM0) {
                    j0(c0911v);
                }
            }
        }
    }

    private void u(O1.g.N n10) {
        Boolean bool;
        if ((n10 instanceof O1.g.L) && (bool = ((O1.g.L) n10).f4138d) != null) {
            this.f4260d.f4303h = bool.booleanValue();
        }
    }

    private void u0(O1.g.C0915z c0915z) {
        y("PolyLine render", new Object[0]);
        W0(this.f4260d, c0915z);
        if (A() && Y0()) {
            C0073h c0073h = this.f4260d;
            if (c0073h.f4298c || c0073h.f4297b) {
                Matrix matrix = c0915z.f4213n;
                if (matrix != null) {
                    this.f4257a.concat(matrix);
                }
                if (c0915z.f4255o.length < 2) {
                    return;
                }
                Path pathB0 = b0(c0915z);
                U0(c0915z);
                pathB0.setFillType(U());
                r(c0915z);
                p(c0915z);
                boolean zM0 = m0();
                if (this.f4260d.f4297b) {
                    B(c0915z, pathB0);
                }
                if (this.f4260d.f4298c) {
                    C(pathB0);
                }
                I0(c0915z);
                if (zM0) {
                    j0(c0915z);
                }
            }
        }
    }

    private static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    private void v0(O1.g.A a10) {
        y("Polygon render", new Object[0]);
        W0(this.f4260d, a10);
        if (A() && Y0()) {
            C0073h c0073h = this.f4260d;
            if (c0073h.f4298c || c0073h.f4297b) {
                Matrix matrix = a10.f4213n;
                if (matrix != null) {
                    this.f4257a.concat(matrix);
                }
                if (a10.f4255o.length < 2) {
                    return;
                }
                Path pathB0 = b0(a10);
                U0(a10);
                r(a10);
                p(a10);
                boolean zM0 = m0();
                if (this.f4260d.f4297b) {
                    B(a10, pathB0);
                }
                if (this.f4260d.f4298c) {
                    C(pathB0);
                }
                I0(a10);
                if (zM0) {
                    j0(a10);
                }
            }
        }
    }

    private static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    private void w0(O1.g.B b10) {
        y("Rect render", new Object[0]);
        O1.g.C0905p c0905p = b10.f4041q;
        if (c0905p == null || b10.f4042r == null || c0905p.i() || b10.f4042r.i()) {
            return;
        }
        W0(this.f4260d, b10);
        if (A() && Y0()) {
            Matrix matrix = b10.f4213n;
            if (matrix != null) {
                this.f4257a.concat(matrix);
            }
            Path pathC0 = c0(b10);
            U0(b10);
            r(b10);
            p(b10);
            boolean zM0 = m0();
            if (this.f4260d.f4297b) {
                B(b10, pathC0);
            }
            if (this.f4260d.f4298c) {
                C(pathC0);
            }
            if (zM0) {
                j0(b10);
            }
        }
    }

    private static int x(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    private void x0(O1.g.F f10) {
        z0(f10, f0(f10.f4120q, f10.f4121r, f10.f4122s, f10.f4123t), f10.f4154p, f10.f4148o);
    }

    private void y0(O1.g.F f10, O1.g.C0892b c0892b) {
        z0(f10, c0892b, f10.f4154p, f10.f4148o);
    }

    private void z(boolean z9, O1.g.C0892b c0892b, O1.g.C0910u c0910u) {
        O1.g.N nP = this.f4259c.p(c0910u.f4239a);
        if (nP == null) {
            F("%s reference '%s' not found", z9 ? "Fill" : "Stroke", c0910u.f4239a);
            O1.g.O o10 = c0910u.f4240b;
            if (o10 != null) {
                P0(this.f4260d, z9, o10);
                return;
            } else if (z9) {
                this.f4260d.f4297b = false;
                return;
            } else {
                this.f4260d.f4298c = false;
                return;
            }
        }
        if (nP instanceof O1.g.M) {
            X(z9, c0892b, (O1.g.M) nP);
        } else if (nP instanceof O1.g.Q) {
            e0(z9, c0892b, (O1.g.Q) nP);
        } else if (nP instanceof O1.g.C) {
            Q0(z9, (O1.g.C) nP);
        }
    }

    private void z0(O1.g.F f10, O1.g.C0892b c0892b, O1.g.C0892b c0892b2, O1.e eVar) {
        y("Svg render", new Object[0]);
        if (c0892b.f4169c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || c0892b.f4170d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        if (eVar == null && (eVar = f10.f4148o) == null) {
            eVar = O1.e.f4003e;
        }
        W0(this.f4260d, f10);
        if (A()) {
            C0073h c0073h = this.f4260d;
            c0073h.f4301f = c0892b;
            if (!c0073h.f4296a.f4052M.booleanValue()) {
                O1.g.C0892b c0892b3 = this.f4260d.f4301f;
                O0(c0892b3.f4167a, c0892b3.f4168b, c0892b3.f4169c, c0892b3.f4170d);
            }
            q(f10, this.f4260d.f4301f);
            if (c0892b2 != null) {
                this.f4257a.concat(o(this.f4260d.f4301f, c0892b2, eVar));
                this.f4260d.f4302g = f10.f4154p;
            } else {
                Canvas canvas = this.f4257a;
                O1.g.C0892b c0892b4 = this.f4260d.f4301f;
                canvas.translate(c0892b4.f4167a, c0892b4.f4168b);
            }
            boolean zM0 = m0();
            X0();
            F0(f10, true);
            if (zM0) {
                j0(f10);
            }
            U0(f10);
        }
    }

    void G0(O1.g gVar, O1.f fVar) {
        O1.g.C0892b c0892b;
        O1.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f4259c = gVar;
        O1.g.F fM = gVar.m();
        if (fM == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.e()) {
            O1.g.L lJ = this.f4259c.j(fVar.f4030e);
            if (lJ == null || !(lJ instanceof O1.g.f0)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.f4030e));
                return;
            }
            O1.g.f0 f0Var = (O1.g.f0) lJ;
            c0892b = f0Var.f4154p;
            if (c0892b == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f4030e));
                return;
            }
            eVar = f0Var.f4148o;
        } else {
            c0892b = fVar.f() ? fVar.f4029d : fM.f4154p;
            eVar = fVar.c() ? fVar.f4027b : fM.f4148o;
        }
        if (fVar.b()) {
            gVar.a(fVar.f4026a);
        }
        if (fVar.d()) {
            O1.b.q qVar = new O1.b.q();
            this.f4264h = qVar;
            qVar.f3985a = gVar.j(fVar.f4028c);
        }
        N0();
        u(fM);
        S0();
        O1.g.C0892b c0892b2 = new O1.g.C0892b(fVar.f4031f);
        O1.g.C0905p c0905p = fM.f4122s;
        if (c0905p != null) {
            c0892b2.f4169c = c0905p.e(this, c0892b2.f4169c);
        }
        O1.g.C0905p c0905p2 = fM.f4123t;
        if (c0905p2 != null) {
            c0892b2.f4170d = c0905p2.e(this, c0892b2.f4170d);
        }
        z0(fM, c0892b2, c0892b, eVar);
        R0();
        if (fVar.b()) {
            gVar.b();
        }
    }

    float Q() {
        return this.f4260d.f4299d.getTextSize();
    }

    float R() {
        return this.f4260d.f4299d.getTextSize() / 2.0f;
    }

    O1.g.C0892b S() {
        C0073h c0073h = this.f4260d;
        O1.g.C0892b c0892b = c0073h.f4302g;
        return c0892b != null ? c0892b : c0073h.f4301f;
    }

    float T() {
        return this.f4258b;
    }

    private class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f4310b;

        private k() {
            super(h.this, null);
            this.f4310b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // O1.h.j
        public void b(String str) {
            this.f4310b += h.this.f4260d.f4299d.measureText(str);
        }

        /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: O1.h$h, reason: collision with other inner class name */
    private class C0073h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        O1.g.E f4296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f4297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f4298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f4299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f4300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        O1.g.C0892b f4301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        O1.g.C0892b f4302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f4303h;

        C0073h() {
            Paint paint = new Paint();
            this.f4299d = paint;
            paint.setFlags(193);
            this.f4299d.setHinting(0);
            this.f4299d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f4299d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f4300e = paint3;
            paint3.setFlags(193);
            this.f4300e.setHinting(0);
            this.f4300e.setStyle(Paint.Style.STROKE);
            this.f4300e.setTypeface(typeface);
            this.f4296a = O1.g.E.b();
        }

        C0073h(C0073h c0073h) {
            this.f4297b = c0073h.f4297b;
            this.f4298c = c0073h.f4298c;
            this.f4299d = new Paint(c0073h.f4299d);
            this.f4300e = new Paint(c0073h.f4300e);
            O1.g.C0892b c0892b = c0073h.f4301f;
            if (c0892b != null) {
                this.f4301f = new O1.g.C0892b(c0892b);
            }
            O1.g.C0892b c0892b2 = c0073h.f4302g;
            if (c0892b2 != null) {
                this.f4302g = new O1.g.C0892b(c0892b2);
            }
            this.f4303h = c0073h.f4303h;
            try {
                this.f4296a = (O1.g.E) c0073h.f4296a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f4296a = O1.g.E.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }
}
