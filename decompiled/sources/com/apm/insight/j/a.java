package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f12957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12958b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12959c;

    a(Handler handler, long j10) {
        this.f12957a = handler;
        this.f12959c = j10;
    }

    final void a() {
        this.f12957a.post(this);
    }

    final long b() {
        return this.f12959c;
    }

    final void a(long j10) {
        if (j10 > 0) {
            this.f12957a.postDelayed(this, j10);
        } else {
            this.f12957a.post(this);
        }
    }
}
