package O;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f3777a;

    static class a {
        static PointerIcon a(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }
    }

    private N(PointerIcon pointerIcon) {
        this.f3777a = pointerIcon;
    }

    public static N b(Context context, int i10) {
        return new N(a.a(context, i10));
    }

    public Object a() {
        return this.f3777a;
    }
}
