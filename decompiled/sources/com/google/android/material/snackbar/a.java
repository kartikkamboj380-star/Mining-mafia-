package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p070h.w;

/* JADX INFO: loaded from: classes2.dex */
class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f39483c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f39484a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f39485b = new Handler(Looper.getMainLooper(), new C0364a());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    class C0364a implements Handler.Callback {
        C0364a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            w.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    interface b {
    }

    private static class c {
    }

    private a() {
    }

    private boolean a(c cVar, int i10) {
        throw null;
    }

    static a b() {
        if (f39483c == null) {
            f39483c = new a();
        }
        return f39483c;
    }

    private boolean d(b bVar) {
        return false;
    }

    void c(c cVar) {
        synchronized (this.f39484a) {
            a(cVar, 2);
        }
    }

    public void e(b bVar) {
        synchronized (this.f39484a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f39484a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
