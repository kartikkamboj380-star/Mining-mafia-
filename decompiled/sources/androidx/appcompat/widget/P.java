package androidx.appcompat.widget;

import O.C0861k0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class P extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f7926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f7932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C0861k0 f7936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.core.widget.f f7937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    f f7938m;

    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f7939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f7940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f7941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f7942d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f7939a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f7940b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f7941c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f7942d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        static boolean a() {
            return f7942d;
        }

        static void b(P p10, int i10, View view) {
            try {
                f7939a.invoke(p10, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f7940b.invoke(p10, Integer.valueOf(i10));
                f7941c.invoke(p10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z9) {
            absListView.setSelectedChildViewEnabled(z9);
        }
    }

    private static class d extends p090j.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7943b;

        d(Drawable drawable) {
            super(drawable);
            this.f7943b = true;
        }

        void b(boolean z9) {
            this.f7943b = z9;
        }

        @Override // p090j.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f7943b) {
                super.draw(canvas);
            }
        }

        @Override // p090j.a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f7943b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // p090j.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f7943b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // p090j.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f7943b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p090j.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z9, boolean z10) {
            if (this.f7943b) {
                return super.setVisible(z9, z10);
            }
            return false;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Field f7944a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f7944a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f7944a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z9) {
            Field field = f7944a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z9));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            P p10 = P.this;
            p10.f7938m = null;
            p10.removeCallbacks(this);
        }

        public void b() {
            P.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            P p10 = P.this;
            p10.f7938m = null;
            p10.drawableStateChanged();
        }
    }

    P(Context context, boolean z9) {
        super(context, null, p060g.a.f43879y);
        this.f7926a = new Rect();
        this.f7927b = 0;
        this.f7928c = 0;
        this.f7929d = 0;
        this.f7930e = 0;
        this.f7934i = z9;
        setCacheColorHint(0);
    }

    private void a() {
        this.f7935j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f7931f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0861k0 c0861k0 = this.f7936k;
        if (c0861k0 != null) {
            c0861k0.c();
            this.f7936k = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f7926a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f7926a);
        selector.draw(canvas);
    }

    private void f(int i10, View view) {
        Rect rect = this.f7926a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f7927b;
        rect.top -= this.f7928c;
        rect.right += this.f7929d;
        rect.bottom += this.f7930e;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z9 = (selector == null || i10 == -1) ? false : true;
        if (z9) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z9) {
            Rect rect = this.f7926a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            G.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        G.a.k(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f7935j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f7931f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f7931f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z9) {
        d dVar = this.f7932g;
        if (dVar != null) {
            dVar.b(z9);
        }
    }

    private boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void l(boolean z9) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z9);
        } else {
            e.b(this, z9);
        }
    }

    private boolean m() {
        return this.f7935j;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f7938m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(MotionEvent motionEvent, int i10) {
        boolean z9;
        boolean z10;
        androidx.core.widget.f fVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z9 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z9 = true;
                    z10 = false;
                } else {
                    z10 = false;
                    z9 = false;
                }
                if (z9 || z10) {
                    a();
                }
                if (z9) {
                    fVar = this.f7937l;
                    if (fVar != null) {
                        fVar.q(false);
                    }
                    return z9;
                }
                if (this.f7937l == null) {
                    this.f7937l = new androidx.core.widget.f(this);
                }
                this.f7937l.q(true);
                this.f7937l.onTouch(this, motionEvent);
                return z9;
            }
            z9 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
            z9 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y9 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y9);
            if (iPointToPosition == -1) {
                z10 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x10, y9);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z9 = true;
                z10 = false;
            }
        }
        if (z9) {
            a();
        } else {
            a();
        }
        if (z9) {
            fVar = this.f7937l;
            if (fVar != null) {
                fVar.q(false);
            }
            return z9;
        }
        if (this.f7937l == null) {
            this.f7937l = new androidx.core.widget.f(this);
        }
        this.f7937l.q(true);
        this.f7937l.onTouch(this, motionEvent);
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f7934i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f7934i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f7934i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f7934i && this.f7933h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f7938m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f7938m == null) {
            f fVar = new f();
            this.f7938m = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7931f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f7938m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z9) {
        this.f7933h = z9;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f7932g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f7927b = rect.left;
        this.f7928c = rect.top;
        this.f7929d = rect.right;
        this.f7930e = rect.bottom;
    }
}
