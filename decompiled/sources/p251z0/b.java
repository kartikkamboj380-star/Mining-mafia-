package p251z0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.InterfaceC1168n;
import androidx.lifecycle.r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC1168n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50882b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f50883a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: z0.b$b, reason: collision with other inner class name */
    public static final class C0561b implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f50884a;

        public C0561b(d registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f50884a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // z0.d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f50884a));
            return bundle;
        }

        public final void b(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f50884a.add(className);
        }
    }

    public b(f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f50883a = owner;
    }

    private final void a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(d.a.class);
            Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((d.a) objNewInstance).a(this.f50883a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1168n
    public void onStateChanged(r source, AbstractC1164j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1164j.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().d(this);
        Bundle bundleB = this.f50883a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = stringArrayList.get(i10);
            i10++;
            a(str);
        }
    }
}
