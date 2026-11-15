package p147o6;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f47301a = Charset.forName("UTF-8");

    public static abstract class a {

        /* JADX INFO: renamed from: o6.F$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0491a {

            /* JADX INFO: renamed from: o6.F$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0492a {
                public abstract AbstractC0491a a();

                public abstract AbstractC0492a b(String str);

                public abstract AbstractC0492a c(String str);

                public abstract AbstractC0492a d(String str);
            }

            public static AbstractC0492a a() {
                return new C7080d.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();
        }

        public static abstract class b {
            public abstract a a();

            public abstract b b(List list);

            public abstract b c(int i10);

            public abstract b d(int i10);

            public abstract b e(String str);

            public abstract b f(long j10);

            public abstract b g(int i10);

            public abstract b h(long j10);

            public abstract b i(long j10);

            public abstract b j(String str);
        }

        public static b a() {
            return new C7079c.b();
        }

        public abstract List b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract long f();

        public abstract int g();

        public abstract long h();

        public abstract long i();

        public abstract String j();
    }

    public static abstract class b {
        public abstract F a();

        public abstract b b(a aVar);

        public abstract b c(String str);

        public abstract b d(String str);

        public abstract b e(String str);

        public abstract b f(String str);

        public abstract b g(String str);

        public abstract b h(String str);

        public abstract b i(String str);

        public abstract b j(d dVar);

        public abstract b k(int i10);

        public abstract b l(String str);

        public abstract b m(e eVar);
    }

    public static abstract class c {

        public static abstract class a {
            public abstract c a();

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public static a a() {
            return new C7081e.b();
        }

        public abstract String b();

        public abstract String c();
    }

    public static abstract class d {

        public static abstract class a {
            public abstract d a();

            public abstract a b(List list);

            public abstract a c(String str);
        }

        public static abstract class b {

            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            public static a a() {
                return new C7083g.b();
            }

            public abstract byte[] b();

            public abstract String c();
        }

        public static a a() {
            return new C7082f.b();
        }

        public abstract List b();

        public abstract String c();
    }

    public static abstract class e {

        public static abstract class a {

            /* JADX INFO: renamed from: o6.F$e$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0493a {
                public abstract a a();

                public abstract AbstractC0493a b(String str);

                public abstract AbstractC0493a c(String str);

                public abstract AbstractC0493a d(String str);

                public abstract AbstractC0493a e(String str);

                public abstract AbstractC0493a f(String str);

                public abstract AbstractC0493a g(String str);
            }

            public static abstract class b {
            }

            public static AbstractC0493a a() {
                return new i.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract b g();

            public abstract String h();
        }

        public static abstract class b {
            public abstract e a();

            public abstract b b(a aVar);

            public abstract b c(String str);

            public abstract b d(boolean z9);

            public abstract b e(c cVar);

            public abstract b f(Long l10);

            public abstract b g(List list);

            public abstract b h(String str);

            public abstract b i(int i10);

            public abstract b j(String str);

            public b k(byte[] bArr) {
                return j(new String(bArr, F.f47301a));
            }

            public abstract b l(AbstractC0508e abstractC0508e);

            public abstract b m(long j10);

            public abstract b n(f fVar);
        }

        public static abstract class c {

            public static abstract class a {
                public abstract c a();

                public abstract a b(int i10);

                public abstract a c(int i10);

                public abstract a d(long j10);

                public abstract a e(String str);

                public abstract a f(String str);

                public abstract a g(String str);

                public abstract a h(long j10);

                public abstract a i(boolean z9);

                public abstract a j(int i10);
            }

            public static a a() {
                return new k.b();
            }

            public abstract int b();

            public abstract int c();

            public abstract long d();

            public abstract String e();

            public abstract String f();

            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        public static abstract class d {

            public static abstract class a {

                /* JADX INFO: renamed from: o6.F$e$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC0494a {
                    public abstract a a();

                    public abstract AbstractC0494a b(List list);

                    public abstract AbstractC0494a c(Boolean bool);

                    public abstract AbstractC0494a d(c cVar);

                    public abstract AbstractC0494a e(List list);

                    public abstract AbstractC0494a f(b bVar);

                    public abstract AbstractC0494a g(List list);

                    public abstract AbstractC0494a h(int i10);
                }

                public static abstract class b {

                    /* JADX INFO: renamed from: o6.F$e$d$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0495a {

                        /* JADX INFO: renamed from: o6.F$e$d$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0496a {
                            public abstract AbstractC0495a a();

                            public abstract AbstractC0496a b(long j10);

                            public abstract AbstractC0496a c(String str);

                            public abstract AbstractC0496a d(long j10);

                            public abstract AbstractC0496a e(String str);

                            public AbstractC0496a f(byte[] bArr) {
                                return e(new String(bArr, F.f47301a));
                            }
                        }

                        public static AbstractC0496a a() {
                            return new o.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public byte[] f() {
                            String strE = e();
                            if (strE != null) {
                                return strE.getBytes(F.f47301a);
                            }
                            return null;
                        }
                    }

                    /* JADX INFO: renamed from: o6.F$e$d$a$b$b, reason: collision with other inner class name */
                    public static abstract class AbstractC0497b {
                        public abstract b a();

                        public abstract AbstractC0497b b(a aVar);

                        public abstract AbstractC0497b c(List list);

                        public abstract AbstractC0497b d(c cVar);

                        public abstract AbstractC0497b e(AbstractC0499d abstractC0499d);

                        public abstract AbstractC0497b f(List list);
                    }

                    public static abstract class c {

                        /* JADX INFO: renamed from: o6.F$e$d$a$b$c$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0498a {
                            public abstract c a();

                            public abstract AbstractC0498a b(c cVar);

                            public abstract AbstractC0498a c(List list);

                            public abstract AbstractC0498a d(int i10);

                            public abstract AbstractC0498a e(String str);

                            public abstract AbstractC0498a f(String str);
                        }

                        public static AbstractC0498a a() {
                            return new p.b();
                        }

                        public abstract c b();

                        public abstract List c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();
                    }

                    /* JADX INFO: renamed from: o6.F$e$d$a$b$d, reason: collision with other inner class name */
                    public static abstract class AbstractC0499d {

                        /* JADX INFO: renamed from: o6.F$e$d$a$b$d$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0500a {
                            public abstract AbstractC0499d a();

                            public abstract AbstractC0500a b(long j10);

                            public abstract AbstractC0500a c(String str);

                            public abstract AbstractC0500a d(String str);
                        }

                        public static AbstractC0500a a() {
                            return new q.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();
                    }

                    /* JADX INFO: renamed from: o6.F$e$d$a$b$e, reason: collision with other inner class name */
                    public static abstract class AbstractC0501e {

                        /* JADX INFO: renamed from: o6.F$e$d$a$b$e$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0502a {
                            public abstract AbstractC0501e a();

                            public abstract AbstractC0502a b(List list);

                            public abstract AbstractC0502a c(int i10);

                            public abstract AbstractC0502a d(String str);
                        }

                        /* JADX INFO: renamed from: o6.F$e$d$a$b$e$b, reason: collision with other inner class name */
                        public static abstract class AbstractC0503b {

                            /* JADX INFO: renamed from: o6.F$e$d$a$b$e$b$a, reason: collision with other inner class name */
                            public static abstract class AbstractC0504a {
                                public abstract AbstractC0503b a();

                                public abstract AbstractC0504a b(String str);

                                public abstract AbstractC0504a c(int i10);

                                public abstract AbstractC0504a d(long j10);

                                public abstract AbstractC0504a e(long j10);

                                public abstract AbstractC0504a f(String str);
                            }

                            public static AbstractC0504a a() {
                                return new s.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();
                        }

                        public static AbstractC0502a a() {
                            return new r.b();
                        }

                        public abstract List b();

                        public abstract int c();

                        public abstract String d();
                    }

                    public static AbstractC0497b a() {
                        return new n.b();
                    }

                    public abstract a b();

                    public abstract List c();

                    public abstract c d();

                    public abstract AbstractC0499d e();

                    public abstract List f();
                }

                public static abstract class c {

                    /* JADX INFO: renamed from: o6.F$e$d$a$c$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0505a {
                        public abstract c a();

                        public abstract AbstractC0505a b(boolean z9);

                        public abstract AbstractC0505a c(int i10);

                        public abstract AbstractC0505a d(int i10);

                        public abstract AbstractC0505a e(String str);
                    }

                    public static AbstractC0505a a() {
                        return new t.b();
                    }

                    public abstract int b();

                    public abstract int c();

                    public abstract String d();

                    public abstract boolean e();
                }

                public static AbstractC0494a a() {
                    return new m.b();
                }

                public abstract List b();

                public abstract Boolean c();

                public abstract c d();

                public abstract List e();

                public abstract b f();

                public abstract List g();

                public abstract int h();

                public abstract AbstractC0494a i();
            }

            public static abstract class b {
                public abstract d a();

                public abstract b b(a aVar);

                public abstract b c(c cVar);

                public abstract b d(AbstractC0506d abstractC0506d);

                public abstract b e(f fVar);

                public abstract b f(long j10);

                public abstract b g(String str);
            }

            public static abstract class c {

                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double d10);

                    public abstract a c(int i10);

                    public abstract a d(long j10);

                    public abstract a e(int i10);

                    public abstract a f(boolean z9);

                    public abstract a g(long j10);
                }

                public static a a() {
                    return new u.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            /* JADX INFO: renamed from: o6.F$e$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC0506d {

                /* JADX INFO: renamed from: o6.F$e$d$d$a */
                public static abstract class a {
                    public abstract AbstractC0506d a();

                    public abstract a b(String str);
                }

                public static a a() {
                    return new v.b();
                }

                public abstract String b();
            }

            /* JADX INFO: renamed from: o6.F$e$d$e, reason: collision with other inner class name */
            public static abstract class AbstractC0507e {

                /* JADX INFO: renamed from: o6.F$e$d$e$a */
                public static abstract class a {
                    public abstract AbstractC0507e a();

                    public abstract a b(String str);

                    public abstract a c(String str);

                    public abstract a d(b bVar);

                    public abstract a e(long j10);
                }

                /* JADX INFO: renamed from: o6.F$e$d$e$b */
                public static abstract class b {

                    /* JADX INFO: renamed from: o6.F$e$d$e$b$a */
                    public static abstract class a {
                        public abstract b a();

                        public abstract a b(String str);

                        public abstract a c(String str);
                    }

                    public static a a() {
                        return new x.b();
                    }

                    public abstract String b();

                    public abstract String c();
                }

                public static a a() {
                    return new w.b();
                }

                public abstract String b();

                public abstract String c();

                public abstract b d();

                public abstract long e();
            }

            public static abstract class f {

                public static abstract class a {
                    public abstract f a();

                    public abstract a b(List list);
                }

                public static a a() {
                    return new y.b();
                }

                public abstract List b();
            }

            public static b a() {
                return new l.b();
            }

            public abstract a b();

            public abstract c c();

            public abstract AbstractC0506d d();

            public abstract f e();

            public abstract long f();

            public abstract String g();

            public abstract b h();
        }

        /* JADX INFO: renamed from: o6.F$e$e, reason: collision with other inner class name */
        public static abstract class AbstractC0508e {

            /* JADX INFO: renamed from: o6.F$e$e$a */
            public static abstract class a {
                public abstract AbstractC0508e a();

                public abstract a b(String str);

                public abstract a c(boolean z9);

                public abstract a d(int i10);

                public abstract a e(String str);
            }

            public static a a() {
                return new z.b();
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();
        }

        public static abstract class f {

            public static abstract class a {
                public abstract f a();

                public abstract a b(String str);
            }

            public static a a() {
                return new A.b();
            }

            public abstract String b();
        }

        public static b a() {
            return new h.b().d(false);
        }

        public abstract a b();

        public abstract String c();

        public abstract c d();

        public abstract Long e();

        public abstract List f();

        public abstract String g();

        public abstract int h();

        public abstract String i();

        public byte[] j() {
            return i().getBytes(F.f47301a);
        }

        public abstract AbstractC0508e k();

        public abstract long l();

        public abstract f m();

        public abstract boolean n();

        public abstract b o();

        e p(String str) {
            return o().c(str).a();
        }

        e q(List list) {
            return o().g(list).a();
        }

        e r(long j10, boolean z9, String str) {
            b bVarO = o();
            bVarO.f(Long.valueOf(j10));
            bVarO.d(z9);
            if (str != null) {
                bVarO.n(f.a().b(str).a());
            }
            return bVarO.a();
        }
    }

    public static b b() {
        return new C7078b.C0510b();
    }

    public abstract a c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract d k();

    public abstract int l();

    public abstract String m();

    public abstract e n();

    protected abstract b o();

    public F p(String str) {
        b bVarC = o().c(str);
        if (n() != null) {
            bVarC.m(n().p(str));
        }
        return bVarC.a();
    }

    public F q(a aVar) {
        return aVar == null ? this : o().b(aVar).a();
    }

    public F r(List list) {
        if (n() != null) {
            return o().m(n().q(list)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public F s(String str) {
        return o().f(str).a();
    }

    public F t(String str) {
        return o().g(str).a();
    }

    public F u(d dVar) {
        return o().m(null).j(dVar).a();
    }

    public F v(long j10, boolean z9, String str) {
        b bVarO = o();
        if (n() != null) {
            bVarO.m(n().r(j10, z9, str));
        }
        return bVarO.a();
    }
}
