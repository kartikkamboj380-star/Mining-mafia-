package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0339b f14917f = new C0339b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f14918g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t3.b.a f14919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque[] f14920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Choreographer.FrameCallback f14923e;

    public enum a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f14930h = p189s8.a.a(c());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14931a;

        a(int i10) {
            this.f14931a = i10;
        }

        public static EnumEntries d() {
            return f14930h;
        }

        public final int e() {
            return this.f14931a;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.modules.core.b$b, reason: collision with other inner class name */
    public static final class C0339b {
        public /* synthetic */ C0339b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            b bVar = b.f14918g;
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        public final void b(p194t3.b choreographerProvider) {
            Intrinsics.checkNotNullParameter(choreographerProvider, "choreographerProvider");
            if (b.f14918g == null) {
                b.f14918g = new b(choreographerProvider, null);
            }
        }

        private C0339b() {
        }
    }

    public /* synthetic */ b(p194t3.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b bVar, p194t3.b bVar2) {
        bVar.f14919a = bVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, long j10) {
        synchronized (bVar.f14920b) {
            try {
                bVar.f14922d = false;
                int length = bVar.f14920b.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ArrayDeque arrayDeque = bVar.f14920b[i10];
                    int size = arrayDeque.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) arrayDeque.pollFirst();
                        if (frameCallback != null) {
                            frameCallback.doFrame(j10);
                            bVar.f14921c--;
                        } else {
                            Z1.a.m("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                bVar.j();
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final b h() {
        return f14917f.a();
    }

    public static final void i(p194t3.b bVar) {
        f14917f.b(bVar);
    }

    private final void j() {
        p004a3.a.a(this.f14921c >= 0);
        if (this.f14921c == 0 && this.f14922d) {
            t3.b.a aVar = this.f14919a;
            if (aVar != null) {
                aVar.b(this.f14923e);
            }
            this.f14922d = false;
        }
    }

    private final void l() {
        if (this.f14922d) {
            return;
        }
        t3.b.a aVar = this.f14919a;
        if (aVar == null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: D3.j
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.react.modules.core.b.m(this.f473a);
                }
            });
        } else {
            aVar.a(this.f14923e);
            this.f14922d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar) {
        synchronized (bVar.f14920b) {
            bVar.l();
            Unit unit = Unit.f45918a;
        }
    }

    public final void k(a type, Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f14920b) {
            this.f14920b[type.e()].addLast(callback);
            boolean z9 = true;
            int i10 = this.f14921c + 1;
            this.f14921c = i10;
            if (i10 <= 0) {
                z9 = false;
            }
            p004a3.a.a(z9);
            l();
            Unit unit = Unit.f45918a;
        }
    }

    public final void n(a type, Choreographer.FrameCallback frameCallback) {
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.f14920b) {
            try {
                if (this.f14920b[type.e()].removeFirstOccurrence(frameCallback)) {
                    this.f14921c--;
                    j();
                } else {
                    Z1.a.m("ReactNative", "Tried to remove non-existent frame callback");
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private b(final p194t3.b bVar) {
        int size = a.d().size();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[size];
        for (int i10 = 0; i10 < size; i10++) {
            arrayDequeArr[i10] = new ArrayDeque();
        }
        this.f14920b = arrayDequeArr;
        this.f14923e = new Choreographer.FrameCallback() { // from class: D3.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                com.facebook.react.modules.core.b.g(this.f470a, j10);
            }
        };
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: D3.i
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.react.modules.core.b.d(this.f471a, bVar);
            }
        });
    }
}
