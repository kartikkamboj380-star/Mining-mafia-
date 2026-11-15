package p005a4;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0128a f7268f = new C0128a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H3.a f7270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f7271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f7272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7273e;

    /* JADX INFO: renamed from: a4.a$a, reason: collision with other inner class name */
    public static final class C0128a {
        public /* synthetic */ C0128a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new a(context, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", 0.0d, 0.0d, H3.a.DEFAULT, 12, null);
        }

        private C0128a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str) {
        this(context, str, 0.0d, 0.0d, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Uri a(Context context) {
        this.f7273e = true;
        return c.f(context, this.f7269a);
    }

    private final Uri b(Context context) {
        try {
            Uri uriA = Uri.parse(this.f7269a);
            if (uriA.getScheme() == null) {
                uriA = a(context);
            }
            Intrinsics.c(uriA);
            return uriA;
        } catch (NullPointerException unused) {
            return a(context);
        }
    }

    public final H3.a c() {
        return this.f7270b;
    }

    public final double d() {
        return this.f7272d;
    }

    public final String e() {
        return this.f7269a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.b(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (Double.compare(aVar.f7272d, this.f7272d) == 0 && g() == aVar.g() && Intrinsics.b(f(), aVar.f()) && Intrinsics.b(this.f7269a, aVar.f7269a) && this.f7270b == aVar.f7270b) {
                return true;
            }
        }
        return false;
    }

    public Uri f() {
        return this.f7271c;
    }

    public boolean g() {
        return this.f7273e;
    }

    public int hashCode() {
        return Objects.hash(f(), this.f7269a, Double.valueOf(this.f7272d), Boolean.valueOf(g()), this.f7270b);
    }

    public a(Context context, String str, double d10, double d11, H3.a cacheControl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
        this.f7269a = str;
        this.f7270b = cacheControl;
        this.f7271c = b(context);
        this.f7272d = d10 * d11;
    }

    public /* synthetic */ a(Context context, String str, double d10, double d11, H3.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? 0.0d : d10, (i10 & 8) != 0 ? 0.0d : d11, (i10 & 16) != 0 ? H3.a.DEFAULT : aVar);
    }
}
