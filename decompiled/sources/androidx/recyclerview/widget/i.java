package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f10725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f10727c;

    class a extends i {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f10725a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10725a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10725a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f10725a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f10725a.getWidth();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f10725a.getWidth() - this.f10725a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f10725a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f10725a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f10725a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return this.f10725a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.i
        public int o() {
            return (this.f10725a.getWidth() - this.f10725a.getPaddingLeft()) - this.f10725a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f10725a.getTransformedBoundingBox(view, true, this.f10727c);
            return this.f10727c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int r(View view) {
            this.f10725a.getTransformedBoundingBox(view, true, this.f10727c);
            return this.f10727c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void s(int i10) {
            this.f10725a.offsetChildrenHorizontal(i10);
        }
    }

    class b extends i {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f10725a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10725a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10725a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f10725a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f10725a.getHeight();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f10725a.getHeight() - this.f10725a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f10725a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f10725a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f10725a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return this.f10725a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.i
        public int o() {
            return (this.f10725a.getHeight() - this.f10725a.getPaddingTop()) - this.f10725a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f10725a.getTransformedBoundingBox(view, true, this.f10727c);
            return this.f10727c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int r(View view) {
            this.f10725a.getTransformedBoundingBox(view, true, this.f10727c);
            return this.f10727c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void s(int i10) {
            this.f10725a.offsetChildrenVertical(i10);
        }
    }

    /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i b(RecyclerView.p pVar, int i10) {
        if (i10 == 0) {
            return a(pVar);
        }
        if (i10 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.p k() {
        return this.f10725a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f10726b) {
            return 0;
        }
        return o() - this.f10726b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(int i10);

    public void t() {
        this.f10726b = o();
    }

    private i(RecyclerView.p pVar) {
        this.f10726b = LinearLayoutManager.INVALID_OFFSET;
        this.f10727c = new Rect();
        this.f10725a = pVar;
    }
}
