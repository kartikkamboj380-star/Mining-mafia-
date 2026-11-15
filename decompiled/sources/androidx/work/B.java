package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    public enum a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    protected B() {
    }

    public static B h(Context context) {
        return K0.C.q(context);
    }

    public static void i(Context context, C1187b c1187b) {
        K0.C.i(context, c1187b);
    }

    public abstract t a(String str);

    public abstract t b(String str);

    public final t c(C c10) {
        return d(Collections.singletonList(c10));
    }

    public abstract t d(List list);

    public abstract t e(String str, g gVar, v vVar);

    public t f(String str, h hVar, s sVar) {
        return g(str, hVar, Collections.singletonList(sVar));
    }

    public abstract t g(String str, h hVar, List list);

    public abstract t j();
}
