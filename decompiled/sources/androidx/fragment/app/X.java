package androidx.fragment.app;

import O.AbstractC0845c0;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f9976f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f9977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f9978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9981e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final X a(ViewGroup container, G fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Z zA0 = fragmentManager.A0();
            Intrinsics.checkNotNullExpressionValue(zA0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, zA0);
        }

        public final X b(ViewGroup container, Z factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object tag = container.getTag(p071h0.b.f44740b);
            if (tag instanceof X) {
                return (X) tag;
            }
            X xA = factory.a(container);
            Intrinsics.checkNotNullExpressionValue(xA, "factory.createController(container)");
            container.setTag(p071h0.b.f44740b, xA);
            return xA;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final M f9982h;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(c.b finalState, c.a lifecycleImpact, M fragmentStateManager, K.e cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            ComponentCallbacksC1144o componentCallbacksC1144oK = fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC1144oK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, componentCallbacksC1144oK, cancellationSignal);
            this.f9982h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.X.c
        public void e() {
            super.e();
            this.f9982h.m();
        }

        @Override // androidx.fragment.app.X.c
        public void n() {
            if (i() != c.a.ADDING) {
                if (i() == c.a.REMOVING) {
                    ComponentCallbacksC1144o componentCallbacksC1144oK = this.f9982h.k();
                    Intrinsics.checkNotNullExpressionValue(componentCallbacksC1144oK, "fragmentStateManager.fragment");
                    View viewRequireView = componentCallbacksC1144oK.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                    if (G.I0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + componentCallbacksC1144oK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            ComponentCallbacksC1144o componentCallbacksC1144oK2 = this.f9982h.k();
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC1144oK2, "fragmentStateManager.fragment");
            View viewFindFocus = componentCallbacksC1144oK2.mView.findFocus();
            if (viewFindFocus != null) {
                componentCallbacksC1144oK2.setFocusedView(viewFindFocus);
                if (G.I0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + componentCallbacksC1144oK2);
                }
            }
            View viewRequireView2 = h().requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f9982h.b();
                viewRequireView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (viewRequireView2.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(componentCallbacksC1144oK2.getPostOnViewCreatedAlpha());
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f9983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f9984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ComponentCallbacksC1144o f9985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f9986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set f9987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f9989g;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f9994a = new a(null);

            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.X$c$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0155b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f10000a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f10000a = iArr;
                }
            }

            public static final b e(int i10) {
                return f9994a.b(i10);
            }

            public final void d(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                int i10 = C0155b.f10000a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (G.I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (G.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (G.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (G.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.X$c$c, reason: collision with other inner class name */
        public /* synthetic */ class C0156c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10001a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f10001a = iArr;
            }
        }

        public c(b finalState, a lifecycleImpact, ComponentCallbacksC1144o fragment, K.e cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            this.f9983a = finalState;
            this.f9984b = lifecycleImpact;
            this.f9985c = fragment;
            this.f9986d = new ArrayList();
            this.f9987e = new LinkedHashSet();
            cancellationSignal.c(new K.e.a() { // from class: androidx.fragment.app.Y
                @Override // K.e.a
                public final void onCancel() {
                    X.c.b(this.f10003a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(c this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.d();
        }

        public final void c(Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f9986d.add(listener);
        }

        public final void d() {
            if (this.f9988f) {
                return;
            }
            this.f9988f = true;
            if (this.f9987e.isEmpty()) {
                e();
                return;
            }
            Iterator it = CollectionsKt.z0(this.f9987e).iterator();
            while (it.hasNext()) {
                ((K.e) it.next()).a();
            }
        }

        public void e() {
            if (this.f9989g) {
                return;
            }
            if (G.I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f9989g = true;
            Iterator it = this.f9986d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(K.e signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (this.f9987e.remove(signal) && this.f9987e.isEmpty()) {
                e();
            }
        }

        public final b g() {
            return this.f9983a;
        }

        public final ComponentCallbacksC1144o h() {
            return this.f9985c;
        }

        public final a i() {
            return this.f9984b;
        }

        public final boolean j() {
            return this.f9988f;
        }

        public final boolean k() {
            return this.f9989g;
        }

        public final void l(K.e signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            n();
            this.f9987e.add(signal);
        }

        public final void m(b finalState, a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i10 = C0156c.f10001a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f9983a == b.REMOVED) {
                    if (G.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9985c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f9984b + " to ADDING.");
                    }
                    this.f9983a = b.VISIBLE;
                    this.f9984b = a.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (G.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9985c + " mFinalState = " + this.f9983a + " -> REMOVED. mLifecycleImpact  = " + this.f9984b + " to REMOVING.");
                }
                this.f9983a = b.REMOVED;
                this.f9984b = a.REMOVING;
                return;
            }
            if (i10 == 3 && this.f9983a != b.REMOVED) {
                if (G.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9985c + " mFinalState = " + this.f9983a + " -> " + finalState + '.');
                }
                this.f9983a = finalState;
            }
        }

        public abstract void n();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f9983a + " lifecycleImpact = " + this.f9984b + " fragment = " + this.f9985c + '}';
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10002a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10002a = iArr;
        }
    }

    public X(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f9977a = container;
        this.f9978b = new ArrayList();
        this.f9979c = new ArrayList();
    }

    private final void c(c.b bVar, c.a aVar, M m10) {
        synchronized (this.f9978b) {
            K.e eVar = new K.e();
            ComponentCallbacksC1144o componentCallbacksC1144oK = m10.k();
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC1144oK, "fragmentStateManager.fragment");
            c cVarL = l(componentCallbacksC1144oK);
            if (cVarL != null) {
                cVarL.m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, m10, eVar);
            this.f9978b.add(bVar2);
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.V
                @Override // java.lang.Runnable
                public final void run() {
                    X.d(this.f9972a, bVar2);
                }
            });
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.W
                @Override // java.lang.Runnable
                public final void run() {
                    X.e(this.f9974a, bVar2);
                }
            });
            Unit unit = Unit.f45918a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(X this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.f9978b.contains(operation)) {
            c.b bVarG = operation.g();
            View view = operation.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            bVarG.d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(X this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.f9978b.remove(operation);
        this$0.f9979c.remove(operation);
    }

    private final c l(ComponentCallbacksC1144o componentCallbacksC1144o) {
        Object next;
        Iterator it = this.f9978b.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (Intrinsics.b(cVar.h(), componentCallbacksC1144o) && !cVar.j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    private final c m(ComponentCallbacksC1144o componentCallbacksC1144o) {
        Object next;
        Iterator it = this.f9979c.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (Intrinsics.b(cVar.h(), componentCallbacksC1144o) && !cVar.j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    public static final X r(ViewGroup viewGroup, G g10) {
        return f9976f.a(viewGroup, g10);
    }

    public static final X s(ViewGroup viewGroup, Z z9) {
        return f9976f.b(viewGroup, z9);
    }

    private final void u() {
        for (c cVar : this.f9978b) {
            if (cVar.i() == c.a.ADDING) {
                View viewRequireView = cVar.h().requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                cVar.m(c.b.f9994a.b(viewRequireView.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void f(c.b finalState, M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        c(finalState, c.a.ADDING, fragmentStateManager);
    }

    public final void g(M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.GONE, c.a.NONE, fragmentStateManager);
    }

    public final void h(M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, fragmentStateManager);
    }

    public final void i(M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.VISIBLE, c.a.NONE, fragmentStateManager);
    }

    public abstract void j(List list, boolean z9);

    public final void k() {
        if (this.f9981e) {
            return;
        }
        if (!AbstractC0845c0.Q(this.f9977a)) {
            n();
            this.f9980d = false;
            return;
        }
        synchronized (this.f9978b) {
            try {
                if (!this.f9978b.isEmpty()) {
                    List<c> listY0 = CollectionsKt.y0(this.f9979c);
                    this.f9979c.clear();
                    for (c cVar : listY0) {
                        if (G.I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                        }
                        cVar.d();
                        if (!cVar.k()) {
                            this.f9979c.add(cVar);
                        }
                    }
                    u();
                    List listY1 = CollectionsKt.y0(this.f9978b);
                    this.f9978b.clear();
                    this.f9979c.addAll(listY1);
                    if (G.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = listY1.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).n();
                    }
                    j(listY1, this.f9980d);
                    this.f9980d = false;
                    if (G.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (G.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zQ = AbstractC0845c0.Q(this.f9977a);
        synchronized (this.f9978b) {
            try {
                u();
                Iterator it = this.f9978b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).n();
                }
                for (c cVar : CollectionsKt.y0(this.f9979c)) {
                    if (G.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zQ ? "" : "Container " + this.f9977a + " is not attached to window. ") + "Cancelling running operation " + cVar);
                    }
                    cVar.d();
                }
                for (c cVar2 : CollectionsKt.y0(this.f9978b)) {
                    if (G.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zQ ? "" : "Container " + this.f9977a + " is not attached to window. ") + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.d();
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.f9981e) {
            if (G.I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f9981e = false;
            k();
        }
    }

    public final c.a p(M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        ComponentCallbacksC1144o componentCallbacksC1144oK = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(componentCallbacksC1144oK, "fragmentStateManager.fragment");
        c cVarL = l(componentCallbacksC1144oK);
        c.a aVarI = cVarL != null ? cVarL.i() : null;
        c cVarM = m(componentCallbacksC1144oK);
        c.a aVarI2 = cVarM != null ? cVarM.i() : null;
        int i10 = aVarI == null ? -1 : d.f10002a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    public final ViewGroup q() {
        return this.f9977a;
    }

    public final void t() {
        Object objPrevious;
        synchronized (this.f9978b) {
            try {
                u();
                List list = this.f9978b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    c cVar = (c) objPrevious;
                    c.b.a aVar = c.b.f9994a;
                    View view = cVar.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    c.b bVarA = aVar.a(view);
                    c.b bVarG = cVar.g();
                    c.b bVar = c.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                c cVar2 = (c) objPrevious;
                ComponentCallbacksC1144o componentCallbacksC1144oH = cVar2 != null ? cVar2.h() : null;
                this.f9981e = componentCallbacksC1144oH != null ? componentCallbacksC1144oH.isPostponed() : false;
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(boolean z9) {
        this.f9980d = z9;
    }
}
