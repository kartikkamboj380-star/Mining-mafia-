package O;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class C0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0 f3738b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f3739a;

    private static class d extends c {
        d() {
        }

        @Override // O.C0.e
        void c(int i10, @NonNull F.b bVar) {
            this.f3747c.setInsets(m.a(i10), bVar.f());
        }

        d(@NonNull C0 c10) {
            super(c10);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0 f3748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        F.b[] f3749b;

        e() {
            this(new C0((C0) null));
        }

        protected final void a() {
            F.b[] bVarArr = this.f3749b;
            if (bVarArr != null) {
                F.b bVarF = bVarArr[l.c(1)];
                F.b bVarF2 = this.f3749b[l.c(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f3748a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f3748a.f(1);
                }
                g(F.b.b(bVarF, bVarF2));
                F.b bVar = this.f3749b[l.c(16)];
                if (bVar != null) {
                    f(bVar);
                }
                F.b bVar2 = this.f3749b[l.c(32)];
                if (bVar2 != null) {
                    d(bVar2);
                }
                F.b bVar3 = this.f3749b[l.c(64)];
                if (bVar3 != null) {
                    h(bVar3);
                }
            }
        }

        @NonNull
        abstract C0 b();

        void c(int i10, @NonNull F.b bVar) {
            if (this.f3749b == null) {
                this.f3749b = new F.b[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f3749b[l.c(i11)] = bVar;
                }
            }
        }

        abstract void e(@NonNull F.b bVar);

        abstract void g(@NonNull F.b bVar);

        e(@NonNull C0 c10) {
            this.f3748a = c10;
        }

        void d(@NonNull F.b bVar) {
        }

        void f(@NonNull F.b bVar) {
        }

        void h(@NonNull F.b bVar) {
        }
    }

    private static class h extends g {
        h(@NonNull C0 c10, @NonNull WindowInsets windowInsets) {
            super(c10, windowInsets);
        }

        @Override // O.C0.k
        @NonNull
        C0 a() {
            return C0.x(this.f3755c.consumeDisplayCutout());
        }

        @Override // O.C0.f, O.C0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f3755c, hVar.f3755c) && Objects.equals(this.f3759g, hVar.f3759g);
        }

        @Override // O.C0.k
        r f() {
            return r.e(this.f3755c.getDisplayCutout());
        }

        @Override // O.C0.k
        public int hashCode() {
            return this.f3755c.hashCode();
        }

        h(@NonNull C0 c10, @NonNull h hVar) {
            super(c10, hVar);
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final C0 f3764q = C0.x(WindowInsets.CONSUMED);

        j(@NonNull C0 c10, @NonNull WindowInsets windowInsets) {
            super(c10, windowInsets);
        }

        @Override // O.C0.f, O.C0.k
        @NonNull
        public F.b g(int i10) {
            return F.b.e(this.f3755c.getInsets(m.a(i10)));
        }

        @Override // O.C0.f, O.C0.k
        @NonNull
        public F.b h(int i10) {
            return F.b.e(this.f3755c.getInsetsIgnoringVisibility(m.a(i10)));
        }

        @Override // O.C0.f, O.C0.k
        public boolean q(int i10) {
            return this.f3755c.isVisible(m.a(i10));
        }

        j(@NonNull C0 c10, @NonNull j jVar) {
            super(c10, jVar);
        }

        @Override // O.C0.f, O.C0.k
        final void d(@NonNull View view) {
        }
    }

    public static final class l {
        public static int a() {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }

        public static int b() {
            return 8;
        }

        static int c(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int d() {
            return 32;
        }

        public static int e() {
            return 2;
        }

        public static int f() {
            return 1;
        }

        public static int g() {
            return 7;
        }
    }

    private static final class m {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3738b = j.f3764q;
        } else {
            f3738b = k.f3765b;
        }
    }

    private C0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f3739a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f3739a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f3739a = new h(this, windowInsets);
        } else {
            this.f3739a = new g(this, windowInsets);
        }
    }

    static F.b o(F.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f650a - i10);
        int iMax2 = Math.max(0, bVar.f651b - i11);
        int iMax3 = Math.max(0, bVar.f652c - i12);
        int iMax4 = Math.max(0, bVar.f653d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : F.b.c(iMax, iMax2, iMax3, iMax4);
    }

    public static C0 x(WindowInsets windowInsets) {
        return y(windowInsets, null);
    }

    public static C0 y(WindowInsets windowInsets, View view) {
        C0 c10 = new C0((WindowInsets) N.f.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c10.u(AbstractC0845c0.G(view));
            c10.d(view.getRootView());
        }
        return c10;
    }

    public C0 a() {
        return this.f3739a.a();
    }

    public C0 b() {
        return this.f3739a.b();
    }

    public C0 c() {
        return this.f3739a.c();
    }

    void d(View view) {
        this.f3739a.d(view);
    }

    public r e() {
        return this.f3739a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0) {
            return N.b.a(this.f3739a, ((C0) obj).f3739a);
        }
        return false;
    }

    public F.b f(int i10) {
        return this.f3739a.g(i10);
    }

    public F.b g(int i10) {
        return this.f3739a.h(i10);
    }

    public F.b h() {
        return this.f3739a.j();
    }

    public int hashCode() {
        k kVar = this.f3739a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public F.b i() {
        return this.f3739a.k();
    }

    public int j() {
        return this.f3739a.l().f653d;
    }

    public int k() {
        return this.f3739a.l().f650a;
    }

    public int l() {
        return this.f3739a.l().f652c;
    }

    public int m() {
        return this.f3739a.l().f651b;
    }

    public C0 n(int i10, int i11, int i12, int i13) {
        return this.f3739a.n(i10, i11, i12, i13);
    }

    public boolean p() {
        return this.f3739a.o();
    }

    public boolean q(int i10) {
        return this.f3739a.q(i10);
    }

    public C0 r(int i10, int i11, int i12, int i13) {
        return new a(this).d(F.b.c(i10, i11, i12, i13)).a();
    }

    void s(F.b[] bVarArr) {
        this.f3739a.r(bVarArr);
    }

    void t(F.b bVar) {
        this.f3739a.s(bVar);
    }

    void u(C0 c10) {
        this.f3739a.t(c10);
    }

    void v(F.b bVar) {
        this.f3739a.u(bVar);
    }

    public WindowInsets w() {
        k kVar = this.f3739a;
        if (kVar instanceof f) {
            return ((f) kVar).f3755c;
        }
        return null;
    }

    private static class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f3741e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f3742f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor f3743g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f3744h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f3745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private F.b f3746d;

        b() {
            this.f3745c = i();
        }

        private static WindowInsets i() {
            if (!f3742f) {
                try {
                    f3741e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f3742f = true;
            }
            Field field = f3741e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f3744h) {
                try {
                    f3743g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f3744h = true;
            }
            Constructor constructor = f3743g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // O.C0.e
        @NonNull
        C0 b() {
            a();
            C0 c0X = C0.x(this.f3745c);
            c0X.s(this.f3749b);
            c0X.v(this.f3746d);
            return c0X;
        }

        @Override // O.C0.e
        void e(F.b bVar) {
            this.f3746d = bVar;
        }

        @Override // O.C0.e
        void g(@NonNull F.b bVar) {
            WindowInsets windowInsets = this.f3745c;
            if (windowInsets != null) {
                this.f3745c = windowInsets.replaceSystemWindowInsets(bVar.f650a, bVar.f651b, bVar.f652c, bVar.f653d);
            }
        }

        b(@NonNull C0 c10) {
            super(c10);
            this.f3745c = c10.w();
        }
    }

    private static class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f3747c;

        c() {
            this.f3747c = K0.a();
        }

        @Override // O.C0.e
        @NonNull
        C0 b() {
            a();
            C0 c0X = C0.x(this.f3747c.build());
            c0X.s(this.f3749b);
            return c0X;
        }

        @Override // O.C0.e
        void d(@NonNull F.b bVar) {
            this.f3747c.setMandatorySystemGestureInsets(bVar.f());
        }

        @Override // O.C0.e
        void e(@NonNull F.b bVar) {
            this.f3747c.setStableInsets(bVar.f());
        }

        @Override // O.C0.e
        void f(@NonNull F.b bVar) {
            this.f3747c.setSystemGestureInsets(bVar.f());
        }

        @Override // O.C0.e
        void g(@NonNull F.b bVar) {
            this.f3747c.setSystemWindowInsets(bVar.f());
        }

        @Override // O.C0.e
        void h(@NonNull F.b bVar) {
            this.f3747c.setTappableElementInsets(bVar.f());
        }

        c(@NonNull C0 c10) {
            WindowInsets.Builder builderA;
            super(c10);
            WindowInsets windowInsetsW = c10.w();
            if (windowInsetsW != null) {
                builderA = J0.a(windowInsetsW);
            } else {
                builderA = K0.a();
            }
            this.f3747c = builderA;
        }
    }

    private static class g extends f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private F.b f3760m;

        g(@NonNull C0 c10, @NonNull WindowInsets windowInsets) {
            super(c10, windowInsets);
            this.f3760m = null;
        }

        @Override // O.C0.k
        @NonNull
        C0 b() {
            return C0.x(this.f3755c.consumeStableInsets());
        }

        @Override // O.C0.k
        @NonNull
        C0 c() {
            return C0.x(this.f3755c.consumeSystemWindowInsets());
        }

        @Override // O.C0.k
        @NonNull
        final F.b j() {
            if (this.f3760m == null) {
                this.f3760m = F.b.c(this.f3755c.getStableInsetLeft(), this.f3755c.getStableInsetTop(), this.f3755c.getStableInsetRight(), this.f3755c.getStableInsetBottom());
            }
            return this.f3760m;
        }

        @Override // O.C0.k
        boolean o() {
            return this.f3755c.isConsumed();
        }

        @Override // O.C0.k
        public void u(F.b bVar) {
            this.f3760m = bVar;
        }

        g(@NonNull C0 c10, @NonNull g gVar) {
            super(c10, gVar);
            this.f3760m = null;
            this.f3760m = gVar.f3760m;
        }
    }

    private static class f extends k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f3750h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static Method f3751i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Class f3752j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Field f3753k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f3754l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f3755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private F.b[] f3756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private F.b f3757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C0 f3758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        F.b f3759g;

        f(@NonNull C0 c10, @NonNull WindowInsets windowInsets) {
            super(c10);
            this.f3757e = null;
            this.f3755c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f3751i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3752j = cls;
                f3753k = cls.getDeclaredField("mVisibleInsets");
                f3754l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3753k.setAccessible(true);
                f3754l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f3750h = true;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private F.b v(int i10, boolean z9) {
            F.b bVarB = F.b.f649e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVarB = F.b.b(bVarB, w(i11, z9));
                }
            }
            return bVarB;
        }

        private F.b x() {
            C0 c10 = this.f3758f;
            return c10 != null ? c10.h() : F.b.f649e;
        }

        private F.b y(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f3750h) {
                A();
            }
            Method method = f3751i;
            if (method != null && f3752j != null && f3753k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3753k.get(f3754l.get(objInvoke));
                    if (rect != null) {
                        return F.b.d(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @Override // O.C0.k
        void d(@NonNull View view) {
            F.b bVarY = y(view);
            if (bVarY == null) {
                bVarY = F.b.f649e;
            }
            s(bVarY);
        }

        @Override // O.C0.k
        void e(@NonNull C0 c10) {
            c10.u(this.f3758f);
            c10.t(this.f3759g);
        }

        @Override // O.C0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3759g, ((f) obj).f3759g);
            }
            return false;
        }

        @Override // O.C0.k
        @NonNull
        public F.b g(int i10) {
            return v(i10, false);
        }

        @Override // O.C0.k
        @NonNull
        public F.b h(int i10) {
            return v(i10, true);
        }

        @Override // O.C0.k
        @NonNull
        final F.b l() {
            if (this.f3757e == null) {
                this.f3757e = F.b.c(this.f3755c.getSystemWindowInsetLeft(), this.f3755c.getSystemWindowInsetTop(), this.f3755c.getSystemWindowInsetRight(), this.f3755c.getSystemWindowInsetBottom());
            }
            return this.f3757e;
        }

        @Override // O.C0.k
        @NonNull
        C0 n(int i10, int i11, int i12, int i13) {
            a aVar = new a(C0.x(this.f3755c));
            aVar.d(C0.o(l(), i10, i11, i12, i13));
            aVar.c(C0.o(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // O.C0.k
        boolean p() {
            return this.f3755c.isRound();
        }

        @Override // O.C0.k
        @SuppressLint({"WrongConstant"})
        boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // O.C0.k
        public void r(F.b[] bVarArr) {
            this.f3756d = bVarArr;
        }

        @Override // O.C0.k
        void s(@NonNull F.b bVar) {
            this.f3759g = bVar;
        }

        @Override // O.C0.k
        void t(C0 c10) {
            this.f3758f = c10;
        }

        @NonNull
        protected F.b w(int i10, boolean z9) {
            F.b bVarH;
            int i11;
            if (i10 == 1) {
                return z9 ? F.b.c(0, Math.max(x().f651b, l().f651b), 0, 0) : F.b.c(0, l().f651b, 0, 0);
            }
            if (i10 == 2) {
                if (z9) {
                    F.b bVarX = x();
                    F.b bVarJ = j();
                    return F.b.c(Math.max(bVarX.f650a, bVarJ.f650a), 0, Math.max(bVarX.f652c, bVarJ.f652c), Math.max(bVarX.f653d, bVarJ.f653d));
                }
                F.b bVarL = l();
                C0 c10 = this.f3758f;
                bVarH = c10 != null ? c10.h() : null;
                int iMin = bVarL.f653d;
                if (bVarH != null) {
                    iMin = Math.min(iMin, bVarH.f653d);
                }
                return F.b.c(bVarL.f650a, 0, bVarL.f652c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return F.b.f649e;
                }
                C0 c11 = this.f3758f;
                r rVarE = c11 != null ? c11.e() : f();
                return rVarE != null ? F.b.c(rVarE.b(), rVarE.d(), rVarE.c(), rVarE.a()) : F.b.f649e;
            }
            F.b[] bVarArr = this.f3756d;
            bVarH = bVarArr != null ? bVarArr[l.c(8)] : null;
            if (bVarH != null) {
                return bVarH;
            }
            F.b bVarL2 = l();
            F.b bVarX2 = x();
            int i12 = bVarL2.f653d;
            if (i12 > bVarX2.f653d) {
                return F.b.c(0, 0, 0, i12);
            }
            F.b bVar = this.f3759g;
            return (bVar == null || bVar.equals(F.b.f649e) || (i11 = this.f3759g.f653d) <= bVarX2.f653d) ? F.b.f649e : F.b.c(0, 0, 0, i11);
        }

        protected boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(F.b.f649e);
        }

        f(@NonNull C0 c10, @NonNull f fVar) {
            this(c10, new WindowInsets(fVar.f3755c));
        }
    }

    private static class i extends h {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private F.b f3761n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private F.b f3762o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private F.b f3763p;

        i(@NonNull C0 c10, @NonNull WindowInsets windowInsets) {
            super(c10, windowInsets);
            this.f3761n = null;
            this.f3762o = null;
            this.f3763p = null;
        }

        @Override // O.C0.k
        @NonNull
        F.b i() {
            if (this.f3762o == null) {
                this.f3762o = F.b.e(this.f3755c.getMandatorySystemGestureInsets());
            }
            return this.f3762o;
        }

        @Override // O.C0.k
        @NonNull
        F.b k() {
            if (this.f3761n == null) {
                this.f3761n = F.b.e(this.f3755c.getSystemGestureInsets());
            }
            return this.f3761n;
        }

        @Override // O.C0.k
        @NonNull
        F.b m() {
            if (this.f3763p == null) {
                this.f3763p = F.b.e(this.f3755c.getTappableElementInsets());
            }
            return this.f3763p;
        }

        @Override // O.C0.f, O.C0.k
        @NonNull
        C0 n(int i10, int i11, int i12, int i13) {
            return C0.x(this.f3755c.inset(i10, i11, i12, i13));
        }

        i(@NonNull C0 c10, @NonNull i iVar) {
            super(c10, iVar);
            this.f3761n = null;
            this.f3762o = null;
            this.f3763p = null;
        }

        @Override // O.C0.g, O.C0.k
        public void u(F.b bVar) {
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f3740a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f3740a = new d();
            } else if (i10 >= 29) {
                this.f3740a = new c();
            } else {
                this.f3740a = new b();
            }
        }

        public C0 a() {
            return this.f3740a.b();
        }

        public a b(int i10, F.b bVar) {
            this.f3740a.c(i10, bVar);
            return this;
        }

        public a c(F.b bVar) {
            this.f3740a.e(bVar);
            return this;
        }

        public a d(F.b bVar) {
            this.f3740a.g(bVar);
            return this;
        }

        public a(C0 c10) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f3740a = new d(c10);
            } else if (i10 >= 29) {
                this.f3740a = new c(c10);
            } else {
                this.f3740a = new b(c10);
            }
        }
    }

    public C0(C0 c10) {
        if (c10 != null) {
            k kVar = c10.f3739a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (kVar instanceof j)) {
                this.f3739a = new j(this, (j) kVar);
            } else if (i10 >= 29 && (kVar instanceof i)) {
                this.f3739a = new i(this, (i) kVar);
            } else if (i10 >= 28 && (kVar instanceof h)) {
                this.f3739a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f3739a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f3739a = new f(this, (f) kVar);
            } else {
                this.f3739a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.f3739a = new k(this);
    }

    private static class k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final C0 f3765b = new a().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C0 f3766a;

        k(@NonNull C0 c10) {
            this.f3766a = c10;
        }

        @NonNull
        C0 a() {
            return this.f3766a;
        }

        @NonNull
        C0 b() {
            return this.f3766a;
        }

        @NonNull
        C0 c() {
            return this.f3766a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p() == kVar.p() && o() == kVar.o() && N.b.a(l(), kVar.l()) && N.b.a(j(), kVar.j()) && N.b.a(f(), kVar.f());
        }

        r f() {
            return null;
        }

        @NonNull
        F.b g(int i10) {
            return F.b.f649e;
        }

        @NonNull
        F.b h(int i10) {
            if ((i10 & 8) == 0) {
                return F.b.f649e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return N.b.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @NonNull
        F.b i() {
            return l();
        }

        @NonNull
        F.b j() {
            return F.b.f649e;
        }

        @NonNull
        F.b k() {
            return l();
        }

        @NonNull
        F.b l() {
            return F.b.f649e;
        }

        @NonNull
        F.b m() {
            return l();
        }

        @NonNull
        C0 n(int i10, int i11, int i12, int i13) {
            return f3765b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i10) {
            return true;
        }

        void d(@NonNull View view) {
        }

        void e(@NonNull C0 c10) {
        }

        public void r(F.b[] bVarArr) {
        }

        void s(@NonNull F.b bVar) {
        }

        void t(C0 c10) {
        }

        public void u(F.b bVar) {
        }
    }
}
