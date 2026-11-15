package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1164j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1152x f9912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f9913b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f9915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f9916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f9917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f9918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f9919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f9920i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f9922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f9923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f9924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f9925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f9926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f9927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f9928q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList f9930s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList f9914c = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f9921j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f9929r = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ComponentCallbacksC1144o f9932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f9933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f9934d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f9936f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9937g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        AbstractC1164j.b f9938h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        AbstractC1164j.b f9939i;

        a() {
        }

        a(int i10, ComponentCallbacksC1144o componentCallbacksC1144o) {
            this.f9931a = i10;
            this.f9932b = componentCallbacksC1144o;
            this.f9933c = false;
            AbstractC1164j.b bVar = AbstractC1164j.b.RESUMED;
            this.f9938h = bVar;
            this.f9939i = bVar;
        }

        a(int i10, ComponentCallbacksC1144o componentCallbacksC1144o, boolean z9) {
            this.f9931a = i10;
            this.f9932b = componentCallbacksC1144o;
            this.f9933c = z9;
            AbstractC1164j.b bVar = AbstractC1164j.b.RESUMED;
            this.f9938h = bVar;
            this.f9939i = bVar;
        }
    }

    O(AbstractC1152x abstractC1152x, ClassLoader classLoader) {
        this.f9912a = abstractC1152x;
        this.f9913b = classLoader;
    }

    public O b(int i10, ComponentCallbacksC1144o componentCallbacksC1144o) {
        l(i10, componentCallbacksC1144o, null, 1);
        return this;
    }

    public O c(int i10, ComponentCallbacksC1144o componentCallbacksC1144o, String str) {
        l(i10, componentCallbacksC1144o, str, 1);
        return this;
    }

    O d(ViewGroup viewGroup, ComponentCallbacksC1144o componentCallbacksC1144o, String str) {
        componentCallbacksC1144o.mContainer = viewGroup;
        return c(viewGroup.getId(), componentCallbacksC1144o, str);
    }

    public O e(ComponentCallbacksC1144o componentCallbacksC1144o, String str) {
        l(0, componentCallbacksC1144o, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f9914c.add(aVar);
        aVar.f9934d = this.f9915d;
        aVar.f9935e = this.f9916e;
        aVar.f9936f = this.f9917f;
        aVar.f9937g = this.f9918g;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public O k() {
        if (this.f9920i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f9921j = false;
        return this;
    }

    void l(int i10, ComponentCallbacksC1144o componentCallbacksC1144o, String str, int i11) {
        String str2 = componentCallbacksC1144o.mPreviousWho;
        if (str2 != null) {
            p081i0.c.f(componentCallbacksC1144o, str2);
        }
        Class<?> cls = componentCallbacksC1144o.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC1144o.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC1144o + ": was " + componentCallbacksC1144o.mTag + " now " + str);
            }
            componentCallbacksC1144o.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC1144o + " with tag " + str + " to container view with no id");
            }
            int i12 = componentCallbacksC1144o.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC1144o + ": was " + componentCallbacksC1144o.mFragmentId + " now " + i10);
            }
            componentCallbacksC1144o.mFragmentId = i10;
            componentCallbacksC1144o.mContainerId = i10;
        }
        f(new a(i11, componentCallbacksC1144o));
    }

    public O m(ComponentCallbacksC1144o componentCallbacksC1144o) {
        f(new a(3, componentCallbacksC1144o));
        return this;
    }

    public O n(int i10, ComponentCallbacksC1144o componentCallbacksC1144o) {
        return o(i10, componentCallbacksC1144o, null);
    }

    public O o(int i10, ComponentCallbacksC1144o componentCallbacksC1144o, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i10, componentCallbacksC1144o, str, 2);
        return this;
    }

    public O p(Runnable runnable) {
        k();
        if (this.f9930s == null) {
            this.f9930s = new ArrayList();
        }
        this.f9930s.add(runnable);
        return this;
    }

    public O q(int i10, int i11) {
        return r(i10, i11, 0, 0);
    }

    public O r(int i10, int i11, int i12, int i13) {
        this.f9915d = i10;
        this.f9916e = i11;
        this.f9917f = i12;
        this.f9918g = i13;
        return this;
    }

    public O s(boolean z9) {
        this.f9929r = z9;
        return this;
    }
}
