package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f10868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f10869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o.c f10871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f10872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f10873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f10874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ServiceConnection f10875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f10876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f10877l;

    public static final class a extends o.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.o.c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.o.c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (r.this.j().get()) {
                return;
            }
            try {
                k kVarH = r.this.h();
                if (kVarH != null) {
                    int iC = r.this.c();
                    Object[] array = tables.toArray(new String[0]);
                    Intrinsics.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    kVarH.v3(iC, (String[]) array);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public static final class b extends j.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void N0(r this$0, String[] tables) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(tables, "$tables");
            this$0.e().k((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.j
        public void m1(final String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Executor executorD = r.this.d();
            final r rVar = r.this;
            executorD.execute(new Runnable() { // from class: androidx.room.s
                @Override // java.lang.Runnable
                public final void run() {
                    r.b.N0(rVar, tables);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            r.this.m(k.a.J(service));
            r.this.d().execute(r.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            r.this.d().execute(r.this.g());
            r.this.m(null);
        }
    }

    public r(Context context, String name, Intent serviceIntent, o invalidationTracker, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f10866a = name;
        this.f10867b = invalidationTracker;
        this.f10868c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f10869d = applicationContext;
        this.f10873h = new b();
        this.f10874i = new AtomicBoolean(false);
        c cVar = new c();
        this.f10875j = cVar;
        this.f10876k = new Runnable() { // from class: androidx.room.p
            @Override // java.lang.Runnable
            public final void run() {
                r.n(this.f10864a);
            }
        };
        this.f10877l = new Runnable() { // from class: androidx.room.q
            @Override // java.lang.Runnable
            public final void run() {
                r.k(this.f10865a);
            }
        };
        Object[] array = invalidationTracker.i().keySet().toArray(new String[0]);
        Intrinsics.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a((String[]) array));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f10867b.n(this$0.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            k kVar = this$0.f10872g;
            if (kVar != null) {
                this$0.f10870e = kVar.x4(this$0.f10873h, this$0.f10866a);
                this$0.f10867b.c(this$0.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f10870e;
    }

    public final Executor d() {
        return this.f10868c;
    }

    public final o e() {
        return this.f10867b;
    }

    public final o.c f() {
        o.c cVar = this.f10871f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("observer");
        return null;
    }

    public final Runnable g() {
        return this.f10877l;
    }

    public final k h() {
        return this.f10872g;
    }

    public final Runnable i() {
        return this.f10876k;
    }

    public final AtomicBoolean j() {
        return this.f10874i;
    }

    public final void l(o.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f10871f = cVar;
    }

    public final void m(k kVar) {
        this.f10872g = kVar;
    }

    public final void o() {
        if (this.f10874i.compareAndSet(false, true)) {
            this.f10867b.n(f());
            try {
                k kVar = this.f10872g;
                if (kVar != null) {
                    kVar.p6(this.f10873h, this.f10870e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.f10869d.unbindService(this.f10875j);
        }
    }
}
