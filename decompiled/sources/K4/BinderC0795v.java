package K4;

import H4.Z0;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: K4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC0795v extends H4.L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f2755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0798y f2756b;

    BinderC0795v(C0798y c0798y, Context context) {
        this.f2755a = context;
        Objects.requireNonNull(c0798y);
        this.f2756b = c0798y;
    }

    @Override // H4.M0
    public final void D0(Z0 z9) {
        if (z9 == null) {
            return;
        }
        this.f2756b.n(this.f2755a, z9.f1253b, true, true);
    }
}
