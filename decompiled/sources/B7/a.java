package B7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f305a;

    static {
        Intrinsics.checkNotNullParameter("debug.pubscale.admob_adapter.flag.debug", "key");
        boolean z9 = false;
        try {
            String strA = w.a(String.valueOf(false));
            if (strA != null) {
                z9 = Boolean.parseBoolean(strA);
            }
        } catch (Exception unused) {
        }
        f305a = z9;
    }
}
