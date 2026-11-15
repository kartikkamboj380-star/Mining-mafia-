package p120m;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f46275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f46276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f46277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f46278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f46279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f46280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f46281i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z9) {
        this.f46275c = context;
        this.f46276d = actionBarContextView;
        this.f46277e = aVar;
        androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).X(1);
        this.f46281i = eVarX;
        eVarX.W(this);
        this.f46280h = z9;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f46277e.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f46276d.l();
    }

    @Override // p120m.b
    public void c() {
        if (this.f46279g) {
            return;
        }
        this.f46279g = true;
        this.f46277e.a(this);
    }

    @Override // p120m.b
    public View d() {
        WeakReference weakReference = this.f46278f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p120m.b
    public Menu e() {
        return this.f46281i;
    }

    @Override // p120m.b
    public MenuInflater f() {
        return new g(this.f46276d.getContext());
    }

    @Override // p120m.b
    public CharSequence g() {
        return this.f46276d.getSubtitle();
    }

    @Override // p120m.b
    public CharSequence i() {
        return this.f46276d.getTitle();
    }

    @Override // p120m.b
    public void k() {
        this.f46277e.b(this, this.f46281i);
    }

    @Override // p120m.b
    public boolean l() {
        return this.f46276d.j();
    }

    @Override // p120m.b
    public void m(View view) {
        this.f46276d.setCustomView(view);
        this.f46278f = view != null ? new WeakReference(view) : null;
    }

    @Override // p120m.b
    public void n(int i10) {
        o(this.f46275c.getString(i10));
    }

    @Override // p120m.b
    public void o(CharSequence charSequence) {
        this.f46276d.setSubtitle(charSequence);
    }

    @Override // p120m.b
    public void q(int i10) {
        r(this.f46275c.getString(i10));
    }

    @Override // p120m.b
    public void r(CharSequence charSequence) {
        this.f46276d.setTitle(charSequence);
    }

    @Override // p120m.b
    public void s(boolean z9) {
        super.s(z9);
        this.f46276d.setTitleOptional(z9);
    }
}
