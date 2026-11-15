package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f7411b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Function0 f7412c;

    public v(boolean z9) {
        this.f7410a = z9;
    }

    public final void a(InterfaceC1079c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f7411b.add(cancellable);
    }

    public final Function0 b() {
        return this.f7412c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(C1078b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void f(C1078b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.f7410a;
    }

    public final void h() {
        Iterator it = this.f7411b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1079c) it.next()).cancel();
        }
    }

    public final void i(InterfaceC1079c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f7411b.remove(cancellable);
    }

    public final void j(boolean z9) {
        this.f7410a = z9;
        Function0 function0 = this.f7412c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void k(Function0 function0) {
        this.f7412c = function0;
    }
}
