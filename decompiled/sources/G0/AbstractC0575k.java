package G0;

import O.AbstractC0845c0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: G0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0575k implements Cloneable {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Animator[] f843Z = new Animator[0];

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int[] f844a0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final AbstractC0571g f845b0 = new a();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static ThreadLocal f846c0 = new ThreadLocal();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private ArrayList f851K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private ArrayList f852L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private f[] f853M;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private e f863W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private p190t.a f864X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f866a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f867b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f868c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f869d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f870e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f871f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f872g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f873h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f874i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f875j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f876k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList f877l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f878m = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f879v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ArrayList f880w = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private w f847G = new w();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private w f848H = new w();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    t f849I = null;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int[] f850J = f844a0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f854N = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    ArrayList f855O = new ArrayList();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Animator[] f856P = f843Z;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    int f857Q = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f858R = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    boolean f859S = false;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private AbstractC0575k f860T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private ArrayList f861U = null;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    ArrayList f862V = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private AbstractC0571g f865Y = f845b0;

    /* JADX INFO: renamed from: G0.k$a */
    class a extends AbstractC0571g {
        a() {
        }

        @Override // G0.AbstractC0571g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: renamed from: G0.k$b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p190t.a f881a;

        b(p190t.a aVar) {
            this.f881a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f881a.remove(animator);
            AbstractC0575k.this.f855O.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0575k.this.f855O.add(animator);
        }
    }

    /* JADX INFO: renamed from: G0.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0575k.this.q();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: G0.k$d */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v f886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        AbstractC0575k f888e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f889f;

        d(View view, String str, AbstractC0575k abstractC0575k, WindowId windowId, v vVar, Animator animator) {
            this.f884a = view;
            this.f885b = str;
            this.f886c = vVar;
            this.f887d = windowId;
            this.f888e = abstractC0575k;
            this.f889f = animator;
        }
    }

    /* JADX INFO: renamed from: G0.k$e */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: G0.k$f */
    public interface f {
        void a(AbstractC0575k abstractC0575k);

        void b(AbstractC0575k abstractC0575k);

        default void c(AbstractC0575k abstractC0575k, boolean z9) {
            d(abstractC0575k);
        }

        void d(AbstractC0575k abstractC0575k);

        void e(AbstractC0575k abstractC0575k);

        default void f(AbstractC0575k abstractC0575k, boolean z9) {
            e(abstractC0575k);
        }

        void g(AbstractC0575k abstractC0575k);
    }

    /* JADX INFO: renamed from: G0.k$g */
    interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f890a = new g() { // from class: G0.l
            @Override // G0.AbstractC0575k.g
            public final void c(AbstractC0575k.f fVar, AbstractC0575k abstractC0575k, boolean z9) {
                fVar.c(abstractC0575k, z9);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f891b = new g() { // from class: G0.m
            @Override // G0.AbstractC0575k.g
            public final void c(AbstractC0575k.f fVar, AbstractC0575k abstractC0575k, boolean z9) {
                fVar.f(abstractC0575k, z9);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f892c = new g() { // from class: G0.n
            @Override // G0.AbstractC0575k.g
            public final void c(AbstractC0575k.f fVar, AbstractC0575k abstractC0575k, boolean z9) {
                fVar.g(abstractC0575k);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g f893d = new g() { // from class: G0.o
            @Override // G0.AbstractC0575k.g
            public final void c(AbstractC0575k.f fVar, AbstractC0575k abstractC0575k, boolean z9) {
                fVar.b(abstractC0575k);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final g f894e = new g() { // from class: G0.p
            @Override // G0.AbstractC0575k.g
            public final void c(AbstractC0575k.f fVar, AbstractC0575k abstractC0575k, boolean z9) {
                fVar.a(abstractC0575k);
            }
        };

        void c(f fVar, AbstractC0575k abstractC0575k, boolean z9);
    }

    private static p190t.a A() {
        p190t.a aVar = (p190t.a) f846c0.get();
        if (aVar != null) {
            return aVar;
        }
        p190t.a aVar2 = new p190t.a();
        f846c0.set(aVar2);
        return aVar2;
    }

    private static boolean L(v vVar, v vVar2, String str) {
        Object obj = vVar.f911a.get(str);
        Object obj2 = vVar2.f911a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void M(p190t.a aVar, p190t.a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && K(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && K(view)) {
                v vVar = (v) aVar.get(view2);
                v vVar2 = (v) aVar2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f851K.add(vVar);
                    this.f852L.add(vVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void O(p190t.a aVar, p190t.a aVar2) {
        v vVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.g(size);
            if (view != null && K(view) && (vVar = (v) aVar2.remove(view)) != null && K(vVar.f912b)) {
                this.f851K.add((v) aVar.i(size));
                this.f852L.add(vVar);
            }
        }
    }

    private void P(p190t.a aVar, p190t.a aVar2, p190t.h hVar, p190t.h hVar2) {
        View view;
        int iK = hVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            View view2 = (View) hVar.l(i10);
            if (view2 != null && K(view2) && (view = (View) hVar2.d(hVar.f(i10))) != null && K(view)) {
                v vVar = (v) aVar.get(view2);
                v vVar2 = (v) aVar2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f851K.add(vVar);
                    this.f852L.add(vVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void R(p190t.a aVar, p190t.a aVar2, p190t.a aVar3, p190t.a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) aVar3.k(i10);
            if (view2 != null && K(view2) && (view = (View) aVar4.get(aVar3.g(i10))) != null && K(view)) {
                v vVar = (v) aVar.get(view2);
                v vVar2 = (v) aVar2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f851K.add(vVar);
                    this.f852L.add(vVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void U(w wVar, w wVar2) {
        p190t.a aVar = new p190t.a(wVar.f914a);
        p190t.a aVar2 = new p190t.a(wVar2.f914a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f850J;
            if (i10 >= iArr.length) {
                d(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                O(aVar, aVar2);
            } else if (i11 == 2) {
                R(aVar, aVar2, wVar.f917d, wVar2.f917d);
            } else if (i11 == 3) {
                M(aVar, aVar2, wVar.f915b, wVar2.f915b);
            } else if (i11 == 4) {
                P(aVar, aVar2, wVar.f916c, wVar2.f916c);
            }
            i10++;
        }
    }

    private void V(AbstractC0575k abstractC0575k, g gVar, boolean z9) {
        AbstractC0575k abstractC0575k2 = this.f860T;
        if (abstractC0575k2 != null) {
            abstractC0575k2.V(abstractC0575k, gVar, z9);
        }
        ArrayList arrayList = this.f861U;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f861U.size();
        f[] fVarArr = this.f853M;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.f853M = null;
        f[] fVarArr2 = (f[]) this.f861U.toArray(fVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            gVar.c(fVarArr2[i10], abstractC0575k, z9);
            fVarArr2[i10] = null;
        }
        this.f853M = fVarArr2;
    }

    private void c0(Animator animator, p190t.a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            f(animator);
        }
    }

    private void d(p190t.a aVar, p190t.a aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            v vVar = (v) aVar.k(i10);
            if (K(vVar.f912b)) {
                this.f851K.add(vVar);
                this.f852L.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            v vVar2 = (v) aVar2.k(i11);
            if (K(vVar2.f912b)) {
                this.f852L.add(vVar2);
                this.f851K.add(null);
            }
        }
    }

    private static void e(w wVar, View view, v vVar) {
        wVar.f914a.put(view, vVar);
        int id = view.getId();
        if (id >= 0) {
            if (wVar.f915b.indexOfKey(id) >= 0) {
                wVar.f915b.put(id, null);
            } else {
                wVar.f915b.put(id, view);
            }
        }
        String strI = AbstractC0845c0.I(view);
        if (strI != null) {
            if (wVar.f917d.containsKey(strI)) {
                wVar.f917d.put(strI, null);
            } else {
                wVar.f917d.put(strI, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (wVar.f916c.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    wVar.f916c.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) wVar.f916c.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    wVar.f916c.g(itemIdAtPosition, null);
                }
            }
        }
    }

    private void h(View view, boolean z9) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f874i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f875j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f876k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f876k.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    v vVar = new v(view);
                    if (z9) {
                        k(vVar);
                    } else {
                        g(vVar);
                    }
                    vVar.f913c.add(this);
                    i(vVar);
                    if (z9) {
                        e(this.f847G, view, vVar);
                    } else {
                        e(this.f848H, view, vVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f878m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f879v;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f880w;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f880w.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                h(viewGroup.getChildAt(i12), z9);
                            }
                        }
                    }
                }
            }
        }
    }

    public long B() {
        return this.f867b;
    }

    public List C() {
        return this.f870e;
    }

    public List D() {
        return this.f872g;
    }

    public List E() {
        return this.f873h;
    }

    public List F() {
        return this.f871f;
    }

    public String[] G() {
        return null;
    }

    public v H(View view, boolean z9) {
        t tVar = this.f849I;
        if (tVar != null) {
            return tVar.H(view, z9);
        }
        return (v) (z9 ? this.f847G : this.f848H).f914a.get(view);
    }

    public boolean I(v vVar, v vVar2) {
        if (vVar != null && vVar2 != null) {
            String[] strArrG = G();
            if (strArrG != null) {
                for (String str : strArrG) {
                    if (L(vVar, vVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = vVar.f911a.keySet().iterator();
                while (it.hasNext()) {
                    if (L(vVar, vVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean K(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f874i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f875j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f876k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f876k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f877l != null && AbstractC0845c0.I(view) != null && this.f877l.contains(AbstractC0845c0.I(view))) {
            return false;
        }
        if ((this.f870e.size() == 0 && this.f871f.size() == 0 && (((arrayList = this.f873h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f872g) == null || arrayList2.isEmpty()))) || this.f870e.contains(Integer.valueOf(id)) || this.f871f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f872g;
        if (arrayList6 != null && arrayList6.contains(AbstractC0845c0.I(view))) {
            return true;
        }
        if (this.f873h != null) {
            for (int i11 = 0; i11 < this.f873h.size(); i11++) {
                if (((Class) this.f873h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void W(g gVar, boolean z9) {
        V(this, gVar, z9);
    }

    public void X(View view) {
        if (this.f859S) {
            return;
        }
        int size = this.f855O.size();
        Animator[] animatorArr = (Animator[]) this.f855O.toArray(this.f856P);
        this.f856P = f843Z;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f856P = animatorArr;
        W(g.f893d, false);
        this.f858R = true;
    }

    void Y(ViewGroup viewGroup) {
        d dVar;
        this.f851K = new ArrayList();
        this.f852L = new ArrayList();
        U(this.f847G, this.f848H);
        p190t.a aVarA = A();
        int size = aVarA.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) aVarA.g(i10);
            if (animator != null && (dVar = (d) aVarA.get(animator)) != null && dVar.f884a != null && windowId.equals(dVar.f887d)) {
                v vVar = dVar.f886c;
                View view = dVar.f884a;
                v vVarH = H(view, true);
                v vVarU = u(view, true);
                if (vVarH == null && vVarU == null) {
                    vVarU = (v) this.f848H.f914a.get(view);
                }
                if ((vVarH != null || vVarU != null) && dVar.f888e.I(vVar, vVarU)) {
                    dVar.f888e.z().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        aVarA.remove(animator);
                    }
                }
            }
        }
        p(viewGroup, this.f847G, this.f848H, this.f851K, this.f852L);
        d0();
    }

    public AbstractC0575k Z(f fVar) {
        AbstractC0575k abstractC0575k;
        ArrayList arrayList = this.f861U;
        if (arrayList != null) {
            if (!arrayList.remove(fVar) && (abstractC0575k = this.f860T) != null) {
                abstractC0575k.Z(fVar);
            }
            if (this.f861U.size() == 0) {
                this.f861U = null;
            }
        }
        return this;
    }

    public AbstractC0575k a0(View view) {
        this.f871f.remove(view);
        return this;
    }

    public AbstractC0575k b(f fVar) {
        if (this.f861U == null) {
            this.f861U = new ArrayList();
        }
        this.f861U.add(fVar);
        return this;
    }

    public void b0(View view) {
        if (this.f858R) {
            if (!this.f859S) {
                int size = this.f855O.size();
                Animator[] animatorArr = (Animator[]) this.f855O.toArray(this.f856P);
                this.f856P = f843Z;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f856P = animatorArr;
                W(g.f894e, false);
            }
            this.f858R = false;
        }
    }

    public AbstractC0575k c(View view) {
        this.f871f.add(view);
        return this;
    }

    protected void cancel() {
        int size = this.f855O.size();
        Animator[] animatorArr = (Animator[]) this.f855O.toArray(this.f856P);
        this.f856P = f843Z;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f856P = animatorArr;
        W(g.f892c, false);
    }

    protected void d0() {
        k0();
        p190t.a aVarA = A();
        ArrayList arrayList = this.f862V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (aVarA.containsKey(animator)) {
                k0();
                c0(animator, aVarA);
            }
        }
        this.f862V.clear();
        q();
    }

    public AbstractC0575k e0(long j10) {
        this.f868c = j10;
        return this;
    }

    protected void f(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (r() >= 0) {
            animator.setDuration(r());
        }
        if (B() >= 0) {
            animator.setStartDelay(B() + animator.getStartDelay());
        }
        if (t() != null) {
            animator.setInterpolator(t());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void f0(e eVar) {
        this.f863W = eVar;
    }

    public abstract void g(v vVar);

    public AbstractC0575k g0(TimeInterpolator timeInterpolator) {
        this.f869d = timeInterpolator;
        return this;
    }

    public void h0(AbstractC0571g abstractC0571g) {
        if (abstractC0571g == null) {
            this.f865Y = f845b0;
        } else {
            this.f865Y = abstractC0571g;
        }
    }

    public AbstractC0575k j0(long j10) {
        this.f867b = j10;
        return this;
    }

    public abstract void k(v vVar);

    protected void k0() {
        if (this.f857Q == 0) {
            W(g.f890a, false);
            this.f859S = false;
        }
        this.f857Q++;
    }

    void l(ViewGroup viewGroup, boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        p190t.a aVar;
        m(z9);
        if ((this.f870e.size() > 0 || this.f871f.size() > 0) && (((arrayList = this.f872g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f873h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f870e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f870e.get(i10)).intValue());
                if (viewFindViewById != null) {
                    v vVar = new v(viewFindViewById);
                    if (z9) {
                        k(vVar);
                    } else {
                        g(vVar);
                    }
                    vVar.f913c.add(this);
                    i(vVar);
                    if (z9) {
                        e(this.f847G, viewFindViewById, vVar);
                    } else {
                        e(this.f848H, viewFindViewById, vVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f871f.size(); i11++) {
                View view = (View) this.f871f.get(i11);
                v vVar2 = new v(view);
                if (z9) {
                    k(vVar2);
                } else {
                    g(vVar2);
                }
                vVar2.f913c.add(this);
                i(vVar2);
                if (z9) {
                    e(this.f847G, view, vVar2);
                } else {
                    e(this.f848H, view, vVar2);
                }
            }
        } else {
            h(viewGroup, z9);
        }
        if (z9 || (aVar = this.f864X) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f847G.f917d.remove((String) this.f864X.g(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f847G.f917d.put((String) this.f864X.k(i13), view2);
            }
        }
    }

    String l0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f868c != -1) {
            sb.append("dur(");
            sb.append(this.f868c);
            sb.append(") ");
        }
        if (this.f867b != -1) {
            sb.append("dly(");
            sb.append(this.f867b);
            sb.append(") ");
        }
        if (this.f869d != null) {
            sb.append("interp(");
            sb.append(this.f869d);
            sb.append(") ");
        }
        if (this.f870e.size() > 0 || this.f871f.size() > 0) {
            sb.append("tgts(");
            if (this.f870e.size() > 0) {
                for (int i10 = 0; i10 < this.f870e.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f870e.get(i10));
                }
            }
            if (this.f871f.size() > 0) {
                for (int i11 = 0; i11 < this.f871f.size(); i11++) {
                    if (i11 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f871f.get(i11));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    void m(boolean z9) {
        if (z9) {
            this.f847G.f914a.clear();
            this.f847G.f915b.clear();
            this.f847G.f916c.b();
        } else {
            this.f848H.f914a.clear();
            this.f848H.f915b.clear();
            this.f848H.f916c.b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: n */
    public AbstractC0575k clone() {
        try {
            AbstractC0575k abstractC0575k = (AbstractC0575k) super.clone();
            abstractC0575k.f862V = new ArrayList();
            abstractC0575k.f847G = new w();
            abstractC0575k.f848H = new w();
            abstractC0575k.f851K = null;
            abstractC0575k.f852L = null;
            abstractC0575k.f860T = this;
            abstractC0575k.f861U = null;
            return abstractC0575k;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator o(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    void p(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        v vVar;
        View view2;
        Animator animator2;
        p190t.a aVarA = A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        z().getClass();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar2 = (v) arrayList.get(i10);
            v vVar3 = (v) arrayList2.get(i10);
            if (vVar2 != null && !vVar2.f913c.contains(this)) {
                vVar2 = null;
            }
            if (vVar3 != null && !vVar3.f913c.contains(this)) {
                vVar3 = null;
            }
            if ((vVar2 != null || vVar3 != null) && (vVar2 == null || vVar3 == null || I(vVar2, vVar3))) {
                Animator animatorO = o(viewGroup, vVar2, vVar3);
                if (animatorO != null) {
                    if (vVar3 != null) {
                        View view3 = vVar3.f912b;
                        String[] strArrG = G();
                        if (strArrG != null && strArrG.length > 0) {
                            vVar = new v(view3);
                            v vVar4 = (v) wVar2.f914a.get(view3);
                            if (vVar4 != null) {
                                int i11 = 0;
                                while (i11 < strArrG.length) {
                                    Map map = vVar.f911a;
                                    String[] strArr = strArrG;
                                    String str = strArr[i11];
                                    map.put(str, vVar4.f911a.get(str));
                                    i11++;
                                    strArrG = strArr;
                                }
                            }
                            int size2 = aVarA.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    view2 = view3;
                                    animator2 = animatorO;
                                    break;
                                }
                                d dVar = (d) aVarA.get((Animator) aVarA.g(i12));
                                if (dVar.f886c != null && dVar.f884a == view3) {
                                    view2 = view3;
                                    if (dVar.f885b.equals(w()) && dVar.f886c.equals(vVar)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i12++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = animatorO;
                            vVar = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = vVar2.f912b;
                        animator = animatorO;
                        vVar = null;
                    }
                    if (animator != null) {
                        aVarA.put(animator, new d(view, w(), this, viewGroup.getWindowId(), vVar, animator));
                        this.f862V.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                d dVar2 = (d) aVarA.get((Animator) this.f862V.get(sparseIntArray.keyAt(i13)));
                dVar2.f889f.setStartDelay((((long) sparseIntArray.valueAt(i13)) - Long.MAX_VALUE) + dVar2.f889f.getStartDelay());
            }
        }
    }

    protected void q() {
        int i10 = this.f857Q - 1;
        this.f857Q = i10;
        if (i10 == 0) {
            W(g.f891b, false);
            for (int i11 = 0; i11 < this.f847G.f916c.k(); i11++) {
                View view = (View) this.f847G.f916c.l(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f848H.f916c.k(); i12++) {
                View view2 = (View) this.f848H.f916c.l(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f859S = true;
        }
    }

    public long r() {
        return this.f868c;
    }

    public e s() {
        return this.f863W;
    }

    public TimeInterpolator t() {
        return this.f869d;
    }

    public String toString() {
        return l0("");
    }

    v u(View view, boolean z9) {
        t tVar = this.f849I;
        if (tVar != null) {
            return tVar.u(view, z9);
        }
        ArrayList arrayList = z9 ? this.f851K : this.f852L;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            v vVar = (v) arrayList.get(i10);
            if (vVar == null) {
                return null;
            }
            if (vVar.f912b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (v) (z9 ? this.f852L : this.f851K).get(i10);
        }
        return null;
    }

    public String w() {
        return this.f866a;
    }

    public AbstractC0571g x() {
        return this.f865Y;
    }

    public s y() {
        return null;
    }

    public final AbstractC0575k z() {
        t tVar = this.f849I;
        return tVar != null ? tVar.z() : this;
    }

    void i(v vVar) {
    }

    public void i0(s sVar) {
    }
}
