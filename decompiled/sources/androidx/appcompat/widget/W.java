package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class W extends U implements V {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static Method f8148a0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private V f8149Z;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z9) {
            popupWindow.setTouchModal(z9);
        }
    }

    public static class c extends P {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private V f8150G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private MenuItem f8151H;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final int f8152v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final int f8153w;

        public c(Context context, boolean z9) {
            super(context, z9);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f8152v = 21;
                this.f8153w = 22;
            } else {
                this.f8152v = 22;
                this.f8153w = 21;
            }
        }

        @Override // androidx.appcompat.widget.P
        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.P
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.P, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f8150G != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= dVar.getCount()) ? null : dVar.getItem(i10);
                MenuItem menuItem = this.f8151H;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f8150G.n(eVarB, menuItem);
                    }
                    this.f8151H = item;
                    if (item != null) {
                        this.f8150G.d(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f8152v) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f8153w) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.P, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(V v10) {
            this.f8150G = v10;
        }

        @Override // androidx.appcompat.widget.P, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f8148a0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public W(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void S(Object obj) {
        a.a(this.f8121W, (Transition) obj);
    }

    public void T(Object obj) {
        a.b(this.f8121W, (Transition) obj);
    }

    public void U(V v10) {
        this.f8149Z = v10;
    }

    public void V(boolean z9) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.f8121W, z9);
            return;
        }
        Method method = f8148a0;
        if (method != null) {
            try {
                method.invoke(this.f8121W, Boolean.valueOf(z9));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.V
    public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        V v10 = this.f8149Z;
        if (v10 != null) {
            v10.d(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.V
    public void n(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        V v10 = this.f8149Z;
        if (v10 != null) {
            v10.n(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.U
    P s(Context context, boolean z9) {
        c cVar = new c(context, z9);
        cVar.setHoverListener(this);
        return cVar;
    }
}
