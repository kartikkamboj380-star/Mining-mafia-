package Q1;

import O5.AbstractC0918c;
import O5.C0916a;
import O5.InterfaceC0917b;
import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p176r5.InterfaceC7089f;
import p176r5.InterfaceC7090g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0917b f4809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicReference f4810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f4811c;

    public e(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC0917b interfaceC0917bA = AbstractC0918c.a(context);
        Intrinsics.checkNotNullExpressionValue(interfaceC0917bA, "create(...)");
        this.f4809a = interfaceC0917bA;
        this.f4810b = new AtomicReference();
        this.f4811c = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(e eVar, Activity activity, Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (Intrinsics.b(AbstractC7024j.x(args), Boolean.TRUE)) {
            try {
                eVar.l(activity);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(e eVar, Promise promise, C0916a c0916a) {
        int iB = c0916a.b();
        boolean z9 = iB == 2 || iB == 3;
        if (z9) {
            eVar.f4810b.set(c0916a);
        }
        promise.resolve(Boolean.valueOf(z9));
        return Unit.f45918a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Promise promise, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        promise.reject(it);
    }

    private final boolean l(Activity activity) {
        C0916a c0916a = (C0916a) this.f4810b.getAndSet(null);
        if (c0916a == null) {
            return false;
        }
        return this.f4809a.a(c0916a, 1, activity, 101);
    }

    public final void e(final Activity activity, int i10, int i11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (i10 == 101 && i11 == 0 && this.f4811c.get()) {
            g(new PromiseImpl(new Callback() { // from class: Q1.a
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    e.f(this.f4803a, activity, objArr);
                }
            }, null));
        }
    }

    public final void g(final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.f4810b.set(null);
        Task taskB = this.f4809a.b();
        Intrinsics.checkNotNullExpressionValue(taskB, "getAppUpdateInfo(...)");
        final Function1 function1 = new Function1() { // from class: Q1.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.h(this.f4805a, promise, (C0916a) obj);
            }
        };
        taskB.g(new InterfaceC7090g() { // from class: Q1.c
            @Override // p176r5.InterfaceC7090g
            public final void onSuccess(Object obj) {
                e.i(function1, obj);
            }
        });
        taskB.e(new InterfaceC7089f() { // from class: Q1.d
            @Override // p176r5.InterfaceC7089f
            public final void onFailure(Exception exc) {
                e.j(promise, exc);
            }
        });
    }

    public final boolean k(boolean z9, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f4811c.set(z9);
        return l(activity);
    }
}
