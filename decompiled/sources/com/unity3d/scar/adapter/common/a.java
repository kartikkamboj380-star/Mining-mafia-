package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42744a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f42745b;

    private void d() {
        Runnable runnable;
        if (this.f42744a > 0 || (runnable = this.f42745b) == null) {
            return;
        }
        runnable.run();
    }

    public synchronized void a() {
        this.f42744a++;
    }

    public synchronized void b() {
        this.f42744a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f42745b = runnable;
        d();
    }
}
