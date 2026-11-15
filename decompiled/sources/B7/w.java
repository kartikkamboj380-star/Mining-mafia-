package B7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public static String a(String str) {
        Intrinsics.checkNotNullParameter("debug.pubscale.admob_adapter.flag.debug", "key");
        Intrinsics.checkNotNullParameter(str, "default");
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "debug.pubscale.admob_adapter.flag.debug");
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) objInvoke;
            return StringsKt.b0(str2) ? str : str2;
        } catch (ClassNotFoundException | Exception | NoClassDefFoundError unused) {
        }
    }
}
