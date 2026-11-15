package X6;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final R6.a f6750b = R6.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f6751a;

    public f() {
        this(new Bundle());
    }

    private g d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f6751a.get(str));
        } catch (ClassCastException e10) {
            f6750b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public boolean a(String str) {
        return str != null && this.f6751a.containsKey(str);
    }

    public g b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f6751a.get(str));
        } catch (ClassCastException e10) {
            f6750b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g c(String str) {
        if (!a(str)) {
            return g.a();
        }
        Object obj = this.f6751a.get(str);
        if (obj == null) {
            return g.a();
        }
        if (obj instanceof Float) {
            return g.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return g.e((Double) obj);
        }
        f6750b.b("Metadata key %s contains type other than double: %s", str);
        return g.a();
    }

    public g e(String str) {
        g gVarD = d(str);
        return gVarD.d() ? g.e(Long.valueOf(((Integer) gVarD.c()).intValue())) : g.a();
    }

    public f(Bundle bundle) {
        this.f6751a = (Bundle) bundle.clone();
    }
}
