package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1163i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1163i f10213a = new C1163i();

    /* JADX INFO: renamed from: androidx.lifecycle.i$a */
    public static final class a implements z0.d.a {
        @Override // z0.d.a
        public void a(p251z0.f owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof W)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            V viewModelStore = ((W) owner).getViewModelStore();
            p251z0.d savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                T tB = viewModelStore.b((String) it.next());
                Intrinsics.c(tB);
                C1163i.a(tB, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.i$b */
    public static final class b implements InterfaceC1168n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1164j f10214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p251z0.d f10215b;

        b(AbstractC1164j abstractC1164j, p251z0.d dVar) {
            this.f10214a = abstractC1164j;
            this.f10215b = dVar;
        }

        @Override // androidx.lifecycle.InterfaceC1168n
        public void onStateChanged(r source, AbstractC1164j.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1164j.a.ON_START) {
                this.f10214a.d(this);
                this.f10215b.i(a.class);
            }
        }
    }

    private C1163i() {
    }

    public static final void a(T viewModel, p251z0.d registry, AbstractC1164j lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        K k10 = (K) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (k10 == null || k10.G()) {
            return;
        }
        k10.a(registry, lifecycle);
        f10213a.c(registry, lifecycle);
    }

    public static final K b(p251z0.d registry, AbstractC1164j lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.c(str);
        K k10 = new K(str, I.f10155f.a(registry.b(str), bundle));
        k10.a(registry, lifecycle);
        f10213a.c(registry, lifecycle);
        return k10;
    }

    private final void c(p251z0.d dVar, AbstractC1164j abstractC1164j) {
        AbstractC1164j.b bVarB = abstractC1164j.b();
        if (bVarB == AbstractC1164j.b.INITIALIZED || bVarB.d(AbstractC1164j.b.STARTED)) {
            dVar.i(a.class);
        } else {
            abstractC1164j.a(new b(abstractC1164j, dVar));
        }
    }
}
