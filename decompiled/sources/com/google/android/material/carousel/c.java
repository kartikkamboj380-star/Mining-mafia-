package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f38918a;

    class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f38919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f38919b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f38919b.getHeight();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return e();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return this.f38919b.getPaddingLeft();
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f38919b.getWidth() - this.f38919b.getPaddingRight();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return j();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i10, int i11) {
            int iG = g();
            this.f38919b.layoutDecoratedWithMargins(view, iG, i10, iG + m(view), i11);
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        int m(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f38919b.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }
    }

    class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f38920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f38920b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f38920b.getHeight() - this.f38920b.getPaddingBottom();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return this.f38920b.X() ? g() : h();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f38920b.getWidth();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return this.f38920b.X() ? h() : g();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return this.f38920b.getPaddingTop();
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i10, int i11) {
            int iJ = j();
            this.f38920b.layoutDecoratedWithMargins(view, i10, iJ, i11, iJ + m(view));
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        int m(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f38920b.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
    }

    /* synthetic */ c(int i10, a aVar) {
        this(i10);
    }

    private static c a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static c b(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return a(carouselLayoutManager);
        }
        if (i10 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static c c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract float d(RecyclerView.q qVar);

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(View view, int i10, int i11);

    abstract void l(View view, Rect rect, float f10, float f11);

    private c(int i10) {
        this.f38918a = i10;
    }
}
