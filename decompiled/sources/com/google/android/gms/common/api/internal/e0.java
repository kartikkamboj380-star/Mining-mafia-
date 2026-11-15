package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17056a = Collections.synchronizedMap(new p190t.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17057b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f17058c;

    e0() {
    }

    final LifecycleCallback a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f17056a.get(str));
    }

    final void b(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f17056a;
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        map.put(str, lifecycleCallback);
        if (this.f17057b > 0) {
            new com.google.android.gms.internal.common.s(Looper.getMainLooper()).post(new d0(this, lifecycleCallback, str));
        }
    }

    final boolean c() {
        return this.f17057b > 0;
    }

    final boolean d() {
        return this.f17057b >= 2;
    }

    final void e(Bundle bundle) {
        this.f17057b = 1;
        this.f17058c = bundle;
        for (Map.Entry entry : this.f17056a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void f() {
        this.f17057b = 2;
        Iterator it = this.f17056a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    final void g() {
        this.f17057b = 3;
        Iterator it = this.f17056a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    final void h(int i10, int i11, Intent intent) {
        Iterator it = this.f17056a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    final void i(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f17056a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void j() {
        this.f17057b = 4;
        Iterator it = this.f17056a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    final void k() {
        this.f17057b = 5;
        Iterator it = this.f17056a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    final void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f17056a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    final /* synthetic */ int m() {
        return this.f17057b;
    }

    final /* synthetic */ Bundle n() {
        return this.f17058c;
    }
}
