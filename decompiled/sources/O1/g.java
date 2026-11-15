package O1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f4032g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private F f4033a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4034b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f4035c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f4036d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.r f4037e = new b.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f4038f = new HashMap();

    static class A extends C0915z {
        A() {
        }

        @Override // O1.g.C0915z, O1.g.N
        String n() {
            return "polygon";
        }
    }

    static class B extends AbstractC0901l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C0905p f4039o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C0905p f4040p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C0905p f4041q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C0905p f4042r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C0905p f4043s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C0905p f4044t;

        B() {
        }

        @Override // O1.g.N
        String n() {
            return "rect";
        }
    }

    static class E implements Cloneable {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        C0905p f4046G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        Integer f4047H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        b f4048I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        EnumC0071g f4049J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        h f4050K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        f f4051L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        Boolean f4052M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        C0893c f4053N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        String f4054O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        String f4055P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        String f4056Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        Boolean f4057R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Boolean f4058S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        O f4059T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        Float f4060U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        String f4061V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        a f4062W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        String f4063X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        O f4064Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Float f4065Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f4066a = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        O f4067a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        O f4068b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        Float f4069b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f4070c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        i f4071c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Float f4072d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        e f4073d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        O f4074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Float f4075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        C0905p f4076g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        c f4077h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        d f4078i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Float f4079j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        C0905p[] f4080k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        C0905p f4081l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Float f4082m;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        C0896f f4083v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        List f4084w;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: renamed from: O1.g$E$g, reason: collision with other inner class name */
        public enum EnumC0071g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        E() {
        }

        static E b() {
            E e10 = new E();
            e10.f4066a = -1L;
            C0896f c0896f = C0896f.f4196b;
            e10.f4068b = c0896f;
            a aVar = a.NonZero;
            e10.f4070c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e10.f4072d = fValueOf;
            e10.f4074e = null;
            e10.f4075f = fValueOf;
            e10.f4076g = new C0905p(1.0f);
            e10.f4077h = c.Butt;
            e10.f4078i = d.Miter;
            e10.f4079j = Float.valueOf(4.0f);
            e10.f4080k = null;
            e10.f4081l = new C0905p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            e10.f4082m = fValueOf;
            e10.f4083v = c0896f;
            e10.f4084w = null;
            e10.f4046G = new C0905p(12.0f, d0.pt);
            e10.f4047H = Integer.valueOf(CommonGatewayClient.CODE_400);
            e10.f4048I = b.Normal;
            e10.f4049J = EnumC0071g.None;
            e10.f4050K = h.LTR;
            e10.f4051L = f.Start;
            Boolean bool = Boolean.TRUE;
            e10.f4052M = bool;
            e10.f4053N = null;
            e10.f4054O = null;
            e10.f4055P = null;
            e10.f4056Q = null;
            e10.f4057R = bool;
            e10.f4058S = bool;
            e10.f4059T = c0896f;
            e10.f4060U = fValueOf;
            e10.f4061V = null;
            e10.f4062W = aVar;
            e10.f4063X = null;
            e10.f4064Y = null;
            e10.f4065Z = fValueOf;
            e10.f4067a0 = null;
            e10.f4069b0 = fValueOf;
            e10.f4071c0 = i.None;
            e10.f4073d0 = e.auto;
            return e10;
        }

        void c(boolean z9) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.f4057R = bool;
            if (!z9) {
                bool = Boolean.FALSE;
            }
            this.f4052M = bool;
            this.f4053N = null;
            this.f4061V = null;
            this.f4082m = fValueOf;
            this.f4059T = C0896f.f4196b;
            this.f4060U = fValueOf;
            this.f4063X = null;
            this.f4064Y = null;
            this.f4065Z = fValueOf;
            this.f4067a0 = null;
            this.f4069b0 = fValueOf;
            this.f4071c0 = i.None;
        }

        protected Object clone() {
            E e10 = (E) super.clone();
            C0905p[] c0905pArr = this.f4080k;
            if (c0905pArr != null) {
                e10.f4080k = (C0905p[]) c0905pArr.clone();
            }
            return e10;
        }
    }

    static class F extends R {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C0905p f4120q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C0905p f4121r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C0905p f4122s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C0905p f4123t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f4124u;

        F() {
        }

        @Override // O1.g.N
        String n() {
            return "svg";
        }
    }

    interface G {
        Set b();

        String c();

        void d(Set set);

        void f(Set set);

        void g(Set set);

        Set getRequiredFeatures();

        void h(Set set);

        void i(String str);

        Set l();

        Set m();
    }

    static abstract class H extends K implements J, G {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        List f4125i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Set f4126j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f4127k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f4128l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f4129m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Set f4130n = null;

        H() {
        }

        @Override // O1.g.J
        public List a() {
            return this.f4125i;
        }

        @Override // O1.g.G
        public Set b() {
            return null;
        }

        @Override // O1.g.G
        public String c() {
            return this.f4127k;
        }

        @Override // O1.g.G
        public void d(Set set) {
            this.f4130n = set;
        }

        @Override // O1.g.G
        public void f(Set set) {
            this.f4126j = set;
        }

        @Override // O1.g.G
        public void g(Set set) {
            this.f4128l = set;
        }

        @Override // O1.g.G
        public Set getRequiredFeatures() {
            return this.f4126j;
        }

        @Override // O1.g.G
        public void h(Set set) {
            this.f4129m = set;
        }

        @Override // O1.g.G
        public void i(String str) {
            this.f4127k = str;
        }

        @Override // O1.g.J
        public void j(N n10) {
            this.f4125i.add(n10);
        }

        @Override // O1.g.G
        public Set l() {
            return this.f4129m;
        }

        @Override // O1.g.G
        public Set m() {
            return this.f4130n;
        }
    }

    static abstract class I extends K implements G {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Set f4131i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f4132j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Set f4133k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f4134l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f4135m = null;

        I() {
        }

        @Override // O1.g.G
        public Set b() {
            return this.f4133k;
        }

        @Override // O1.g.G
        public String c() {
            return this.f4132j;
        }

        @Override // O1.g.G
        public void d(Set set) {
            this.f4135m = set;
        }

        @Override // O1.g.G
        public void f(Set set) {
            this.f4131i = set;
        }

        @Override // O1.g.G
        public void g(Set set) {
            this.f4133k = set;
        }

        @Override // O1.g.G
        public Set getRequiredFeatures() {
            return this.f4131i;
        }

        @Override // O1.g.G
        public void h(Set set) {
            this.f4134l = set;
        }

        @Override // O1.g.G
        public void i(String str) {
            this.f4132j = str;
        }

        @Override // O1.g.G
        public Set l() {
            return this.f4134l;
        }

        @Override // O1.g.G
        public Set m() {
            return this.f4135m;
        }
    }

    interface J {
        List a();

        void j(N n10);
    }

    static abstract class K extends L {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C0892b f4136h = null;

        K() {
        }
    }

    static abstract class L extends N {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f4137c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Boolean f4138d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        E f4139e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        E f4140f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f4141g = null;

        L() {
        }

        public String toString() {
            return n();
        }
    }

    static class M extends AbstractC0899j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        C0905p f4142m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C0905p f4143n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C0905p f4144o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C0905p f4145p;

        M() {
        }

        @Override // O1.g.N
        String n() {
            return "linearGradient";
        }
    }

    static class N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f4146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        J f4147b;

        N() {
        }

        abstract String n();
    }

    static abstract class O implements Cloneable {
        O() {
        }
    }

    static abstract class P extends H {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        e f4148o = null;

        P() {
        }
    }

    static class Q extends AbstractC0899j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        C0905p f4149m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C0905p f4150n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C0905p f4151o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C0905p f4152p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C0905p f4153q;

        Q() {
        }

        @Override // O1.g.N
        String n() {
            return "radialGradient";
        }
    }

    static abstract class R extends P {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C0892b f4154p;

        R() {
        }
    }

    static class S extends C0902m {
        S() {
        }

        @Override // O1.g.C0902m, O1.g.N
        String n() {
            return "switch";
        }
    }

    static class T extends R implements InterfaceC0909t {
        T() {
        }

        @Override // O1.g.N
        String n() {
            return "symbol";
        }
    }

    static class U extends Y implements X {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f4155o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private b0 f4156p;

        U() {
        }

        @Override // O1.g.X
        public b0 e() {
            return this.f4156p;
        }

        @Override // O1.g.N
        String n() {
            return "tref";
        }

        public void o(b0 b0Var) {
            this.f4156p = b0Var;
        }
    }

    static class V extends a0 implements X {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private b0 f4157s;

        V() {
        }

        @Override // O1.g.X
        public b0 e() {
            return this.f4157s;
        }

        @Override // O1.g.N
        String n() {
            return "tspan";
        }

        public void o(b0 b0Var) {
            this.f4157s = b0Var;
        }
    }

    static class W extends a0 implements b0, InterfaceC0903n {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f4158s;

        W() {
        }

        @Override // O1.g.InterfaceC0903n
        public void k(Matrix matrix) {
            this.f4158s = matrix;
        }

        @Override // O1.g.N
        String n() {
            return "text";
        }
    }

    interface X {
        b0 e();
    }

    static abstract class Y extends H {
        Y() {
        }

        @Override // O1.g.H, O1.g.J
        public void j(N n10) throws j {
            if (n10 instanceof X) {
                this.f4125i.add(n10);
                return;
            }
            throw new j("Text content elements cannot contain " + n10 + " elements.");
        }
    }

    static class Z extends Y implements X {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f4159o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C0905p f4160p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private b0 f4161q;

        Z() {
        }

        @Override // O1.g.X
        public b0 e() {
            return this.f4161q;
        }

        @Override // O1.g.N
        String n() {
            return "textPath";
        }

        public void o(b0 b0Var) {
            this.f4161q = b0Var;
        }
    }

    /* JADX INFO: renamed from: O1.g$a, reason: case insensitive filesystem */
    static /* synthetic */ class C0891a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4162a;

        static {
            int[] iArr = new int[d0.values().length];
            f4162a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4162a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4162a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4162a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4162a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4162a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4162a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4162a[d0.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4162a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static abstract class a0 extends Y {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List f4163o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        List f4164p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        List f4165q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        List f4166r;

        a0() {
        }
    }

    interface b0 {
    }

    /* JADX INFO: renamed from: O1.g$c, reason: case insensitive filesystem */
    static class C0893c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C0905p f4171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        C0905p f4172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        C0905p f4173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        C0905p f4174d;

        C0893c(C0905p c0905p, C0905p c0905p2, C0905p c0905p3, C0905p c0905p4) {
            this.f4171a = c0905p;
            this.f4172b = c0905p2;
            this.f4173c = c0905p3;
            this.f4174d = c0905p4;
        }
    }

    static class c0 extends N implements X {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f4175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b0 f4176d;

        c0(String str) {
            this.f4175c = str;
        }

        @Override // O1.g.X
        public b0 e() {
            return this.f4176d;
        }

        public String toString() {
            return "TextChild: '" + this.f4175c + "'";
        }
    }

    /* JADX INFO: renamed from: O1.g$d, reason: case insensitive filesystem */
    static class C0894d extends AbstractC0901l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C0905p f4177o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C0905p f4178p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C0905p f4179q;

        C0894d() {
        }

        @Override // O1.g.N
        String n() {
            return "circle";
        }
    }

    enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* JADX INFO: renamed from: O1.g$e, reason: case insensitive filesystem */
    static class C0895e extends C0902m implements InterfaceC0909t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f4190p;

        C0895e() {
        }

        @Override // O1.g.C0902m, O1.g.N
        String n() {
            return "clipPath";
        }
    }

    static class e0 extends C0902m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f4191p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C0905p f4192q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C0905p f4193r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C0905p f4194s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C0905p f4195t;

        e0() {
        }

        @Override // O1.g.C0902m, O1.g.N
        String n() {
            return "use";
        }
    }

    /* JADX INFO: renamed from: O1.g$f, reason: case insensitive filesystem */
    static class C0896f extends O {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final C0896f f4196b = new C0896f(-16777216);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final C0896f f4197c = new C0896f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4198a;

        C0896f(int i10) {
            this.f4198a = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f4198a));
        }
    }

    static class f0 extends R implements InterfaceC0909t {
        f0() {
        }

        @Override // O1.g.N
        String n() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: O1.g$g, reason: collision with other inner class name */
    static class C0072g extends O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static C0072g f4199a = new C0072g();

        private C0072g() {
        }

        static C0072g b() {
            return f4199a;
        }
    }

    /* JADX INFO: renamed from: O1.g$h, reason: case insensitive filesystem */
    static class C0897h extends C0902m implements InterfaceC0909t {
        C0897h() {
        }

        @Override // O1.g.C0902m, O1.g.N
        String n() {
            return "defs";
        }
    }

    /* JADX INFO: renamed from: O1.g$i, reason: case insensitive filesystem */
    static class C0898i extends AbstractC0901l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C0905p f4200o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C0905p f4201p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C0905p f4202q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C0905p f4203r;

        C0898i() {
        }

        @Override // O1.g.N
        String n() {
            return "ellipse";
        }
    }

    /* JADX INFO: renamed from: O1.g$j, reason: case insensitive filesystem */
    static abstract class AbstractC0899j extends L implements J {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List f4204h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Boolean f4205i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Matrix f4206j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        EnumC0900k f4207k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f4208l;

        AbstractC0899j() {
        }

        @Override // O1.g.J
        public List a() {
            return this.f4204h;
        }

        @Override // O1.g.J
        public void j(N n10) throws j {
            if (n10 instanceof D) {
                this.f4204h.add(n10);
                return;
            }
            throw new j("Gradient elements cannot contain " + n10 + " elements.");
        }
    }

    /* JADX INFO: renamed from: O1.g$k, reason: case insensitive filesystem */
    enum EnumC0900k {
        pad,
        reflect,
        repeat
    }

    /* JADX INFO: renamed from: O1.g$l, reason: case insensitive filesystem */
    static abstract class AbstractC0901l extends I implements InterfaceC0903n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Matrix f4213n;

        AbstractC0901l() {
        }

        @Override // O1.g.InterfaceC0903n
        public void k(Matrix matrix) {
            this.f4213n = matrix;
        }
    }

    /* JADX INFO: renamed from: O1.g$m, reason: case insensitive filesystem */
    static class C0902m extends H implements InterfaceC0903n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Matrix f4214o;

        C0902m() {
        }

        @Override // O1.g.InterfaceC0903n
        public void k(Matrix matrix) {
            this.f4214o = matrix;
        }

        @Override // O1.g.N
        String n() {
            return "group";
        }
    }

    /* JADX INFO: renamed from: O1.g$n, reason: case insensitive filesystem */
    interface InterfaceC0903n {
        void k(Matrix matrix);
    }

    /* JADX INFO: renamed from: O1.g$o, reason: case insensitive filesystem */
    static class C0904o extends P implements InterfaceC0903n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f4215p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C0905p f4216q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C0905p f4217r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C0905p f4218s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C0905p f4219t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Matrix f4220u;

        C0904o() {
        }

        @Override // O1.g.InterfaceC0903n
        public void k(Matrix matrix) {
            this.f4220u = matrix;
        }

        @Override // O1.g.N
        String n() {
            return "image";
        }
    }

    /* JADX INFO: renamed from: O1.g$q, reason: case insensitive filesystem */
    static class C0906q extends AbstractC0901l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C0905p f4223o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C0905p f4224p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C0905p f4225q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C0905p f4226r;

        C0906q() {
        }

        @Override // O1.g.N
        String n() {
            return "line";
        }
    }

    /* JADX INFO: renamed from: O1.g$r, reason: case insensitive filesystem */
    static class C0907r extends R implements InterfaceC0909t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f4227q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C0905p f4228r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C0905p f4229s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C0905p f4230t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        C0905p f4231u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Float f4232v;

        C0907r() {
        }

        @Override // O1.g.N
        String n() {
            return "marker";
        }
    }

    /* JADX INFO: renamed from: O1.g$s, reason: case insensitive filesystem */
    static class C0908s extends H implements InterfaceC0909t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f4233o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f4234p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C0905p f4235q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C0905p f4236r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C0905p f4237s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C0905p f4238t;

        C0908s() {
        }

        @Override // O1.g.N
        String n() {
            return "mask";
        }
    }

    /* JADX INFO: renamed from: O1.g$t, reason: case insensitive filesystem */
    interface InterfaceC0909t {
    }

    /* JADX INFO: renamed from: O1.g$u, reason: case insensitive filesystem */
    static class C0910u extends O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f4239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        O f4240b;

        C0910u(String str, O o10) {
            this.f4239a = str;
            this.f4240b = o10;
        }

        public String toString() {
            return this.f4239a + " " + this.f4240b;
        }
    }

    /* JADX INFO: renamed from: O1.g$v, reason: case insensitive filesystem */
    static class C0911v extends AbstractC0901l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C0912w f4241o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Float f4242p;

        C0911v() {
        }

        @Override // O1.g.N
        String n() {
            return "path";
        }
    }

    /* JADX INFO: renamed from: O1.g$w, reason: case insensitive filesystem */
    static class C0912w implements InterfaceC0913x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4244b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4246d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f4243a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f4245c = new float[16];

        C0912w() {
        }

        private void f(byte b10) {
            int i10 = this.f4244b;
            byte[] bArr = this.f4243a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f4243a = bArr2;
            }
            byte[] bArr3 = this.f4243a;
            int i11 = this.f4244b;
            this.f4244b = i11 + 1;
            bArr3[i11] = b10;
        }

        private void g(int i10) {
            float[] fArr = this.f4245c;
            if (fArr.length < this.f4246d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f4245c = fArr2;
            }
        }

        @Override // O1.g.InterfaceC0913x
        public void a(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f4245c;
            int i10 = this.f4246d;
            int i11 = i10 + 1;
            this.f4246d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f4246d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f4246d = i13;
            fArr[i12] = f12;
            this.f4246d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // O1.g.InterfaceC0913x
        public void b(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f4245c;
            int i10 = this.f4246d;
            int i11 = i10 + 1;
            this.f4246d = i11;
            fArr[i10] = f10;
            this.f4246d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // O1.g.InterfaceC0913x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f4245c;
            int i10 = this.f4246d;
            int i11 = i10 + 1;
            this.f4246d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f4246d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f4246d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f4246d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f4246d = i15;
            fArr[i14] = f14;
            this.f4246d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // O1.g.InterfaceC0913x
        public void close() {
            f((byte) 8);
        }

        @Override // O1.g.InterfaceC0913x
        public void d(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14) {
            f((byte) ((z9 ? 2 : 0) | 4 | (z10 ? 1 : 0)));
            g(5);
            float[] fArr = this.f4245c;
            int i10 = this.f4246d;
            int i11 = i10 + 1;
            this.f4246d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f4246d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f4246d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f4246d = i14;
            fArr[i13] = f13;
            this.f4246d = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // O1.g.InterfaceC0913x
        public void e(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f4245c;
            int i10 = this.f4246d;
            int i11 = i10 + 1;
            this.f4246d = i11;
            fArr[i10] = f10;
            this.f4246d = i10 + 2;
            fArr[i11] = f11;
        }

        void h(InterfaceC0913x interfaceC0913x) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f4244b; i11++) {
                byte b10 = this.f4243a[i11];
                if (b10 == 0) {
                    float[] fArr = this.f4245c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    interfaceC0913x.b(f10, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f4245c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    interfaceC0913x.e(f11, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f4245c;
                    interfaceC0913x.c(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b10 == 3) {
                    float[] fArr4 = this.f4245c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    interfaceC0913x.a(f12, f13, f14, fArr4[i14]);
                } else if (b10 != 8) {
                    boolean z9 = (b10 & 2) != 0;
                    boolean z10 = (b10 & 1) != 0;
                    float[] fArr5 = this.f4245c;
                    interfaceC0913x.d(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z9, z10, fArr5[i10 + 3], fArr5[i10 + 4]);
                    i10 += 5;
                } else {
                    interfaceC0913x.close();
                }
            }
        }

        boolean i() {
            return this.f4244b == 0;
        }
    }

    /* JADX INFO: renamed from: O1.g$x, reason: case insensitive filesystem */
    interface InterfaceC0913x {
        void a(float f10, float f11, float f12, float f13);

        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13, float f14, float f15);

        void close();

        void d(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14);

        void e(float f10, float f11);
    }

    /* JADX INFO: renamed from: O1.g$y, reason: case insensitive filesystem */
    static class C0914y extends R implements InterfaceC0909t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f4247q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Boolean f4248r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f4249s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C0905p f4250t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        C0905p f4251u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        C0905p f4252v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        C0905p f4253w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f4254x;

        C0914y() {
        }

        @Override // O1.g.N
        String n() {
            return "pattern";
        }
    }

    /* JADX INFO: renamed from: O1.g$z, reason: case insensitive filesystem */
    static class C0915z extends AbstractC0901l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float[] f4255o;

        C0915z() {
        }

        @Override // O1.g.N
        String n() {
            return "polyline";
        }
    }

    g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private C0892b e(float f10) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float fC;
        d0 d0Var5;
        F f11 = this.f4033a;
        C0905p c0905p = f11.f4122s;
        C0905p c0905p2 = f11.f4123t;
        if (c0905p == null || c0905p.i() || (d0Var = c0905p.f4222b) == (d0Var2 = d0.percent) || d0Var == (d0Var3 = d0.em) || d0Var == (d0Var4 = d0.ex)) {
            return new C0892b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fC2 = c0905p.c(f10);
        if (c0905p2 == null) {
            C0892b c0892b = this.f4033a.f4154p;
            fC = c0892b != null ? (c0892b.f4170d * fC2) / c0892b.f4169c : fC2;
        } else {
            if (c0905p2.i() || (d0Var5 = c0905p2.f4222b) == d0Var2 || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C0892b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fC = c0905p2.c(f10);
        }
        return new C0892b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fC2, fC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L i(J j10, String str) {
        L lI;
        L l10 = (L) j10;
        if (str.equals(l10.f4137c)) {
            return l10;
        }
        for (Object obj : j10.a()) {
            if (obj instanceof L) {
                L l11 = (L) obj;
                if (str.equals(l11.f4137c)) {
                    return l11;
                }
                if ((obj instanceof J) && (lI = i((J) obj, str)) != null) {
                    return lI;
                }
            }
        }
        return null;
    }

    static i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new k().z(inputStream, f4032g);
    }

    void a(b.r rVar) {
        this.f4037e.b(rVar);
    }

    void b() {
        this.f4037e.e(b.u.RenderOptions);
    }

    List d() {
        return this.f4037e.c();
    }

    public float f() {
        if (this.f4033a != null) {
            return e(this.f4036d).f4170d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        F f10 = this.f4033a;
        if (f10 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C0892b c0892b = f10.f4154p;
        if (c0892b == null) {
            return null;
        }
        return c0892b.d();
    }

    public float h() {
        if (this.f4033a != null) {
            return e(this.f4036d).f4169c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    L j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f4033a.f4137c)) {
            return this.f4033a;
        }
        if (this.f4038f.containsKey(str)) {
            return (L) this.f4038f.get(str);
        }
        L lI = i(this.f4033a, str);
        this.f4038f.put(str, lI);
        return lI;
    }

    F m() {
        return this.f4033a;
    }

    boolean n() {
        return !this.f4037e.d();
    }

    public void o(Canvas canvas, f fVar) {
        if (fVar == null) {
            fVar = new f();
        }
        if (!fVar.g()) {
            fVar.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
        }
        new h(canvas, this.f4036d).G0(this, fVar);
    }

    N p(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return j(strC.substring(1));
    }

    void q(String str) {
        this.f4035c = str;
    }

    public void r(String str) {
        F f10 = this.f4033a;
        if (f10 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f10.f4123t = k.o0(str);
    }

    public void s(float f10, float f11, float f12, float f13) {
        F f14 = this.f4033a;
        if (f14 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f14.f4154p = new C0892b(f10, f11, f12, f13);
    }

    public void t(String str) {
        F f10 = this.f4033a;
        if (f10 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f10.f4122s = k.o0(str);
    }

    void u(F f10) {
        this.f4033a = f10;
    }

    void v(String str) {
        this.f4034b = str;
    }

    /* JADX INFO: renamed from: O1.g$p, reason: case insensitive filesystem */
    static class C0905p implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f4221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d0 f4222b;

        C0905p(float f10, d0 d0Var) {
            this.f4221a = f10;
            this.f4222b = d0Var;
        }

        float b() {
            return this.f4221a;
        }

        float c(float f10) {
            int i10 = C0891a.f4162a[this.f4222b.ordinal()];
            if (i10 == 1) {
                return this.f4221a;
            }
            switch (i10) {
                case 4:
                    return this.f4221a * f10;
                case 5:
                    return (this.f4221a * f10) / 2.54f;
                case 6:
                    return (this.f4221a * f10) / 25.4f;
                case 7:
                    return (this.f4221a * f10) / 72.0f;
                case 8:
                    return (this.f4221a * f10) / 6.0f;
                default:
                    return this.f4221a;
            }
        }

        float d(h hVar) {
            if (this.f4222b != d0.percent) {
                return f(hVar);
            }
            C0892b c0892bS = hVar.S();
            if (c0892bS == null) {
                return this.f4221a;
            }
            float f10 = c0892bS.f4169c;
            float f11 = c0892bS.f4170d;
            if (f10 == f11) {
                return (this.f4221a * f10) / 100.0f;
            }
            return (this.f4221a * ((float) (Math.sqrt((f10 * f10) + (f11 * f11)) / 1.414213562373095d))) / 100.0f;
        }

        float e(h hVar, float f10) {
            return this.f4222b == d0.percent ? (this.f4221a * f10) / 100.0f : f(hVar);
        }

        float f(h hVar) {
            switch (C0891a.f4162a[this.f4222b.ordinal()]) {
                case 1:
                    return this.f4221a;
                case 2:
                    return this.f4221a * hVar.Q();
                case 3:
                    return this.f4221a * hVar.R();
                case 4:
                    return this.f4221a * hVar.T();
                case 5:
                    return (this.f4221a * hVar.T()) / 2.54f;
                case 6:
                    return (this.f4221a * hVar.T()) / 25.4f;
                case 7:
                    return (this.f4221a * hVar.T()) / 72.0f;
                case 8:
                    return (this.f4221a * hVar.T()) / 6.0f;
                case 9:
                    C0892b c0892bS = hVar.S();
                    return c0892bS == null ? this.f4221a : (this.f4221a * c0892bS.f4169c) / 100.0f;
                default:
                    return this.f4221a;
            }
        }

        float g(h hVar) {
            if (this.f4222b != d0.percent) {
                return f(hVar);
            }
            C0892b c0892bS = hVar.S();
            return c0892bS == null ? this.f4221a : (this.f4221a * c0892bS.f4170d) / 100.0f;
        }

        boolean h() {
            return this.f4221a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        boolean i() {
            return this.f4221a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public String toString() {
            return String.valueOf(this.f4221a) + this.f4222b;
        }

        C0905p(float f10) {
            this.f4221a = f10;
            this.f4222b = d0.px;
        }
    }

    /* JADX INFO: renamed from: O1.g$b, reason: case insensitive filesystem */
    static class C0892b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f4167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f4168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f4169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f4170d;

        C0892b(float f10, float f11, float f12, float f13) {
            this.f4167a = f10;
            this.f4168b = f11;
            this.f4169c = f12;
            this.f4170d = f13;
        }

        static C0892b a(float f10, float f11, float f12, float f13) {
            return new C0892b(f10, f11, f12 - f10, f13 - f11);
        }

        float b() {
            return this.f4167a + this.f4169c;
        }

        float c() {
            return this.f4168b + this.f4170d;
        }

        RectF d() {
            return new RectF(this.f4167a, this.f4168b, b(), c());
        }

        void e(C0892b c0892b) {
            float f10 = c0892b.f4167a;
            if (f10 < this.f4167a) {
                this.f4167a = f10;
            }
            float f11 = c0892b.f4168b;
            if (f11 < this.f4168b) {
                this.f4168b = f11;
            }
            if (c0892b.b() > b()) {
                this.f4169c = c0892b.b() - this.f4167a;
            }
            if (c0892b.c() > c()) {
                this.f4170d = c0892b.c() - this.f4168b;
            }
        }

        public String toString() {
            return "[" + this.f4167a + " " + this.f4168b + " " + this.f4169c + " " + this.f4170d + "]";
        }

        C0892b(C0892b c0892b) {
            this.f4167a = c0892b.f4167a;
            this.f4168b = c0892b.f4168b;
            this.f4169c = c0892b.f4169c;
            this.f4170d = c0892b.f4170d;
        }
    }

    static class C extends L implements J {
        C() {
        }

        @Override // O1.g.J
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override // O1.g.N
        String n() {
            return "solidColor";
        }

        @Override // O1.g.J
        public void j(N n10) {
        }
    }

    static class D extends L implements J {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Float f4045h;

        D() {
        }

        @Override // O1.g.J
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override // O1.g.N
        String n() {
            return "stop";
        }

        @Override // O1.g.J
        public void j(N n10) {
        }
    }
}
