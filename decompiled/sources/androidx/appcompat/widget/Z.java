package androidx.appcompat.widget;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes.dex */
class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8165a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8166b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8167c = LinearLayoutManager.INVALID_OFFSET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8168d = LinearLayoutManager.INVALID_OFFSET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8169e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8170f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8171g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8172h = false;

    Z() {
    }

    public int a() {
        return this.f8171g ? this.f8165a : this.f8166b;
    }

    public int b() {
        return this.f8165a;
    }

    public int c() {
        return this.f8166b;
    }

    public int d() {
        return this.f8171g ? this.f8166b : this.f8165a;
    }

    public void e(int i10, int i11) {
        this.f8172h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f8169e = i10;
            this.f8165a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f8170f = i11;
            this.f8166b = i11;
        }
    }

    public void f(boolean z9) {
        if (z9 == this.f8171g) {
            return;
        }
        this.f8171g = z9;
        if (!this.f8172h) {
            this.f8165a = this.f8169e;
            this.f8166b = this.f8170f;
            return;
        }
        if (z9) {
            int i10 = this.f8168d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f8169e;
            }
            this.f8165a = i10;
            int i11 = this.f8167c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f8170f;
            }
            this.f8166b = i11;
            return;
        }
        int i12 = this.f8167c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f8169e;
        }
        this.f8165a = i12;
        int i13 = this.f8168d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f8170f;
        }
        this.f8166b = i13;
    }

    public void g(int i10, int i11) {
        this.f8167c = i10;
        this.f8168d = i11;
        this.f8172h = true;
        if (this.f8171g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f8165a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f8166b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f8165a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f8166b = i11;
        }
    }
}
