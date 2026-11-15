package X0;

import android.content.Context;
import app.notifee.core.database.NotifeeCoreDatabase;
import b9.t;
import b9.v;
import com.google.common.util.concurrent.p;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i f6677b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f6678a;

    public i(Context context) {
        this.f6678a = NotifeeCoreDatabase.d(context).e();
    }

    public static i i(Context context) {
        i iVar;
        synchronized (i.class) {
            try {
                if (f6677b == null) {
                    f6677b = new i(context);
                }
                iVar = f6677b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q(Boolean bool) {
        return this.f6678a.f(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(v vVar) {
        this.f6678a.c(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(List list) {
        this.f6678a.a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f6678a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(v vVar) {
        this.f6678a.b(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(String str) {
        this.f6678a.e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ v w(String str) {
        return this.f6678a.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List x() {
        return this.f6678a.a();
    }

    public p j(final Boolean bool) {
        return NotifeeCoreDatabase.f11459b.submit(new Callable() { // from class: X0.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6664a.q(bool);
            }
        });
    }

    public void k() {
        NotifeeCoreDatabase.f11459b.execute(new Runnable() { // from class: X0.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f6672a.t();
            }
        });
    }

    public void l(final v vVar) {
        NotifeeCoreDatabase.f11459b.execute(new Runnable() { // from class: X0.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f6668a.r(vVar);
            }
        });
    }

    public void m(final String str) {
        NotifeeCoreDatabase.f11459b.execute(new Runnable() { // from class: X0.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f6675a.v(str);
            }
        });
    }

    public void n(final List list) {
        NotifeeCoreDatabase.f11459b.execute(new Runnable() { // from class: X0.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f6666a.s(list);
            }
        });
    }

    public p o() {
        return NotifeeCoreDatabase.f11459b.submit(new Callable() { // from class: X0.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6663a.x();
            }
        });
    }

    public p p(final String str) {
        return NotifeeCoreDatabase.f11459b.submit(new Callable() { // from class: X0.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6670a.w(str);
            }
        });
    }

    public void y(final v vVar) {
        NotifeeCoreDatabase.f11459b.execute(new Runnable() { // from class: X0.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f6673a.u(vVar);
            }
        });
    }
}
