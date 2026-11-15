package D2;

import Y1.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p129m8.g;
import p129m8.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f459e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f460f = g.b(j.SYNCHRONIZED, new Function0() { // from class: D2.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e.f();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D2.a f463c = new D2.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f464d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(int i10, InputStream inputStream, byte[] bArr) throws IOException {
            if (bArr.length < i10) {
                throw new IllegalStateException("Check failed.");
            }
            if (!inputStream.markSupported()) {
                return Y1.a.b(inputStream, bArr, 0, i10);
            }
            try {
                inputStream.mark(i10);
                return Y1.a.b(inputStream, bArr, 0, i10);
            } finally {
                inputStream.reset();
            }
        }

        public final c b(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            return d().c(is);
        }

        public final c c(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            try {
                return b(is);
            } catch (IOException e10) {
                throw p.a(e10);
            }
        }

        public final e d() {
            return (e) e.f460f.getValue();
        }

        private a() {
        }
    }

    private e() {
        h();
    }

    public static final c d(InputStream inputStream) {
        return f459e.c(inputStream);
    }

    public static final e e() {
        return f459e.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e f() {
        return new e();
    }

    private final void h() {
        this.f461a = this.f463c.b();
        List list = this.f462b;
        if (list != null) {
            Intrinsics.c(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f461a = Math.max(this.f461a, ((c.b) it.next()).b());
            }
        }
    }

    public final c c(InputStream is) throws IOException {
        Intrinsics.checkNotNullParameter(is, "is");
        int i10 = this.f461a;
        byte[] bArr = new byte[i10];
        int iE = f459e.e(i10, is, bArr);
        c cVarA = this.f463c.a(bArr, iE);
        if (Intrinsics.b(cVarA, b.f452n) && !this.f464d) {
            cVarA = c.f456d;
        }
        if (cVarA != c.f456d) {
            return cVarA;
        }
        List list = this.f462b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVarA2 = ((c.b) it.next()).a(bArr, iE);
                if (cVarA2 != c.f456d) {
                    return cVarA2;
                }
            }
        }
        return c.f456d;
    }

    public final e g(boolean z9) {
        this.f464d = z9;
        return this;
    }
}
