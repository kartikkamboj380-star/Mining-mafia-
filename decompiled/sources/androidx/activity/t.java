package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f7402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f7403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f7408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f7409h;

    public t(Executor executor, Function0 reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f7402a = executor;
        this.f7403b = reportFullyDrawn;
        this.f7404c = new Object();
        this.f7408g = new ArrayList();
        this.f7409h = new Runnable() { // from class: androidx.activity.s
            @Override // java.lang.Runnable
            public final void run() {
                t.d(this.f7401a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(t this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f7404c) {
            try {
                this$0.f7406e = false;
                if (this$0.f7405d == 0 && !this$0.f7407f) {
                    this$0.f7403b.invoke();
                    this$0.b();
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f7404c) {
            try {
                this.f7407f = true;
                Iterator it = this.f7408g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f7408g.clear();
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z9;
        synchronized (this.f7404c) {
            z9 = this.f7407f;
        }
        return z9;
    }
}
