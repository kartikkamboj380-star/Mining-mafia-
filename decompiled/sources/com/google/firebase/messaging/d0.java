package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f40242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40244c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f40246e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayDeque f40245d = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40247f = false;

    private d0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f40242a = sharedPreferences;
        this.f40243b = str;
        this.f40244c = str2;
        this.f40246e = executor;
    }

    private boolean c(boolean z9) {
        if (z9 && !this.f40247f) {
            j();
        }
        return z9;
    }

    static d0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        d0 d0Var = new d0(sharedPreferences, str, str2, executor);
        d0Var.e();
        return d0Var;
    }

    private void e() {
        synchronized (this.f40245d) {
            try {
                this.f40245d.clear();
                String string = this.f40242a.getString(this.f40243b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f40244c)) {
                    String[] strArrSplit = string.split(this.f40244c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f40245d.add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f40245d) {
            this.f40242a.edit().putString(this.f40243b, h()).commit();
        }
    }

    private void j() {
        this.f40246e.execute(new Runnable() { // from class: com.google.firebase.messaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f40237a.i();
            }
        });
    }

    public boolean b(String str) {
        boolean zC;
        if (TextUtils.isEmpty(str) || str.contains(this.f40244c)) {
            return false;
        }
        synchronized (this.f40245d) {
            zC = c(this.f40245d.add(str));
        }
        return zC;
    }

    public String f() {
        String str;
        synchronized (this.f40245d) {
            str = (String) this.f40245d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean zC;
        synchronized (this.f40245d) {
            zC = c(this.f40245d.remove(obj));
        }
        return zC;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f40245d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f40244c);
        }
        return sb.toString();
    }
}
