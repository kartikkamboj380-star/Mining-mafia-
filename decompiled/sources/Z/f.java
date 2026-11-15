package Z;

import androidx.datastore.preferences.protobuf.AbstractC1123t;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.k0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1123t implements K {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private D preferences_ = D.f();

    public static final class a extends AbstractC1123t.a implements K {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a o(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            i();
            ((f) this.f9672b).M().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C f7082a = C.d(k0.b.f9568k, "", k0.b.f9570m, h.V());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC1123t.H(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map M() {
        return O();
    }

    private D O() {
        if (!this.preferences_.k()) {
            this.preferences_ = this.preferences_.n();
        }
        return this.preferences_;
    }

    private D P() {
        return this.preferences_;
    }

    public static a Q() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public static f R(InputStream inputStream) {
        return (f) AbstractC1123t.F(DEFAULT_INSTANCE, inputStream);
    }

    public Map N() {
        return Collections.unmodifiableMap(P());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123t
    protected final Object o(AbstractC1123t.d dVar, Object obj, Object obj2) {
        S bVar;
        e eVar = null;
        switch (e.f7081a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1123t.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f7082a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S s10 = PARSER;
                if (s10 != null) {
                    return s10;
                }
                synchronized (f.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC1123t.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
