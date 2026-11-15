package p036d5;

import android.os.Bundle;
import android.util.Log;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f43073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C7094k f43074b = new C7094k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f43075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Bundle f43076d;

    A(int i10, int i11, Bundle bundle) {
        this.f43073a = i10;
        this.f43075c = i11;
        this.f43076d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(B b10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + b10.toString());
        }
        this.f43074b.b(b10);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f43074b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f43075c + " id=" + this.f43073a + " oneWay=" + b() + "}";
    }
}
