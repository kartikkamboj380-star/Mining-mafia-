package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f7669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.a f7670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f7671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.a f7672d;

    public f(e eVar) {
        this.f7669a = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.f7670b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z9) {
        if (z9 || eVar == this.f7669a) {
            a();
        }
        j.a aVar = this.f7672d;
        if (aVar != null) {
            aVar.b(eVar, z9);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f7672d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f7669a;
        androidx.appcompat.app.a.C0134a c0134a = new androidx.appcompat.app.a.C0134a(eVar.w());
        c cVar = new c(c0134a.b(), p060g.g.f43999j);
        this.f7671c = cVar;
        cVar.e(this);
        this.f7669a.b(this.f7671c);
        c0134a.c(this.f7671c.a(), this);
        View viewA = eVar.A();
        if (viewA != null) {
            c0134a.d(viewA);
        } else {
            c0134a.e(eVar.y()).m(eVar.z());
        }
        c0134a.j(this);
        androidx.appcompat.app.a aVarA = c0134a.a();
        this.f7670b = aVarA;
        aVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f7670b.getWindow().getAttributes();
        attributes.type = BackupConstant.SCENE_CLOSED_WITHOUT_SHOW;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f7670b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f7669a.O((g) this.f7671c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f7671c.b(this.f7669a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f7670b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f7670b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f7669a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f7669a.performShortcut(i10, keyEvent, 0);
    }
}
