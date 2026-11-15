package Q7;

import com.facebook.react.views.view.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5072a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f5073b;

    static {
        boolean z9;
        if (!q.d()) {
            try {
                Class.forName("com.zoontek.rnedgetoedge.EdgeToEdgePackage");
            } catch (ClassNotFoundException unused) {
                z9 = false;
            }
        }
        z9 = true;
        f5073b = z9;
    }

    private b() {
    }

    public final boolean a() {
        return f5073b;
    }
}
