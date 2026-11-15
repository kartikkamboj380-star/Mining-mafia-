package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class U implements p130n.e {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static Method f8103X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static Method f8104Y;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private View f8105G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f8106H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private DataSetObserver f8107I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private View f8108J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Drawable f8109K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private AdapterView.OnItemClickListener f8110L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f8111M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final i f8112N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final h f8113O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final g f8114P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final e f8115Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Runnable f8116R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final Handler f8117S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Rect f8118T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Rect f8119U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f8120V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    PopupWindow f8121W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f8123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    P f8124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8134m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f8136w;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = U.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            U.this.c();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            P p10;
            if (i10 == -1 || (p10 = U.this.f8124c) == null) {
                return;
            }
            p10.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z9) {
            return popupWindow.getMaxAvailableHeight(view, i10, z9);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z9) {
            popupWindow.setIsClippedToScreen(z9);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            U.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (U.this.a()) {
                U.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            U.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || U.this.A() || U.this.f8121W.getContentView() == null) {
                return;
            }
            U u10 = U.this;
            u10.f8117S.removeCallbacks(u10.f8112N);
            U.this.f8112N.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = U.this.f8121W) != null && popupWindow.isShowing() && x10 >= 0 && x10 < U.this.f8121W.getWidth() && y9 >= 0 && y9 < U.this.f8121W.getHeight()) {
                U u10 = U.this;
                u10.f8117S.postDelayed(u10.f8112N, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            U u11 = U.this;
            u11.f8117S.removeCallbacks(u11.f8112N);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P p10 = U.this.f8124c;
            if (p10 == null || !p10.isAttachedToWindow() || U.this.f8124c.getCount() <= U.this.f8124c.getChildCount()) {
                return;
            }
            int childCount = U.this.f8124c.getChildCount();
            U u10 = U.this;
            if (childCount <= u10.f8136w) {
                u10.f8121W.setInputMethodMode(2);
                U.this.c();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f8103X = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f8104Y = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public U(Context context) {
        this(context, null, p060g.a.f43844C);
    }

    private void C() {
        View view = this.f8105G;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f8105G);
            }
        }
    }

    private void O(boolean z9) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f8121W, z9);
            return;
        }
        Method method = f8103X;
        if (method != null) {
            try {
                method.invoke(this.f8121W, Boolean.valueOf(z9));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f8124c == null) {
            Context context = this.f8122a;
            this.f8116R = new a();
            P pS = s(context, !this.f8120V);
            this.f8124c = pS;
            Drawable drawable = this.f8109K;
            if (drawable != null) {
                pS.setSelector(drawable);
            }
            this.f8124c.setAdapter(this.f8123b);
            this.f8124c.setOnItemClickListener(this.f8110L);
            this.f8124c.setFocusable(true);
            this.f8124c.setFocusableInTouchMode(true);
            this.f8124c.setOnItemSelectedListener(new b());
            this.f8124c.setOnScrollListener(this.f8114P);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f8111M;
            if (onItemSelectedListener != null) {
                this.f8124c.setOnItemSelectedListener(onItemSelectedListener);
            }
            P p10 = this.f8124c;
            View view2 = this.f8105G;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f8106H;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(p10, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f8106H);
                } else {
                    linearLayout.addView(p10, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f8126e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = p10;
            }
            this.f8121W.setContentView(view);
        } else {
            View view3 = this.f8105G;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f8121W.getBackground();
        if (background != null) {
            background.getPadding(this.f8118T);
            Rect rect = this.f8118T;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f8130i) {
                this.f8128g = -i14;
            }
        } else {
            this.f8118T.setEmpty();
            i10 = 0;
        }
        int iU = u(t(), this.f8128g, this.f8121W.getInputMethodMode() == 2);
        if (this.f8134m || this.f8125d == -1) {
            return iU + i10;
        }
        int i15 = this.f8126e;
        if (i15 == -2) {
            int i16 = this.f8122a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f8118T;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), LinearLayoutManager.INVALID_OFFSET);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f8122a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f8118T;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f8124c.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f8124c.getPaddingTop() + this.f8124c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i10, boolean z9) {
        return c.a(this.f8121W, view, i10, z9);
    }

    public boolean A() {
        return this.f8121W.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f8120V;
    }

    public void D(View view) {
        this.f8108J = view;
    }

    public void E(int i10) {
        this.f8121W.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f8121W.getBackground();
        if (background == null) {
            R(i10);
            return;
        }
        background.getPadding(this.f8118T);
        Rect rect = this.f8118T;
        this.f8126e = rect.left + rect.right + i10;
    }

    public void G(int i10) {
        this.f8133l = i10;
    }

    public void H(Rect rect) {
        this.f8119U = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.f8121W.setInputMethodMode(i10);
    }

    public void J(boolean z9) {
        this.f8120V = z9;
        this.f8121W.setFocusable(z9);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f8121W.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f8110L = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f8111M = onItemSelectedListener;
    }

    public void N(boolean z9) {
        this.f8132k = true;
        this.f8131j = z9;
    }

    public void P(int i10) {
        this.f8106H = i10;
    }

    public void Q(int i10) {
        P p10 = this.f8124c;
        if (!a() || p10 == null) {
            return;
        }
        p10.setListSelectionHidden(false);
        p10.setSelection(i10);
        if (p10.getChoiceMode() != 0) {
            p10.setItemChecked(i10, true);
        }
    }

    public void R(int i10) {
        this.f8126e = i10;
    }

    @Override // p130n.e
    public boolean a() {
        return this.f8121W.isShowing();
    }

    public int b() {
        return this.f8127f;
    }

    @Override // p130n.e
    public void c() {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.h.b(this.f8121W, this.f8129h);
        if (this.f8121W.isShowing()) {
            if (t().isAttachedToWindow()) {
                int width = this.f8126e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i10 = this.f8125d;
                if (i10 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.f8121W.setWidth(this.f8126e == -1 ? -1 : 0);
                        this.f8121W.setHeight(0);
                    } else {
                        this.f8121W.setWidth(this.f8126e == -1 ? -1 : 0);
                        this.f8121W.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iQ = i10;
                }
                this.f8121W.setOutsideTouchable((this.f8135v || this.f8134m) ? false : true);
                this.f8121W.update(t(), this.f8127f, this.f8128g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f8126e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i11 = this.f8125d;
        if (i11 == -1) {
            iQ = -1;
        } else if (i11 != -2) {
            iQ = i11;
        }
        this.f8121W.setWidth(width2);
        this.f8121W.setHeight(iQ);
        O(true);
        this.f8121W.setOutsideTouchable((this.f8135v || this.f8134m) ? false : true);
        this.f8121W.setTouchInterceptor(this.f8113O);
        if (this.f8132k) {
            androidx.core.widget.h.a(this.f8121W, this.f8131j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f8104Y;
            if (method != null) {
                try {
                    method.invoke(this.f8121W, this.f8119U);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.f8121W, this.f8119U);
        }
        androidx.core.widget.h.c(this.f8121W, t(), this.f8127f, this.f8128g, this.f8133l);
        this.f8124c.setSelection(-1);
        if (!this.f8120V || this.f8124c.isInTouchMode()) {
            r();
        }
        if (this.f8120V) {
            return;
        }
        this.f8117S.post(this.f8115Q);
    }

    @Override // p130n.e
    public void dismiss() {
        this.f8121W.dismiss();
        C();
        this.f8121W.setContentView(null);
        this.f8124c = null;
        this.f8117S.removeCallbacks(this.f8112N);
    }

    public void e(int i10) {
        this.f8127f = i10;
    }

    public Drawable g() {
        return this.f8121W.getBackground();
    }

    public void i(int i10) {
        this.f8128g = i10;
        this.f8130i = true;
    }

    public int l() {
        if (this.f8130i) {
            return this.f8128g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f8107I;
        if (dataSetObserver == null) {
            this.f8107I = new f();
        } else {
            ListAdapter listAdapter2 = this.f8123b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f8123b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8107I);
        }
        P p10 = this.f8124c;
        if (p10 != null) {
            p10.setAdapter(this.f8123b);
        }
    }

    @Override // p130n.e
    public ListView o() {
        return this.f8124c;
    }

    public void p(Drawable drawable) {
        this.f8121W.setBackgroundDrawable(drawable);
    }

    public void r() {
        P p10 = this.f8124c;
        if (p10 != null) {
            p10.setListSelectionHidden(true);
            p10.requestLayout();
        }
    }

    P s(Context context, boolean z9) {
        return new P(context, z9);
    }

    public View t() {
        return this.f8108J;
    }

    public Object v() {
        if (a()) {
            return this.f8124c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f8124c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f8124c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.f8124c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f8126e;
    }

    public U(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public U(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f8125d = -2;
        this.f8126e = -2;
        this.f8129h = BackupConstant.SCENE_BACKUP_RENDER_FAIL;
        this.f8133l = 0;
        this.f8134m = false;
        this.f8135v = false;
        this.f8136w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f8106H = 0;
        this.f8112N = new i();
        this.f8113O = new h();
        this.f8114P = new g();
        this.f8115Q = new e();
        this.f8118T = new Rect();
        this.f8122a = context;
        this.f8117S = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p060g.j.f44207l1, i10, i11);
        this.f8127f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p060g.j.f44212m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p060g.j.f44217n1, 0);
        this.f8128g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8130i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1098t c1098t = new C1098t(context, attributeSet, i10, i11);
        this.f8121W = c1098t;
        c1098t.setInputMethodMode(1);
    }
}
