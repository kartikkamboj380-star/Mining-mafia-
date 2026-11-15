package c9;

import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import r9.C7108k;
import r9.InterfaceC7106i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11923a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: c9.C$a$a, reason: collision with other inner class name */
        public static final class C0197a extends C {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f11924b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C7108k f11925c;

            C0197a(x xVar, C7108k c7108k) {
                this.f11924b = xVar;
                this.f11925c = c7108k;
            }

            @Override // c9.C
            public long a() {
                return this.f11925c.E();
            }

            @Override // c9.C
            public x b() {
                return this.f11924b;
            }

            @Override // c9.C
            public void g(InterfaceC7106i sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.F(this.f11925c);
            }
        }

        public static final class b extends C {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f11926b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f11927c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ byte[] f11928d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f11929e;

            b(x xVar, int i10, byte[] bArr, int i11) {
                this.f11926b = xVar;
                this.f11927c = i10;
                this.f11928d = bArr;
                this.f11929e = i11;
            }

            @Override // c9.C
            public long a() {
                return this.f11927c;
            }

            @Override // c9.C
            public x b() {
                return this.f11926b;
            }

            @Override // c9.C
            public void g(InterfaceC7106i sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f11928d, this.f11929e, this.f11927c);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C h(a aVar, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.d(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ C i(a aVar, C7108k c7108k, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.f(c7108k, xVar);
        }

        public static /* synthetic */ C j(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.g(bArr, xVar, i10, i11);
        }

        public final C a(x xVar, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return e(content, xVar);
        }

        public final C b(x xVar, C7108k content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return f(content, xVar);
        }

        public final C c(x xVar, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return h(this, xVar, content, 0, 0, 12, null);
        }

        public final C d(x xVar, byte[] content, int i10, int i11) {
            Intrinsics.checkNotNullParameter(content, "content");
            return g(content, xVar, i10, i11);
        }

        public final C e(String str, x xVar) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (xVar != null) {
                Charset charsetD = x.d(xVar, null, 1, null);
                if (charsetD == null) {
                    xVar = x.f12264e.c(xVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return g(bytes, xVar, 0, bytes.length);
        }

        public final C f(C7108k c7108k, x xVar) {
            Intrinsics.checkNotNullParameter(c7108k, "<this>");
            return new C0197a(xVar, c7108k);
        }

        public final C g(byte[] bArr, x xVar, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            d9.e.l(bArr.length, i10, i11);
            return new b(xVar, i11, bArr, i10);
        }

        private a() {
        }
    }

    public static final C c(x xVar, String str) {
        return f11923a.a(xVar, str);
    }

    public static final C d(x xVar, byte[] bArr) {
        return f11923a.c(xVar, bArr);
    }

    public abstract long a();

    public abstract x b();

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract void g(InterfaceC7106i interfaceC7106i);
}
