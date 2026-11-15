package androidx.appcompat.widget;

import O.C0861k0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public interface J {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, androidx.appcompat.view.menu.j.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    Menu j();

    int k();

    C0861k0 l(int i10, long j10);

    ViewGroup m();

    void n(boolean z9);

    void o();

    void p(boolean z9);

    void q();

    void r(a0 a0Var);

    void s(int i10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2);

    int u();

    void v();

    void w(Drawable drawable);
}
