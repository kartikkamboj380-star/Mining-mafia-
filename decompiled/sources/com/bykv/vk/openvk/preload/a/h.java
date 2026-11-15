package com.bykv.vk.openvk.preload.a;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class<? extends d> f13409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f13410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f13411c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<? extends d> f13412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f13413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object[] f13414c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f13412a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f13413b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f13414c = objArr;
            return this;
        }
    }

    /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f13410b;
    }

    final Object[] b() {
        return this.f13411c;
    }

    private h(a aVar) {
        this.f13409a = aVar.f13412a;
        this.f13410b = aVar.f13413b;
        this.f13411c = aVar.f13414c;
        if (this.f13409a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
