package com.google.android.material.appbar;

import O.AbstractC0845c0;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f38689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38694f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f38695g = true;

    public g(View view) {
        this.f38689a = view;
    }

    void a() {
        View view = this.f38689a;
        AbstractC0845c0.X(view, this.f38692d - (view.getTop() - this.f38690b));
        View view2 = this.f38689a;
        AbstractC0845c0.W(view2, this.f38693e - (view2.getLeft() - this.f38691c));
    }

    public int b() {
        return this.f38692d;
    }

    void c() {
        this.f38690b = this.f38689a.getTop();
        this.f38691c = this.f38689a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f38695g || this.f38693e == i10) {
            return false;
        }
        this.f38693e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f38694f || this.f38692d == i10) {
            return false;
        }
        this.f38692d = i10;
        a();
        return true;
    }
}
