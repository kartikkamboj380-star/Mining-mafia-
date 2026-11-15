package p058f7;

import kotlin.jvm.internal.Intrinsics;
import p048e7.V;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43736a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static V f43737b;

    private a() {
    }

    public static final void b() {
        try {
            if (f43737b == null) {
                f43736a.c(V.f43365a.a());
            }
            a aVar = f43736a;
            if (aVar.a().a()) {
                aVar.a().b();
            }
        } catch (Exception unused) {
        }
    }

    public final V a() {
        V v10 = f43737b;
        if (v10 != null) {
            return v10;
        }
        Intrinsics.r("sharedSessionRepository");
        return null;
    }

    public final void c(V v10) {
        Intrinsics.checkNotNullParameter(v10, "<set-?>");
        f43737b = v10;
    }
}
