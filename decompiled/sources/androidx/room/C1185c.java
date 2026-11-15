package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.room.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1185c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f10767m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A0.h f10768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f10769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f10770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f10771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f10772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f10773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private A0.g f10776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f10778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f10779l;

    /* JADX INFO: renamed from: androidx.room.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1185c(long j10, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.f10769b = new Handler(Looper.getMainLooper());
        this.f10771d = new Object();
        this.f10772e = autoCloseTimeUnit.toMillis(j10);
        this.f10773f = autoCloseExecutor;
        this.f10775h = SystemClock.uptimeMillis();
        this.f10778k = new Runnable() { // from class: androidx.room.a
            @Override // java.lang.Runnable
            public final void run() {
                C1185c.f(this.f10765a);
            }
        };
        this.f10779l = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                C1185c.c(this.f10766a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1185c this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f10771d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f10775h < this$0.f10772e) {
                    return;
                }
                if (this$0.f10774g != 0) {
                    return;
                }
                Runnable runnable = this$0.f10770c;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.f45918a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                A0.g gVar = this$0.f10776i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                this$0.f10776i = null;
                Unit unit2 = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C1185c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f10773f.execute(this$0.f10779l);
    }

    public final void d() {
        synchronized (this.f10771d) {
            try {
                this.f10777j = true;
                A0.g gVar = this.f10776i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f10776i = null;
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f10771d) {
            try {
                int i10 = this.f10774g;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i11 = i10 - 1;
                this.f10774g = i11;
                if (i11 == 0) {
                    if (this.f10776i == null) {
                        return;
                    } else {
                        this.f10769b.postDelayed(this.f10778k, this.f10772e);
                    }
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final A0.g h() {
        return this.f10776i;
    }

    public final A0.h i() {
        A0.h hVar = this.f10768a;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("delegateOpenHelper");
        return null;
    }

    public final A0.g j() {
        synchronized (this.f10771d) {
            this.f10769b.removeCallbacks(this.f10778k);
            this.f10774g++;
            if (this.f10777j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            A0.g gVar = this.f10776i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            A0.g gVarJ0 = i().J0();
            this.f10776i = gVarJ0;
            return gVarJ0;
        }
    }

    public final void k(A0.h delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        n(delegateOpenHelper);
    }

    public final boolean l() {
        return !this.f10777j;
    }

    public final void m(Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.f10770c = onAutoClose;
    }

    public final void n(A0.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f10768a = hVar;
    }
}
