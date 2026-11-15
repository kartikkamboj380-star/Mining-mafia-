package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1256j implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f14160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14163d;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j$a */
    private static class a extends AbstractC1265t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f14164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f14165d;

        a(InterfaceC1260n interfaceC1260n, int i10, int i11) {
            super(interfaceC1260n);
            this.f14164c = i10;
            this.f14165d = i11;
        }

        private void p(p023c2.a aVar) {
            O2.d dVar;
            Bitmap bitmapQ0;
            int rowBytes;
            if (aVar == null || !aVar.R() || (dVar = (O2.d) aVar.G()) == null || dVar.isClosed() || !(dVar instanceof O2.e) || (bitmapQ0 = ((O2.e) dVar).Q0()) == null || (rowBytes = bitmapQ0.getRowBytes() * bitmapQ0.getHeight()) < this.f14164c || rowBytes > this.f14165d) {
                return;
            }
            bitmapQ0.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(p023c2.a aVar, int i10) {
            p(aVar);
            o().b(aVar, i10);
        }
    }

    public C1256j(d0 d0Var, int i10, int i11, boolean z9) {
        Y1.k.b(Boolean.valueOf(i10 <= i11));
        this.f14160a = (d0) Y1.k.g(d0Var);
        this.f14161b = i10;
        this.f14162c = i11;
        this.f14163d = z9;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        if (!e0Var.Q() || this.f14163d) {
            this.f14160a.b(new a(interfaceC1260n, this.f14161b, this.f14162c), e0Var);
        } else {
            this.f14160a.b(interfaceC1260n, e0Var);
        }
    }
}
