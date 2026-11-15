package Y5;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f6956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f6957b;

        /* JADX INFO: renamed from: Y5.x$a$a, reason: collision with other inner class name */
        class C0120a extends AbstractC1071b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator f6958c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator f6959d;

            C0120a() {
                this.f6958c = a.this.f6956a.iterator();
                this.f6959d = a.this.f6957b.iterator();
            }

            @Override // Y5.AbstractC1071b
            protected Object a() {
                if (this.f6958c.hasNext()) {
                    return this.f6958c.next();
                }
                while (this.f6959d.hasNext()) {
                    Object next = this.f6959d.next();
                    if (!a.this.f6956a.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f6956a = set;
            this.f6957b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public A iterator() {
            return new C0120a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f6956a.contains(obj) || this.f6957b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f6956a.isEmpty() && this.f6957b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f6956a.size();
            Iterator it = this.f6957b.iterator();
            while (it.hasNext()) {
                if (!this.f6956a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public static abstract class b extends AbstractSet {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract A iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static b c(Set set, Set set2) {
        X5.j.i(set, "set1");
        X5.j.i(set2, "set2");
        return new a(set, set2);
    }
}
