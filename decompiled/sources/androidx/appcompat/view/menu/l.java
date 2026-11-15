package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.W;

/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int f7719M = p060g.g.f44002m;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    ViewTreeObserver f7720G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f7721H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f7722I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f7723J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f7725L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f7727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f7728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final W f7733i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f7736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f7737m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    View f7738v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private j.a f7739w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f7734j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f7735k = new b();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f7724K = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f7733i.B()) {
                return;
            }
            View view = l.this.f7738v;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f7733i.c();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f7720G;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f7720G = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f7720G.removeGlobalOnLayoutListener(lVar.f7734j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z9) {
        this.f7726b = context;
        this.f7727c = eVar;
        this.f7729e = z9;
        this.f7728d = new d(eVar, LayoutInflater.from(context), z9, f7719M);
        this.f7731g = i10;
        this.f7732h = i11;
        Resources resources = context.getResources();
        this.f7730f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p060g.d.f43891b));
        this.f7737m = view;
        this.f7733i = new W(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean B() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f7721H || (view = this.f7737m) == null) {
            return false;
        }
        this.f7738v = view;
        this.f7733i.K(this);
        this.f7733i.L(this);
        this.f7733i.J(true);
        View view2 = this.f7738v;
        boolean z9 = this.f7720G == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f7720G = viewTreeObserver;
        if (z9) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f7734j);
        }
        view2.addOnAttachStateChangeListener(this.f7735k);
        this.f7733i.D(view2);
        this.f7733i.G(this.f7724K);
        if (!this.f7722I) {
            this.f7723J = h.q(this.f7728d, null, this.f7726b, this.f7730f);
            this.f7722I = true;
        }
        this.f7733i.F(this.f7723J);
        this.f7733i.I(2);
        this.f7733i.H(p());
        this.f7733i.c();
        ListView listViewO = this.f7733i.o();
        listViewO.setOnKeyListener(this);
        if (this.f7725L && this.f7727c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f7726b).inflate(p060g.g.f44001l, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f7727c.z());
            }
            frameLayout.setEnabled(false);
            listViewO.addHeaderView(frameLayout, null, false);
        }
        this.f7733i.m(this.f7728d);
        this.f7733i.c();
        return true;
    }

    @Override // p130n.e
    public boolean a() {
        return !this.f7721H && this.f7733i.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z9) {
        if (eVar != this.f7727c) {
            return;
        }
        dismiss();
        j.a aVar = this.f7739w;
        if (aVar != null) {
            aVar.b(eVar, z9);
        }
    }

    @Override // p130n.e
    public void c() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p130n.e
    public void dismiss() {
        if (a()) {
            this.f7733i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f7739w = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f7726b, mVar, this.f7738v, this.f7729e, this.f7731g, this.f7732h);
            iVar.j(this.f7739w);
            iVar.g(h.z(mVar));
            iVar.i(this.f7736l);
            this.f7736l = null;
            this.f7727c.e(false);
            int iB = this.f7733i.b();
            int iL = this.f7733i.l();
            if ((Gravity.getAbsoluteGravity(this.f7724K, this.f7737m.getLayoutDirection()) & 7) == 5) {
                iB += this.f7737m.getWidth();
            }
            if (iVar.n(iB, iL)) {
                j.a aVar = this.f7739w;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z9) {
        this.f7722I = false;
        d dVar = this.f7728d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(e eVar) {
    }

    @Override // p130n.e
    public ListView o() {
        return this.f7733i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f7721H = true;
        this.f7727c.close();
        ViewTreeObserver viewTreeObserver = this.f7720G;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f7720G = this.f7738v.getViewTreeObserver();
            }
            this.f7720G.removeGlobalOnLayoutListener(this.f7734j);
            this.f7720G = null;
        }
        this.f7738v.removeOnAttachStateChangeListener(this.f7735k);
        PopupWindow.OnDismissListener onDismissListener = this.f7736l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f7737m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(boolean z9) {
        this.f7728d.d(z9);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i10) {
        this.f7724K = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f7733i.e(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f7736l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(boolean z9) {
        this.f7725L = z9;
    }

    @Override // androidx.appcompat.view.menu.h
    public void y(int i10) {
        this.f7733i.i(i10);
    }
}
