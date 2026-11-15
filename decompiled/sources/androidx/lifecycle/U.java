package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10189b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.a.b f10190c = n0.g.a.f46538a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p121m0.d f10191a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10196a = a.f10197a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f10197a = new a();

            private a() {
            }
        }

        default T a(Class modelClass, p121m0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return c(modelClass);
        }

        default T b(F8.c modelClass, p121m0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return a(p249y8.a.a(modelClass), extras);
        }

        default T c(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return p131n0.g.f46537a.c();
        }
    }

    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static d f10199c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10198b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final m0.a.b f10200d = n0.g.a.f46538a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f10199c == null) {
                    d.f10199c = new d();
                }
                d dVar = d.f10199c;
                Intrinsics.c(dVar);
                return dVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.U.c
        public T a(Class modelClass, p121m0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return c(modelClass);
        }

        @Override // androidx.lifecycle.U.c
        public T b(F8.c modelClass, p121m0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return a(p249y8.a.a(modelClass), extras);
        }

        @Override // androidx.lifecycle.U.c
        public T c(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return p131n0.a.f46532a.a(modelClass);
        }
    }

    public static class e {
        public abstract void d(T t10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(V store, c factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public final T a(F8.c modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return p121m0.d.b(this.f10191a, modelClass, null, 2, null);
    }

    public T b(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return a(p249y8.a.c(modelClass));
    }

    public T c(String key, Class modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return this.f10191a.a(p249y8.a.c(modelClass), key);
    }

    public static class a extends d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static a f10193g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Application f10195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f10192f = new b(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final m0.a.b f10194h = new C0158a();

        /* JADX INFO: renamed from: androidx.lifecycle.U$a$a, reason: collision with other inner class name */
        public static final class C0158a implements m0.a.b {
            C0158a() {
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f10193g == null) {
                    a.f10193g = new a(application);
                }
                a aVar = a.f10193g;
                Intrinsics.c(aVar);
                return aVar;
            }

            private b() {
            }
        }

        private a(Application application, int i10) {
            this.f10195e = application;
        }

        private final T h(Class cls, Application application) {
            if (!AbstractC1155a.class.isAssignableFrom(cls)) {
                return super.c(cls);
            }
            try {
                T t10 = (T) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(t10, "{\n                try {\n…          }\n            }");
                return t10;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.U.d, androidx.lifecycle.U.c
        public T a(Class modelClass, p121m0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f10195e != null) {
                return c(modelClass);
            }
            Application application = (Application) extras.a(f10194h);
            if (application != null) {
                return h(modelClass, application);
            }
            if (AbstractC1155a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.c(modelClass);
        }

        @Override // androidx.lifecycle.U.d, androidx.lifecycle.U.c
        public T c(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f10195e;
            if (application != null) {
                return h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }
    }

    private U(p121m0.d dVar) {
        this.f10191a = dVar;
    }

    public /* synthetic */ U(V v10, c cVar, p121m0.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v10, cVar, (i10 & 4) != 0 ? p121m0.a.C0470a.f46340b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(V store, c factory, p121m0.a defaultCreationExtras) {
        this(new p121m0.d(store, factory, defaultCreationExtras));
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(W owner, c factory) {
        this(owner.getViewModelStore(), factory, p131n0.g.f46537a.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
