package p251z0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.InterfaceC1168n;
import androidx.lifecycle.r;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f50886g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f50889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f50890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p251z0.b.C0561b f50891e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p150p.b f50887a = new p150p.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f50892f = true;

    public interface a {
        void a(f fVar);
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d this$0, r rVar, AbstractC1164j.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1164j.a.ON_START) {
            this$0.f50892f = true;
        } else if (event == AbstractC1164j.a.ON_STOP) {
            this$0.f50892f = false;
        }
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f50890d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f50889c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f50889c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f50889c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f50889c = null;
        return bundle2;
    }

    public final c c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        for (Map.Entry components : this.f50887a) {
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (Intrinsics.b(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC1164j lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f50888b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC1168n() { // from class: z0.c
            @Override // androidx.lifecycle.InterfaceC1168n
            public final void onStateChanged(r rVar, AbstractC1164j.a aVar) {
                d.d(this.f50885a, rVar, aVar);
            }
        });
        this.f50888b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f50888b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f50890d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f50889c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f50890d = true;
    }

    public final void g(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f50889c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        p.b.d dVarD = this.f50887a.d();
        Intrinsics.checkNotNullExpressionValue(dVarD, "this.components.iteratorWithAdditions()");
        while (dVarD.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarD.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((c) this.f50887a.i(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f50892f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        p251z0.b.C0561b c0561b = this.f50891e;
        if (c0561b == null) {
            c0561b = new p251z0.b.C0561b(this);
        }
        this.f50891e = c0561b;
        try {
            clazz.getDeclaredConstructor(null);
            p251z0.b.C0561b c0561b2 = this.f50891e;
            if (c0561b2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                c0561b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
