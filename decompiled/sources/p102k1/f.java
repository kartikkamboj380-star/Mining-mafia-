package p102k1;

import C.b;
import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a() {
        if (Intrinsics.b(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
    }

    public static final boolean b(Context context, String str) {
        return b.a(context, str) == 0;
    }
}
