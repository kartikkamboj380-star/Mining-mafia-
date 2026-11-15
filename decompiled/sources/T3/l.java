package T3;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends T3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f5752g = new a(null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        p064g3.b.a("LayoutUpdateAnimation", p064g3.a.ERROR);
    }

    @Override // T3.a
    public Animation c(View view, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z9 = true;
        boolean z10 = (((int) view.getX()) == i10 && ((int) view.getY()) == i11) ? false : true;
        if (view.getWidth() == i12 && view.getHeight() == i13) {
            z9 = false;
        }
        if (z10 || z9) {
            return new n(view, i10, i11, i12, i13);
        }
        return null;
    }

    @Override // T3.a
    public boolean g() {
        return e() > 0;
    }
}
