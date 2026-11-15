package androidx.appcompat.widget;

import O.AbstractC0845c0;
import O.AbstractC0875s;
import O.C0889z;
import O.InterfaceC0883w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p070h.AbstractC6986a;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0883w {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f8047G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f8048H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f8049I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f8050J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Z f8051K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f8052L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f8053M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f8054N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CharSequence f8055O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private CharSequence f8056P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private ColorStateList f8057Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private ColorStateList f8058R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f8059S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f8060T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final ArrayList f8061U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final ArrayList f8062V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final int[] f8063W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ActionMenuView f8064a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    final C0889z f8065a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f8066b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ArrayList f8067b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f8068c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    h f8069c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageButton f8070d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final ActionMenuView.e f8071d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f8072e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private l0 f8073e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f8074f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private C1082c f8075f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f8076g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private f f8077g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ImageButton f8078h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f8079h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f8080i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f8081i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f8082j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f8083j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8084k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private OnBackInvokedCallback f8085k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8086l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private OnBackInvokedDispatcher f8087l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8088m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f8089m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final Runnable f8090n0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f8091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8092w;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f8065a0.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f8069c0;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements androidx.appcompat.view.menu.e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f8081i0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f8064a.H()) {
                Toolbar.this.f8065a0.i(eVar);
            }
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f8081i0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.k0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f8097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f8098b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f8078h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f8078h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f8078h);
            }
            Toolbar.this.f8080i = gVar.getActionView();
            this.f8098b = gVar;
            ViewParent parent2 = Toolbar.this.f8080i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f8080i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f44563a = (toolbar4.f8091v & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f8100b = 2;
                toolbar4.f8080i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f8080i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f8080i;
            if (callback instanceof p120m.c) {
                ((p120m.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public Parcelable h() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(boolean z9) {
            if (this.f8098b != null) {
                androidx.appcompat.view.menu.e eVar = this.f8097a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f8097a.getItem(i10) == this.f8098b) {
                            return;
                        }
                    }
                }
                k(this.f8097a, this.f8098b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f8080i;
            if (callback instanceof p120m.c) {
                ((p120m.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f8080i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f8078h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f8080i = null;
            toolbar3.a();
            this.f8098b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void l(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f8097a;
            if (eVar2 != null && (gVar = this.f8098b) != null) {
                eVar2.f(gVar);
            }
            this.f8097a = eVar;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f8065a0.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f8067b0 = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f8090n0);
        post(this.f8090n0);
    }

    private boolean O() {
        if (!this.f8083j0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z9 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = AbstractC0875s.b(i10, getLayoutDirection());
        list.clear();
        if (!z9) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f8100b == 0 && P(childAt) && p(gVar.f44563a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f8100b == 0 && P(childAt2) && p(gVar2.f44563a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z9) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.f8100b = 1;
        if (!z9 || this.f8080i == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.f8062V.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new p120m.g(getContext());
    }

    private void h() {
        if (this.f8051K == null) {
            this.f8051K = new Z();
        }
    }

    private void i() {
        if (this.f8072e == null) {
            this.f8072e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f8064a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f8064a.getMenu();
            if (this.f8077g0 == null) {
                this.f8077g0 = new f();
            }
            this.f8064a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f8077g0, this.f8082j);
            R();
        }
    }

    private void k() {
        if (this.f8064a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f8064a = actionMenuView;
            actionMenuView.setPopupTheme(this.f8084k);
            this.f8064a.setOnMenuItemClickListener(this.f8071d0);
            this.f8064a.M(this.f8079h0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f44563a = (this.f8091v & 112) | 8388613;
            this.f8064a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f8064a, false);
        }
    }

    private void l() {
        if (this.f8070d == null) {
            this.f8070d = new C1095p(getContext(), null, p060g.a.f43853L);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f44563a = (this.f8091v & 112) | 8388611;
            this.f8070d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = AbstractC0875s.b(i10, layoutDirection) & 7;
        if (iB == 1 || iB == 3 || iB == 5) {
            return iB;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(gVar.f44563a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f8054N & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.f8062V.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f8064a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f8064a;
        return actionMenuView != null && actionMenuView.H();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f8100b != 2 && childAt != this.f8064a) {
                removeViewAt(childCount);
                this.f8062V.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f8051K.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, C1082c c1082c) {
        if (eVar == null && this.f8064a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f8064a.L();
        if (eVarL == eVar) {
            return;
        }
        if (eVarL != null) {
            eVarL.R(this.f8075f0);
            eVarL.R(this.f8077g0);
        }
        if (this.f8077g0 == null) {
            this.f8077g0 = new f();
        }
        c1082c.I(true);
        if (eVar != null) {
            eVar.c(c1082c, this.f8082j);
            eVar.c(this.f8077g0, this.f8082j);
        } else {
            c1082c.l(this.f8082j, null);
            this.f8077g0.l(this.f8082j, null);
            c1082c.i(true);
            this.f8077g0.i(true);
        }
        this.f8064a.setPopupTheme(this.f8084k);
        this.f8064a.setPresenter(c1082c);
        this.f8075f0 = c1082c;
        R();
    }

    public void L(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f8079h0 = aVar;
        this.f8081i0 = aVar2;
        ActionMenuView actionMenuView = this.f8064a;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f8088m = i10;
        TextView textView = this.f8068c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f8086l = i10;
        TextView textView = this.f8066b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f8064a;
        return actionMenuView != null && actionMenuView.N();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z9 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f8089m0;
            if (z9 && this.f8087l0 == null) {
                if (this.f8085k0 == null) {
                    this.f8085k0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8330a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f8085k0);
                this.f8087l0 = onBackInvokedDispatcherA;
                return;
            }
            if (z9 || (onBackInvokedDispatcher = this.f8087l0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f8085k0);
            this.f8087l0 = null;
        }
    }

    void a() {
        for (int size = this.f8062V.size() - 1; size >= 0; size--) {
            addView((View) this.f8062V.get(size));
        }
        this.f8062V.clear();
    }

    @Override // O.InterfaceC0883w
    public void addMenuProvider(O.C c10) {
        this.f8065a0.c(c10);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f8064a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.f8077g0;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f8098b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f8064a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f8078h == null) {
            C1095p c1095p = new C1095p(getContext(), null, p060g.a.f43853L);
            this.f8078h = c1095p;
            c1095p.setImageDrawable(this.f8074f);
            this.f8078h.setContentDescription(this.f8076g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f44563a = (this.f8091v & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f8100b = 2;
            this.f8078h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f8078h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f8078h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f8078h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Z z9 = this.f8051K;
        if (z9 != null) {
            return z9.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f8053M;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Z z9 = this.f8051K;
        if (z9 != null) {
            return z9.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Z z9 = this.f8051K;
        if (z9 != null) {
            return z9.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Z z9 = this.f8051K;
        if (z9 != null) {
            return z9.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f8052L;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f8064a;
        return (actionMenuView == null || (eVarL = actionMenuView.L()) == null || !eVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f8053M, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f8052L, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f8072e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f8072e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f8064a.getMenu();
    }

    View getNavButtonView() {
        return this.f8070d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f8070d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f8070d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C1082c getOuterActionMenuPresenter() {
        return this.f8075f0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f8064a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f8082j;
    }

    public int getPopupTheme() {
        return this.f8084k;
    }

    public CharSequence getSubtitle() {
        return this.f8056P;
    }

    final TextView getSubtitleTextView() {
        return this.f8068c;
    }

    public CharSequence getTitle() {
        return this.f8055O;
    }

    public int getTitleMarginBottom() {
        return this.f8050J;
    }

    public int getTitleMarginEnd() {
        return this.f8048H;
    }

    public int getTitleMarginStart() {
        return this.f8047G;
    }

    public int getTitleMarginTop() {
        return this.f8049I;
    }

    final TextView getTitleTextView() {
        return this.f8066b;
    }

    public J getWrapper() {
        if (this.f8073e0 == null) {
            this.f8073e0 = new l0(this, true);
        }
        return this.f8073e0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof AbstractC6986a.C0431a) {
            return new g((AbstractC6986a.C0431a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f8090n0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8060T = false;
        }
        if (!this.f8060T) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f8060T = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8060T = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:102:0x0283  */
    /* JADX WARN: Code duplicated, block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02df  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x0238  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:99:0x025e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int iC;
        int iD;
        int iMax;
        int iMin;
        boolean zP;
        boolean zP2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iMax2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int size;
        int iC2;
        int i29;
        int size2;
        int i30;
        int i31;
        int i32;
        int size3;
        boolean z11 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.f8063W;
        iArr[1] = 0;
        iArr[0] = 0;
        int iA = AbstractC0845c0.A(this);
        int iMin2 = iA >= 0 ? Math.min(iA, i13 - i11) : 0;
        if (P(this.f8070d)) {
            if (z11) {
                iD = D(this.f8070d, i33, iArr, iMin2);
                iC = paddingLeft;
            } else {
                iC = C(this.f8070d, paddingLeft, iArr, iMin2);
            }
            if (P(this.f8078h)) {
                if (z11) {
                    iD = D(this.f8078h, iD, iArr, iMin2);
                } else {
                    iC = C(this.f8078h, iC, iArr, iMin2);
                }
            }
            if (P(this.f8064a)) {
                if (z11) {
                    iC = C(this.f8064a, iC, iArr, iMin2);
                } else {
                    iD = D(this.f8064a, iD, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iC);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iD));
            iMax = Math.max(iC, currentContentInsetLeft);
            iMin = Math.min(iD, i33 - currentContentInsetRight);
            if (P(this.f8080i)) {
                if (z11) {
                    iMin = D(this.f8080i, iMin, iArr, iMin2);
                } else {
                    iMax = C(this.f8080i, iMax, iArr, iMin2);
                }
            }
            if (P(this.f8072e)) {
                if (z11) {
                    iMin = D(this.f8072e, iMin, iArr, iMin2);
                } else {
                    iMax = C(this.f8072e, iMax, iArr, iMin2);
                }
            }
            zP = P(this.f8066b);
            zP2 = P(this.f8068c);
            if (zP) {
                g gVar3 = (g) this.f8066b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f8066b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zP2) {
                g gVar4 = (g) this.f8068c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f8068c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zP || zP2) {
                if (zP) {
                    textView = this.f8066b;
                } else {
                    textView = this.f8068c;
                }
                if (zP2) {
                    textView2 = this.f8068c;
                } else {
                    textView2 = this.f8066b;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i14 = measuredHeight;
                z10 = (!zP && this.f8066b.getMeasuredWidth() > 0) || (zP2 && this.f8068c.getMeasuredWidth() > 0);
                i15 = this.f8054N & 112;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f8049I;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i25 = this.f8049I;
                    if (iMax2 < i24 + i25) {
                        iMax2 = i24 + i25;
                    } else {
                        i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i28 = this.f8050J;
                        if (i26 < i27 + i28) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f8050J) - i14;
                }
                if (z11) {
                    if (z10) {
                        i21 = this.f8047G;
                    } else {
                        i21 = 0;
                    }
                    int i34 = i21 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zP) {
                        g gVar5 = (g) this.f8066b.getLayoutParams();
                        int measuredWidth = iMin - this.f8066b.getMeasuredWidth();
                        int measuredHeight2 = this.f8066b.getMeasuredHeight() + paddingTop;
                        this.f8066b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i22 = measuredWidth - this.f8048H;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i22 = iMin;
                    }
                    if (zP2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8068c.getLayoutParams())).topMargin;
                        this.f8068c.layout(iMin - this.f8068c.getMeasuredWidth(), i35, iMin, this.f8068c.getMeasuredHeight() + i35);
                        i23 = iMin - this.f8048H;
                    } else {
                        i23 = iMin;
                    }
                    if (z10) {
                        iMin = Math.min(i22, i23);
                    }
                    iMax = i16;
                    i18 = 0;
                } else {
                    if (z10) {
                        i17 = this.f8047G;
                    } else {
                        i17 = 0;
                    }
                    i18 = 0;
                    int i36 = i17 - iArr[0];
                    iMax = i16 + Math.max(0, i36);
                    iArr[0] = Math.max(0, -i36);
                    if (zP) {
                        g gVar6 = (g) this.f8066b.getLayoutParams();
                        int measuredWidth2 = this.f8066b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f8066b.getMeasuredHeight() + paddingTop;
                        this.f8066b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i19 = measuredWidth2 + this.f8048H;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i19 = iMax;
                    }
                    if (zP2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8068c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f8068c.getMeasuredWidth() + iMax;
                        this.f8068c.layout(iMax, i37, measuredWidth3, this.f8068c.getMeasuredHeight() + i37);
                        i20 = measuredWidth3 + this.f8048H;
                    } else {
                        i20 = iMax;
                    }
                    if (z10) {
                        iMax = Math.max(i19, i20);
                    }
                }
            } else {
                i18 = 0;
            }
            b(this.f8061U, 3);
            size = this.f8061U.size();
            iC2 = iMax;
            for (i29 = i18; i29 < size; i29++) {
                iC2 = C((View) this.f8061U.get(i29), iC2, iArr, iMin2);
            }
            b(this.f8061U, 5);
            size2 = this.f8061U.size();
            for (i30 = i18; i30 < size2; i30++) {
                iMin = D((View) this.f8061U.get(i30), iMin, iArr, iMin2);
            }
            b(this.f8061U, 1);
            int iU = u(this.f8061U, iArr);
            i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU / 2);
            i32 = iU + i31;
            if (i31 >= iC2) {
                if (i32 > iMin) {
                    iC2 = i31 - (i32 - iMin);
                } else {
                    iC2 = i31;
                }
            }
            size3 = this.f8061U.size();
            while (i18 < size3) {
                iC2 = C((View) this.f8061U.get(i18), iC2, iArr, iMin2);
                i18++;
            }
            this.f8061U.clear();
        }
        iC = paddingLeft;
        iD = i33;
        if (P(this.f8078h)) {
            if (z11) {
                iD = D(this.f8078h, iD, iArr, iMin2);
            } else {
                iC = C(this.f8078h, iC, iArr, iMin2);
            }
        }
        if (P(this.f8064a)) {
            if (z11) {
                iC = C(this.f8064a, iC, iArr, iMin2);
            } else {
                iD = D(this.f8064a, iD, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iC);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iD));
        iMax = Math.max(iC, currentContentInsetLeft2);
        iMin = Math.min(iD, i33 - currentContentInsetRight2);
        if (P(this.f8080i)) {
            if (z11) {
                iMin = D(this.f8080i, iMin, iArr, iMin2);
            } else {
                iMax = C(this.f8080i, iMax, iArr, iMin2);
            }
        }
        if (P(this.f8072e)) {
            if (z11) {
                iMin = D(this.f8072e, iMin, iArr, iMin2);
            } else {
                iMax = C(this.f8072e, iMax, iArr, iMin2);
            }
        }
        zP = P(this.f8066b);
        zP2 = P(this.f8068c);
        if (zP) {
            g gVar7 = (g) this.f8066b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + this.f8066b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zP2) {
            g gVar8 = (g) this.f8068c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) gVar8).topMargin + this.f8068c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zP) {
            if (zP) {
                textView = this.f8066b;
            } else {
                textView = this.f8068c;
            }
            if (zP2) {
                textView2 = this.f8068c;
            } else {
                textView2 = this.f8066b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zP) {
            }
            i15 = this.f8054N & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f8049I;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f8049I;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f8050J;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f8050J) - i14;
            }
            if (z11) {
                if (z10) {
                    i21 = this.f8047G;
                } else {
                    i21 = 0;
                }
                int i38 = i21 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zP) {
                    g gVar9 = (g) this.f8066b.getLayoutParams();
                    int measuredWidth4 = iMin - this.f8066b.getMeasuredWidth();
                    int measuredHeight4 = this.f8066b.getMeasuredHeight() + paddingTop;
                    this.f8066b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i22 = measuredWidth4 - this.f8048H;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zP2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8068c.getLayoutParams())).topMargin;
                    this.f8068c.layout(iMin - this.f8068c.getMeasuredWidth(), i39, iMin, this.f8068c.getMeasuredHeight() + i39);
                    i23 = iMin - this.f8048H;
                } else {
                    i23 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z10) {
                    i17 = this.f8047G;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i310 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i310);
                iArr[0] = Math.max(0, -i310);
                if (zP) {
                    g gVar10 = (g) this.f8066b.getLayoutParams();
                    int measuredWidth5 = this.f8066b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f8066b.getMeasuredHeight() + paddingTop;
                    this.f8066b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i19 = measuredWidth5 + this.f8048H;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zP2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8068c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f8068c.getMeasuredWidth() + iMax;
                    this.f8068c.layout(iMax, i311, measuredWidth6, this.f8068c.getMeasuredHeight() + i311);
                    i20 = measuredWidth6 + this.f8048H;
                } else {
                    i20 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i19, i20);
                }
            }
        } else {
            if (zP) {
                textView = this.f8066b;
            } else {
                textView = this.f8068c;
            }
            if (zP2) {
                textView2 = this.f8068c;
            } else {
                textView2 = this.f8066b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zP) {
            }
            i15 = this.f8054N & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f8049I;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f8049I;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f8050J;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f8050J) - i14;
            }
            if (z11) {
                if (z10) {
                    i21 = this.f8047G;
                } else {
                    i21 = 0;
                }
                int i312 = i21 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zP) {
                    g gVar11 = (g) this.f8066b.getLayoutParams();
                    int measuredWidth7 = iMin - this.f8066b.getMeasuredWidth();
                    int measuredHeight6 = this.f8066b.getMeasuredHeight() + paddingTop;
                    this.f8066b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i22 = measuredWidth7 - this.f8048H;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zP2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8068c.getLayoutParams())).topMargin;
                    this.f8068c.layout(iMin - this.f8068c.getMeasuredWidth(), i313, iMin, this.f8068c.getMeasuredHeight() + i313);
                    i23 = iMin - this.f8048H;
                } else {
                    i23 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z10) {
                    i17 = this.f8047G;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i314 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i314);
                iArr[0] = Math.max(0, -i314);
                if (zP) {
                    g gVar12 = (g) this.f8066b.getLayoutParams();
                    int measuredWidth8 = this.f8066b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f8066b.getMeasuredHeight() + paddingTop;
                    this.f8066b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i19 = measuredWidth8 + this.f8048H;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zP2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8068c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f8068c.getMeasuredWidth() + iMax;
                    this.f8068c.layout(iMax, i315, measuredWidth9, this.f8068c.getMeasuredHeight() + i315);
                    i20 = measuredWidth9 + this.f8048H;
                } else {
                    i20 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i19, i20);
                }
            }
        }
        b(this.f8061U, 3);
        size = this.f8061U.size();
        iC2 = iMax;
        while (i29 < size) {
            iC2 = C((View) this.f8061U.get(i29), iC2, iArr, iMin2);
        }
        b(this.f8061U, 5);
        size2 = this.f8061U.size();
        while (i30 < size2) {
            iMin = D((View) this.f8061U.get(i30), iMin, iArr, iMin2);
        }
        b(this.f8061U, 1);
        int iU2 = u(this.f8061U, iArr);
        i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU2 / 2);
        i32 = iU2 + i31;
        if (i31 >= iC2) {
            if (i32 > iMin) {
                iC2 = i31 - (i32 - iMin);
            } else {
                iC2 = i31;
            }
        }
        size3 = this.f8061U.size();
        while (i18 < size3) {
            iC2 = C((View) this.f8061U.get(i18), iC2, iArr, iMin2);
            i18++;
        }
        this.f8061U.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f8063W;
        boolean zB = s0.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f8070d)) {
            F(this.f8070d, i10, 0, i11, 0, this.f8092w);
            measuredWidth = this.f8070d.getMeasuredWidth() + s(this.f8070d);
            iMax = Math.max(0, this.f8070d.getMeasuredHeight() + t(this.f8070d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f8070d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f8078h)) {
            F(this.f8078h, i10, 0, i11, 0, this.f8092w);
            measuredWidth = this.f8078h.getMeasuredWidth() + s(this.f8078h);
            iMax = Math.max(iMax, this.f8078h.getMeasuredHeight() + t(this.f8078h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8078h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f8064a)) {
            F(this.f8064a, i10, iMax3, i11, 0, this.f8092w);
            measuredWidth2 = this.f8064a.getMeasuredWidth() + s(this.f8064a);
            iMax = Math.max(iMax, this.f8064a.getMeasuredHeight() + t(this.f8064a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8064a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f8080i)) {
            iArr = iArr2;
            iMax4 += E(this.f8080i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f8080i.getMeasuredHeight() + t(this.f8080i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8080i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f8072e)) {
            iMax4 += E(this.f8072e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f8072e.getMeasuredHeight() + t(this.f8072e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8072e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f8100b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f8049I + this.f8050J;
        int i16 = this.f8047G + this.f8048H;
        if (P(this.f8066b)) {
            E(this.f8066b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f8066b.getMeasuredWidth() + s(this.f8066b);
            int measuredHeight2 = this.f8066b.getMeasuredHeight() + t(this.f8066b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f8066b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (P(this.f8068c)) {
            iMax2 = Math.max(iMax2, E(this.f8068c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f8068c.getMeasuredHeight() + t(this.f8068c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f8068c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f8064a;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = iVar.f8101c;
        if (i10 != 0 && this.f8077g0 != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f8102d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f8051K.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f8077g0;
        if (fVar != null && (gVar = fVar.f8098b) != null) {
            iVar.f8101c = gVar.getItemId();
        }
        iVar.f8102d = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8059S = false;
        }
        if (!this.f8059S) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f8059S = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8059S = false;
        }
        return true;
    }

    @Override // O.InterfaceC0883w
    public void removeMenuProvider(O.C c10) {
        this.f8065a0.j(c10);
    }

    public void setBackInvokedCallbackEnabled(boolean z9) {
        if (this.f8089m0 != z9) {
            this.f8089m0 = z9;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(p080i.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z9) {
        this.f8083j0 = z9;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i10 != this.f8053M) {
            this.f8053M = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i10 != this.f8052L) {
            this.f8052L = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(p080i.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(p080i.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f8070d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f8069c0 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f8064a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f8084k != i10) {
            this.f8084k = i10;
            if (i10 == 0) {
                this.f8082j = getContext();
            } else {
                this.f8082j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f8050J = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f8048H = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f8047G = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f8049I = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        f fVar = this.f8077g0;
        return (fVar == null || fVar.f8098b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f8064a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        ArrayList arrayList = this.f8067b0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        G();
    }

    public static class g extends AbstractC6986a.C0431a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8100b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8100b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f8100b = 0;
            this.f44563a = 8388627;
        }

        public g(g gVar) {
            super((AbstractC6986a.C0431a) gVar);
            this.f8100b = 0;
            this.f8100b = gVar.f8100b;
        }

        public g(AbstractC6986a.C0431a c0431a) {
            super(c0431a);
            this.f8100b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8100b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8100b = 0;
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43854M);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f8078h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f8078h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f8078h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f8074f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f8072e)) {
                c(this.f8072e, true);
            }
        } else {
            ImageView imageView = this.f8072e;
            if (imageView != null && z(imageView)) {
                removeView(this.f8072e);
                this.f8062V.remove(this.f8072e);
            }
        }
        ImageView imageView2 = this.f8072e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f8072e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f8070d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            m0.a(this.f8070d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f8070d)) {
                c(this.f8070d, true);
            }
        } else {
            ImageButton imageButton = this.f8070d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f8070d);
                this.f8062V.remove(this.f8070d);
            }
        }
        ImageButton imageButton2 = this.f8070d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f8068c;
            if (textView != null && z(textView)) {
                removeView(this.f8068c);
                this.f8062V.remove(this.f8068c);
            }
        } else {
            if (this.f8068c == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f8068c = d10;
                d10.setSingleLine();
                this.f8068c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f8088m;
                if (i10 != 0) {
                    this.f8068c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f8058R;
                if (colorStateList != null) {
                    this.f8068c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f8068c)) {
                c(this.f8068c, true);
            }
        }
        TextView textView2 = this.f8068c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f8056P = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f8058R = colorStateList;
        TextView textView = this.f8068c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f8066b;
            if (textView != null && z(textView)) {
                removeView(this.f8066b);
                this.f8062V.remove(this.f8066b);
            }
        } else {
            if (this.f8066b == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f8066b = d10;
                d10.setSingleLine();
                this.f8066b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f8086l;
                if (i10 != 0) {
                    this.f8066b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f8057Q;
                if (colorStateList != null) {
                    this.f8066b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f8066b)) {
                c(this.f8066b, true);
            }
        }
        TextView textView2 = this.f8066b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f8055O = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f8057Q = colorStateList;
        TextView textView = this.f8066b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends T.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f8102d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8101c = parcel.readInt();
            this.f8102d = parcel.readInt() != 0;
        }

        @Override // T.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f8101c);
            parcel.writeInt(this.f8102d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8054N = 8388627;
        this.f8061U = new ArrayList();
        this.f8062V = new ArrayList();
        this.f8063W = new int[2];
        this.f8065a0 = new C0889z(new Runnable() { // from class: androidx.appcompat.widget.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8337a.y();
            }
        });
        this.f8067b0 = new ArrayList();
        this.f8071d0 = new a();
        this.f8090n0 = new b();
        h0 h0VarV = h0.v(getContext(), attributeSet, p060g.j.f44169d3, i10, 0);
        AbstractC0845c0.k0(this, context, p060g.j.f44169d3, attributeSet, h0VarV.r(), i10, 0);
        this.f8086l = h0VarV.n(p060g.j.f44057F3, 0);
        this.f8088m = h0VarV.n(p060g.j.f44264w3, 0);
        this.f8054N = h0VarV.l(p060g.j.f44174e3, this.f8054N);
        this.f8091v = h0VarV.l(p060g.j.f44179f3, 48);
        int iE = h0VarV.e(p060g.j.f44279z3, 0);
        iE = h0VarV.s(p060g.j.f44052E3) ? h0VarV.e(p060g.j.f44052E3, iE) : iE;
        this.f8050J = iE;
        this.f8049I = iE;
        this.f8048H = iE;
        this.f8047G = iE;
        int iE2 = h0VarV.e(p060g.j.f44042C3, -1);
        if (iE2 >= 0) {
            this.f8047G = iE2;
        }
        int iE3 = h0VarV.e(p060g.j.f44037B3, -1);
        if (iE3 >= 0) {
            this.f8048H = iE3;
        }
        int iE4 = h0VarV.e(p060g.j.f44047D3, -1);
        if (iE4 >= 0) {
            this.f8049I = iE4;
        }
        int iE5 = h0VarV.e(p060g.j.f44032A3, -1);
        if (iE5 >= 0) {
            this.f8050J = iE5;
        }
        this.f8092w = h0VarV.f(p060g.j.f44234q3, -1);
        int iE6 = h0VarV.e(p060g.j.f44214m3, LinearLayoutManager.INVALID_OFFSET);
        int iE7 = h0VarV.e(p060g.j.f44194i3, LinearLayoutManager.INVALID_OFFSET);
        int iF = h0VarV.f(p060g.j.f44204k3, 0);
        int iF2 = h0VarV.f(p060g.j.f44209l3, 0);
        h();
        this.f8051K.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f8051K.g(iE6, iE7);
        }
        this.f8052L = h0VarV.e(p060g.j.f44219n3, LinearLayoutManager.INVALID_OFFSET);
        this.f8053M = h0VarV.e(p060g.j.f44199j3, LinearLayoutManager.INVALID_OFFSET);
        this.f8074f = h0VarV.g(p060g.j.f44189h3);
        this.f8076g = h0VarV.p(p060g.j.f44184g3);
        CharSequence charSequenceP = h0VarV.p(p060g.j.f44274y3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = h0VarV.p(p060g.j.f44259v3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f8082j = getContext();
        setPopupTheme(h0VarV.n(p060g.j.f44254u3, 0));
        Drawable drawableG = h0VarV.g(p060g.j.f44249t3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = h0VarV.p(p060g.j.f44244s3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = h0VarV.g(p060g.j.f44224o3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = h0VarV.p(p060g.j.f44229p3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (h0VarV.s(p060g.j.f44062G3)) {
            setTitleTextColor(h0VarV.c(p060g.j.f44062G3));
        }
        if (h0VarV.s(p060g.j.f44269x3)) {
            setSubtitleTextColor(h0VarV.c(p060g.j.f44269x3));
        }
        if (h0VarV.s(p060g.j.f44239r3)) {
            x(h0VarV.n(p060g.j.f44239r3, 0));
        }
        h0VarV.x();
    }
}
