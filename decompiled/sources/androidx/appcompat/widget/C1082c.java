package androidx.appcompat.widget;

import O.AbstractC0842b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1082c extends androidx.appcompat.view.menu.a implements AbstractC0842b.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f8204G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f8205H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f8206I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f8207J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f8208K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f8209L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f8210M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f8211N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final SparseBooleanArray f8212O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    e f8213P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    a f8214Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    RunnableC0137c f8215R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private b f8216S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    final f f8217T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f8218U;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d f8219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f8220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8221m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8222v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8223w;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, p060g.a.f43863i);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = C1082c.this.f8219k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C1082c.this).f7585i : view2);
            }
            j(C1082c.this.f8217T);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            C1082c c1082c = C1082c.this;
            c1082c.f8214Q = null;
            c1082c.f8218U = 0;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p130n.e a() {
            a aVar = C1082c.this.f8214Q;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0137c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f8226a;

        public RunnableC0137c(e eVar) {
            this.f8226a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) C1082c.this).f7579c != null) {
                ((androidx.appcompat.view.menu.a) C1082c.this).f7579c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) C1082c.this).f7585i;
            if (view != null && view.getWindowToken() != null && this.f8226a.m()) {
                C1082c.this.f8213P = this.f8226a;
            }
            C1082c.this.f8215R = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$d */
    private class d extends r implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$d$a */
        class a extends S {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ C1082c f8229j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C1082c c1082c) {
                super(view);
                this.f8229j = c1082c;
            }

            @Override // androidx.appcompat.widget.S
            public p130n.e e() {
                e eVar = C1082c.this.f8213P;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.S
            public boolean f() {
                C1082c.this.M();
                return true;
            }

            @Override // androidx.appcompat.widget.S
            public boolean g() {
                C1082c c1082c = C1082c.this;
                if (c1082c.f8215R != null) {
                    return false;
                }
                c1082c.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, p060g.a.f43862h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            m0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C1082c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean e() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1082c.this.M();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                G.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z9) {
            super(context, eVar, view, z9, p060g.a.f43863i);
            h(8388613);
            j(C1082c.this.f8217T);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) C1082c.this).f7579c != null) {
                ((androidx.appcompat.view.menu.a) C1082c.this).f7579c.close();
            }
            C1082c.this.f8213P = null;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$f */
    private class f implements androidx.appcompat.view.menu.j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.F().e(false);
            }
            androidx.appcompat.view.menu.j.a aVarO = C1082c.this.o();
            if (aVarO != null) {
                aVarO.b(eVar, z9);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) C1082c.this).f7579c) {
                return false;
            }
            C1082c.this.f8218U = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            androidx.appcompat.view.menu.j.a aVarO = C1082c.this.o();
            if (aVarO != null) {
                return aVarO.c(eVar);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$g */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8233a;

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$g$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f8233a);
        }

        g(Parcel parcel) {
            this.f8233a = parcel.readInt();
        }
    }

    public C1082c(Context context) {
        super(context, p060g.g.f43992c, p060g.g.f43991b);
        this.f8212O = new SparseBooleanArray();
        this.f8217T = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f7585i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof androidx.appcompat.view.menu.k.a) && ((androidx.appcompat.view.menu.k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        return D() | E();
    }

    public Drawable C() {
        d dVar = this.f8219k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f8221m) {
            return this.f8220l;
        }
        return null;
    }

    public boolean D() {
        Object obj;
        RunnableC0137c runnableC0137c = this.f8215R;
        if (runnableC0137c != null && (obj = this.f7585i) != null) {
            ((View) obj).removeCallbacks(runnableC0137c);
            this.f8215R = null;
            return true;
        }
        e eVar = this.f8213P;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean E() {
        a aVar = this.f8214Q;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.f8215R != null || G();
    }

    public boolean G() {
        e eVar = this.f8213P;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f8207J) {
            this.f8206I = p120m.a.b(this.f7578b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f7579c;
        if (eVar != null) {
            eVar.N(true);
        }
    }

    public void I(boolean z9) {
        this.f8210M = z9;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f7585i = actionMenuView;
        actionMenuView.a(this.f7579c);
    }

    public void K(Drawable drawable) {
        d dVar = this.f8219k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f8221m = true;
            this.f8220l = drawable;
        }
    }

    public void L(boolean z9) {
        this.f8222v = z9;
        this.f8223w = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f8222v || G() || (eVar = this.f7579c) == null || this.f7585i == null || this.f8215R != null || eVar.B().isEmpty()) {
            return false;
        }
        RunnableC0137c runnableC0137c = new RunnableC0137c(new e(this.f7578b, this.f7579c, this.f8219k, true));
        this.f8215R = runnableC0137c;
        ((View) this.f7585i).post(runnableC0137c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
        A();
        super.b(eVar, z9);
    }

    @Override // androidx.appcompat.view.menu.a
    public void c(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.k.a aVar) {
        aVar.f(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f7585i);
        if (this.f8216S == null) {
            this.f8216S = new b();
        }
        actionMenuItemView.setPopupCallback(this.f8216S);
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f8233a) > 0 && (menuItemFindItem = this.f7579c.findItem(i10)) != null) {
            g((androidx.appcompat.view.menu.m) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean g(androidx.appcompat.view.menu.m mVar) {
        boolean z9 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.j0() != this.f7579c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.j0();
        }
        View viewB = B(mVar2.getItem());
        if (viewB == null) {
            return false;
        }
        this.f8218U = mVar.getItem().getItemId();
        int size = mVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z9 = true;
                break;
            }
        }
        a aVar = new a(this.f7578b, mVar, viewB);
        this.f8214Q = aVar;
        aVar.g(z9);
        this.f8214Q.k();
        super.g(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        g gVar = new g();
        gVar.f8233a = this.f8218U;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(boolean z9) {
        super.i(z9);
        ((View) this.f7585i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f7579c;
        boolean z10 = false;
        if (eVar != null) {
            ArrayList arrayListU = eVar.u();
            int size = arrayListU.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0842b abstractC0842bA = ((androidx.appcompat.view.menu.g) arrayListU.get(i10)).a();
                if (abstractC0842bA != null) {
                    abstractC0842bA.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f7579c;
        ArrayList arrayListB = eVar2 != null ? eVar2.B() : null;
        if (this.f8222v && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z10 = !((androidx.appcompat.view.menu.g) arrayListB.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f8219k == null) {
                this.f8219k = new d(this.f7577a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f8219k.getParent();
            if (viewGroup != this.f7585i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f8219k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f7585i;
                actionMenuView.addView(this.f8219k, actionMenuView.D());
            }
        } else {
            d dVar = this.f8219k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f7585i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8219k);
                }
            }
        }
        ((ActionMenuView) this.f7585i).setOverflowReserved(this.f8222v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        ArrayList arrayListG;
        int size;
        int i10;
        int iJ;
        ?? r10;
        C1082c c1082c = this;
        androidx.appcompat.view.menu.e eVar = c1082c.f7579c;
        View view = null;
        ?? r11 = 0;
        if (eVar != null) {
            arrayListG = eVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i11 = c1082c.f8206I;
        int i12 = c1082c.f8205H;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1082c.f7585i;
        boolean z9 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayListG.get(i15);
            if (gVar.o()) {
                i13++;
            } else if (gVar.n()) {
                i14++;
            } else {
                z9 = true;
            }
            if (c1082c.f8210M && gVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (c1082c.f8222v && (z9 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = c1082c.f8212O;
        sparseBooleanArray.clear();
        if (c1082c.f8208K) {
            int i17 = c1082c.f8211N;
            iJ = i12 / i17;
            i10 = i17 + ((i12 % i17) / iJ);
        } else {
            i10 = 0;
            iJ = 0;
        }
        int i18 = 0;
        int i19 = 0;
        ?? r12 = c1082c;
        while (i18 < size) {
            ?? r15 = (androidx.appcompat.view.menu.g) arrayListG.get(i18);
            if (r15.o()) {
                View viewP = r12.p(r15, view, viewGroup);
                if (r12.f8208K) {
                    iJ -= ActionMenuView.J(viewP, i10, iJ, iMakeMeasureSpec, r11);
                } else {
                    viewP.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewP.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.u(true);
                r10 = r11;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z10 = sparseBooleanArray.get(groupId2);
                boolean z11 = (i16 > 0 || z10) && i12 > 0 && (!r12.f8208K || iJ > 0);
                boolean z12 = z11;
                if (z11) {
                    View viewP2 = r12.p(r15, null, viewGroup);
                    if (r12.f8208K) {
                        int iJ2 = ActionMenuView.J(viewP2, i10, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z12 = false;
                        }
                    } else {
                        viewP2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z13 = z12;
                    int measuredWidth2 = viewP2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z11 = z13 & (!r12.f8208K ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z11 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z10) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayListG.get(i20);
                        if (gVar2.getGroupId() == groupId2) {
                            if (gVar2.l()) {
                                i16++;
                            }
                            gVar2.u(false);
                        }
                    }
                }
                if (z11) {
                    i16--;
                }
                r15.u(z11);
                r10 = 0;
            } else {
                r10 = r11;
                r15.u(r10);
            }
            i18++;
            r11 = r10;
            size = size;
            view = null;
            r12 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void l(Context context, androidx.appcompat.view.menu.e eVar) {
        super.l(context, eVar);
        Resources resources = context.getResources();
        p120m.a aVarB = p120m.a.b(context);
        if (!this.f8223w) {
            this.f8222v = aVarB.f();
        }
        if (!this.f8209L) {
            this.f8204G = aVarB.c();
        }
        if (!this.f8207J) {
            this.f8206I = aVarB.d();
        }
        int measuredWidth = this.f8204G;
        if (this.f8222v) {
            if (this.f8219k == null) {
                d dVar = new d(this.f7577a);
                this.f8219k = dVar;
                if (this.f8221m) {
                    dVar.setImageDrawable(this.f8220l);
                    this.f8220l = null;
                    this.f8221m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8219k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f8219k.getMeasuredWidth();
        } else {
            this.f8219k = null;
        }
        this.f8205H = measuredWidth;
        this.f8211N = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f8219k) {
            return false;
        }
        return super.n(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View p(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.p(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k q(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f7585i;
        androidx.appcompat.view.menu.k kVarQ = super.q(viewGroup);
        if (kVar != kVarQ) {
            ((ActionMenuView) kVarQ).setPresenter(this);
        }
        return kVarQ;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean s(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }
}
