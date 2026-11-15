package androidx.fragment.app;

import O.InterfaceC0883w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.C1173t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1148t extends androidx.activity.j implements androidx.core.app.b.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f10116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f10117d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C1151w f10114a = C1151w.b(new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C1173t f10115b = new C1173t(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f10118e = true;

    /* JADX INFO: renamed from: androidx.fragment.app.t$a */
    class a extends AbstractC1153y implements C.d, C.e, androidx.core.app.s, androidx.core.app.t, androidx.lifecycle.W, androidx.activity.z, p040e.f, p251z0.f, K, InterfaceC0883w {
        public a() {
            super(AbstractActivityC1148t.this);
        }

        @Override // androidx.fragment.app.K
        public void a(G g10, ComponentCallbacksC1144o componentCallbacksC1144o) {
            AbstractActivityC1148t.this.H(componentCallbacksC1144o);
        }

        @Override // O.InterfaceC0883w
        public void addMenuProvider(O.C c10) {
            AbstractActivityC1148t.this.addMenuProvider(c10);
        }

        @Override // C.d
        public void addOnConfigurationChangedListener(N.a aVar) {
            AbstractActivityC1148t.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.s
        public void addOnMultiWindowModeChangedListener(N.a aVar) {
            AbstractActivityC1148t.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.t
        public void addOnPictureInPictureModeChangedListener(N.a aVar) {
            AbstractActivityC1148t.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // C.e
        public void addOnTrimMemoryListener(N.a aVar) {
            AbstractActivityC1148t.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.AbstractC1150v
        public View c(int i10) {
            return AbstractActivityC1148t.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC1150v
        public boolean d() {
            Window window = AbstractActivityC1148t.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p040e.f
        public p040e.e getActivityResultRegistry() {
            return AbstractActivityC1148t.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.r
        public AbstractC1164j getLifecycle() {
            return AbstractActivityC1148t.this.f10115b;
        }

        @Override // androidx.activity.z
        public androidx.activity.w getOnBackPressedDispatcher() {
            return AbstractActivityC1148t.this.getOnBackPressedDispatcher();
        }

        @Override // p251z0.f
        public p251z0.d getSavedStateRegistry() {
            return AbstractActivityC1148t.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.W
        public androidx.lifecycle.V getViewModelStore() {
            return AbstractActivityC1148t.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC1153y
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC1148t.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC1153y
        public LayoutInflater j() {
            return AbstractActivityC1148t.this.getLayoutInflater().cloneInContext(AbstractActivityC1148t.this);
        }

        @Override // androidx.fragment.app.AbstractC1153y
        public boolean l(String str) {
            return androidx.core.app.b.t(AbstractActivityC1148t.this, str);
        }

        @Override // androidx.fragment.app.AbstractC1153y
        public void o() {
            p();
        }

        public void p() {
            AbstractActivityC1148t.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.AbstractC1153y
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC1148t i() {
            return AbstractActivityC1148t.this;
        }

        @Override // O.InterfaceC0883w
        public void removeMenuProvider(O.C c10) {
            AbstractActivityC1148t.this.removeMenuProvider(c10);
        }

        @Override // C.d
        public void removeOnConfigurationChangedListener(N.a aVar) {
            AbstractActivityC1148t.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.s
        public void removeOnMultiWindowModeChangedListener(N.a aVar) {
            AbstractActivityC1148t.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.t
        public void removeOnPictureInPictureModeChangedListener(N.a aVar) {
            AbstractActivityC1148t.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // C.e
        public void removeOnTrimMemoryListener(N.a aVar) {
            AbstractActivityC1148t.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public AbstractActivityC1148t() {
        E();
    }

    private void E() {
        getSavedStateRegistry().h("android:support:lifecycle", new z0.d.c() { // from class: androidx.fragment.app.p
            @Override // z0.d.c
            public final Bundle a() {
                return AbstractActivityC1148t.z(this.f10110a);
            }
        });
        addOnConfigurationChangedListener(new N.a() { // from class: androidx.fragment.app.q
            @Override // N.a
            public final void accept(Object obj) {
                this.f10111a.f10114a.m();
            }
        });
        addOnNewIntentListener(new N.a() { // from class: androidx.fragment.app.r
            @Override // N.a
            public final void accept(Object obj) {
                this.f10112a.f10114a.m();
            }
        });
        addOnContextAvailableListener(new p030d.b() { // from class: androidx.fragment.app.s
            @Override // p030d.b
            public final void a(Context context) {
                this.f10113a.f10114a.a(null);
            }
        });
    }

    private static boolean G(G g10, AbstractC1164j.b bVar) {
        boolean zG = false;
        for (ComponentCallbacksC1144o componentCallbacksC1144o : g10.u0()) {
            if (componentCallbacksC1144o != null) {
                if (componentCallbacksC1144o.getHost() != null) {
                    zG |= G(componentCallbacksC1144o.getChildFragmentManager(), bVar);
                }
                T t10 = componentCallbacksC1144o.mViewLifecycleOwner;
                if (t10 != null && t10.getLifecycle().b().d(AbstractC1164j.b.STARTED)) {
                    componentCallbacksC1144o.mViewLifecycleOwner.f(bVar);
                    zG = true;
                }
                if (componentCallbacksC1144o.mLifecycleRegistry.b().d(AbstractC1164j.b.STARTED)) {
                    componentCallbacksC1144o.mLifecycleRegistry.n(bVar);
                    zG = true;
                }
            }
        }
        return zG;
    }

    public static /* synthetic */ Bundle z(AbstractActivityC1148t abstractActivityC1148t) {
        abstractActivityC1148t.F();
        abstractActivityC1148t.f10115b.i(AbstractC1164j.a.ON_STOP);
        return new Bundle();
    }

    final View B(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f10114a.n(view, str, context, attributeSet);
    }

    public G C() {
        return this.f10114a.l();
    }

    public androidx.loader.app.a D() {
        return androidx.loader.app.a.b(this);
    }

    void F() {
        while (G(C(), AbstractC1164j.b.CREATED)) {
        }
    }

    public void H(ComponentCallbacksC1144o componentCallbacksC1144o) {
    }

    protected void I() {
        this.f10115b.i(AbstractC1164j.a.ON_RESUME);
        this.f10114a.h();
    }

    @Override // androidx.core.app.b.d
    public final void d(int i10) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f10116c);
            printWriter.print(" mResumed=");
            printWriter.print(this.f10117d);
            printWriter.print(" mStopped=");
            printWriter.print(this.f10118e);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f10114a.l().V(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.f10114a.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.j, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10115b.i(AbstractC1164j.a.ON_CREATE);
        this.f10114a.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewB = B(view, str, context, attributeSet);
        return viewB == null ? super.onCreateView(view, str, context, attributeSet) : viewB;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f10114a.f();
        this.f10115b.i(AbstractC1164j.a.ON_DESTROY);
    }

    @Override // androidx.activity.j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f10114a.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f10117d = false;
        this.f10114a.g();
        this.f10115b.i(AbstractC1164j.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        I();
    }

    @Override // androidx.activity.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f10114a.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f10114a.m();
        super.onResume();
        this.f10117d = true;
        this.f10114a.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f10114a.m();
        super.onStart();
        this.f10118e = false;
        if (!this.f10116c) {
            this.f10116c = true;
            this.f10114a.c();
        }
        this.f10114a.k();
        this.f10115b.i(AbstractC1164j.a.ON_START);
        this.f10114a.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f10114a.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f10118e = true;
        F();
        this.f10114a.j();
        this.f10115b.i(AbstractC1164j.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewB = B(null, str, context, attributeSet);
        return viewB == null ? super.onCreateView(str, context, attributeSet) : viewB;
    }
}
