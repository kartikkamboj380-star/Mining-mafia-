package Y1;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f6866a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f6867b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f6868c = new d();

    class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f6869a;

        a(Object obj) {
            this.f6869a = obj;
        }

        @Override // Y1.n
        public Object get() {
            return this.f6869a;
        }
    }

    class b implements n {
        b() {
        }

        @Override // Y1.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    class c implements n {
        c() {
        }

        @Override // Y1.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    class d implements n {
        d() {
        }

        @Override // Y1.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return "";
        }
    }

    public static n a(Object obj) {
        return new a(obj);
    }
}
