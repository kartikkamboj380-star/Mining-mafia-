package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f10717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f10718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f10719e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f10722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f10723i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f10715a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f10720f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f10721g = 0;

    f() {
    }

    boolean a(RecyclerView.A a10) {
        int i10 = this.f10717c;
        return i10 >= 0 && i10 < a10.b();
    }

    View b(RecyclerView.v vVar) {
        View viewO = vVar.o(this.f10717c);
        this.f10717c += this.f10718d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f10716b + ", mCurrentPosition=" + this.f10717c + ", mItemDirection=" + this.f10718d + ", mLayoutDirection=" + this.f10719e + ", mStartLine=" + this.f10720f + ", mEndLine=" + this.f10721g + '}';
    }
}
