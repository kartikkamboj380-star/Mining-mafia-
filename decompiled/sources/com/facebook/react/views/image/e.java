package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements U2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15901b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15902a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final U2.d a(List postprocessors) {
            Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
            int size = postprocessors.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size != 0) {
                return size != 1 ? new e(postprocessors, defaultConstructorMarker) : (U2.d) postprocessors.get(0);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ e(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // U2.d
    public S1.d a() {
        List list = this.f15902a;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((U2.d) it.next()).a());
        }
        return new S1.f(arrayList);
    }

    @Override // U2.d
    public p023c2.a b(Bitmap sourceBitmap, G2.b bitmapFactory) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        p023c2.a aVarB = null;
        try {
            p023c2.a aVarClone = null;
            for (U2.d dVar : this.f15902a) {
                if (aVarClone == null || (bitmap = (Bitmap) aVarClone.G()) == null) {
                    bitmap = sourceBitmap;
                }
                aVarB = dVar.b(bitmap, bitmapFactory);
                p023c2.a.x(aVarClone);
                aVarClone = aVarB.clone();
            }
            if (aVarB != null) {
                p023c2.a aVarClone2 = aVarB.clone();
                Intrinsics.checkNotNullExpressionValue(aVarClone2, "clone(...)");
                p023c2.a.x(aVarB);
                return aVarClone2;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.f15902a.size()).toString());
        } catch (Throwable th) {
            p023c2.a.x(null);
            throw th;
        }
    }

    @Override // U2.d
    public String getName() {
        return "MultiPostProcessor (" + CollectionsKt.e0(this.f15902a, ",", null, null, 0, null, null, 62, null) + ")";
    }

    private e(List list) {
        this.f15902a = new LinkedList(list);
    }
}
