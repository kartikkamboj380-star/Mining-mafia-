package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RecyclerView.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f10735g = true;

    public final void A(RecyclerView.D d10) {
        I(d10);
        h(d10);
    }

    public final void B(RecyclerView.D d10) {
        J(d10);
    }

    public final void C(RecyclerView.D d10, boolean z9) {
        K(d10, z9);
        h(d10);
    }

    public final void D(RecyclerView.D d10, boolean z9) {
        L(d10, z9);
    }

    public final void E(RecyclerView.D d10) {
        M(d10);
        h(d10);
    }

    public final void F(RecyclerView.D d10) {
        N(d10);
    }

    public final void G(RecyclerView.D d10) {
        O(d10);
        h(d10);
    }

    public final void H(RecyclerView.D d10) {
        P(d10);
    }

    public void I(RecyclerView.D d10) {
    }

    public void J(RecyclerView.D d10) {
    }

    public void K(RecyclerView.D d10, boolean z9) {
    }

    public void L(RecyclerView.D d10, boolean z9) {
    }

    public void M(RecyclerView.D d10) {
    }

    public void N(RecyclerView.D d10) {
    }

    public void O(RecyclerView.D d10) {
    }

    public void P(RecyclerView.D d10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.D d10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10;
        int i11;
        return (bVar == null || ((i10 = bVar.f10502a) == (i11 = bVar2.f10502a) && bVar.f10503b == bVar2.f10503b)) ? w(d10) : y(d10, i10, bVar.f10503b, i11, bVar2.f10503b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.D d10, RecyclerView.D d11, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f10502a;
        int i13 = bVar.f10503b;
        if (d11.shouldIgnore()) {
            int i14 = bVar.f10502a;
            i11 = bVar.f10503b;
            i10 = i14;
        } else {
            i10 = bVar2.f10502a;
            i11 = bVar2.f10503b;
        }
        return x(d10, d11, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.D d10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10 = bVar.f10502a;
        int i11 = bVar.f10503b;
        View view = d10.itemView;
        int left = bVar2 == null ? view.getLeft() : bVar2.f10502a;
        int top = bVar2 == null ? view.getTop() : bVar2.f10503b;
        if (d10.isRemoved() || (i10 == left && i11 == top)) {
            return z(d10);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(d10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.D d10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10 = bVar.f10502a;
        int i11 = bVar2.f10502a;
        if (i10 != i11 || bVar.f10503b != bVar2.f10503b) {
            return y(d10, i10, bVar.f10503b, i11, bVar2.f10503b);
        }
        E(d10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.D d10) {
        return !this.f10735g || d10.isInvalid();
    }

    public abstract boolean w(RecyclerView.D d10);

    public abstract boolean x(RecyclerView.D d10, RecyclerView.D d11, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.D d10, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.D d10);
}
