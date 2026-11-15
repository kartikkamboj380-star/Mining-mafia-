package V8;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f6148b;

        a(d dVar) {
            this.f6148b = dVar;
            this.f6147a = dVar.d();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d next() {
            d dVar = this.f6148b;
            int iD = dVar.d();
            int i10 = this.f6147a;
            this.f6147a = i10 - 1;
            return dVar.g(iD - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6147a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterable, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f6149a;

        public b(d dVar) {
            this.f6149a = dVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f6149a);
        }
    }

    public static final Iterable a(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new b(dVar);
    }
}
