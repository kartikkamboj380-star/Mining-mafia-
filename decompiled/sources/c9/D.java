package c9;

import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f11930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f11931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f11934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f11935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E f11936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final D f11937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final D f11938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final D f11939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f11940k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f11941l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h9.c f11942m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C1216d f11943v;

    public D(B request, A protocol, String message, int i10, s sVar, t headers, E e10, D d10, D d11, D d12, long j10, long j11, h9.c cVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f11930a = request;
        this.f11931b = protocol;
        this.f11932c = message;
        this.f11933d = i10;
        this.f11934e = sVar;
        this.f11935f = headers;
        this.f11936g = e10;
        this.f11937h = d10;
        this.f11938i = d11;
        this.f11939j = d12;
        this.f11940k = j10;
        this.f11941l = j11;
        this.f11942m = cVar;
    }

    public static /* synthetic */ String R(D d10, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return d10.Q(str, str2);
    }

    public final int G() {
        return this.f11933d;
    }

    public final A I0() {
        return this.f11931b;
    }

    public final h9.c J() {
        return this.f11942m;
    }

    public final s M() {
        return this.f11934e;
    }

    public final String N(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return R(this, name, null, 2, null);
    }

    public final String Q(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strB = this.f11935f.b(name);
        return strB == null ? str : strB;
    }

    public final long R0() {
        return this.f11941l;
    }

    public final t S() {
        return this.f11935f;
    }

    public final boolean T() {
        int i10 = this.f11933d;
        return 200 <= i10 && i10 < 300;
    }

    public final String V() {
        return this.f11932c;
    }

    public final B V0() {
        return this.f11930a;
    }

    public final D W() {
        return this.f11937h;
    }

    public final a X() {
        return new a(this);
    }

    public final E a() {
        return this.f11936g;
    }

    public final D a0() {
        return this.f11939j;
    }

    public final int c() {
        return this.f11933d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        E e10 = this.f11936g;
        if (e10 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        e10.close();
    }

    public final long g1() {
        return this.f11940k;
    }

    public final t h() {
        return this.f11935f;
    }

    public final B j() {
        return this.f11930a;
    }

    public final E n() {
        return this.f11936g;
    }

    public String toString() {
        return "Response{protocol=" + this.f11931b + ", code=" + this.f11933d + ", message=" + this.f11932c + ", url=" + this.f11930a.n() + '}';
    }

    public final C1216d v() {
        C1216d c1216d = this.f11943v;
        if (c1216d != null) {
            return c1216d;
        }
        C1216d c1216dB = C1216d.f12019n.b(this.f11935f);
        this.f11943v = c1216dB;
        return c1216dB;
    }

    public final D w() {
        return this.f11938i;
    }

    public final List x() {
        String str;
        t tVar = this.f11935f;
        int i10 = this.f11933d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return CollectionsKt.i();
            }
            str = "Proxy-Authenticate";
        }
        return i9.e.a(tVar, str);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private B f11944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private A f11945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f11947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s f11948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t.a f11949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E f11950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private D f11951h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private D f11952i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private D f11953j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f11954k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f11955l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private h9.c f11956m;

        public a() {
            this.f11946c = -1;
            this.f11949f = new t.a();
        }

        private final void e(D d10) {
            if (d10 != null && d10.n() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, D d10) {
            if (d10 != null) {
                if (d10.n() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (d10.W() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (d10.w() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (d10.a0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f11949f.a(name, value);
            return this;
        }

        public a b(E e10) {
            this.f11950g = e10;
            return this;
        }

        public D c() {
            int i10 = this.f11946c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f11946c).toString());
            }
            B b10 = this.f11944a;
            if (b10 == null) {
                throw new IllegalStateException("request == null");
            }
            A a10 = this.f11945b;
            if (a10 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f11947d;
            if (str != null) {
                return new D(b10, a10, str, i10, this.f11948e, this.f11949f.e(), this.f11950g, this.f11951h, this.f11952i, this.f11953j, this.f11954k, this.f11955l, this.f11956m);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(D d10) {
            f("cacheResponse", d10);
            this.f11952i = d10;
            return this;
        }

        public a g(int i10) {
            this.f11946c = i10;
            return this;
        }

        public final int h() {
            return this.f11946c;
        }

        public a i(s sVar) {
            this.f11948e = sVar;
            return this;
        }

        public a j(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f11949f.i(name, value);
            return this;
        }

        public a k(t headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f11949f = headers.i();
            return this;
        }

        public final void l(h9.c deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f11956m = deferredTrailers;
        }

        public a m(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f11947d = message;
            return this;
        }

        public a n(D d10) {
            f("networkResponse", d10);
            this.f11951h = d10;
            return this;
        }

        public a o(D d10) {
            e(d10);
            this.f11953j = d10;
            return this;
        }

        public a p(A protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f11945b = protocol;
            return this;
        }

        public a q(long j10) {
            this.f11955l = j10;
            return this;
        }

        public a r(B request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f11944a = request;
            return this;
        }

        public a s(long j10) {
            this.f11954k = j10;
            return this;
        }

        public a(D response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f11946c = -1;
            this.f11944a = response.V0();
            this.f11945b = response.I0();
            this.f11946c = response.G();
            this.f11947d = response.V();
            this.f11948e = response.M();
            this.f11949f = response.S().i();
            this.f11950g = response.n();
            this.f11951h = response.W();
            this.f11952i = response.w();
            this.f11953j = response.a0();
            this.f11954k = response.g1();
            this.f11955l = response.R0();
            this.f11956m = response.J();
        }
    }
}
