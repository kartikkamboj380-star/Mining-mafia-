package O;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: O.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0842b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f3795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0066b f3796c;

    /* JADX INFO: renamed from: O.b$a */
    public interface a {
    }

    /* JADX INFO: renamed from: O.b$b, reason: collision with other inner class name */
    public interface InterfaceC0066b {
        void onActionProviderVisibilityChanged(boolean z9);
    }

    public AbstractC0842b(Context context) {
        this.f3794a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f3796c = null;
        this.f3795b = null;
    }

    public void h(a aVar) {
        this.f3795b = aVar;
    }

    public abstract void i(InterfaceC0066b interfaceC0066b);
}
