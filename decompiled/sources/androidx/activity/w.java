package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.InterfaceC1168n;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C7023i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f7413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N.a f7414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7023i f7415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f7416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f7417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f7418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7420h;

    static final class a extends kotlin.jvm.internal.m implements Function1 {
        a() {
            super(1);
        }

        public final void a(C1078b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            w.this.n(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1078b) obj);
            return Unit.f45918a;
        }
    }

    static final class b extends kotlin.jvm.internal.m implements Function1 {
        b() {
            super(1);
        }

        public final void a(C1078b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            w.this.m(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1078b) obj);
            return Unit.f45918a;
        }
    }

    static final class c extends kotlin.jvm.internal.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m4invoke();
            return Unit.f45918a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m4invoke() {
            w.this.l();
        }
    }

    static final class d extends kotlin.jvm.internal.m implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return Unit.f45918a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            w.this.k();
        }
    }

    static final class e extends kotlin.jvm.internal.m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return Unit.f45918a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            w.this.l();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f7426a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @NotNull
        public final OnBackInvokedCallback b(@NotNull final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.x
                public final void onBackInvoked() {
                    w.f.c(onBackInvoked);
                }
            };
        }

        public final void d(@NotNull Object dispatcher, int i10, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(@NotNull Object dispatcher, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f7427a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f7428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f7429b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0 f7430c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0 f7431d;

            a(Function1 function1, Function1 function2, Function0 function0, Function0 function3) {
                this.f7428a = function1;
                this.f7429b = function2;
                this.f7430c = function0;
                this.f7431d = function3;
            }

            public void onBackCancelled() {
                this.f7431d.invoke();
            }

            public void onBackInvoked() {
                this.f7430c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f7429b.invoke(new C1078b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f7428a.invoke(new C1078b(backEvent));
            }
        }

        private g() {
        }

        @NotNull
        public final OnBackInvokedCallback a(@NotNull Function1<? super C1078b, Unit> onBackStarted, @NotNull Function1<? super C1078b, Unit> onBackProgressed, @NotNull Function0<Unit> onBackInvoked, @NotNull Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    private final class h implements InterfaceC1168n, InterfaceC1079c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1164j f7432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f7433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InterfaceC1079c f7434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f7435d;

        public h(w wVar, AbstractC1164j lifecycle, v onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f7435d = wVar;
            this.f7432a = lifecycle;
            this.f7433b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.InterfaceC1079c
        public void cancel() {
            this.f7432a.d(this);
            this.f7433b.i(this);
            InterfaceC1079c interfaceC1079c = this.f7434c;
            if (interfaceC1079c != null) {
                interfaceC1079c.cancel();
            }
            this.f7434c = null;
        }

        @Override // androidx.lifecycle.InterfaceC1168n
        public void onStateChanged(androidx.lifecycle.r source, AbstractC1164j.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1164j.a.ON_START) {
                this.f7434c = this.f7435d.j(this.f7433b);
                return;
            }
            if (event != AbstractC1164j.a.ON_STOP) {
                if (event == AbstractC1164j.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC1079c interfaceC1079c = this.f7434c;
                if (interfaceC1079c != null) {
                    interfaceC1079c.cancel();
                }
            }
        }
    }

    private final class i implements InterfaceC1079c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f7436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f7437b;

        public i(w wVar, v onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f7437b = wVar;
            this.f7436a = onBackPressedCallback;
        }

        @Override // androidx.activity.InterfaceC1079c
        public void cancel() {
            this.f7437b.f7415c.remove(this.f7436a);
            if (Intrinsics.b(this.f7437b.f7416d, this.f7436a)) {
                this.f7436a.c();
                this.f7437b.f7416d = null;
            }
            this.f7436a.i(this);
            Function0 function0B = this.f7436a.b();
            if (function0B != null) {
                function0B.invoke();
            }
            this.f7436a.k(null);
        }
    }

    /* synthetic */ class j extends kotlin.jvm.internal.k implements Function0 {
        j(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void b() {
            ((w) this.receiver).q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return Unit.f45918a;
        }
    }

    /* synthetic */ class k extends kotlin.jvm.internal.k implements Function0 {
        k(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void b() {
            ((w) this.receiver).q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return Unit.f45918a;
        }
    }

    public w(Runnable runnable, N.a aVar) {
        this.f7413a = runnable;
        this.f7414b = aVar;
        this.f7415c = new C7023i();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f7417e = i10 >= 34 ? g.f7427a.a(new a(), new b(), new c(), new d()) : f.f7426a.b(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        Object objPrevious;
        v vVar = this.f7416d;
        if (vVar == null) {
            C7023i c7023i = this.f7415c;
            ListIterator<E> listIterator = c7023i.listIterator(c7023i.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((v) objPrevious).g());
            vVar = (v) objPrevious;
        }
        this.f7416d = null;
        if (vVar != null) {
            vVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(C1078b c1078b) {
        Object objPrevious;
        v vVar = this.f7416d;
        if (vVar == null) {
            C7023i c7023i = this.f7415c;
            ListIterator<E> listIterator = c7023i.listIterator(c7023i.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((v) objPrevious).g());
            vVar = (v) objPrevious;
        }
        if (vVar != null) {
            vVar.e(c1078b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(C1078b c1078b) {
        Object objPrevious;
        C7023i c7023i = this.f7415c;
        ListIterator<E> listIterator = c7023i.listIterator(c7023i.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((v) objPrevious).g());
        v vVar = (v) objPrevious;
        if (this.f7416d != null) {
            k();
        }
        this.f7416d = vVar;
        if (vVar != null) {
            vVar.f(c1078b);
        }
    }

    private final void p(boolean z9) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f7418f;
        OnBackInvokedCallback onBackInvokedCallback = this.f7417e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z9 && !this.f7419g) {
            f.f7426a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f7419g = true;
        } else {
            if (z9 || !this.f7419g) {
                return;
            }
            f.f7426a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f7419g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z9 = this.f7420h;
        C7023i c7023i = this.f7415c;
        boolean z10 = false;
        if (c7023i == null || !c7023i.isEmpty()) {
            Iterator<E> it = c7023i.iterator();
            while (it.hasNext()) {
                if (((v) it.next()).g()) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f7420h = z10;
        if (z10 != z9) {
            N.a aVar = this.f7414b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z10));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z10);
            }
        }
    }

    public final void h(v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final void i(androidx.lifecycle.r owner, v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1164j lifecycle = owner.getLifecycle();
        if (lifecycle.b() == AbstractC1164j.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new h(this, lifecycle, onBackPressedCallback));
        q();
        onBackPressedCallback.k(new j(this));
    }

    public final InterfaceC1079c j(v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f7415c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.a(iVar);
        q();
        onBackPressedCallback.k(new k(this));
        return iVar;
    }

    public final void l() {
        Object objPrevious;
        v vVar = this.f7416d;
        if (vVar == null) {
            C7023i c7023i = this.f7415c;
            ListIterator<E> listIterator = c7023i.listIterator(c7023i.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((v) objPrevious).g());
            vVar = (v) objPrevious;
        }
        this.f7416d = null;
        if (vVar != null) {
            vVar.d();
            return;
        }
        Runnable runnable = this.f7413a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f7418f = invoker;
        p(this.f7420h);
    }

    public w(Runnable runnable) {
        this(runnable, null);
    }
}
