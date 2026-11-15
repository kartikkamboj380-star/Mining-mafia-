package androidx.appcompat.view.menu;

import O.AbstractC0875s;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.V;
import androidx.appcompat.widget.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final int f7587S = p060g.g.f43994e;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    View f7588G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f7590I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f7591J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f7592K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f7593L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f7595N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j.a f7596O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    ViewTreeObserver f7597P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private PopupWindow.OnDismissListener f7598Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    boolean f7599R;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f7605g;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f7613w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7606h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List f7607i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f7608j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f7609k = new ViewOnAttachStateChangeListenerC0135b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final V f7610l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7611m = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f7612v = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f7594M = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f7589H = F();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f7607i.size() <= 0 || ((d) b.this.f7607i.get(0)).f7621a.B()) {
                return;
            }
            View view = b.this.f7588G;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f7607i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f7621a.c();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0135b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0135b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f7597P;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f7597P = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f7597P.removeGlobalOnLayoutListener(bVar.f7608j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements V {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f7617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f7618b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f7619c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f7617a = dVar;
                this.f7618b = menuItem;
                this.f7619c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f7617a;
                if (dVar != null) {
                    b.this.f7599R = true;
                    dVar.f7622b.e(false);
                    b.this.f7599R = false;
                }
                if (this.f7618b.isEnabled() && this.f7618b.hasSubMenu()) {
                    this.f7619c.O(this.f7618b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.V
        public void d(e eVar, MenuItem menuItem) {
            b.this.f7605g.removeCallbacksAndMessages(null);
            int size = b.this.f7607i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.f7607i.get(i10)).f7622b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f7605g.postAtTime(new a(i11 < b.this.f7607i.size() ? (d) b.this.f7607i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.V
        public void n(e eVar, MenuItem menuItem) {
            b.this.f7605g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final W f7621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f7622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7623c;

        public d(W w10, e eVar, int i10) {
            this.f7621a = w10;
            this.f7622b = eVar;
            this.f7623c = i10;
        }

        public ListView a() {
            return this.f7621a.o();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z9) {
        this.f7600b = context;
        this.f7613w = view;
        this.f7602d = i10;
        this.f7603e = i11;
        this.f7604f = z9;
        Resources resources = context.getResources();
        this.f7601c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p060g.d.f43891b));
        this.f7605g = new Handler();
    }

    private W B() {
        W w10 = new W(this.f7600b, null, this.f7602d, this.f7603e);
        w10.U(this.f7610l);
        w10.L(this);
        w10.K(this);
        w10.D(this.f7613w);
        w10.G(this.f7612v);
        w10.J(true);
        w10.I(2);
        return w10;
    }

    private int C(e eVar) {
        int size = this.f7607i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f7607i.get(i10)).f7622b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem D(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View E(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemD = D(dVar.f7622b, eVar);
        if (menuItemD == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemD == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int F() {
        return this.f7613w.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int G(int i10) {
        List list = this.f7607i;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f7588G.getWindowVisibleDisplayFrame(rect);
        if (this.f7589H == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void H(e eVar) {
        d dVar;
        View viewE;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f7600b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f7604f, f7587S);
        if (!a() && this.f7594M) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.z(eVar));
        }
        int iQ = h.q(dVar2, null, this.f7600b, this.f7601c);
        W wB = B();
        wB.m(dVar2);
        wB.F(iQ);
        wB.G(this.f7612v);
        if (this.f7607i.size() > 0) {
            List list = this.f7607i;
            dVar = (d) list.get(list.size() - 1);
            viewE = E(dVar, eVar);
        } else {
            dVar = null;
            viewE = null;
        }
        if (viewE != null) {
            wB.V(false);
            wB.S(null);
            int iG = G(iQ);
            boolean z9 = iG == 1;
            this.f7589H = iG;
            if (Build.VERSION.SDK_INT >= 26) {
                wB.D(viewE);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f7613w.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewE.getLocationOnScreen(iArr2);
                if ((this.f7612v & 7) == 5) {
                    iArr[0] = iArr[0] + this.f7613w.getWidth();
                    iArr2[0] = iArr2[0] + viewE.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f7612v & 5) == 5) {
                if (z9) {
                    i12 = i10 + iQ;
                } else {
                    iQ = viewE.getWidth();
                    i12 = i10 - iQ;
                }
            } else if (z9) {
                iQ = viewE.getWidth();
                i12 = i10 + iQ;
            } else {
                i12 = i10 - iQ;
            }
            wB.e(i12);
            wB.N(true);
            wB.i(i11);
        } else {
            if (this.f7590I) {
                wB.e(this.f7592K);
            }
            if (this.f7591J) {
                wB.i(this.f7593L);
            }
            wB.H(p());
        }
        this.f7607i.add(new d(wB, eVar, this.f7589H));
        wB.c();
        ListView listViewO = wB.o();
        listViewO.setOnKeyListener(this);
        if (dVar == null && this.f7595N && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(p060g.g.f44001l, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewO.addHeaderView(frameLayout, null, false);
            wB.c();
        }
    }

    @Override // p130n.e
    public boolean a() {
        return this.f7607i.size() > 0 && ((d) this.f7607i.get(0)).f7621a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z9) {
        int iC = C(eVar);
        if (iC < 0) {
            return;
        }
        int i10 = iC + 1;
        if (i10 < this.f7607i.size()) {
            ((d) this.f7607i.get(i10)).f7622b.e(false);
        }
        d dVar = (d) this.f7607i.remove(iC);
        dVar.f7622b.R(this);
        if (this.f7599R) {
            dVar.f7621a.T(null);
            dVar.f7621a.E(0);
        }
        dVar.f7621a.dismiss();
        int size = this.f7607i.size();
        if (size > 0) {
            this.f7589H = ((d) this.f7607i.get(size - 1)).f7623c;
        } else {
            this.f7589H = F();
        }
        if (size != 0) {
            if (z9) {
                ((d) this.f7607i.get(0)).f7622b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f7596O;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f7597P;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f7597P.removeGlobalOnLayoutListener(this.f7608j);
            }
            this.f7597P = null;
        }
        this.f7588G.removeOnAttachStateChangeListener(this.f7609k);
        this.f7598Q.onDismiss();
    }

    @Override // p130n.e
    public void c() {
        if (a()) {
            return;
        }
        Iterator it = this.f7606h.iterator();
        while (it.hasNext()) {
            H((e) it.next());
        }
        this.f7606h.clear();
        View view = this.f7613w;
        this.f7588G = view;
        if (view != null) {
            boolean z9 = this.f7597P == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f7597P = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f7608j);
            }
            this.f7588G.addOnAttachStateChangeListener(this.f7609k);
        }
    }

    @Override // p130n.e
    public void dismiss() {
        int size = this.f7607i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f7607i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f7621a.a()) {
                    dVar.f7621a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f7596O = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        for (d dVar : this.f7607i) {
            if (mVar == dVar.f7622b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m(mVar);
        j.a aVar = this.f7596O;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z9) {
        Iterator it = this.f7607i.iterator();
        while (it.hasNext()) {
            h.A(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(e eVar) {
        eVar.c(this, this.f7600b);
        if (a()) {
            H(eVar);
        } else {
            this.f7606h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean n() {
        return false;
    }

    @Override // p130n.e
    public ListView o() {
        if (this.f7607i.isEmpty()) {
            return null;
        }
        List list = this.f7607i;
        return ((d) list.get(list.size() - 1)).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f7607i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f7607i.get(i10);
            if (!dVar.f7621a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f7622b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(View view) {
        if (this.f7613w != view) {
            this.f7613w = view;
            this.f7612v = AbstractC0875s.b(this.f7611m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(boolean z9) {
        this.f7594M = z9;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i10) {
        if (this.f7611m != i10) {
            this.f7611m = i10;
            this.f7612v = AbstractC0875s.b(i10, this.f7613w.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f7590I = true;
        this.f7592K = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f7598Q = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(boolean z9) {
        this.f7595N = z9;
    }

    @Override // androidx.appcompat.view.menu.h
    public void y(int i10) {
        this.f7591J = true;
        this.f7593L = i10;
    }
}
