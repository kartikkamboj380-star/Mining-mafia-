package I8;

import N8.C0838o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G0 extends C0838o implements InterfaceC0670g0, InterfaceC0701w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H0 f1707d;

    @Override // I8.InterfaceC0701w0
    public M0 a() {
        return null;
    }

    @Override // I8.InterfaceC0670g0
    public void c() {
        u().z0(this);
    }

    @Override // I8.InterfaceC0701w0
    public boolean isActive() {
        return true;
    }

    @Override // N8.C0838o
    public String toString() {
        return T.a(this) + '@' + T.b(this) + "[job@" + T.b(u()) + ']';
    }

    public final H0 u() {
        H0 h10 = this.f1707d;
        if (h10 != null) {
            return h10;
        }
        Intrinsics.r("job");
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable th);

    public final void x(H0 h10) {
        this.f1707d = h10;
    }
}
