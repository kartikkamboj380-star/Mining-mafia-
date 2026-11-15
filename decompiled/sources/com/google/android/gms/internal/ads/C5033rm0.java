package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5033rm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f33011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f33012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f33013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f33014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f33015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f33016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f33017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f33018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f33019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f33020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f33021k;

    private static double b(MotionEvent motionEvent, double d10, double d11, double d12) {
        return d12 + Math.hypot(((double) motionEvent.getRawX()) - d10, ((double) motionEvent.getRawY()) - d11);
    }

    final /* synthetic */ void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f33011a++;
            this.f33017g = 0.0d;
            this.f33015e = motionEvent.getRawX();
            this.f33016f = motionEvent.getRawY();
            this.f33018h = motionEvent.getX();
            this.f33019i = motionEvent.getY();
            this.f33020j = motionEvent.getRawX();
            this.f33021k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f33013c++;
            this.f33017g = b(motionEvent, this.f33015e, this.f33016f, this.f33017g);
            this.f33015e = motionEvent.getRawX();
            this.f33016f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f33014d++;
        } else {
            this.f33012b += (long) (motionEvent.getHistorySize() + 1);
            this.f33017g = b(motionEvent, this.f33015e, this.f33016f, this.f33017g);
            this.f33015e = motionEvent.getRawX();
            this.f33016f = motionEvent.getRawY();
        }
    }
}
