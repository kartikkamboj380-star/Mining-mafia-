package c9;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f11912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f11914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C f11915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f11916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1216d f11917f;

    public B(u url, String method, t headers, C c10, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f11912a = url;
        this.f11913b = method;
        this.f11914c = headers;
        this.f11915d = c10;
        this.f11916e = tags;
    }

    public final String a() {
        return this.f11913b;
    }

    public final u b() {
        return this.f11912a;
    }

    public final C c() {
        return this.f11915d;
    }

    public final C1216d d() {
        C1216d c1216d = this.f11917f;
        if (c1216d != null) {
            return c1216d;
        }
        C1216d c1216dB = C1216d.f12019n.b(this.f11914c);
        this.f11917f = c1216dB;
        return c1216dB;
    }

    public final Map e() {
        return this.f11916e;
    }

    public final String f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f11914c.b(name);
    }

    public final t g() {
        return this.f11914c;
    }

    public final List h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f11914c.l(name);
    }

    public final boolean i() {
        return this.f11912a.i();
    }

    public final String j() {
        return this.f11913b;
    }

    public final a k() {
        return new a(this);
    }

    public final Object l() {
        return m(Object.class);
    }

    public final Object m(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f11916e.get(type));
    }

    public final u n() {
        return this.f11912a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f11913b);
        sb.append(", url=");
        sb.append(this.f11912a);
        if (this.f11914c.size() != 0) {
            sb.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f11914c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.r();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.a();
                String str2 = (String) pair.b();
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i10 = i11;
            }
            sb.append(']');
        }
        if (!this.f11916e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f11916e);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f11918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t.a f11920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C f11921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f11922e;

        public a() {
            this.f11922e = new LinkedHashMap();
            this.f11919b = "GET";
            this.f11920c = new t.a();
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f11920c.a(name, value);
            return this;
        }

        public B b() {
            u uVar = this.f11918a;
            if (uVar != null) {
                return new B(uVar, this.f11919b, this.f11920c.e(), this.f11921d, d9.e.W(this.f11922e));
            }
            throw new IllegalStateException("url == null");
        }

        public a c(C1216d cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? i("Cache-Control") : e("Cache-Control", string);
        }

        public a d() {
            return g("GET", null);
        }

        public a e(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f11920c.i(name, value);
            return this;
        }

        public a f(t headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f11920c = headers.i();
            return this;
        }

        public a g(String method, C c10) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (c10 == null) {
                if (i9.f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!i9.f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f11919b = method;
            this.f11921d = c10;
            return this;
        }

        public a h(C body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return g("POST", body);
        }

        public a i(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f11920c.h(name);
            return this;
        }

        public a j(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f11922e.remove(type);
                return this;
            }
            if (this.f11922e.isEmpty()) {
                this.f11922e = new LinkedHashMap();
            }
            Map map = this.f11922e;
            Object objCast = type.cast(obj);
            Intrinsics.c(objCast);
            map.put(type, objCast);
            return this;
        }

        public a k(Object obj) {
            return j(Object.class, obj);
        }

        public a l(u url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f11918a = url;
            return this;
        }

        public a m(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.H(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (StringsKt.H(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            return l(u.f12242k.d(url));
        }

        public a(B request) {
            Map mapV;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f11922e = new LinkedHashMap();
            this.f11918a = request.n();
            this.f11919b = request.j();
            this.f11921d = request.c();
            if (request.e().isEmpty()) {
                mapV = new LinkedHashMap();
            } else {
                mapV = kotlin.collections.E.v(request.e());
            }
            this.f11922e = mapV;
            this.f11920c = request.g().i();
        }
    }
}
