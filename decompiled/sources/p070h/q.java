package p070h;

import O.AbstractC0877t;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.r;
import p060g.a;
import p120m.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends r implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f44685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC0877t.a f44686e;

    public q(Context context, int i10) {
        super(context, i(context, i10));
        this.f44686e = new AbstractC0877t.a() { // from class: h.p
            @Override // O.AbstractC0877t.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f44684a.j(keyEvent);
            }
        };
        e eVarH = h();
        eVarH.O(i(context, i10));
        eVarH.y(null);
    }

    private static int i(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.f43878x, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        h().e(view, layoutParams);
    }

    @Override // p070h.c
    public b c(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        h().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0877t.e(this.f44686e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return h().l(i10);
    }

    public e h() {
        if (this.f44685d == null) {
            this.f44685d = e.k(this, this);
        }
        return this.f44685d;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        h().v();
    }

    boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean k(int i10) {
        return h().H(i10);
    }

    @Override // androidx.activity.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        h().u();
        super.onCreate(bundle);
        h().y(bundle);
    }

    @Override // androidx.activity.r, android.app.Dialog
    protected void onStop() {
        super.onStop();
        h().E();
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void setContentView(int i10) {
        d();
        h().I(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h().P(charSequence);
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void setContentView(View view) {
        d();
        h().J(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        h().P(getContext().getString(i10));
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        h().K(view, layoutParams);
    }

    @Override // p070h.c
    public void f(b bVar) {
    }

    @Override // p070h.c
    public void g(b bVar) {
    }
}
