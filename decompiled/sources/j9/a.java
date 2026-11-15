package j9;

import c9.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r9.InterfaceC7107j;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0456a f45560c = new C0456a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7107j f45561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f45562b;

    /* JADX INFO: renamed from: j9.a$a, reason: collision with other inner class name */
    public static final class C0456a {
        public /* synthetic */ C0456a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0456a() {
        }
    }

    public a(InterfaceC7107j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f45561a = source;
        this.f45562b = 262144L;
    }

    public final t a() {
        t.a aVar = new t.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.e();
            }
            aVar.b(strB);
        }
    }

    public final String b() {
        String strA = this.f45561a.A(this.f45562b);
        this.f45562b -= (long) strA.length();
        return strA;
    }
}
