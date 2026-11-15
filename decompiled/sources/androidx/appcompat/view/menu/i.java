package androidx.appcompat.view.menu;

import O.AbstractC0875s;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f7707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f7711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f7714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f7715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f7716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f7717l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z9, int i10) {
        this(context, eVar, view, z9, i10, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f7706a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f7706a.getResources().getDimensionPixelSize(p060g.d.f43890a) ? new b(this.f7706a, this.f7711f, this.f7709d, this.f7710e, this.f7708c) : new l(this.f7706a, this.f7707b, this.f7711f, this.f7709d, this.f7710e, this.f7708c);
        bVar.m(this.f7707b);
        bVar.w(this.f7717l);
        bVar.r(this.f7711f);
        bVar.e(this.f7714i);
        bVar.t(this.f7713h);
        bVar.u(this.f7712g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z9, boolean z10) {
        h hVarC = c();
        hVarC.x(z10);
        if (z9) {
            if ((AbstractC0875s.b(this.f7712g, this.f7711f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f7711f.getWidth();
            }
            hVarC.v(i10);
            hVarC.y(i11);
            int i12 = (int) ((this.f7706a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.s(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.c();
    }

    public void b() {
        if (d()) {
            this.f7715j.dismiss();
        }
    }

    public h c() {
        if (this.f7715j == null) {
            this.f7715j = a();
        }
        return this.f7715j;
    }

    public boolean d() {
        h hVar = this.f7715j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f7715j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f7716k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f7711f = view;
    }

    public void g(boolean z9) {
        this.f7713h = z9;
        h hVar = this.f7715j;
        if (hVar != null) {
            hVar.t(z9);
        }
    }

    public void h(int i10) {
        this.f7712g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f7716k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f7714i = aVar;
        h hVar = this.f7715j;
        if (hVar != null) {
            hVar.e(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f7711f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f7711f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z9, int i10, int i11) {
        this.f7712g = 8388611;
        this.f7717l = new a();
        this.f7706a = context;
        this.f7707b = eVar;
        this.f7711f = view;
        this.f7708c = z9;
        this.f7709d = i10;
        this.f7710e = i11;
    }
}
