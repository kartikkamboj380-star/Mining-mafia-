package com.facebook.imagepipeline.memory;

import Y1.k;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Queue f13949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13951e;

    public b(int i10, int i11, int i12, boolean z9) {
        k.i(i10 > 0);
        k.i(i11 >= 0);
        k.i(i12 >= 0);
        this.f13947a = i10;
        this.f13948b = i11;
        this.f13949c = new LinkedList();
        this.f13951e = i12;
        this.f13950d = z9;
    }

    void a(Object obj) {
        this.f13949c.add(obj);
    }

    public void b() {
        k.i(this.f13951e > 0);
        this.f13951e--;
    }

    public Object c() {
        Object objG = g();
        if (objG != null) {
            this.f13951e++;
        }
        return objG;
    }

    int d() {
        return this.f13949c.size();
    }

    public void e() {
        this.f13951e++;
    }

    public boolean f() {
        return this.f13951e + d() > this.f13948b;
    }

    public Object g() {
        return this.f13949c.poll();
    }

    public void h(Object obj) {
        k.g(obj);
        if (this.f13950d) {
            k.i(this.f13951e > 0);
            this.f13951e--;
            a(obj);
        } else {
            int i10 = this.f13951e;
            if (i10 <= 0) {
                Z1.a.o("BUCKET", "Tried to release value %s from an empty bucket!", obj);
            } else {
                this.f13951e = i10 - 1;
                a(obj);
            }
        }
    }
}
