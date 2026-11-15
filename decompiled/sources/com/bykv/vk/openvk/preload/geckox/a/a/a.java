package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f13448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c f13449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f13450c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0219a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f13452b = b.f13454a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f13453c;

        public final C0219a a() {
            this.f13451a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0219a a(b bVar) {
            if (bVar == null) {
                bVar = b.f13454a;
            }
            this.f13452b = bVar;
            return this;
        }
    }

    /* synthetic */ a(C0219a c0219a, byte b10) {
        this(c0219a);
    }

    public final b a() {
        return this.f13450c;
    }

    private a(C0219a c0219a) {
        this.f13448a = c0219a.f13451a;
        this.f13450c = c0219a.f13452b;
        this.f13449b = c0219a.f13453c;
    }
}
