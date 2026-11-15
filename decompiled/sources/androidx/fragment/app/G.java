package androidx.fragment.app;

import O.InterfaceC0883w;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1164j;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static boolean f9809S = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p040e.c f9813D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p040e.c f9814E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p040e.c f9815F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f9817H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f9818I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f9819J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f9820K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f9821L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ArrayList f9822M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ArrayList f9823N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayList f9824O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private J f9825P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p081i0.c.C0438c f9826Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9829b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f9831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f9832e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.activity.w f9834g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f9840m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AbstractC1153y f9849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AbstractC1150v f9850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ComponentCallbacksC1144o f9851x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ComponentCallbacksC1144o f9852y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f9828a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N f9830c = new N();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LayoutInflaterFactory2C1154z f9833f = new LayoutInflaterFactory2C1154z(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.activity.v f9835h = new b(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f9836i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f9837j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f9838k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f9839l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final A f9841n = new A(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f9842o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final N.a f9843p = new N.a() { // from class: androidx.fragment.app.B
        @Override // N.a
        public final void accept(Object obj) {
            G.e(this.f9799a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final N.a f9844q = new N.a() { // from class: androidx.fragment.app.C
        @Override // N.a
        public final void accept(Object obj) {
            G.a(this.f9800a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final N.a f9845r = new N.a() { // from class: androidx.fragment.app.D
        @Override // N.a
        public final void accept(Object obj) {
            G.d(this.f9801a, (androidx.core.app.k) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final N.a f9846s = new N.a() { // from class: androidx.fragment.app.E
        @Override // N.a
        public final void accept(Object obj) {
            G.c(this.f9802a, (androidx.core.app.w) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final O.C f9847t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f9848u = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AbstractC1152x f9853z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private AbstractC1152x f9810A = new d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Z f9811B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Z f9812C = new e();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    ArrayDeque f9816G = new ArrayDeque();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Runnable f9827R = new f();

    class a implements p040e.b {
        a() {
        }

        @Override // p040e.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l lVar = (l) G.this.f9816G.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVar.f9864a;
            int i11 = lVar.f9865b;
            ComponentCallbacksC1144o componentCallbacksC1144oI = G.this.f9830c.i(str);
            if (componentCallbacksC1144oI != null) {
                componentCallbacksC1144oI.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends androidx.activity.v {
        b(boolean z9) {
            super(z9);
        }

        @Override // androidx.activity.v
        public void d() {
            G.this.E0();
        }
    }

    class c implements O.C {
        c() {
        }

        @Override // O.C
        public void a(Menu menu) {
            G.this.J(menu);
        }

        @Override // O.C
        public void b(Menu menu) {
            G.this.N(menu);
        }

        @Override // O.C
        public boolean c(MenuItem menuItem) {
            return G.this.I(menuItem);
        }

        @Override // O.C
        public void d(Menu menu, MenuInflater menuInflater) {
            G.this.B(menu, menuInflater);
        }
    }

    class d extends AbstractC1152x {
        d() {
        }

        @Override // androidx.fragment.app.AbstractC1152x
        public ComponentCallbacksC1144o a(ClassLoader classLoader, String str) {
            return G.this.v0().b(G.this.v0().f(), str, null);
        }
    }

    class e implements Z {
        e() {
        }

        @Override // androidx.fragment.app.Z
        public X a(ViewGroup viewGroup) {
            return new C1140k(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.Z(true);
        }
    }

    class g implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1144o f9860a;

        g(ComponentCallbacksC1144o componentCallbacksC1144o) {
            this.f9860a = componentCallbacksC1144o;
        }

        @Override // androidx.fragment.app.K
        public void a(G g10, ComponentCallbacksC1144o componentCallbacksC1144o) {
            this.f9860a.onAttachFragment(componentCallbacksC1144o);
        }
    }

    class h implements p040e.b {
        h() {
        }

        @Override // p040e.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(p040e.a aVar) {
            l lVar = (l) G.this.f9816G.pollLast();
            if (lVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVar.f9864a;
            int i10 = lVar.f9865b;
            ComponentCallbacksC1144o componentCallbacksC1144oI = G.this.f9830c.i(str);
            if (componentCallbacksC1144oI != null) {
                componentCallbacksC1144oI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements p040e.b {
        i() {
        }

        @Override // p040e.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(p040e.a aVar) {
            l lVar = (l) G.this.f9816G.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVar.f9864a;
            int i10 = lVar.f9865b;
            ComponentCallbacksC1144o componentCallbacksC1144oI = G.this.f9830c.i(str);
            if (componentCallbacksC1144oI != null) {
                componentCallbacksC1144oI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends p050f.a {
        j() {
        }

        @Override // p050f.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, p040e.g gVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = gVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new e.g.a(gVar.d()).b(null).c(gVar.c(), gVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (G.I0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p050f.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public p040e.a c(int i10, Intent intent) {
            return new p040e.a(i10, intent);
        }
    }

    public static abstract class k {
        public void a(G g10, ComponentCallbacksC1144o componentCallbacksC1144o, Bundle bundle) {
        }

        public void b(G g10, ComponentCallbacksC1144o componentCallbacksC1144o, Context context) {
        }

        public void c(G g10, ComponentCallbacksC1144o componentCallbacksC1144o, Bundle bundle) {
        }

        public void d(G g10, ComponentCallbacksC1144o componentCallbacksC1144o) {
        }

        public void e(G g10, ComponentCallbacksC1144o componentCallbacksC1144o) {
        }

        public void f(G g10, ComponentCallbacksC1144o componentCallbacksC1144o) {
        }

        public void g(G g10, ComponentCallbacksC1144o componentCallbacksC1144o, Context context) {
        }

        public void h(G g10, ComponentCallbacksC1144o componentCallbacksC1144o, Bundle bundle) {
        }

        public void i(G g10, ComponentCallbacksC1144o componentCallbacksC1144o) {
        }

        public void j(G g10, ComponentCallbacksC1144o componentCallbacksC1144o, Bundle bundle) {
        }

        public void k(G g10, ComponentCallbacksC1144o componentCallbacksC1144o) {
        }

        public void l(G g10, ComponentCallbacksC1144o componentCallbacksC1144o) {
        }

        public void m(G g10, ComponentCallbacksC1144o componentCallbacksC1144o, View view, Bundle bundle) {
        }

        public void n(G g10, ComponentCallbacksC1144o componentCallbacksC1144o) {
        }
    }

    interface m {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class n implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f9866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f9867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f9868c;

        n(String str, int i10, int i11) {
            this.f9866a = str;
            this.f9867b = i10;
            this.f9868c = i11;
        }

        @Override // androidx.fragment.app.G.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            ComponentCallbacksC1144o componentCallbacksC1144o = G.this.f9852y;
            if (componentCallbacksC1144o == null || this.f9867b >= 0 || this.f9866a != null || !componentCallbacksC1144o.getChildFragmentManager().Y0()) {
                return G.this.b1(arrayList, arrayList2, this.f9866a, this.f9867b, this.f9868c);
            }
            return false;
        }
    }

    static ComponentCallbacksC1144o C0(View view) {
        Object tag = view.getTag(p071h0.b.f44739a);
        if (tag instanceof ComponentCallbacksC1144o) {
            return (ComponentCallbacksC1144o) tag;
        }
        return null;
    }

    public static boolean I0(int i10) {
        return f9809S || Log.isLoggable("FragmentManager", i10);
    }

    private boolean J0(ComponentCallbacksC1144o componentCallbacksC1144o) {
        return (componentCallbacksC1144o.mHasMenu && componentCallbacksC1144o.mMenuVisible) || componentCallbacksC1144o.mChildFragmentManager.o();
    }

    private void K(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (componentCallbacksC1144o == null || !componentCallbacksC1144o.equals(e0(componentCallbacksC1144o.mWho))) {
            return;
        }
        componentCallbacksC1144o.performPrimaryNavigationFragmentChanged();
    }

    private boolean K0() {
        ComponentCallbacksC1144o componentCallbacksC1144o = this.f9851x;
        if (componentCallbacksC1144o == null) {
            return true;
        }
        return componentCallbacksC1144o.isAdded() && this.f9851x.getParentFragmentManager().K0();
    }

    private void R(int i10) {
        try {
            this.f9829b = true;
            this.f9830c.d(i10);
            T0(i10, false);
            Iterator it = s().iterator();
            while (it.hasNext()) {
                ((X) it.next()).n();
            }
            this.f9829b = false;
            Z(true);
        } catch (Throwable th) {
            this.f9829b = false;
            throw th;
        }
    }

    private void U() {
        if (this.f9821L) {
            this.f9821L = false;
            r1();
        }
    }

    private void W() {
        Iterator it = s().iterator();
        while (it.hasNext()) {
            ((X) it.next()).n();
        }
    }

    private void Y(boolean z9) {
        if (this.f9829b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f9849v == null) {
            if (!this.f9820K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f9849v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z9) {
            p();
        }
        if (this.f9822M == null) {
            this.f9822M = new ArrayList();
            this.f9823N = new ArrayList();
        }
    }

    public static /* synthetic */ void a(G g10, Integer num) {
        if (g10.K0() && num.intValue() == 80) {
            g10.E(false);
        }
    }

    private boolean a1(String str, int i10, int i11) {
        Z(false);
        Y(true);
        ComponentCallbacksC1144o componentCallbacksC1144o = this.f9852y;
        if (componentCallbacksC1144o != null && i10 < 0 && str == null && componentCallbacksC1144o.getChildFragmentManager().Y0()) {
            return true;
        }
        boolean zB1 = b1(this.f9822M, this.f9823N, str, i10, i11);
        if (zB1) {
            this.f9829b = true;
            try {
                e1(this.f9822M, this.f9823N);
                q();
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        u1();
        U();
        this.f9830c.b();
        return zB1;
    }

    private static void b0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C1130a c1130a = (C1130a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c1130a.t(-1);
                c1130a.y();
            } else {
                c1130a.t(1);
                c1130a.x();
            }
            i10++;
        }
    }

    public static /* synthetic */ void c(G g10, androidx.core.app.w wVar) {
        if (g10.K0()) {
            g10.M(wVar.a(), false);
        }
    }

    private void c0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ArrayList arrayList3;
        boolean z9 = ((C1130a) arrayList.get(i10)).f9929r;
        ArrayList arrayList4 = this.f9824O;
        if (arrayList4 == null) {
            this.f9824O = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f9824O.addAll(this.f9830c.o());
        ComponentCallbacksC1144o componentCallbacksC1144oZ0 = z0();
        boolean z10 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C1130a c1130a = (C1130a) arrayList.get(i12);
            componentCallbacksC1144oZ0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? c1130a.z(this.f9824O, componentCallbacksC1144oZ0) : c1130a.C(this.f9824O, componentCallbacksC1144oZ0);
            z10 = z10 || c1130a.f9920i;
        }
        this.f9824O.clear();
        if (!z9 && this.f9848u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                ArrayList arrayList5 = ((C1130a) arrayList.get(i13)).f9914c;
                int size = arrayList5.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList5.get(i14);
                    i14++;
                    ComponentCallbacksC1144o componentCallbacksC1144o = ((O.a) obj).f9932b;
                    if (componentCallbacksC1144o != null && componentCallbacksC1144o.mFragmentManager != null) {
                        this.f9830c.r(u(componentCallbacksC1144o));
                    }
                }
            }
        }
        b0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z10 && (arrayList3 = this.f9840m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList.get(i15);
                i15++;
                linkedHashSet.addAll(n0((C1130a) obj2));
            }
            ArrayList arrayList6 = this.f9840m;
            int size3 = arrayList6.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList6.get(i16);
                i16++;
                p070h.w.a(obj3);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f9840m;
            int size4 = arrayList7.size();
            int i17 = 0;
            while (i17 < size4) {
                Object obj4 = arrayList7.get(i17);
                i17++;
                p070h.w.a(obj4);
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        for (int i18 = i10; i18 < i11; i18++) {
            C1130a c1130a2 = (C1130a) arrayList.get(i18);
            if (zBooleanValue) {
                for (int size5 = c1130a2.f9914c.size() - 1; size5 >= 0; size5--) {
                    ComponentCallbacksC1144o componentCallbacksC1144o2 = ((O.a) c1130a2.f9914c.get(size5)).f9932b;
                    if (componentCallbacksC1144o2 != null) {
                        u(componentCallbacksC1144o2).m();
                    }
                }
            } else {
                ArrayList arrayList8 = c1130a2.f9914c;
                int size6 = arrayList8.size();
                int i19 = 0;
                while (i19 < size6) {
                    Object obj5 = arrayList8.get(i19);
                    i19++;
                    ComponentCallbacksC1144o componentCallbacksC1144o3 = ((O.a) obj5).f9932b;
                    if (componentCallbacksC1144o3 != null) {
                        u(componentCallbacksC1144o3).m();
                    }
                }
            }
        }
        T0(this.f9848u, true);
        for (X x10 : t(arrayList, i10, i11)) {
            x10.v(zBooleanValue);
            x10.t();
            x10.k();
        }
        while (i10 < i11) {
            C1130a c1130a3 = (C1130a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && c1130a3.f10006v >= 0) {
                c1130a3.f10006v = -1;
            }
            c1130a3.B();
            i10++;
        }
        if (z10) {
            g1();
        }
    }

    public static /* synthetic */ void d(G g10, androidx.core.app.k kVar) {
        if (g10.K0()) {
            g10.F(kVar.a(), false);
        }
    }

    public static /* synthetic */ void e(G g10, Configuration configuration) {
        if (g10.K0()) {
            g10.y(configuration, false);
        }
    }

    private void e1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C1130a) arrayList.get(i10)).f9929r) {
                if (i11 != i10) {
                    c0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C1130a) arrayList.get(i11)).f9929r) {
                        i11++;
                    }
                }
                c0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            c0(arrayList, arrayList2, i11, size);
        }
    }

    private int f0(String str, int i10, boolean z9) {
        ArrayList arrayList = this.f9831d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z9) {
                return 0;
            }
            return this.f9831d.size() - 1;
        }
        int size = this.f9831d.size() - 1;
        while (size >= 0) {
            C1130a c1130a = (C1130a) this.f9831d.get(size);
            if ((str != null && str.equals(c1130a.A())) || (i10 >= 0 && i10 == c1130a.f10006v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z9) {
            if (size == this.f9831d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1130a c1130a2 = (C1130a) this.f9831d.get(size - 1);
            if ((str == null || !str.equals(c1130a2.A())) && (i10 < 0 || i10 != c1130a2.f10006v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public static ComponentCallbacksC1144o g0(View view) {
        ComponentCallbacksC1144o componentCallbacksC1144oL0 = l0(view);
        if (componentCallbacksC1144oL0 != null) {
            return componentCallbacksC1144oL0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private void g1() {
        ArrayList arrayList = this.f9840m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        p070h.w.a(this.f9840m.get(0));
        throw null;
    }

    static int i1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    static G k0(View view) {
        AbstractActivityC1148t abstractActivityC1148t;
        ComponentCallbacksC1144o componentCallbacksC1144oL0 = l0(view);
        if (componentCallbacksC1144oL0 != null) {
            if (componentCallbacksC1144oL0.isAdded()) {
                return componentCallbacksC1144oL0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + componentCallbacksC1144oL0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC1148t = null;
                break;
            }
            if (context instanceof AbstractActivityC1148t) {
                abstractActivityC1148t = (AbstractActivityC1148t) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC1148t != null) {
            return abstractActivityC1148t.C();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static ComponentCallbacksC1144o l0(View view) {
        while (view != null) {
            ComponentCallbacksC1144o componentCallbacksC1144oC0 = C0(view);
            if (componentCallbacksC1144oC0 != null) {
                return componentCallbacksC1144oC0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void m0() {
        Iterator it = s().iterator();
        while (it.hasNext()) {
            ((X) it.next()).o();
        }
    }

    private Set n0(C1130a c1130a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c1130a.f9914c.size(); i10++) {
            ComponentCallbacksC1144o componentCallbacksC1144o = ((O.a) c1130a.f9914c.get(i10)).f9932b;
            if (componentCallbacksC1144o != null && c1130a.f9920i) {
                hashSet.add(componentCallbacksC1144o);
            }
        }
        return hashSet;
    }

    private boolean o0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f9828a) {
            if (this.f9828a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f9828a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= ((m) this.f9828a.get(i10)).a(arrayList, arrayList2);
                }
                this.f9828a.clear();
                this.f9849v.g().removeCallbacks(this.f9827R);
                return zA;
            } catch (Throwable th) {
                this.f9828a.clear();
                this.f9849v.g().removeCallbacks(this.f9827R);
                throw th;
            }
        }
    }

    private void p() {
        if (P0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void p1(ComponentCallbacksC1144o componentCallbacksC1144o) {
        ViewGroup viewGroupS0 = s0(componentCallbacksC1144o);
        if (viewGroupS0 == null || componentCallbacksC1144o.getEnterAnim() + componentCallbacksC1144o.getExitAnim() + componentCallbacksC1144o.getPopEnterAnim() + componentCallbacksC1144o.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupS0.getTag(p071h0.b.f44741c) == null) {
            viewGroupS0.setTag(p071h0.b.f44741c, componentCallbacksC1144o);
        }
        ((ComponentCallbacksC1144o) viewGroupS0.getTag(p071h0.b.f44741c)).setPopDirection(componentCallbacksC1144o.getPopDirection());
    }

    private void q() {
        this.f9829b = false;
        this.f9823N.clear();
        this.f9822M.clear();
    }

    private J q0(ComponentCallbacksC1144o componentCallbacksC1144o) {
        return this.f9825P.j(componentCallbacksC1144o);
    }

    private void r() {
        boolean zN;
        AbstractC1153y abstractC1153y = this.f9849v;
        if (abstractC1153y instanceof androidx.lifecycle.W) {
            zN = this.f9830c.p().n();
        } else {
            zN = abstractC1153y.f() instanceof Activity ? !((Activity) this.f9849v.f()).isChangingConfigurations() : true;
        }
        if (zN) {
            Iterator it = this.f9837j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C1132c) it.next()).f10022a.iterator();
                while (it2.hasNext()) {
                    this.f9830c.p().g((String) it2.next());
                }
            }
        }
    }

    private void r1() {
        Iterator it = this.f9830c.k().iterator();
        while (it.hasNext()) {
            W0((M) it.next());
        }
    }

    private Set s() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f9830c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((M) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(X.s(viewGroup, A0()));
            }
        }
        return hashSet;
    }

    private ViewGroup s0(ComponentCallbacksC1144o componentCallbacksC1144o) {
        ViewGroup viewGroup = componentCallbacksC1144o.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC1144o.mContainerId > 0 && this.f9850w.d()) {
            View viewC = this.f9850w.c(componentCallbacksC1144o.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private void s1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new U("FragmentManager"));
        AbstractC1153y abstractC1153y = this.f9849v;
        if (abstractC1153y != null) {
            try {
                abstractC1153y.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            V("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    private Set t(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList arrayList2 = ((C1130a) arrayList.get(i10)).f9914c;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                ComponentCallbacksC1144o componentCallbacksC1144o = ((O.a) obj).f9932b;
                if (componentCallbacksC1144o != null && (viewGroup = componentCallbacksC1144o.mContainer) != null) {
                    hashSet.add(X.r(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void u1() {
        synchronized (this.f9828a) {
            try {
                if (this.f9828a.isEmpty()) {
                    this.f9835h.j(p0() > 0 && N0(this.f9851x));
                } else {
                    this.f9835h.j(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void A() {
        this.f9818I = false;
        this.f9819J = false;
        this.f9825P.p(false);
        R(1);
    }

    Z A0() {
        Z z9 = this.f9811B;
        if (z9 != null) {
            return z9;
        }
        ComponentCallbacksC1144o componentCallbacksC1144o = this.f9851x;
        return componentCallbacksC1144o != null ? componentCallbacksC1144o.mFragmentManager.A0() : this.f9812C;
    }

    boolean B(Menu menu, MenuInflater menuInflater) {
        if (this.f9848u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z9 = false;
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null && M0(componentCallbacksC1144o) && componentCallbacksC1144o.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC1144o);
                z9 = true;
            }
        }
        if (this.f9832e != null) {
            for (int i10 = 0; i10 < this.f9832e.size(); i10++) {
                ComponentCallbacksC1144o componentCallbacksC1144o2 = (ComponentCallbacksC1144o) this.f9832e.get(i10);
                if (arrayList == null || !arrayList.contains(componentCallbacksC1144o2)) {
                    componentCallbacksC1144o2.onDestroyOptionsMenu();
                }
            }
        }
        this.f9832e = arrayList;
        return z9;
    }

    public p081i0.c.C0438c B0() {
        return this.f9826Q;
    }

    void C() {
        this.f9820K = true;
        Z(true);
        W();
        r();
        R(-1);
        Object obj = this.f9849v;
        if (obj instanceof C.e) {
            ((C.e) obj).removeOnTrimMemoryListener(this.f9844q);
        }
        Object obj2 = this.f9849v;
        if (obj2 instanceof C.d) {
            ((C.d) obj2).removeOnConfigurationChangedListener(this.f9843p);
        }
        Object obj3 = this.f9849v;
        if (obj3 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj3).removeOnMultiWindowModeChangedListener(this.f9845r);
        }
        Object obj4 = this.f9849v;
        if (obj4 instanceof androidx.core.app.t) {
            ((androidx.core.app.t) obj4).removeOnPictureInPictureModeChangedListener(this.f9846s);
        }
        Object obj5 = this.f9849v;
        if ((obj5 instanceof InterfaceC0883w) && this.f9851x == null) {
            ((InterfaceC0883w) obj5).removeMenuProvider(this.f9847t);
        }
        this.f9849v = null;
        this.f9850w = null;
        this.f9851x = null;
        if (this.f9834g != null) {
            this.f9835h.h();
            this.f9834g = null;
        }
        p040e.c cVar = this.f9813D;
        if (cVar != null) {
            cVar.c();
            this.f9814E.c();
            this.f9815F.c();
        }
    }

    void D() {
        R(1);
    }

    androidx.lifecycle.V D0(ComponentCallbacksC1144o componentCallbacksC1144o) {
        return this.f9825P.m(componentCallbacksC1144o);
    }

    void E(boolean z9) {
        if (z9 && (this.f9849v instanceof C.e)) {
            s1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null) {
                componentCallbacksC1144o.performLowMemory();
                if (z9) {
                    componentCallbacksC1144o.mChildFragmentManager.E(true);
                }
            }
        }
    }

    void E0() {
        Z(true);
        if (this.f9835h.g()) {
            Y0();
        } else {
            this.f9834g.l();
        }
    }

    void F(boolean z9, boolean z10) {
        if (z10 && (this.f9849v instanceof androidx.core.app.s)) {
            s1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null) {
                componentCallbacksC1144o.performMultiWindowModeChanged(z9);
                if (z10) {
                    componentCallbacksC1144o.mChildFragmentManager.F(z9, true);
                }
            }
        }
    }

    void F0(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (I0(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC1144o);
        }
        if (componentCallbacksC1144o.mHidden) {
            return;
        }
        componentCallbacksC1144o.mHidden = true;
        componentCallbacksC1144o.mHiddenChanged = true ^ componentCallbacksC1144o.mHiddenChanged;
        p1(componentCallbacksC1144o);
    }

    void G(ComponentCallbacksC1144o componentCallbacksC1144o) {
        Iterator it = this.f9842o.iterator();
        while (it.hasNext()) {
            ((K) it.next()).a(this, componentCallbacksC1144o);
        }
    }

    void G0(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (componentCallbacksC1144o.mAdded && J0(componentCallbacksC1144o)) {
            this.f9817H = true;
        }
    }

    void H() {
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.l()) {
            if (componentCallbacksC1144o != null) {
                componentCallbacksC1144o.onHiddenChanged(componentCallbacksC1144o.isHidden());
                componentCallbacksC1144o.mChildFragmentManager.H();
            }
        }
    }

    public boolean H0() {
        return this.f9820K;
    }

    boolean I(MenuItem menuItem) {
        if (this.f9848u < 1) {
            return false;
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null && componentCallbacksC1144o.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void J(Menu menu) {
        if (this.f9848u < 1) {
            return;
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null) {
                componentCallbacksC1144o.performOptionsMenuClosed(menu);
            }
        }
    }

    void L() {
        R(5);
    }

    boolean L0(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (componentCallbacksC1144o == null) {
            return false;
        }
        return componentCallbacksC1144o.isHidden();
    }

    void M(boolean z9, boolean z10) {
        if (z10 && (this.f9849v instanceof androidx.core.app.t)) {
            s1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null) {
                componentCallbacksC1144o.performPictureInPictureModeChanged(z9);
                if (z10) {
                    componentCallbacksC1144o.mChildFragmentManager.M(z9, true);
                }
            }
        }
    }

    boolean M0(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (componentCallbacksC1144o == null) {
            return true;
        }
        return componentCallbacksC1144o.isMenuVisible();
    }

    boolean N(Menu menu) {
        boolean z9 = false;
        if (this.f9848u < 1) {
            return false;
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null && M0(componentCallbacksC1144o) && componentCallbacksC1144o.performPrepareOptionsMenu(menu)) {
                z9 = true;
            }
        }
        return z9;
    }

    boolean N0(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (componentCallbacksC1144o == null) {
            return true;
        }
        G g10 = componentCallbacksC1144o.mFragmentManager;
        return componentCallbacksC1144o.equals(g10.z0()) && N0(g10.f9851x);
    }

    void O() {
        u1();
        K(this.f9852y);
    }

    boolean O0(int i10) {
        return this.f9848u >= i10;
    }

    void P() {
        this.f9818I = false;
        this.f9819J = false;
        this.f9825P.p(false);
        R(7);
    }

    public boolean P0() {
        return this.f9818I || this.f9819J;
    }

    void Q() {
        this.f9818I = false;
        this.f9819J = false;
        this.f9825P.p(false);
        R(5);
    }

    void Q0(ComponentCallbacksC1144o componentCallbacksC1144o, String[] strArr, int i10) {
        if (this.f9815F == null) {
            this.f9849v.k(componentCallbacksC1144o, strArr, i10);
            return;
        }
        this.f9816G.addLast(new l(componentCallbacksC1144o.mWho, i10));
        this.f9815F.a(strArr);
    }

    void R0(ComponentCallbacksC1144o componentCallbacksC1144o, Intent intent, int i10, Bundle bundle) {
        if (this.f9813D == null) {
            this.f9849v.m(componentCallbacksC1144o, intent, i10, bundle);
            return;
        }
        this.f9816G.addLast(new l(componentCallbacksC1144o.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f9813D.a(intent);
    }

    void S() {
        this.f9819J = true;
        this.f9825P.p(true);
        R(4);
    }

    void S0(ComponentCallbacksC1144o componentCallbacksC1144o, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.f9814E == null) {
            this.f9849v.n(componentCallbacksC1144o, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (I0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + componentCallbacksC1144o);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        p040e.g gVarA = new e.g.a(intentSender).b(intent).c(i12, i11).a();
        this.f9816G.addLast(new l(componentCallbacksC1144o.mWho, i10));
        if (I0(2)) {
            Log.v("FragmentManager", "Fragment " + componentCallbacksC1144o + "is launching an IntentSender for result ");
        }
        this.f9814E.a(gVarA);
    }

    void T() {
        R(2);
    }

    void T0(int i10, boolean z9) {
        AbstractC1153y abstractC1153y;
        if (this.f9849v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z9 || i10 != this.f9848u) {
            this.f9848u = i10;
            this.f9830c.t();
            r1();
            if (this.f9817H && (abstractC1153y = this.f9849v) != null && this.f9848u == 7) {
                abstractC1153y.o();
                this.f9817H = false;
            }
        }
    }

    void U0() {
        if (this.f9849v == null) {
            return;
        }
        this.f9818I = false;
        this.f9819J = false;
        this.f9825P.p(false);
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null) {
                componentCallbacksC1144o.noteStateNotSaved();
            }
        }
    }

    public void V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f9830c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f9832e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                ComponentCallbacksC1144o componentCallbacksC1144o = (ComponentCallbacksC1144o) this.f9832e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC1144o.toString());
            }
        }
        ArrayList arrayList2 = this.f9831d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C1130a c1130a = (C1130a) this.f9831d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c1130a.toString());
                c1130a.v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f9836i.get());
        synchronized (this.f9828a) {
            try {
                int size3 = this.f9828a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        m mVar = (m) this.f9828a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f9849v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f9850w);
        if (this.f9851x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f9851x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f9848u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f9818I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9819J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f9820K);
        if (this.f9817H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f9817H);
        }
    }

    void V0(FragmentContainerView fragmentContainerView) {
        View view;
        for (M m10 : this.f9830c.k()) {
            ComponentCallbacksC1144o componentCallbacksC1144oK = m10.k();
            if (componentCallbacksC1144oK.mContainerId == fragmentContainerView.getId() && (view = componentCallbacksC1144oK.mView) != null && view.getParent() == null) {
                componentCallbacksC1144oK.mContainer = fragmentContainerView;
                m10.b();
            }
        }
    }

    void W0(M m10) {
        ComponentCallbacksC1144o componentCallbacksC1144oK = m10.k();
        if (componentCallbacksC1144oK.mDeferStart) {
            if (this.f9829b) {
                this.f9821L = true;
            } else {
                componentCallbacksC1144oK.mDeferStart = false;
                m10.m();
            }
        }
    }

    void X(m mVar, boolean z9) {
        if (!z9) {
            if (this.f9849v == null) {
                if (!this.f9820K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.f9828a) {
            try {
                if (this.f9849v == null) {
                    if (!z9) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f9828a.add(mVar);
                    k1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void X0(int i10, int i11, boolean z9) {
        if (i10 >= 0) {
            X(new n(null, i10, i11), z9);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean Y0() {
        return a1(null, -1, 0);
    }

    boolean Z(boolean z9) {
        Y(z9);
        boolean z10 = false;
        while (o0(this.f9822M, this.f9823N)) {
            z10 = true;
            this.f9829b = true;
            try {
                e1(this.f9822M, this.f9823N);
                q();
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        u1();
        U();
        this.f9830c.b();
        return z10;
    }

    public boolean Z0(int i10, int i11) {
        if (i10 >= 0) {
            return a1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    void a0(m mVar, boolean z9) {
        if (z9 && (this.f9849v == null || this.f9820K)) {
            return;
        }
        Y(z9);
        if (mVar.a(this.f9822M, this.f9823N)) {
            this.f9829b = true;
            try {
                e1(this.f9822M, this.f9823N);
                q();
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        u1();
        U();
        this.f9830c.b();
    }

    boolean b1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iF0 = f0(str, i10, (i11 & 1) != 0);
        if (iF0 < 0) {
            return false;
        }
        for (int size = this.f9831d.size() - 1; size >= iF0; size--) {
            arrayList.add((C1130a) this.f9831d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void c1(k kVar, boolean z9) {
        this.f9841n.o(kVar, z9);
    }

    public boolean d0() {
        boolean Z9 = Z(true);
        m0();
        return Z9;
    }

    void d1(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (I0(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC1144o + " nesting=" + componentCallbacksC1144o.mBackStackNesting);
        }
        boolean zIsInBackStack = componentCallbacksC1144o.isInBackStack();
        if (componentCallbacksC1144o.mDetached && zIsInBackStack) {
            return;
        }
        this.f9830c.u(componentCallbacksC1144o);
        if (J0(componentCallbacksC1144o)) {
            this.f9817H = true;
        }
        componentCallbacksC1144o.mRemoving = true;
        p1(componentCallbacksC1144o);
    }

    ComponentCallbacksC1144o e0(String str) {
        return this.f9830c.f(str);
    }

    void f1(ComponentCallbacksC1144o componentCallbacksC1144o) {
        this.f9825P.o(componentCallbacksC1144o);
    }

    void g(C1130a c1130a) {
        if (this.f9831d == null) {
            this.f9831d = new ArrayList();
        }
        this.f9831d.add(c1130a);
    }

    M h(ComponentCallbacksC1144o componentCallbacksC1144o) {
        String str = componentCallbacksC1144o.mPreviousWho;
        if (str != null) {
            p081i0.c.f(componentCallbacksC1144o, str);
        }
        if (I0(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC1144o);
        }
        M mU = u(componentCallbacksC1144o);
        componentCallbacksC1144o.mFragmentManager = this;
        this.f9830c.r(mU);
        if (!componentCallbacksC1144o.mDetached) {
            this.f9830c.a(componentCallbacksC1144o);
            componentCallbacksC1144o.mRemoving = false;
            if (componentCallbacksC1144o.mView == null) {
                componentCallbacksC1144o.mHiddenChanged = false;
            }
            if (J0(componentCallbacksC1144o)) {
                this.f9817H = true;
            }
        }
        return mU;
    }

    public ComponentCallbacksC1144o h0(int i10) {
        return this.f9830c.g(i10);
    }

    void h1(Parcelable parcelable) {
        M m10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f9849v.f().getClassLoader());
                this.f9838k.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f9849v.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f9830c.x(map);
        I i10 = (I) bundle3.getParcelable("state");
        if (i10 == null) {
            return;
        }
        this.f9830c.v();
        ArrayList arrayList = i10.f9870a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Bundle bundleB = this.f9830c.B((String) obj, null);
            if (bundleB != null) {
                ComponentCallbacksC1144o componentCallbacksC1144oI = this.f9825P.i(((L) bundleB.getParcelable("state")).f9887b);
                if (componentCallbacksC1144oI != null) {
                    if (I0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC1144oI);
                    }
                    m10 = new M(this.f9841n, this.f9830c, componentCallbacksC1144oI, bundleB);
                } else {
                    m10 = new M(this.f9841n, this.f9830c, this.f9849v.f().getClassLoader(), t0(), bundleB);
                }
                ComponentCallbacksC1144o componentCallbacksC1144oK = m10.k();
                componentCallbacksC1144oK.mSavedFragmentState = bundleB;
                componentCallbacksC1144oK.mFragmentManager = this;
                if (I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC1144oK.mWho + "): " + componentCallbacksC1144oK);
                }
                m10.o(this.f9849v.f().getClassLoader());
                this.f9830c.r(m10);
                m10.s(this.f9848u);
            }
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9825P.l()) {
            if (!this.f9830c.c(componentCallbacksC1144o.mWho)) {
                if (I0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC1144o + " that was not found in the set of active Fragments " + i10.f9870a);
                }
                this.f9825P.o(componentCallbacksC1144o);
                componentCallbacksC1144o.mFragmentManager = this;
                M m11 = new M(this.f9841n, this.f9830c, componentCallbacksC1144o);
                m11.s(1);
                m11.m();
                componentCallbacksC1144o.mRemoving = true;
                m11.m();
            }
        }
        this.f9830c.w(i10.f9871b);
        if (i10.f9872c != null) {
            this.f9831d = new ArrayList(i10.f9872c.length);
            int i12 = 0;
            while (true) {
                C1131b[] c1131bArr = i10.f9872c;
                if (i12 >= c1131bArr.length) {
                    break;
                }
                C1130a c1130aB = c1131bArr[i12].b(this);
                if (I0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i12 + " (index " + c1130aB.f10006v + "): " + c1130aB);
                    PrintWriter printWriter = new PrintWriter(new U("FragmentManager"));
                    c1130aB.w("  ", printWriter, false);
                    printWriter.close();
                }
                this.f9831d.add(c1130aB);
                i12++;
            }
        } else {
            this.f9831d = null;
        }
        this.f9836i.set(i10.f9873d);
        String str3 = i10.f9874e;
        if (str3 != null) {
            ComponentCallbacksC1144o componentCallbacksC1144oE0 = e0(str3);
            this.f9852y = componentCallbacksC1144oE0;
            K(componentCallbacksC1144oE0);
        }
        ArrayList arrayList2 = i10.f9875f;
        if (arrayList2 != null) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                this.f9837j.put((String) arrayList2.get(i13), (C1132c) i10.f9876g.get(i13));
            }
        }
        this.f9816G = new ArrayDeque(i10.f9877h);
    }

    public void i(K k10) {
        this.f9842o.add(k10);
    }

    public ComponentCallbacksC1144o i0(String str) {
        return this.f9830c.h(str);
    }

    void j(ComponentCallbacksC1144o componentCallbacksC1144o) {
        this.f9825P.e(componentCallbacksC1144o);
    }

    ComponentCallbacksC1144o j0(String str) {
        return this.f9830c.i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle j1() {
        C1131b[] c1131bArr;
        int size;
        Bundle bundle = new Bundle();
        m0();
        W();
        Z(true);
        this.f9818I = true;
        this.f9825P.p(true);
        ArrayList arrayListY = this.f9830c.y();
        HashMap mapM = this.f9830c.m();
        if (!mapM.isEmpty()) {
            ArrayList arrayListZ = this.f9830c.z();
            ArrayList arrayList = this.f9831d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c1131bArr = null;
            } else {
                c1131bArr = new C1131b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c1131bArr[i10] = new C1131b((C1130a) this.f9831d.get(i10));
                    if (I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f9831d.get(i10));
                    }
                }
            }
            I i11 = new I();
            i11.f9870a = arrayListY;
            i11.f9871b = arrayListZ;
            i11.f9872c = c1131bArr;
            i11.f9873d = this.f9836i.get();
            ComponentCallbacksC1144o componentCallbacksC1144o = this.f9852y;
            if (componentCallbacksC1144o != null) {
                i11.f9874e = componentCallbacksC1144o.mWho;
            }
            i11.f9875f.addAll(this.f9837j.keySet());
            i11.f9876g.addAll(this.f9837j.values());
            i11.f9877h = new ArrayList(this.f9816G);
            bundle.putParcelable("state", i11);
            for (String str : this.f9838k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f9838k.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapM.get(str2));
            }
        } else if (I0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    int k() {
        return this.f9836i.getAndIncrement();
    }

    void k1() {
        synchronized (this.f9828a) {
            try {
                if (this.f9828a.size() == 1) {
                    this.f9849v.g().removeCallbacks(this.f9827R);
                    this.f9849v.g().post(this.f9827R);
                    u1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void l(AbstractC1153y abstractC1153y, AbstractC1150v abstractC1150v, ComponentCallbacksC1144o componentCallbacksC1144o) {
        String str;
        androidx.lifecycle.r rVar;
        if (this.f9849v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f9849v = abstractC1153y;
        this.f9850w = abstractC1150v;
        this.f9851x = componentCallbacksC1144o;
        if (componentCallbacksC1144o != null) {
            i(new g(componentCallbacksC1144o));
        } else if (abstractC1153y instanceof K) {
            i((K) abstractC1153y);
        }
        if (this.f9851x != null) {
            u1();
        }
        if (abstractC1153y instanceof androidx.activity.z) {
            androidx.activity.z zVar = (androidx.activity.z) abstractC1153y;
            androidx.activity.w onBackPressedDispatcher = zVar.getOnBackPressedDispatcher();
            this.f9834g = onBackPressedDispatcher;
            if (componentCallbacksC1144o != null) {
                rVar = zVar;
                rVar = componentCallbacksC1144o;
            }
            rVar = zVar;
            onBackPressedDispatcher.i(rVar, this.f9835h);
        }
        if (componentCallbacksC1144o != null) {
            this.f9825P = componentCallbacksC1144o.mFragmentManager.q0(componentCallbacksC1144o);
        } else if (abstractC1153y instanceof androidx.lifecycle.W) {
            this.f9825P = J.k(((androidx.lifecycle.W) abstractC1153y).getViewModelStore());
        } else {
            this.f9825P = new J(false);
        }
        this.f9825P.p(P0());
        this.f9830c.A(this.f9825P);
        Object obj = this.f9849v;
        if ((obj instanceof p251z0.f) && componentCallbacksC1144o == null) {
            p251z0.d savedStateRegistry = ((p251z0.f) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new z0.d.c() { // from class: androidx.fragment.app.F
                @Override // z0.d.c
                public final Bundle a() {
                    return this.f9803a.j1();
                }
            });
            Bundle bundleB = savedStateRegistry.b("android:support:fragments");
            if (bundleB != null) {
                h1(bundleB);
            }
        }
        Object obj2 = this.f9849v;
        if (obj2 instanceof p040e.f) {
            p040e.e activityResultRegistry = ((p040e.f) obj2).getActivityResultRegistry();
            if (componentCallbacksC1144o != null) {
                str = componentCallbacksC1144o.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f9813D = activityResultRegistry.m(str2 + "StartActivityForResult", new p050f.c(), new h());
            this.f9814E = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f9815F = activityResultRegistry.m(str2 + "RequestPermissions", new p050f.b(), new a());
        }
        Object obj3 = this.f9849v;
        if (obj3 instanceof C.d) {
            ((C.d) obj3).addOnConfigurationChangedListener(this.f9843p);
        }
        Object obj4 = this.f9849v;
        if (obj4 instanceof C.e) {
            ((C.e) obj4).addOnTrimMemoryListener(this.f9844q);
        }
        Object obj5 = this.f9849v;
        if (obj5 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj5).addOnMultiWindowModeChangedListener(this.f9845r);
        }
        Object obj6 = this.f9849v;
        if (obj6 instanceof androidx.core.app.t) {
            ((androidx.core.app.t) obj6).addOnPictureInPictureModeChangedListener(this.f9846s);
        }
        Object obj7 = this.f9849v;
        if ((obj7 instanceof InterfaceC0883w) && componentCallbacksC1144o == null) {
            ((InterfaceC0883w) obj7).addMenuProvider(this.f9847t);
        }
    }

    void l1(ComponentCallbacksC1144o componentCallbacksC1144o, boolean z9) {
        ViewGroup viewGroupS0 = s0(componentCallbacksC1144o);
        if (viewGroupS0 == null || !(viewGroupS0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupS0).setDrawDisappearingViewsLast(!z9);
    }

    void m(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (I0(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC1144o);
        }
        if (componentCallbacksC1144o.mDetached) {
            componentCallbacksC1144o.mDetached = false;
            if (componentCallbacksC1144o.mAdded) {
                return;
            }
            this.f9830c.a(componentCallbacksC1144o);
            if (I0(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC1144o);
            }
            if (J0(componentCallbacksC1144o)) {
                this.f9817H = true;
            }
        }
    }

    public void m1(AbstractC1152x abstractC1152x) {
        this.f9853z = abstractC1152x;
    }

    public O n() {
        return new C1130a(this);
    }

    void n1(ComponentCallbacksC1144o componentCallbacksC1144o, AbstractC1164j.b bVar) {
        if (componentCallbacksC1144o.equals(e0(componentCallbacksC1144o.mWho)) && (componentCallbacksC1144o.mHost == null || componentCallbacksC1144o.mFragmentManager == this)) {
            componentCallbacksC1144o.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC1144o + " is not an active fragment of FragmentManager " + this);
    }

    boolean o() {
        boolean zJ0 = false;
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.l()) {
            if (componentCallbacksC1144o != null) {
                zJ0 = J0(componentCallbacksC1144o);
            }
            if (zJ0) {
                return true;
            }
        }
        return false;
    }

    void o1(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (componentCallbacksC1144o == null || (componentCallbacksC1144o.equals(e0(componentCallbacksC1144o.mWho)) && (componentCallbacksC1144o.mHost == null || componentCallbacksC1144o.mFragmentManager == this))) {
            ComponentCallbacksC1144o componentCallbacksC1144o2 = this.f9852y;
            this.f9852y = componentCallbacksC1144o;
            K(componentCallbacksC1144o2);
            K(this.f9852y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC1144o + " is not an active fragment of FragmentManager " + this);
    }

    public int p0() {
        ArrayList arrayList = this.f9831d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void q1(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (I0(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC1144o);
        }
        if (componentCallbacksC1144o.mHidden) {
            componentCallbacksC1144o.mHidden = false;
            componentCallbacksC1144o.mHiddenChanged = !componentCallbacksC1144o.mHiddenChanged;
        }
    }

    AbstractC1150v r0() {
        return this.f9850w;
    }

    public AbstractC1152x t0() {
        AbstractC1152x abstractC1152x = this.f9853z;
        if (abstractC1152x != null) {
            return abstractC1152x;
        }
        ComponentCallbacksC1144o componentCallbacksC1144o = this.f9851x;
        return componentCallbacksC1144o != null ? componentCallbacksC1144o.mFragmentManager.t0() : this.f9810A;
    }

    public void t1(k kVar) {
        this.f9841n.p(kVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC1144o componentCallbacksC1144o = this.f9851x;
        if (componentCallbacksC1144o != null) {
            sb.append(componentCallbacksC1144o.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f9851x)));
            sb.append("}");
        } else {
            AbstractC1153y abstractC1153y = this.f9849v;
            if (abstractC1153y != null) {
                sb.append(abstractC1153y.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f9849v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    M u(ComponentCallbacksC1144o componentCallbacksC1144o) {
        M mN = this.f9830c.n(componentCallbacksC1144o.mWho);
        if (mN != null) {
            return mN;
        }
        M m10 = new M(this.f9841n, this.f9830c, componentCallbacksC1144o);
        m10.o(this.f9849v.f().getClassLoader());
        m10.s(this.f9848u);
        return m10;
    }

    public List u0() {
        return this.f9830c.o();
    }

    void v(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (I0(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC1144o);
        }
        if (componentCallbacksC1144o.mDetached) {
            return;
        }
        componentCallbacksC1144o.mDetached = true;
        if (componentCallbacksC1144o.mAdded) {
            if (I0(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC1144o);
            }
            this.f9830c.u(componentCallbacksC1144o);
            if (J0(componentCallbacksC1144o)) {
                this.f9817H = true;
            }
            p1(componentCallbacksC1144o);
        }
    }

    public AbstractC1153y v0() {
        return this.f9849v;
    }

    void w() {
        this.f9818I = false;
        this.f9819J = false;
        this.f9825P.p(false);
        R(4);
    }

    LayoutInflater.Factory2 w0() {
        return this.f9833f;
    }

    void x() {
        this.f9818I = false;
        this.f9819J = false;
        this.f9825P.p(false);
        R(0);
    }

    A x0() {
        return this.f9841n;
    }

    void y(Configuration configuration, boolean z9) {
        if (z9 && (this.f9849v instanceof C.d)) {
            s1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null) {
                componentCallbacksC1144o.performConfigurationChanged(configuration);
                if (z9) {
                    componentCallbacksC1144o.mChildFragmentManager.y(configuration, true);
                }
            }
        }
    }

    ComponentCallbacksC1144o y0() {
        return this.f9851x;
    }

    boolean z(MenuItem menuItem) {
        if (this.f9848u < 1) {
            return false;
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144o : this.f9830c.o()) {
            if (componentCallbacksC1144o != null && componentCallbacksC1144o.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public ComponentCallbacksC1144o z0() {
        return this.f9852y;
    }

    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f9864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f9865b;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        l(String str, int i10) {
            this.f9864a = str;
            this.f9865b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f9864a);
            parcel.writeInt(this.f9865b);
        }

        l(Parcel parcel) {
            this.f9864a = parcel.readString();
            this.f9865b = parcel.readInt();
        }
    }
}
