package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2044Ln extends AbstractC3162cu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K4.E f20663d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20662c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20664e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20665f = 0;

    public C2044Ln(K4.E e10) {
        this.f20663d = e10;
    }

    public final C1784Gn g() {
        C1784Gn c1784Gn = new C1784Gn(this);
        AbstractC0786o0.k("createNewReference: Trying to acquire lock");
        synchronized (this.f20662c) {
            AbstractC0786o0.k("createNewReference: Lock acquired");
            a(new C1836Hn(this, c1784Gn), new C1888In(this, c1784Gn));
            Preconditions.checkState(this.f20665f >= 0);
            this.f20665f++;
        }
        AbstractC0786o0.k("createNewReference: Lock released");
        return c1784Gn;
    }

    protected final void h() {
        AbstractC0786o0.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f20662c) {
            AbstractC0786o0.k("releaseOneReference: Lock acquired");
            Preconditions.checkState(this.f20665f > 0);
            AbstractC0786o0.k("Releasing 1 reference for JS Engine");
            this.f20665f--;
            j();
        }
        AbstractC0786o0.k("releaseOneReference: Lock released");
    }

    public final void i() {
        AbstractC0786o0.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f20662c) {
            AbstractC0786o0.k("markAsDestroyable: Lock acquired");
            Preconditions.checkState(this.f20665f >= 0);
            AbstractC0786o0.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f20664e = true;
            j();
        }
        AbstractC0786o0.k("markAsDestroyable: Lock released");
    }

    protected final void j() {
        AbstractC0786o0.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f20662c) {
            try {
                AbstractC0786o0.k("maybeDestroy: Lock acquired");
                Preconditions.checkState(this.f20665f >= 0);
                if (this.f20664e && this.f20665f == 0) {
                    AbstractC0786o0.k("No reference is left (including root). Cleaning up engine.");
                    a(new C1992Kn(this), new C2731Yt());
                } else {
                    AbstractC0786o0.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0786o0.k("maybeDestroy: Lock released");
    }
}
