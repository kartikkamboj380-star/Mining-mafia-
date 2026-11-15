package Z;

import androidx.datastore.preferences.protobuf.AbstractC1105a;
import androidx.datastore.preferences.protobuf.AbstractC1123t;
import androidx.datastore.preferences.protobuf.AbstractC1124u;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1123t implements K {
    private static final g DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC1124u.b strings_ = AbstractC1123t.p();

    public static final class a extends AbstractC1123t.a implements K {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a o(Iterable iterable) {
            i();
            ((g) this.f9672b).M(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1123t.H(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(Iterable iterable) {
        N();
        AbstractC1105a.a(iterable, this.strings_);
    }

    private void N() {
        AbstractC1124u.b bVar = this.strings_;
        if (bVar.isModifiable()) {
            return;
        }
        this.strings_ = AbstractC1123t.B(bVar);
    }

    public static g O() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public List P() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123t
    protected final Object o(AbstractC1123t.d dVar, Object obj, Object obj2) {
        S bVar;
        e eVar = null;
        switch (e.f7081a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1123t.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S s10 = PARSER;
                if (s10 != null) {
                    return s10;
                }
                synchronized (g.class) {
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
