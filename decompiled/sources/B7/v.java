package B7;

import android.util.Log;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    public static void a(String message) {
        Intrinsics.checkNotNullParameter("[PAA]", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        String[] msg = {message};
        boolean z9 = a.f305a;
        Intrinsics.checkNotNullParameter("[PAA]", "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (a.f305a) {
            Log.v("[PAA]", AbstractC7024j.O(msg, "\n", null, null, 0, null, null, 62, null));
        }
        if (A7.a.f50a.a()) {
            Log.d("[PAA]", message);
        }
    }
}
