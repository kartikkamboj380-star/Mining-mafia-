package p178r7;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static f f48362b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f48363a;

    private f() {
    }

    public static f c() {
        return f48362b;
    }

    public Context a() {
        return this.f48363a;
    }

    public void b(Context context) {
        this.f48363a = context != null ? context.getApplicationContext() : null;
    }
}
