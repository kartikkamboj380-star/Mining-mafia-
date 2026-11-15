package com.google.firebase.messaging;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6712a implements A6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A6.a f40208a = new C6712a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C0371a implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0371a f40209a = new C0371a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f40210b = p257z6.c.a("projectNumber").b(C6.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final p257z6.c f40211c = p257z6.c.a("messageId").b(C6.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final p257z6.c f40212d = p257z6.c.a("instanceId").b(C6.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final p257z6.c f40213e = p257z6.c.a("messageType").b(C6.a.b().c(4).a()).a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final p257z6.c f40214f = p257z6.c.a("sdkPlatform").b(C6.a.b().c(5).a()).a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final p257z6.c f40215g = p257z6.c.a(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME).b(C6.a.b().c(6).a()).a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final p257z6.c f40216h = p257z6.c.a("collapseKey").b(C6.a.b().c(7).a()).a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final p257z6.c f40217i = p257z6.c.a(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).b(C6.a.b().c(8).a()).a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final p257z6.c f40218j = p257z6.c.a("ttl").b(C6.a.b().c(9).a()).a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final p257z6.c f40219k = p257z6.c.a("topic").b(C6.a.b().c(10).a()).a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final p257z6.c f40220l = p257z6.c.a("bulkId").b(C6.a.b().c(11).a()).a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final p257z6.c f40221m = p257z6.c.a("event").b(C6.a.b().c(12).a()).a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final p257z6.c f40222n = p257z6.c.a("analyticsLabel").b(C6.a.b().c(13).a()).a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final p257z6.c f40223o = p257z6.c.a("campaignId").b(C6.a.b().c(14).a()).a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final p257z6.c f40224p = p257z6.c.a("composerLabel").b(C6.a.b().c(15).a()).a();

        private C0371a() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(M6.a aVar, p257z6.e eVar) {
            eVar.e(f40210b, aVar.l());
            eVar.b(f40211c, aVar.h());
            eVar.b(f40212d, aVar.g());
            eVar.b(f40213e, aVar.i());
            eVar.b(f40214f, aVar.m());
            eVar.b(f40215g, aVar.j());
            eVar.b(f40216h, aVar.d());
            eVar.d(f40217i, aVar.k());
            eVar.d(f40218j, aVar.o());
            eVar.b(f40219k, aVar.n());
            eVar.e(f40220l, aVar.b());
            eVar.b(f40221m, aVar.f());
            eVar.b(f40222n, aVar.a());
            eVar.e(f40223o, aVar.c());
            eVar.b(f40224p, aVar.e());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f40225a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f40226b = p257z6.c.a("messagingClientEvent").b(C6.a.b().c(1).a()).a();

        private b() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(M6.b bVar, p257z6.e eVar) {
            eVar.b(f40226b, bVar.a());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f40227a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f40228b = p257z6.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // p257z6.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            p070h.w.a(obj);
            b(null, (p257z6.e) obj2);
        }

        public void b(O o10, p257z6.e eVar) {
            throw null;
        }
    }

    private C6712a() {
    }

    @Override // A6.a
    public void a(A6.b bVar) {
        bVar.a(O.class, c.f40227a);
        bVar.a(M6.b.class, b.f40225a);
        bVar.a(M6.a.class, C0371a.f40209a);
    }
}
