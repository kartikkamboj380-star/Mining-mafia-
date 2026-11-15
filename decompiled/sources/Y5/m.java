package Y5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    private static final class a extends A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f6927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6928b;

        a(Object obj) {
            this.f6927a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f6928b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f6928b) {
                throw new NoSuchElementException();
            }
            this.f6928b = true;
            return this.f6927a;
        }
    }

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !X5.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static A b(Object obj) {
        return new a(obj);
    }
}
