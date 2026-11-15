package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ReactMarker.FabricMarkerListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0338a f14827c = new C0338a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f14828d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f14829e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f14830f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f14831g = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f14832h = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14833a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f14834b = new ArrayList();

    /* JADX INFO: renamed from: com.facebook.react.fabric.a$a, reason: collision with other inner class name */
    private static final class C0338a {
        public /* synthetic */ C0338a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(ReactMarkerConstants reactMarkerConstants) {
            return reactMarkerConstants == ReactMarkerConstants.FABRIC_COMMIT_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_COMMIT_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_DIFF_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_DIFF_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES;
        }

        private C0338a() {
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f14835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f14836b = new LinkedHashMap();

        public c(int i10) {
            this.f14835a = i10;
        }

        private final long q(ReactMarkerConstants reactMarkerConstants) {
            d dVar = (d) this.f14836b.get(reactMarkerConstants);
            if (dVar != null) {
                return dVar.a();
            }
            return -1L;
        }

        public final void a(ReactMarkerConstants key, d data) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f14836b.put(key, data);
        }

        public final long b() {
            return c() - d();
        }

        public final long c() {
            return q(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END);
        }

        public final long d() {
            return q(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START);
        }

        public final long e() {
            return f() - h();
        }

        public final long f() {
            return q(ReactMarkerConstants.FABRIC_COMMIT_END);
        }

        public final long g() {
            return this.f14835a;
        }

        public final long h() {
            return q(ReactMarkerConstants.FABRIC_COMMIT_START);
        }

        public final long i() {
            return j() - k();
        }

        public final long j() {
            return q(ReactMarkerConstants.FABRIC_DIFF_END);
        }

        public final long k() {
            return q(ReactMarkerConstants.FABRIC_DIFF_START);
        }

        public final long l() {
            return q(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END);
        }

        public final long m() {
            return q(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START);
        }

        public final long n() {
            return o() - p();
        }

        public final long o() {
            return q(ReactMarkerConstants.FABRIC_LAYOUT_END);
        }

        public final long p() {
            return q(ReactMarkerConstants.FABRIC_LAYOUT_START);
        }

        public final long r() {
            return l() - m();
        }

        public String toString() {
            return "FabricCommitPoint{mCommitNumber=" + this.f14835a + ", mPoints=" + this.f14836b + "}";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f14837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14838b;

        public d(long j10, int i10) {
            this.f14837a = j10;
            this.f14838b = i10;
        }

        public final long a() {
            return this.f14837a;
        }
    }

    private final void b(c cVar) {
        Iterator it = this.f14834b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(cVar);
        }
    }

    public final void a(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f14834b.add(listener);
    }

    public final void c(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f14834b.remove(listener);
    }

    @Override // com.facebook.react.bridge.ReactMarker.FabricMarkerListener
    public void logFabricMarker(ReactMarkerConstants name, String str, int i10, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        logFabricMarker(name, str, i10, j10, 0);
    }

    @Override // com.facebook.react.bridge.ReactMarker.FabricMarkerListener
    public void logFabricMarker(ReactMarkerConstants name, String str, int i10, long j10, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (f14827c.b(name)) {
            c cVar = (c) this.f14833a.get(Integer.valueOf(i10));
            if (cVar == null) {
                cVar = new c(i10);
                this.f14833a.put(Integer.valueOf(i10), cVar);
            }
            cVar.a(name, new d(j10, i11));
            if (name != ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END || j10 <= 0) {
                return;
            }
            b(cVar);
            this.f14833a.remove(Integer.valueOf(i10));
        }
    }
}
